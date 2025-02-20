/*Faça um algoritmo que pergunte a distância que um
passageiro deseja percorrer em Km. Calcule o preço da
passagem, cobrando R$0.50 por Km para viagens até 200Km e
R$0.45 para viagens mais longas.
 */

fun main(){
    println("Qual seu nome:")
    val nome = readLine().toString()
    println("$nome, qual a distância que deseja percorrer: ")
    var distancia = readln().toDouble()

    val valorKm = 0.50
    val acimaDe200 = 0.45

    if (distancia <= 200){
        println("$nome, o valor a ser cobrado por essa distância é de R$${distancia * valorKm}")
    }else{
        println("$nome, o valor a ser cobrado por essa distância é de R$${distancia * acimaDe200}")
    }


}