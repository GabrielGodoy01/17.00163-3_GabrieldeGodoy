import 'package:flutter/material.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Flutter Demo',
      debugShowCheckedModeBanner: false,
      theme: ThemeData(
        primarySwatch: Colors.blue,
        visualDensity: VisualDensity.adaptivePlatformDensity,
      ),
      home: MinhaTela(),
    );
  }
}

class MinhaTela extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: Text("Meu App Flutter")),
      body: Column(
        children: [
          Text("Ola eu sou o Goku"),
          Padding(
            padding: const EdgeInsets.all(8.0),
            child: Image.network("https://www.einerd.com.br/wp-content/uploads/2018/08/oi-eu-sou-o-goku-capa-890x466.jpg"),
          ),
          Expanded(
            child: Row(

              children: [
                Expanded(child: Image.network("https://assets.pokemon.com/assets/cms2/img/pokedex/full/150.png", fit: BoxFit.contain)),
                Expanded(
                  child: Column(
                    mainAxisAlignment: MainAxisAlignment.center,
                    crossAxisAlignment: CrossAxisAlignment.center,
                    children: [
                      _minha_lista_personalizada("https://assets.pokemon.com/assets/cms2/img/pokedex/full/152.png","Gabriel de Godoy Braz"),
                      _minha_lista_personalizada("https://assets.pokemon.com/assets/cms2/img/pokedex/full/115.png","link do git"),
                    ],
                  ),
                ),
              ],
            ),
          ),
          Expanded(child: Image.asset("assets/gitqrcode.png"))
        ],
      ),
      floatingActionButton: FloatingActionButton(
        onPressed: () {
          print("Ola Devs!!");
          },
        child: Icon(Icons.accessibility_sharp),
      ),
    );
  }
  _minha_lista_personalizada(String url, String texto){
    return Row(
      children:[
        Expanded(child: Image.network(url, fit: BoxFit.contain)),
        Expanded(child: Text(texto)),
      ],
    );
  }
}

