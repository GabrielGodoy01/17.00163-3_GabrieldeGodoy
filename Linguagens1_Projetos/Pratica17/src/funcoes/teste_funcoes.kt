package funcoes

fun SomarDoisNumeros(numero1 : Int, numero2 : Int) : Int{
    return numero1 + numero2
}

fun MultiplicarDoisNumeros(numero1 : Double, numero2 : Int) = numero1 * numero2


fun main(){
    println("${SomarDoisNumeros(4,89)}")
    println("${MultiplicarDoisNumeros(4.0,89)}")
}