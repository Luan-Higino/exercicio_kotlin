///Escreva um programa que leia 15 números e guarde-os em um
//vetor. No final, mostre o vetor inteiro na tela e em seguida
//mostre em que posições foram digitados valores que são múltiplos
//de 10.

fun main(){
    val numeros  = mutableListOf<Int>()

    for (i in 1..15){
        print("Digite o $i numero: ")
        val numero = readln().toInt()
        numeros.add(numero)
    }
    print("\nOs numeros digitados foram : ${numeros }")
    println("\n=============================")
    println("\nNumeros multiplos de 10")
    for (i in numeros.indices){
        if (numeros[i] %10 == 0){
            println("\n Multiplo de 10, no vetor $i, valor : ${numeros[i]}")
        }
    }


}
