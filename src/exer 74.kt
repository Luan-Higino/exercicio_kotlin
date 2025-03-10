///Crie um programa que preencha automaticamente (usando
//lógica, não apenas atribuindo diretamente) um vetor numérico
//com 10 posições, conforme abaixo:
//9 8 7 6 5 4 3 2 1 0
//0 1 2 3 4 5 6 7 8 9

fun main(){
    val vetor = IntArray(10)

    for (i in 0..9){
        vetor[i] = 9 - i
    }
    println("Vetor de 9 a 0:")
    for (num in vetor){
        print("$num ")
    }
    println()
    for (i in vetor.indices){
        print("$i ")
    }
}
