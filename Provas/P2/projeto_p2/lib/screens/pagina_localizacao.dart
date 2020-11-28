import 'package:flutter/material.dart';
import 'package:google_fonts/google_fonts.dart';
import 'package:projeto_p2/utilities/network_cep.dart';

class PaginaLocalizacao extends StatefulWidget {
  var cep;

  PaginaLocalizacao({Key key, this.cep}) : super(key: key);
  @override
  _PaginaLocalizacaoState createState() => _PaginaLocalizacaoState();
}

class _PaginaLocalizacaoState extends State<PaginaLocalizacao> {
  var _searchCepController = TextEditingController();
  bool _loading = false;
  bool _enableField = true;
  String _result;

  @override
  void dispose() {
    super.dispose();
    _searchCepController.clear();
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text("Consultar CEP", style: GoogleFonts.arimo(),),
        backgroundColor: Colors.redAccent.shade200,
      ),
      body: SingleChildScrollView(
        padding: EdgeInsets.all(20.0),
        child: Column(
          crossAxisAlignment: CrossAxisAlignment.stretch,
          children: <Widget>[
            _buildSearchCepTextField(),
            _buildSearchCepButton(),
            _buildResultForm()
          ],
        ),
      ),
    );
  }

  Widget _buildSearchCepTextField() {
    return TextField(
      autofocus: true,
      keyboardType: TextInputType.number,
      textInputAction: TextInputAction.done,
      decoration: InputDecoration(labelText: 'Cep', border: const OutlineInputBorder(), focusColor: Colors.redAccent, fillColor: Colors.redAccent.shade200), style: GoogleFonts.poppins(),cursorColor: Colors.black,
      controller: _searchCepController,
      enabled: _enableField,
    );
  }

  Widget _buildSearchCepButton() {
    return Padding(
      padding: const EdgeInsets.only(top: 20.0),
      child: RaisedButton(
        color: Colors.redAccent.shade200,
        onPressed: _searchCep,
        child: _loading ? _circularLoading() : Text('Consultar', style: GoogleFonts.arimo(),), elevation: 10,textColor: Colors.white,
        shape: RoundedRectangleBorder(borderRadius: BorderRadius.circular(20)),
      ),
    );
  }

  void _searching(bool enable) {
    setState(() {
      _result = enable ? '' : _result;
      _loading = enable;
      _enableField = !enable;
    });
  }

  Widget _circularLoading() {
    return Container(
      height: 15.0,
      width: 15.0,
      child: CircularProgressIndicator(),
    );
  }

  Future _searchCep() async {
    _searching(true);

    final cep = _searchCepController.text;

    final resultCep = await NetworkCep.fetchCep(cep: cep);
    print(resultCep.localidade);

    setState(() {
      _result = resultCep.toJson();
    });

    _searching(false);
  }

  Widget _buildResultForm() {
    return Container(
      padding: EdgeInsets.only(top: 20.0),
      child: Text(_result ?? ''),
    );
  }
}