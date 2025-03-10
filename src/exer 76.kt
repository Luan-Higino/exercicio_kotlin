///Crie um programa que preencha automaticamente (usando
//lógica, não apenas atribuindo diretamente) um vetor numérico
//com 15 posições com os primeiros elementos da sequência de
//Fibonacci:
//1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987
//0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15

fun main(){

    val vetor = IntArray(16)

    var anterior = 1
    var atual = 1
    vetor[0] = anterior
    vetor[1] = atual

    for (i in 2..15){
        val proximo = anterior + atual
        vetor[i] = proximo
        anterior = atual
        atual = proximo
    }

    for (num in vetor){
        print("$num ")
    }
    println()
    for (i in 0..15){
        print("$i ")
    }
}
