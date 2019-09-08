## Instruções para instalação

### As instruções consideram que:
- O usuário já tem o **Eclispe EE** instalado;
- O usuário já tem o **JDK** (Java Develompent Kit) instalado


### Instruções:

1. *Baixe* o projeto;
2. *Extraia* o projeto;
3. *Abra* o Eclipse;
4. *Importe* o projeto:
	- No *menu de navegação* do **Eclipse**, clique em: File > Import > Existing Maven Projects > Clique em *Next*;
	- *Navegue* até a pasta do projeto;
	- *Clique* em Finish.
5. *Aguarde* o **Maven** *baixar* todas as **dependências**;
6. *Abra* a classe **App.java** localizada em **src/main/java/br/com/inmetrics**;
7. No *menu de navegação* do **Eclipse**, clique em: Run > Run As > *JUnit Test*;
8. *Aguarde* a execução do **teste**;
9. Volte ao **Eclipse**, *clique* na aba **JUnit** e verifique que o *teste* foi executado com *sucesso*.

*OBS**: Se o **chromedriver não for compatível** (o projeto está usando a *versão 75*), será necessário *baixar* um que seja *compatível [aqui](https://chromedriver.chromium.org/downloads)**.
