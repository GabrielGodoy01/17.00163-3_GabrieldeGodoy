import 'package:flutter/material.dart';
import 'package:projeto_p2/models/produtos.dart';
import 'package:projeto_p2/screens/pagina_estoque.dart';

class PaginaDeCadastro extends StatelessWidget{
  final _MyProdutos = [MyProdutos("as", "as", "as", "https://i.pinimg.com/originals/9e/ca/7b/9eca7b75902d31804b525746e8a1f23d.jpg")];

  final controladorNome = TextEditingController();

  final controladorValor = TextEditingController();

  final controladorQuantidade = TextEditingController();

  final controladorUrlImage = TextEditingController();

  var _logoempresa = "assets/logo_empresa.jpg";


  @override
  Widget build(BuildContext context) {
    return SafeArea(
      child: Scaffold(
          resizeToAvoidBottomPadding: false,
        backgroundColor: Colors.white,
          body: Column(
            children: [
              SizedBox(width:350, height: 150,child: Image.asset(_logoempresa)),
              meuTextFieldPersonalizado(controladorNome, "Informe o nome do produto: ", "Nome:", Icon(IconData(57602, fontFamily: 'MaterialIcons'))),
              meuTextFieldPersonalizado(controladorValor, "Informe o valor do produto: ", "Valor:", Icon(IconData(58005, fontFamily: 'MaterialIcons'))),
              meuTextFieldPersonalizado(controladorQuantidade, "Informe a quantidade deste produto: ", "Quantidade:", Icon(IconData(57378, fontFamily: 'MaterialIcons'))),
              meuTextFieldPersonalizado(controladorUrlImage, "Informe a URL da imagem do produto: ", "URL Imagem:", Icon(Icons.image)),
              FlatButton(
                  color: Colors.redAccent,
                  onPressed: (){
                    adicionar_novo_registro();
                  },
                  child: Text("Cadastrar")),
              Expanded(
                child: ListView.builder(
                  itemBuilder: (context, index){
                    return ListTile(
                      title: Text(_MyProdutos[index].nome),
                      subtitle: Text(_MyProdutos[index].valor),
                      leading: Image.network(_MyProdutos[index].image),
                    );
                  },
                  itemCount: _MyProdutos.length,
                ),
              ),

              RaisedButton(child: const Text('Conferir Estoque'),
                color: Colors.blue,
                elevation: 4.0,
                splashColor: Colors.red,
                onPressed: () {
                  _sendDataToEstoque(context);
                  Navigator.push(context, MaterialPageRoute(builder: (_) {
                    return PaginaEstoque();
                  }));
                },
              ),
            ],
          )

      ),
    );
  }

  Widget meuTextFieldPersonalizado(TextEditingController controlador, String hint, String label, Icon icone) {
    return Padding(
      padding: const EdgeInsets.all(8.0),
      child: TextField(controller: controlador, decoration: InputDecoration(
          hintText: hint,
          labelText: label,
          icon: icone,
      ),),
    );
  }

  void adicionar_novo_registro() {
    //setState(() {
      _MyProdutos.add(MyProdutos(controladorNome.text, controladorValor.text,controladorQuantidade.text, controladorUrlImage.text));
      print(_MyProdutos);
    //});
  }

  void _sendDataToEstoque(BuildContext context) {
    Navigator.push(
        context,
        MaterialPageRoute(
          builder: (context) => PaginaEstoque(),
        ));
  }
}