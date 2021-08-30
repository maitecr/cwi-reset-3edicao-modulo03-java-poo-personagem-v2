# cwi-reset-3edicao-modulo03-java-poo-personagem-v2

![soni02](https://user-images.githubusercontent.com/81782090/131369265-e9426400-6aed-4c4d-b967-fb2eb8bd6cc1.jpg)


Este repositório será destinado apenas às soluções dos exercícios propostos, elaboradas por mim, durante a 3ª Edição do programa Reset da empresa CWI. Estarão disponibilizados os códigos correspondentes ao Módulo 03, onde foi a Programação Orientada a Objeto, voltada para a linguagem Java.

Esta é a segunda versão da atividade elaborada anteriormente, disponível no link: https://github.com/maitecr/cwi-reset-3edicao-modulo03-java-poo-personagem. 

Nesta segunda versão, os atributos referentes a espécie, cor da pele, vestuario, impulso, anel e enrolar foram excluídos, bem como seus métodos getters e setters.

Foram adicionados os atributos referentes a estamnia, moedas coletas e quantidade de vidas.
Assim como os métodos:
revigorar();
morrer();
perderEstamina();
ganharEstamina();
coletarMoedas();

1º Teste:
a. Foi iniciado pelo método "status()" que retorna as características configuradas pelo método construtor;

b. Descontou-se a estamina pelo método "perderEstamina()", a fim de verificar se retornaria o valor zero, mesmo que fossem descontada além;

c. Método "revigorar()" para repor o valor 100 na estamina.

![perder-estamina-revigorar](https://user-images.githubusercontent.com/81782090/131367460-603ddd0c-46e6-4f37-80cc-112605792e5a.jpg)


2º Teste:
a. Foi iniciado pelo método "status()" que retorna as características configuradas pelo método construtor;

b. Verificou-se se, através do método "perderEstamina()", o valor era descontado do atributo, assim como, se o método "ganharEstamina()" acrescentava valor.

![ganhar-estamina](https://user-images.githubusercontent.com/81782090/131367789-9a785f78-0869-4511-9930-95938c3bf2ee.jpg)

c. Também foi verificado se, ao acrescentar estamina acima de 100, o valor seria acrescentado ou permaneceria em 100.

![ganhar-estamina-acima-100](https://user-images.githubusercontent.com/81782090/131368048-be27f365-0fa0-41aa-ab05-92e69a3cc9ee.jpg)

3º Teste:
a. Foi iniciado pelo método "status()" que retorna as características configuradas pelo método construtor;

b. Chamamos o método "perderEstamina()" e o "coletarMoedas()". Através do "coletarMoedas()", foi possível verificar se a contagem estava sendo computada e se, depois de acrescentar 10 moedas, seria acrescentada o valor de 1 vida;

c. Por último, foi testado o método "morrer()", a fim de verificar se o valor de 1 vida era descontado e se a estamina revigorava para o valor de 100.

![perder-estamina-coletar-moedas-morrer-status](https://user-images.githubusercontent.com/81782090/131368700-d103eac6-b81c-4fe1-a1bb-3e9f79aa1206.jpg)


4º Teste:
a. Foi iniciado pelo método "status()" que retorna as características configuradas pelo método construtor;

b. O método "morrer()" foi utilizado duas vezes para verificarmos se contabilizaria um número negativo ou manteria o número de vidas em zero.

![morrer-2x-vidas-zero](https://user-images.githubusercontent.com/81782090/131369096-4c59e80c-5d4e-4d58-8d1c-4ac3e0d0e328.jpg)


Atualiado em 30 de Agosto de 20210.

