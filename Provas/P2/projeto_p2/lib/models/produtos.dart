class MyProdutos{
  var _nome;
  var _valor;
  var _quatidade;
  var _urlImg;

  MyProdutos(this._nome, this._valor, this._quantidade, this._urlImg);

  @override
  String toString() {
    return 'MyHero{_nome: $_nome, _valor: $_valor, _quantidade: $_quantidade, _urlImg: $_urlImg}';
  }

  get quantidade => _quantidade;

  get valor => _valor;

  get nome => _nome;

  get image => _urlImg;

}