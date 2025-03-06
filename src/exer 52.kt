///Faça um aplicativo que leia o preço de 8 produtos. No final,
//mostre na tela qual foi o maior e qual foi o menor preço
//digitados.

fun main(){

    var menorValor = Double.MAX_VALUE
    var maiorValor = Double.MIN_VALUE

    for (i in 1..8){
        print("Digite o ${i} preço: ")
        var valor = readln().toDouble()

        if (valor > maiorValor){
            maiorValor = valor

        }
        if (valor < menorValor){
            menorValor = valor
        }
    }
    println("O maior preço é: R$$maiorValor")
    println("O menor preço é: R$$menorValor")
}