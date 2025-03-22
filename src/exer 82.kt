///Crie um programa que leia a idade de 8 pessoas e guarde-as em
//um vetor. No final, mostre:
//• Qual é a média de idade das pessoas cadastradas
//• Em quais posições temos pessoas com mais de 25 anos
//• Qual foi a maior idade digitada (podem haver repetições)
//• Em que posições digitamos a maior idade

fun main(){
    val idades = mutableListOf<Int>()
    var maiorIdade = Int.MIN_VALUE

    for (i in 1..8){
        print("Digite a $i idade: ")
        var idade = readln().toInt()
        idades.add(idade)

    }
    val somaIdades = idades.sum()
    val mediaIdade = somaIdades / idades.size
    println("A média de idade das pessoas cadastradas é: $mediaIdade")


    println("Posições de pessoas com mais de 25 anos")
    for (i in idades.indices){
        if (idades[i] > 25){
            println("Posições: ${i }, Idade: ${idades[i]}")
        }
    }

    for (idade in idades){
        if (idade > maiorIdade){
            maiorIdade = idade
        }
    }
    println("A maior idade digitada foi: $maiorIdade")
    println("Posições onde a maior idade foi digitada:")
    for (i in idades.indices){
        if (idades[i] == maiorIdade){
            println("Posição $i: Idade ${idades[i]}")
        }
    }
}
