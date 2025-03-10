

///Crie um programa que preencha automaticamente (usando
//lógica, não apenas atribuindo diretamente) um vetor numérico
//com 10 posições, conforme abaixo:
//5 3 5 3 5 3 5 3 5 3
//0 1 2 3 4 5 6 7 8 9

fun main(){

    val vetor = IntArray(10)

    for (i in 0..9){
        if (i % 2 == 0){
            vetor[i] = 5
        }else{
            vetor[i] = 3
        }
    }
    for (num in vetor){
        print("$num ")
    }
    println()
    for (i in 0..9){
        vetor[i] = i
    }
    for (num in vetor){
        print("$num ")
    }


}
