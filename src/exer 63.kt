///Faça um programa usando a estrutura “faça enquanto” que leia a
//idade de várias pessoas. A cada laço, você deverá perguntar para o
//usuário se ele quer ou não continuar a digitar dados. No final,
//quando o usuário decidir parar, mostre na tela:
//• Quantas idades foram digitadas
//• Qual é a média entre as idades digitadas
//• Quantas pessoas tem 21 anos ou mais.

fun main(){

    var idadesDigitadas = 0
    var totalIdade = 0
    var idadeMaisVinteum = 0

    do {
        print("Insira sua idade: ")
        val idade = readln().toInt()
        totalIdade += idade
        idadesDigitadas ++

        if (idade >= 21){
            idadeMaisVinteum ++
        }
        println("Deseja continuar? (Sim/Não)")
    }while (readln().lowercase() == "sim")
    val media = if (idadesDigitadas > 0) totalIdade / idadesDigitadas else 0
    println("\n=======RESULTADOS==========")
    println("O total de idades digitadas: $idadesDigitadas")
    println("Média das idades: $media")
    println("Pessoas com mais de 21: $idadeMaisVinteum")
}
