/**
 * Programa para calcular a redução do tempo de vida de um fumante.
 * O usuário informa a quantidade de cigarros fumados por dia e há quantos anos fuma.
 * Considera-se que cada cigarro reduz a vida em 10 minutos.
 * O resultado é exibido em dias perdidos.
 */

fun main() {
    print("Quantos cigarros você fuma por dia? ")
    val cigarrosPorDia = readln().toInt()

    print("Há quantos anos você fuma? ")
    val anosFumando = readln().toInt()

    val minutosPerdidosPorCigarro = 10
    val minutosPorHora = 60
    val horasPorDia = 24

    val totalCigarros = cigarrosPorDia * anosFumando * 365

    val minutosPerdidos = totalCigarros * minutosPerdidosPorCigarro

    val diasPerdidos = minutosPerdidos / (minutosPorHora * horasPorDia)

    println("Você perdeu aproximadamente $diasPerdidos dias de vida devido ao fumo.")
}