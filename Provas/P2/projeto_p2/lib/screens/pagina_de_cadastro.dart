import 'package:flutter/material.dart';
import 'package:google_fonts/google_fonts.dart';
import 'package:projeto_p2/models/produtos.dart';
import 'package:projeto_p2/models/via_cep.dart';
import 'package:projeto_p2/screens/pagina_estoque.dart';
import 'package:projeto_p2/screens/pagina_localizacao.dart';
import 'package:projeto_p2/utilities/network_cep.dart';


class PaginaDeCadastro extends StatefulWidget {
  @override
  _PaginaDeCadastroState createState() => _PaginaDeCadastroState();
}

class _PaginaDeCadastroState extends State<PaginaDeCadastro> {
  final _myProdutosList = [MyProdutos("as", "as", "as", "https://i.pinimg.com/originals/9e/ca/7b/9eca7b75902d31804b525746e8a1f23d.jpg")];

  final controladorNome = TextEditingController();

  final controladorValor = TextEditingController();

  final controladorQuantidade = TextEditingController();

  final controladorUrlImage = TextEditingController();

  var _logoempresa = "assets/logo_empresa.jpg";

  @override
  Widget build(BuildContext context) {
    return SafeArea(
      child: Scaffold(
        drawer: new Drawer(
          child: ListView.builder(
            itemBuilder: (context, index){
              return ListTile(
                title: Text(_myProdutosList[index].nome),
                subtitle: Text("R\$ " + _myProdutosList[index].valor),
                trailing: Icon(Icons.keyboard_arrow_right),
                onTap: () {
                  print(Text(_myProdutosList[index].quantidade));
                },
                leading: Image.network(_myProdutosList[index].image),
              );
            },
            itemCount: _myProdutosList.length,
          ),
        ),
          appBar: new AppBar(
            title: Text("Cadastro de vendas", style: GoogleFonts.arimo(),),
            backgroundColor: Colors.redAccent.shade200,
            leading: Builder(
              builder: (context) => IconButton(
                icon: new Icon(IconData(61720, fontFamily: 'MaterialIcons')),
                onPressed: () => Scaffold.of(context).openDrawer(),
              ),
            ),
          ),

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
              SizedBox(width:350, height: 150,child: Image.asset(_logoempresa)),
              meuTextFieldPersonalizado(controladorNome, "Informe o nome do produto: ", "Nome:", Icon(IconData(57602, fontFamily: 'MaterialIcons'))),
              meuTextFieldPersonalizado(controladorValor, "Informe o valor do produto: ", "Valor:", Icon(IconData(58005, fontFamily: 'MaterialIcons'))),
              meuTextFieldPersonalizado(controladorQuantidade, "Informe a quantidade deste produto: ", "Quantidade:", Icon(IconData(57378, fontFamily: 'MaterialIcons'))),
              meuTextFieldPersonalizado(controladorUrlImage, "Informe a URL da imagem do produto: ", "URL Imagem:", Icon(Icons.image)),
              FlatButton(
                  color: Colors.redAccent.shade200,
                  onPressed: (){
                    adicionar_novo_registro();
                  },
                  child: Text("Cadastrar", style: GoogleFonts.arimo(),), textColor: Colors.white,),
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
    setState(() {
      _myProdutosList.add(MyProdutos(controladorNome.text, controladorValor.text,controladorQuantidade.text, controladorUrlImage.text));
      print(_myProdutosList);
    });
  }}