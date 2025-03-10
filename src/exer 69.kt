///Crie um programa que leia sexo e peso de 8 pessoas,
//usando a estrutura “para”. No final, mostre na tela:
//• Quantas mulheres foram cadastradas
//• Quantos homens pesam mais de 100Kg
//• A média de peso entre as mulheres
//• O maior peso entre os homens

fun main(){

    var mulherCadastrada = 0
    var homemMaisCem = 0
    var mediaMulher = 0.0
    var maiorPesoHomem = Double.MIN_VALUE

    for (i in 0..8){
        print("Digite seu sexo(Feminino/Masculino): ")
        val sexo = readln().lowercase()
        print("Digite seu peso: ")
        val peso = readln().toDouble()

        if (sexo == "feminino") mediaMulher += peso
        if (sexo == "feminino") mulherCadastrada ++
        if (sexo == "masculino" && peso > 100) homemMaisCem ++
        if (sexo == "masculino" && peso > maiorPesoHomem){
            maiorPesoHomem = peso
        }
    }
    val soma = if (mulherCadastrada > 0) mediaMulher / mulherCadastrada else 0
    println("\n==========RESULTADOS==========")
    println("O total de mulheres cadastradas: $mulherCadastrada")
    println("Total de homens, que pesam mais de 100Kg: $homemMaisCem")
    println("A media de peso entre as mulheres: $soma")
    println("O maior peso entre os homens: $maiorPesoHomem")
}
