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

1º Teste: Consistia em, através do método "status()", verificar se "perderEstamina()" e "revigorar()" estavam contabilizando a estamina. Além de verificar se quando, usado mais de dez vezes "perderEstamina()", o estamina permaneceria em zero ou contabilizaria como número negativo (o que não deveria acontecer).

![perder-estamina-revigorar](https://user-images.githubusercontent.com/81782090/131367460-603ddd0c-46e6-4f37-80cc-112605792e5a.jpg)


2º Teste: Verificar se os métodos "perderEstamina()" e "ganharEstamina()" acrescenta os devidos valores ao atributo de estamina.

![ganhar-estamina](https://user-images.githubusercontent.com/81782090/131367789-9a785f78-0869-4511-9930-95938c3bf2ee.jpg)

Depois, foi testado se "ganharEstamina()" acrescentaria um valor acima de cem no atributo estamina, o que não deveria acontecer.

![ganhar-estamina-acima-100](https://user-images.githubusercontent.com/81782090/131368048-be27f365-0fa0-41aa-ab05-92e69a3cc9ee.jpg)

3º Teste: Chamamos os métodos "perderEstamina()" e o "coletarMoedas()". Através do "coletarMoedas()", foi possível verificar se a contagem estava sendo computada e se, depois de acrescentar 10 moedas, seria somada mais 1 valor em vida. E, por fim, foi testado o método "morrer()", a fim de verificar se o valor de 1 vida era descontado e se a estamina revigorava para o valor de 100.

![perder-estamina-coletar-moedas-morrer-status](https://user-images.githubusercontent.com/81782090/131368700-d103eac6-b81c-4fe1-a1bb-3e9f79aa1206.jpg)

4º Teste: Foi verificado se o método "morrer()" contabilizaria um número negativo ou manteria o número de vidas em zero.

![morrer-2x-vidas-zero](https://user-images.githubusercontent.com/81782090/131369096-4c59e80c-5d4e-4d58-8d1c-4ac3e0d0e328.jpg)

                                                                    Atualiado em 30 de Agosto de 20210.

Introdução da criação de objetos com arrays, onde, através do método construtor, podemos configurar seus nomes, velocidades e se possuem o anel que aumenta sua velocidade. 

Caso possuam o anel, sua velocidade é multiplicada por cinco vezes, como nos exemplos abaixo.

![aumentavelocidadept1](https://user-images.githubusercontent.com/81782090/131552432-e69d6509-2c3b-4868-b534-c34bafe7e894.jpg)

![aumentavelocidadep2](https://user-images.githubusercontent.com/81782090/131552452-360b4b3e-ddce-42d8-8570-b8a20804dd70.jpg)

Os métodos "perderVelocidade()" e "ganharVelocidade()" foram excluídos.

                                                                    Atualizado em 31 de Agosto de 2021.

Nesta atualização, iniciamos o tema de relacionamento entre classes (agregação). Onde foi criado um novo método costrutor em uma nova classe, chamada Jogo, que recebia dois jogadores. Este método construtor poderia executar o método "jogar()", onde atribuiria um valor aleatório ao atributo de moedas (presente na classe Personagem) e, assim, a partir da referência ao método "coletarMoedas()" (também na classe Personagem), contabilizaria o número de moedas coletadas e acrescentaria um valor a mais no atributo de vida.

![coletarmoedasfor](https://user-images.githubusercontent.com/81782090/131761713-164f7f89-efb2-4e25-8e7c-73279b2e8b90.jpg)

                                                                   Atualizado em 01 de Setembro de 2021.
