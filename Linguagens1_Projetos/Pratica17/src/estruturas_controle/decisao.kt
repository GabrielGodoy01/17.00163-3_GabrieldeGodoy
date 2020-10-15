package estruturas_controle

fun main(){
    val numero = 15
    if( numero % 2 == 0)
        println("Par")
    else
        println("Impar")

    //Simular em ternario
    val numero2 = 40
    val resultado = if (numero % 2 == 0) "Par" else "Impar"
    println("$resultado")

    println("Resultado: ${if (numero % 2 == 0) "Par" else "Impar"}")

    //Elvis operator
    //Deixa explicito que a variavel pode receber um valor nulo
    var nome : String?
    nome = "Miguel"
    println(nome)
    nome = null
    println(nome)
    println("${nome ?: "Ryu"}")
}