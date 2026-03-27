Cálculo de Área de Triângulos — Refatoração com Orientação a Objetos

Sobre o projeto

Este projeto apresenta a solução de um problema clássico de programação, implementado em duas abordagens diferentes:

 Versão 1: Programação procedural
 Versão 2: Refatoração utilizando Orientação a Objetos (POO)

 O objetivo é demonstrar a evolução na estruturação do código e aplicação de boas práticas.

 Problema proposto

Fazer um programa para ler as medidas dos lados de dois triângulos X e Y (supondo medidas válidas).

Em seguida, o programa deve:

Calcular a área dos dois triângulos
Exibir os valores das áreas
Informar qual dos dois triângulos possui a maior área

Fórmula utilizada (Heron)

Para calcular a área de um triângulo a partir dos lados a, b e c, utilizamos a fórmula de Heron:

p = (a + b + c) / 2

area = √ (p * (p - a) * (p - b) * (p - c))


Refatoração com POO

Na versão orientada a objetos, foi criada uma classe para representar o triângulo, contendo:

Atributos: lados do triângulo (a, b, c)
Método: cálculo da área utilizando a fórmula de Heron

Isso permite encapsular a lógica e tornar o código mais limpo e reutilizável.

Este projeto faz parte do meu processo de aprendizado em desenvolvimento de software e tem como objetivo consolidar conceitos fundamentais de Java e POO.


