
import { Cliente } from './clientes/cliente.model';
import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  clientes: Cliente[] = [];
  onClienteAdicionado(cliente: never){
    this.clientes = [cliente, ...this.clientes];
    // console.log(cliente);
  }
}
