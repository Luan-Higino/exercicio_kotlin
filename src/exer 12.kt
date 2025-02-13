/**
 * Crie um programa que leia o preço de um produto, calcule e
 * mostre o seu PREÇO PROMOCIONAL, com 5% de desconto.
 */

fun main(){
    println("Preço do produto:")
    var produto = readln().toDouble()
    val desconto = 0.05
    val soma = desconto * produto
    println("O desconto de $produto, ficou R$${produto - soma}")

}