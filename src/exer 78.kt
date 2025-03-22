///Faça um programa que leia 7 nomes de pessoas e guarde-os em
//um vetor. No final, mostre uma listagem com todos os nomes
//informados, na ordem inversa daquela em que eles foram
//informados.

fun main(){
    val nomes = mutableListOf<String>()

    for (i in 1..7){
        print("Digite seu nome: ")
        val nome = readln()
        nomes.add(nome)
    }
    println("\n nomes na ordem inversa: ")
    for (i in nomes.size -1 downTo 0){
        println(nomes[i])
    }

}
