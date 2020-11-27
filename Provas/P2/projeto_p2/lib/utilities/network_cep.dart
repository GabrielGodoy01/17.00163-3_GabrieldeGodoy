import 'package:http/http.dart' as http;
import 'package:projeto_p2/models/via_cep.dart';

class NetworkCep{
  static Future<ViaCep> fetchCep({String cep}) async {
    final response = await http.get('https://viacep.com.br/ws/$cep/json/');
    if (response.statusCode == 200) {
      return ViaCep.fromJson(response.body);
    } else {
      throw Exception('CEP inválido!');
    }
  }
}