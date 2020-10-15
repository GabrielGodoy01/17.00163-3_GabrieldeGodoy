package colecoes

import kotlin.math.min

fun main(){
    val meuVetor = arrayOf(1, 2, 3)
    var item : Int
    for (item in meuVetor)
        println(item)
    println("Tamanho do meu array: ${meuVetor.size}")
    println("Primeiro elemento: ${meuVetor[0]}")
    println("Maior valor: ${meuVetor.max()}")

    //Lista
    //Listas não são mutaveis (sem .add)
    val minhaLista = listOf("Oi", "ola", "denovo")
    println(minhaLista)

    val minhaListaQueMuda = mutableListOf("Oi", "ola", "denovo")
    println(minhaListaQueMuda)
    minhaListaQueMuda.add("Goku")
    println(minhaListaQueMuda)
}