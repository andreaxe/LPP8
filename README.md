# Projecto 8

Numa loja de venda de fruta, toda a fruta tem um nome e um preço base. A loja vende a fruta de três formas: 

1. à unidade;
2. ao peso; 
3. volume. 

O preço total é calculado multiplicando o preço base pelo número de unidades, 
pelo peso ou pelo volume, conforme o caso. 

Qualquer tipo de fruta (p.e. banana, laranja, maçã) pode ser vendido à unidade, ao peso ou ao volume.

Pretende-se o desenvolvimento de um Projeto Java, com uma hierarquia de classes. 
As classes 

1. FrutaUnidade
2. FrutaPeso
3. FrutaVolume 

herdam da classe **Fruta**. Deverá ainda existir uma classe **CabazDeFruta** que que representa as várias 
frutas a serem compradas. Esta classe deverá incluir métodos para:

1. Inserir no cabaz uma compra de uma dada fruta;
2. Calcular o valor total dos frutos comprados;
3. Calcular o valor total gasto para um dado tipo de fruta (o nome da fruta).

Por uma questão de compatibilidade com classes de outros projetos, o método que efetua os 
cálculos do valor a pagar, a usar nas várias classes, terá o nome valorPago, 
retorna o tipo double e não tem parâmetros. Este método deverá estar declarado numa interface.

O projeto deverá incluir uma classe para testar as restantes e que irá conter o método main.

Todas as classes deverão conter os métodos habituais (construtores, métodos de acesso e, pelo menos, toString() e clone()).

A interface deverá ser o mais simples possível, em modo consola.