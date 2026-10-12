# MiniLoja

Loja virtual de terminal desenvolvida em Java para praticar menus, estruturas condicionais e entrada de dados. O projeto está **em desenvolvimento**: a base do menu e o cálculo de compra já funcionam, e as próximas funcionalidades estão listadas abaixo.

## Funcionalidades atuais

- Menu principal com as opções da loja
- Listagem de produtos com preços
- Compra de um produto com escolha da quantidade e cálculo do valor total
- Mensagem de erro para opção de produto inexistente

## Produtos disponíveis

| Nº | Produto            | Preço     |
|----|--------------------|-----------|
| 1  | Calça Preta        | R$ 100,00 |
| 2  | Calça Bege         | R$ 95,00  |
| 3  | Camiseta Colorida  | R$ 70,00  |
| 4  | Sapato Social      | R$ 95,00  |

## Tecnologias

- Java
- Classe `Scanner` para leitura de dados no terminal

## Como executar

### Pré-requisito

Ter o [JDK](https://adoptium.net/) instalado. Para conferir, rode no terminal:

```bash
java -version
```

### Passo a passo

1. Clone o repositório:

```bash
git clone https://github.com/Rafael4antunes/NOME-DO-REPOSITORIO.git
cd NOME-DO-REPOSITORIO
```

2. Compile:

```bash
javac -d out MiniLoja.java
```

3. Execute:

```bash
java -cp out project.MiniLoja
```

> Também é possível abrir a pasta em uma IDE (NetBeans, IntelliJ, Eclipse) e rodar a classe `MiniLoja`.

## Exemplo de uso

```
========================
     Lojinha Digital
========================
[1] Ver produtos
[2] Comprar produto
[3] Ver carrinho
[4] Ver saldo
[5] Sair
Escolha uma opção:
2
[1] Calça Preta - R$100,00
[2] Calça Bege - R$95,00
[3] Camiseta Colorida - R$70,00
[4] Sapato Social - R$95,00
Qual gostaria:
3
Qual a quantidade:
2
O valor total da compra é: 140.0
```

## Estrutura do projeto

```
├── MiniLoja.java    # classe principal com o menu e a lógica de compra
├── .gitignore
└── README.md
```

## O que estou praticando

- Leitura de dados com `Scanner`
- Uso de `switch` e `if/else if/else`
- Cálculo de valores com `double`

## Próximos passos

- [ ] Repetir o menu com um laço `while` até o usuário escolher "Sair"
- [ ] Criar a classe `Produto` e guardar os produtos em um `ArrayList`
- [ ] Implementar o carrinho de compras (opção 3)
- [ ] Implementar o saldo do cliente, descontado a cada compra (opção 4)
- [ ] Validar entradas (letras no lugar de números, quantidade zero ou negativa)
- [ ] Separar o código em métodos e classes
- [ ] Salvar os dados em arquivo

## Autor

Feito por **Rafael Antunes** — estudante de Ciência da Computação.

[GitHub](https://github.com/Rafael4antunes)
