import 'package:flutter/material.dart';
import 'package:projeto_p2/screens/pagina_de_cadastro.dart';

class PaginaEstoque extends StatefulWidget {
  @override
  _PaginaEstoqueState createState() => _PaginaEstoqueState();
}

class _PaginaEstoqueState extends State<PaginaEstoque> {
  @override
  Widget build(BuildContext context) {
    var _logoempresa = "assets/logo_empresa.jpg";
    return SafeArea(
      child: Scaffold(
        resizeToAvoidBottomPadding: false,
        backgroundColor: Colors.white,
        body: Column(
          children: [
            Container(
              alignment: Alignment.topCenter,
                child: SizedBox(width:350, height: 150,child: Image.asset(_logoempresa),)),
            FlatButton(
                color: Colors.redAccent,
                onPressed: (){
                  //adicionar_novo_registro();
                },
                child: Text("Atualizar Estoque")),
            RaisedButton(child: const Text('Menu de Cadastro'),
              color: Colors.blue,
              elevation: 4.0,
              splashColor: Colors.red,
              onPressed: () {
                  Navigator.pop(context);
                },
            ),
          ]
        ),

      ),
    );
  }
}