///Escreva um programa que leia um número qualquer e mostre a
//tabuada desse número, usando a estrutura “para”.
//Ex: Digite um valor: 5
//5 x 1 = 5
//
//5 x 2 = 10
//5 x 3 = 15 ...

fun main(){
    println("Digite um número: ")
    val tabuada = readln().toInt()
    for (i in 1..10 ){
        println("$tabuada x ${i}: ${tabuada * i}")
    }

}
