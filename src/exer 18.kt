/**
 * Faça um programa que leia o ano de nascimento de uma pessoa,
 * calcule a idade dela e depois mostre se ela pode ou não votar.
 */

fun main(){
    println("Qual seu ano de nascimento:")
    val  ano = readln().toInt()
    val soma = 2025 - ano
    if(soma >=18){
        println("Você pode votar ")
    }else if (soma < 18){
        println("Você não pode votar")
    }

}