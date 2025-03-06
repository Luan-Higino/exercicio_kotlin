///• Crie um algoritmo que leia a idade de 10 pessoas, mostrando no
//final:
//• Qual é a média de idade do grupo
//• Quantas pessoas tem mais de 18 anos
//• Quantas pessoas tem menos de 5 anos
//• Qual foi a maior idade lida

fun main(){

    var maiorIdade = Int.MIN_VALUE
    var maiorDeIdade = 0
    var menorQueCinco = 0
    var somaIdade = 0

    for (i in 1..10){
        print("Digite a idade da pessoa ${i}: ")
        var idade = readln().toInt()

        somaIdade += idade

        if (idade > 18){
            maiorDeIdade ++
        }
        if (idade < 5){
            menorQueCinco ++
        }
        if (idade > maiorIdade) {
            maiorIdade = idade

        }

    }
    val soma = somaIdade / 10.0
    println()
    println("Média de idade do grupo: $soma")
    println("Número de pessoas com mais de 18 anos: $maiorDeIdade")
    println("Número de pessoas com menos de 5 anos: $menorQueCinco")
    println("A maior idade lida foi: $maiorIdade")
}