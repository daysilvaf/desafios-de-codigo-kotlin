DESAFIO
Faça um programa que calcule e imprima o salário a ser transferido para um funcionário. Para realizar o calculo, primeiro receba o valor do salário bruto (valorSalario) e adicional dos benefícios (valorBeneficios). Por fim, o salário a ser transferido é calculado da seguinte maneira: 
(valorSalario - valorImpostos) + valorBeneficios

Para calcular o valorImpostos, seguem as aliquotas (baseadas no valor do salário bruto):

    De R$ 0.00 a R$ 1100.00 = 5.00%
    De R$ 1100.01 a R$ 2500.00 = 10.00%
    Maior que R$ 2500.00 = 15.00%

ENTRADA
A entrada consiste em vários arquivos de teste, que conterá o valor do salário bruto (valorSalario) e adicional dos benefícios (valorBeneficios). Conforme mostrado no exemplo de entrada a seguir.

SAÍDA 
Para cada conjunto de Entradas (valorSalario e valorBeneficios), deverá ser calculada uma Saída. Para isso, basta imprimir uma linha com o resultado da seguinte fórmula:
saida = (valorSalario - valorImpostos) + valorBeneficios
Use o exemplo abaixo para entender melhor a formatação das Entradas e Saída.

EXEMPLOS
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

---------------------
| ENTRADA |  SAÍDA  | 
---------------------
|   2000  | 2050.00 | 
|   250   |         |
---------------------
|   1100  | 1045.00 | 
|   50    |         |
---------------------
|   3000  | 2960.00 | 
|   400   |         | 
---------------------

RESOLUÇÃO 

object ReceitaFederal {
    fun calcularImposto(salario: Double): Double {
        val aliquota = when {
            salario <= 1100.00 -> 0.05
            salario <= 2500.00 -> 0.10
            else -> 0.15
        }
        return aliquota * salario
    }
}

fun main() {
    val valorSalario = readLine()!!.toDouble()
    val valorBeneficios = readLine()!!.toDouble()

    val valorImposto = ReceitaFederal.calcularImposto(valorSalario)
    val saida = valorSalario - valorImposto + valorBeneficios

    println(String.format("%.2f", saida))
}
