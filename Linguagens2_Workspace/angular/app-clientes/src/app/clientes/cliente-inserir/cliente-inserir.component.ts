import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-cliente-inserir',
  templateUrl: './cliente-inserir.component.html',
  styleUrls: ['./cliente-inserir.component.css']
})
export class ClienteInserirComponent implements OnInit {

  //Pegar os dados que o usuário vai digitar nos 3 inputs do html, 2-way-databinding
  nome!: string;
  fone!: string;
  email!: string;

  constructor() { }

  ngOnInit(): void {
  }

  onAdicionarCliente(){
    console.log("Adicionando cliente...");
  }
}
