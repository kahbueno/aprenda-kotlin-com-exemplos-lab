enum class Nivel { BASICO, INTERMEDIARIO, AVANÇADO }

data class Aluno(val name: String)

data class ConteudoEducacional(val nome: String, val duracao: Int, var nivel: Nivel)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Aluno>()
    
    fun matricular(vararg alunos: Aluno){
    for (aluno in alunos) {
        inscritos.add(aluno)
    }}
}

fun main() {
    val conteudo1 = ConteudoEducacional("Introdução", 120, Nivel.BASICO)
    val conteudo2 = ConteudoEducacional("Orientações a Objetos", 180, Nivel.INTERMEDIARIO)
    val conteudo3 = ConteudoEducacional("Funções e Tratamento de Exceções", 240, Nivel.AVANÇADO)
    val conteudos = listOf(conteudo1, conteudo2, conteudo3)
    
     val formacao = Formacao("Linguagem de Programção Kotlin", conteudos)
    
    val aluno1 = Aluno("Karenn")
    val aluno2 = Aluno("Falvo Jr")
    val aluno3 = Aluno("DIO")
    formacao.matricular(aluno1, aluno2, aluno3)
    
    println("Informações sobre a formação ${formacao.nome}:")
    for (conteudo in formacao.conteudos){
        println(conteudo.toString())
    }
    println()
    println("Inscritos:")
    for (inscrito in formacao.inscritos){
        println(inscrito.name)
    }
    
}
