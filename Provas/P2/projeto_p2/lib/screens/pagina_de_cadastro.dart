import 'package:flutter/material.dart';
import 'package:projeto_p2/models/produtos.dart';

class PaginaDeCadastro extends StatefulWidget {
  @override
  _PaginaDeCadastroState createState() => _PaginaDeCadastroState();
}

class _PaginaDeCadastroState extends State<PaginaDeCadastro> {
  final _myProdutosList = [MyProdutos("Memória DDR4 Corsair", "250", "2", "https://w7.pngwing.com/pngs/421/211/png-transparent-ddr4-sdram-corsair-vengeance-rgb-ddr4-corsair-components-dimm-computer-memory-ddr4-ram-electronic-device-microcontroller.png")

  ];

  final controladorNome = TextEditingController();

  final controladorValor = TextEditingController();

  final controladorQuantidade = TextEditingController();

  final controladorUrlImage = TextEditingController();

  @override
  Widget build(BuildContext context) {
    return SafeArea(
      child: Scaffold(
          body: Column(
            children: [
              SizedBox(width:200, height: 100,child: Image.network("https://upload.wikimedia.org/wikipedia/commons/c/cf/Boku_no_Hero_Academia_Logo.png")),
              meuTextFieldPersonalizado(controladorNome, "Informe o nome do produto: ", "Nome:", Icon(Icons.drive_file_rename_outline)),
              meuTextFieldPersonalizado(controladorValor, "Informe o valor do produto: ", "Valor:", Icon(Icons.drive_file_rename_outline)),
              meuTextFieldPersonalizado(controladorQuantidade, "Informe a quantidade deste produto: ", "Quantidade:", Icon(Icons.ac_unit_outlined)),
              meuTextFieldPersonalizado(controladorUrlImage, "Informe a URL da imagem do produto: ", "URL Imagem:", Icon(Icons.image)),
              FlatButton(onPressed: (){
                adicionar_novo_registro();
              }, child: Text("Cadastrar")),
              Expanded(
                child: ListView.builder(
                  itemBuilder: (context, index){
                    return ListTile(
                      title: Text(_myProdutosList[index].nome),
                      subtitle: Text(_myProdutosList[index].valor),
                      : Text(_myProdutosList[index].quantidade),
                      leading: Image.network(_myProdutosList[index].image),
                    );
                  },
                  itemCount: _myProdutosList.length,
                ),
              )
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
          icon: icone
      ),),
    );
  }

  void adicionar_novo_registro() {
    setState(() {
      _myProdutosList.add(MyProdutos(controladorNome.text, controladorValor.text,controladorQuantidade.text, controladorUrlImage.text));
      print(_myProdutosList);
    });
  }}