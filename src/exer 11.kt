/**
 * Desenvolva uma lógica que leia os valores de A, B e C de
 * uma equação do segundo grau e mostre o valor de Delta.
 */

fun main(){
    println("Valor de A:")
    var a = readln().toDouble()
    println("Valor de B:")
    var b = readln().toDouble()
    println("Valor de C:")
    var c = readln().toDouble()
    val delta = (b * b) - (4 * a * c)
    println("Valor de Delta é: $delta")

}
