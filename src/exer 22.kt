/*Escreva um programa que leia o ano de nascimento de um rapaz e
mostre a sua situação em relação ao alistamento militar.
• Se estiver antes dos 18 anos, mostre em quantos anos
faltam para o alistamento.
• Se já tiver depois dos 18 anos, mostre quantos anos já
se passaram do alistamento.
 */
fun main(){
    println("Qual seu ano de nascimento:")
    val ano = readln().toInt()
    val alist = 2025 - ano
    if (alist == 18){
        println("Você pode se alistar")
    }else if(alist < 18){
        println("Ainda faltam ${18 - alist} Anos, para o alistamento")
    }
    else{
        println("Já se passaram ${alist - 18} Anos, do alistamento")
    }
}