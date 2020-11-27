import 'package:flutter/material.dart';
import 'package:google_fonts/google_fonts.dart';
import 'package:projeto_p2/screens/pagina_de_cadastro.dart';
import 'package:projeto_p2/screens/pagina_localizacao.dart';

class PaginaEstoque extends StatefulWidget {
  var nome;
  var valor;
  var quantidade;
  var urlImage;

  PaginaEstoque({Key key, this.nome, this.valor, this.quantidade, this.urlImage}) : super(key: key);

  @override
  _PaginaEstoqueState createState() => _PaginaEstoqueState();
}

class _PaginaEstoqueState extends State<PaginaEstoque> {
  @override
  Widget build(BuildContext context) {
    var _logoempresa = "assets/logo_empresa.jpg";
    return SafeArea(
      child: Scaffold(
        floatingActionButton: FloatingActionButton.extended(
          icon: Icon(Icons.send),
          backgroundColor: Colors.redAccent.shade200,
          onPressed: () async{
            Navigator.push(context, MaterialPageRoute(builder: (_) {
              return PaginaLocalizacao();
            }));
          },
          label: Text("Checar CEP", style: GoogleFonts.arimo(),),
        ),
        resizeToAvoidBottomPadding: false,
        backgroundColor: Colors.white,
        body: Column(
          children: [
            Container(
              alignment: Alignment.topCenter,
                child: SizedBox(width:350, height: 150,child: Image.asset(_logoempresa),)),
            SizedBox(width:350, height: 150,child: Image.network(widget.urlImage)),
            Text("Nome: " + widget.nome),

            RaisedButton(child: const Text('Tela de Cadastro'),
              color: Colors.blue,
              elevation: 4.0,
              splashColor: Colors.red,
              onPressed: () {
                Navigator.pop(context);
                })
          ]
        ),
      ),
    );
  }
}