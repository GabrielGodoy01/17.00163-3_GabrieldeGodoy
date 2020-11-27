class MyProdutos{
  var _nome;
  var _valor;
  var _descricao;
  var _urlImg;

  MyProdutos(this._nome, this._valor, this._descricao, this._urlImg);

  @override
  String toString() {
    return 'MyHero{_nome: $_nome, _valor: $_valor, _descricao: $_descricao, _urlImg: $_urlImg}';
  }

  get descricao => _descricao;

  get valor => _valor;

  get nome => _nome;

  get image => _urlImg;

}