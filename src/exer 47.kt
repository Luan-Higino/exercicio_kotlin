///Desenvolva um aplicativo que mostre na tela o resultado da
//expressão 500 +
//450 + 400 + 350 + 300 + ... + 50 + 0

fun main() {
    var soma = 0

    for (i in 500 downTo 0 step 50) {
        soma += i
        if (i != 0) {
            print("$i + ")
        }else{
            print(i)
        }
    }
    println()
    println("Resultado: $soma")
}
