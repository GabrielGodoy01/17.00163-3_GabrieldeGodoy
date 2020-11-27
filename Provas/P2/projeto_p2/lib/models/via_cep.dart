import 'dart:convert';

class ViaCep {
  String cep;
  String logradouro;
  String complemento;
  String bairro;
  String localidade;
  String uf;
  String unidade;
  String ibge;
  String gia;

  ViaCep({
    this.cep,
    this.logradouro,
    this.complemento,
    this.bairro,
    this.localidade,
    this.uf,
    this.unidade,
    this.ibge,
    this.gia,
  });

  factory ViaCep.fromJson(String str) => ViaCep.fromMap(json.decode(str));

  String toJson() => json.encode(toMap());

  factory ViaCep.fromMap(Map<String, dynamic> json) => ViaCep(
    cep: json["cep"],
    logradouro: json["logradouro"],
    complemento: json["complemento"],
    bairro: json["bairro"],
    localidade: json["localidade"],
    uf: json["uf"],
    unidade: json["unidade"],
    ibge: json["ibge"],
    gia: json["gia"],
  );

  Map<String, dynamic> toMap() => {
    "cep": cep,
    "logradouro": logradouro,
    "complemento": complemento,
    "bairro": bairro,
    "localidade": localidade,
    "uf": uf,
    "unidade": unidade,
    "ibge": ibge,
    "gia": gia,
  };
}