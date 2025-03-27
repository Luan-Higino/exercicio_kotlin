///Crie um programa que melhore o procedimento Gerador() da
//questão anterior para que mostre uma mensagem personalizada,
//passada como parâmetro.
//Ex: Ao chamar Gerador(&quot;Aprendendo Portugol&quot;) aparece:
//+ ======= +
//Aprendendo Portugol
//+ ======= +

fun gerador(mensagem:String){
    val linha = "+ " + "=".repeat(mensagem.length) + "+"
    println(linha)
    println(mensagem)
    println(linha)
}
fun main(){
    gerador("Aprendendo Kotlin")
}
