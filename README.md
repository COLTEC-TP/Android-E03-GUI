# Android E03: Layouts

Professor: João Eduardo Montandon

<<<<<<< HEAD
=======
## Configuração do Ambiente

Esta lista é composta por vários projetos, onde cada um está em seu branch específico. Para carregar o projeto dessa lista você deverá fazer o clone do seu fork e executar o seguinte comando:
```
$ cd Android-E03-GUI        # Acessar o diretório do projeto
$ git checkout layouts      # altera para o branch do exercício
```

Em seguida, você deverá abrir o Android Studio e abrir o projeto através da opção `File > New > Import Project...`.

## Explorando os Layouts
>>>>>>> layouts

Como pré-requisito, esse exercício requer que você tenha terminado o exercício [anterior](https://github.com/COLTEC-TP/Android-E03-GUI/tree/layouts).

Caso você já tenha terminado, é necessário atualizar este branch com o código implementado. Para isso, execute o comando abaixo no diretório do projeto:

```
$ git checkout widgets      # altera para o branch do exercício
$ git merge layouts         # Atualiza o branch widgets com o conteúdo de layouts
```

## Utilizando Dialogs

Durante o preenchimento de um formulário, é uma boa prática exibir uma mensagem pedindo para que o usuário confirme o envio da mensagem, conforme esse [modelo](https://i.stack.imgur.com/wmgBG.png). No desenvolvimento de aplicativos para Android, geralmente essas mensagens de confirmação são codificadas por um `Dialog`.

<<<<<<< HEAD
Você deverá implementar uma mensagem de confirmação para o usuário utilizando a classe `AlertDialog`. O `AlertDialog` deverá ser exibido no momento em que o usuário clicar no botão para envio do comentário. 
=======
Utilize o `RelativeLayout` para criar uma tela de exibição de notícia. A tela deverá conter:

* Título da notícia no topo da tela
* Subtítulo, posicionado embaixo do título
* Nome do autor, posicionado embaixo do subítulo, ancorado a direita
* Corpo da notícia, posicionado embaixo do autor
* Horário de postagem da notícia, embaixo do corpo da notícia, ancorado a direita
* Foto do autor, localizado embaixo do horário de postagem, localizado a esqueda
* Contatos do autor (nome + email), localizado a direita da foto do autor, ocupando o restante da tela 

### Previsão do Tempo

Utilize o `TableLayout` para criar uma tela de exibição da previsão do tempo dos últimos dias. A tela deverá apresentar a previsão diária, onde cada dia ocupará uma linha da tabela. Para cada dia, será necessário exibir o dia, um ícone com o resumo do tempo, e as temperaturas máxima e mínima para aquele dia. Utilize essa [imagem](http://www.inlovewithandroid.com/images/best-android-weather-app-yahoo-weather3.jpg) como referência.

### Formulário

Utilize o `LinearLayout` para criar uma tela de formulário de cadastro de um comentário de um aplicativo de avaliação de produtos. Essa tela deverá permitir ao usuário fornecer as seguintes informações:

* Nome
* E-mail
* Comentário (campo de texto com várias linhas)
* Nota (escala de 1 a 5)
* Botão para submeter o formulário

*OBS: Sua tela deverá organizar os layouts no formato vertical!!*

### Empacotando Tudo

Altere a `MainActivity` do projeto incluindo uma série de botões que, ao serem clicados, redirecione para cada uma das telas criadas anteriormente.
 
>>>>>>> layouts

Ainda, você deverá tratar as ambas as situações de confirmação e cancelamento do envio. Utilize `Toast` para exibir a mensagem de confirmação/cancelamento de envio do comentário.

## Internacionalização

Uma vez que seu app estiver disponível na Play Store, usuários de vários países podem baixar e utilizar seu aplicativo a qualquer momento. Por isso, o recurso de internacionalização é extremamente importante para o desenvolvimento de aplicaitvos móveis em geral.

Aplique os recursos de internacionalização nas telas de **Previsão do Tempo** e **Comentários** para que ele suporte duas línguas: português e inglês. Para isso, você precisará configurar seu projeto com arquivos `string.xml` para cada língua, e preenchê-los com os respectivos textos necessários para tradução.