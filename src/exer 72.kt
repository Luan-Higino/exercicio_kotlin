///Faça um programa que preencha automaticamente um vetor
//numérico com 8 posições, conforme abaixo:
//999 999 999 999 999 999 999 999
//0 1 2 3 4 5 6 7

fun main(){

    val vetor = IntArray(8){999}

    for (num in vetor){
        print("$num ")
    }
    println()
    for (i in vetor.indices)
        print("$i ")
}
