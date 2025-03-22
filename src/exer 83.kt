///Faça um algoritmo que leia a nota de 10 alunos de uma turma e
//guarde-as em um vetor. No final, mostre:
//• Qual é a média da turma
//• Quantos alunos estão acima da média da turma
//• Qual foi a maior nota digitada
//• Em que posições a maior nota aparece

fun main(){

    val notas = mutableListOf<Double>()
    var acimaMedia = 0
    var maiorNota = Double.MIN_VALUE

    for (i in 1..10){
        print("Digite a $i MEDIA: ")
        val medias = readln().toDouble()
        notas.add(medias)
    }

    val somaTurma = notas.sum()
    val mediaTurma = somaTurma / notas.size
    println("A media da turma é: %.2f".format(mediaTurma))

    for (i in notas.indices){
        if (notas[i] >=6){
            acimaMedia++
        }
    }
    println("Total de alunos acima da media: $acimaMedia")



    for (medias in notas){
        if (medias > maiorNota){
            maiorNota = medias
        }
    }
    println("A maior nota digitada foi: ${maiorNota}")

    for(i in notas.indices){
        if (notas[i] == maiorNota){
            println("Posição: $i")
        }
    }

}
