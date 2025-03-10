///Crie um programa que preencha automaticamente (usando
//lógica, não apenas atribuindo diretamente) um vetor numérico
//com 10 posições, conforme abaixo:
//5 10 15 20 25 30 35 40 45 50
//0 1 2 3 4 5 6 7 8 9

fun main(){

    val vetor = IntArray(10)

    for (i in vetor.indices){
        vetor[i] = (i+1)*5
    }

    println("Vetor com multiplos de 5: ")

    for (num in vetor){
        print("$num ")
    }
    println()
    for (i in vetor.indices){
        print("$i ")
    }

}
