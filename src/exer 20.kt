/*Desenvolva um programa que leia um número inteiro e mostre se
ele é PAR ou ÍMPAR.
 */

fun main(){
    println("Digite um numero inteiro:")
    val numero = readln().toInt()

    if(numero %2==0){
        println("Número par")

    }else{
        println("Número impar")
    }
}