///Crie um programa que leia 6 números inteiros e no final mostre
//quantos deles são pares e quantos são ímpares.

fun main(){
    var impar = 0
    var par = 0

    for (i in 1..6){
        print("Digite o ${i} número :")
        val numero = readln().toInt()
        if (numero % 2 == 0){
            par ++
    }else{
        impar ++
        }
    }
    val pluralImpar = if (impar == 1) "Número ímpar" else "Números ímpares"
    val pluralPar = if (par == 1) "Número par" else "Números pares"
    println("$par $pluralPar, $impar $pluralImpar")

}