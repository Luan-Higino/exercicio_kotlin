fun main() {
    println("Digite o primeiro número: ")
    var num1 = readln().toDouble()
    var terca = String.format("%.2f", num1/3)

    println("O dobro é: ${num1*2}")
    println("A terça parte é: $terca")
}