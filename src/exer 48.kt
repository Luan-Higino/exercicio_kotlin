///Faça um programa que leia 7 números inteiros e no final
//mostre o somatório entre eles.


fun main(){
    var soma = 0

    for (i in 1..7){
        print("Digite o ${i} número: ")
        val numero = readln().toInt()
        soma += numero

    }
    println("O somatório dos números é: $soma")
}
