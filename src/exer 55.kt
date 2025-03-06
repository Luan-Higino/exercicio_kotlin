///Desenvolva um aplicativo que leia o peso e a altura de 7
//pessoas, mostrando no final:
//• Qual foi a média de altura do grupo
//• Quantas pessoas pesam mais de 90Kg
//• Quantas pessoas que pesam menos de 50Kg tem menos de 1.60m
//• Quantas pessoas que medem mais de 1.90m pesam mais de
//100Kg.

fun main(){
    var mediaAltura = 0.0
    var pesoMaiorNoventa = 0
    var menorCinquenta = 0
    var pesoMaiorCem = 0


    for (i in 1..7){
        print("Informe o peso da pessoa ${i}: ")
        var peso = readln().toDouble()
        print("Informe a altura da pessoa ${i}: ")
        var altura = readln().toDouble()
        mediaAltura += altura
        println("----------------------------------|")

        if (peso > 90){
            pesoMaiorNoventa ++
        }
        if (peso < 50 && altura < 1.60){
            menorCinquenta ++
        }
        if (peso > 100 && altura > 1.90){
            pesoMaiorCem ++
        }

    }
    var somaAltura = mediaAltura / 7.0
    println("A media da altura do grupo: %.2f".format(somaAltura))
    println("Total de pessoas que pesam mais de 90Kg: $pesoMaiorNoventa")
    println("Pessoas que pesam menos de 50Kg e tem menos de 1.60 é de: $menorCinquenta")
    println("Pessoas que pesam mais de 100Kg e medem mais de 1.90 é de: $pesoMaiorCem")


}