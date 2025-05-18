DESAFIO
Geronimo acredita que perde muito tempo lembrando qual número do mês representa cada um deles. Ele precisa de um programa que mude os meses do ano do calendário do celular dele para facilitar e agilizar a leitura. Ajude-o e faça um programa que, com uma determinada entrada de uma data, retorne essa data com o mês escrito por extenso.

ENTRADA
As entradas serão datas em formato numeral. O dia ou mês que possuirem somente um digito, terão um 0 (zero) na frente.

SAÍDA
As saídas serão as mesmas datas da entrada porém, com o mês escrito por extenso. O mês deve ter a primeira letra em maiúsculo.

EXEMPLOS
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

----------------------------------------
|   ENTRADA  |          SAÍDA          | 
----------------------------------------
| 19/10/1997 | 19 de Outubro de 1997   | 
----------------------------------------
| 25/12/2019 | 25 de Dezembro de 2019  | 
----------------------------------------
| 02/02/2020 | 02 de Fevereiro de 2020 | 
----------------------------------------
| 23/03/2003 | 23 de Marco de 2003     | 
----------------------------------------

RESOLUÇÃO

fun main() {
    val entrada: String? = readLine()

    // Divide a entrada nas partes: dia, mês e ano
    val (dia, mes, ano) = entrada!!.split("/")

    // Converte o número do mês para seu nome por extenso
    val mesPorExtenso = when (mes.toInt()) {
        1 -> "Janeiro"
        2 -> "Fevereiro"
        3 -> "Marco"
        4 -> "Abril"
        5 -> "Maio"
        6 -> "Junho"
        7 -> "Julho"
        8 -> "Agosto"
        9 -> "Setembro"
        10 -> "Outubro"
        11 -> "Novembro"
        12 -> "Dezembro"
        else -> "Mês Inválido!"
    }

    // Imprime a data com o mês por extenso
    println("$dia de $mesPorExtenso de $ano")
}
