/**
 * Crie um programa que leia o número de dias trabalhados em um
 * mês e mostre o salário de um funcionário, sabendo que ele trabalha
 * 8 horas por dia e ganha R$25 por hora trabalhada.
 */

fun main(){
    println("Dias trabalhados no mês: ")
    val mes = readln().toInt()

    val ganhoPorDia = 25 * 8
    val salario = mes * ganhoPorDia
    println("Seu ganho por dia é de R$$ganhoPorDia")
    println("Seu salario é de R$$salario")

}