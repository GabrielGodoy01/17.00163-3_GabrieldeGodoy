import 'package:flutter/material.dart';
import 'package:google_fonts/google_fonts.dart';
import 'package:projeto_p2/models/via_cep.dart';
import 'package:projeto_p2/utilities/network_cep.dart';

class PaginaLocalizacao extends StatefulWidget {
  var cep;

  PaginaLocalizacao({Key key, this.cep}) : super(key: key);
  @override
  _PaginaLocalizacaoState createState() => _PaginaLocalizacaoState();
}

class _PaginaLocalizacaoState extends State<PaginaLocalizacao> {
  var _dados = "";

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text("Consultar CEP", style: GoogleFonts.arimo(),),
        backgroundColor: Colors.redAccent.shade200,
      ),
      body: Column(
          children: [
            Text(_dados),
            FlatButton(
              color: Colors.redAccent.shade200,
              splashColor: Colors.blueAccent,
              child: Text("Checar CEP", style: GoogleFonts.arimo(),),
              textColor: Colors.white,
              onPressed: () async {
                mostrarResultados();
              },
            ),

          ]
      ),
    );
  }

  Future<void> mostrarResultados() async {
    var requisicao = NetworkCep(
        url: "https://viacep.com.br/ws/" + widget.cep + "/json/");
    var dados = ViaCep.fromJson(await requisicao.getData());
    showDialog(
        context: context,
        builder: (BuildContext context) {
          return AlertDialog(
            title: new Text("Dados do CEP: "+dados.cep),
            content: new Text("Logradouro: "+ dados.logradouro + "\n" + "Complemento: " +
                dados.complemento + "\n"+ "Bairro: " + dados.bairro + "\n" + "Localidade: "
                + dados.localidade + "\n" + "UF: " + dados.uf + "\n"),
            actions: <Widget>[
              new FlatButton(
                child: new Text("Fechar"),
                onPressed: () {
                  Navigator.of(context).pop();
                },
              ),
            ],
          );
        });
    print(dados.logradouro);
    print(dados.cep);
  }
}