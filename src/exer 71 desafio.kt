///Faça um programa que mostre os 10 primeiros elementos
//da Sequência de Fibonacci:
//
//1 1 2 3 5 8 13 21...

fun main(){
    var elementos = 10
    var anterior = 1
    var atual = 1

    println("Os $elementos elementos da Sequência de Fibonacci são: ")
    print("$anterior $atual")
    for (i in 3..elementos) {
        val proximo = anterior + atual
        print(" $proximo")
        anterior = atual
        atual = proximo
    }


}
