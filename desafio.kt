// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

//DESAFIO EM KOTLIN
//NIVEIS
enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }
//CLASSE DO USUÁRIO
class Usuario(val nome: String)

//CONTEUDO
data class ConteudoEducacional(val nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {
    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("Usuário ${usuario.nome} matriculado na formação $nome.")
    }
}

//Formação
fun main() {
    val kotlinBasico = ConteudoEducacional("Kotlin Básico", 30)
    val kotlinAvancado = ConteudoEducacional("Kotlin Avançado", 45)

    val formacaoKotlin = Formacao("Formação Kotlin", listOf(kotlinBasico, kotlinAvancado))

    val usuario1 = Usuario("Phelipe")
    val usuario2 = Usuario("Vitória")

    formacaoKotlin.matricular(usuario1)
    formacaoKotlin.matricular(usuario2)

    formacaoKotlin.inscritos.forEach {
        println("Usuário matriculado na formação: ${it.nome}")
    }
}

