///Faça um algoritmo que leia a idade de vários alunos de uma
//turma. O programa vai parar quando for digitada a idade 999. No
//final, mostre quantos alunos existem na turma e qual é a média de
//idade do grupo.

fun main(){

    var contagemAlunos = 0
    var contagemIdade = 0

    while (true){
        print("Digite sua idade (999 para sair!): ")
        val idade = readln().toInt()

        if (idade == 999){
            break
        }
        contagemAlunos++
        contagemIdade += idade
    }
    val mediaIdade = contagemIdade.toDouble() / contagemAlunos
    if (contagemAlunos > 0){
        println()
        println("O total de aluno na turna, é de: $contagemAlunos")
        println("A média de idade dos alunos na turma é: %.1f".format(mediaIdade))
    }else{
        println("Nenhuma idade foi inserida!!")
    }

}