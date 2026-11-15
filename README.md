# Representação de Pontos 2D e 3D em Java

Estudos de Programação Orientada a Objetos (POO) em Java. 

O projeto tem como objetivo representar pontos em um plano bidimensional (2D) e em um espaço tridimensional (3D), utilizando classes, objetos, construtores, encapsulamento e herança. 

A implementação utiliza duas classes principais: Ponto2D, responsável por representar pontos com coordenadas X e Y, e Ponto3D, que herda as características da primeira classe e acrescenta uma terceira coordenada, Z.

---
ESTRUTURA DO PROJETO

 - Ponto 2D: define a estrutura de um ponto bidimensional, com atributos para armazenar as coordenadas X e Y.
 - Ponto 3D: estende a classe Ponto2D, acrescentando o atributo Z e adaptando os métodos de representação dos pontos.
 - Principal: contém o método main, responsável pela criação dos objetos e execução do programa.
---
PONTO 2D | DEFINIÇÃO DOS ATRIBUTOS

A classe Ponto2D representa um ponto em um plano bidimensional, utilizando duas coordenadas: X e Y.

Os atributos são declarados como privados (private), aplicando o conceito de encapsulamento.

```
public class Ponto2D {
    private double x;
    private double y;
}
```
O construtor recebe os valores iniciais das coordenadas e utiliza this para atribuí-los aos atributos do objeto.

Também foram implementados métodos getters e setters, permitindo consultar e modificar as coordenadas.
```
public Ponto2D(double x, double y) {
    this.x = x;
    this.y = y;
}

public double getX() {
    return x;
}

public void setX(double x) {
    this.x = x;
}
```
A mesma estrutura é usada para a coordena y.
---
PONTO 3D | APLICAÇÃO DE HERANÇA

A classe Ponto3D utiliza extends Ponto2D para herdar os atributos e métodos disponíveis na classe Ponto2D.

Além das coordenadas X e Y herdadas, acrescenta o atributo Z, permitindo representar pontos em três dimensões.

```
public class Ponto3D extends Ponto2D {
    private double z;
}
```
```
public Ponto3D(double x, double y, double z) {
    super(x, y);
    this.z = z;
}
```
As duas classes possuem o método toString(), responsável por retornar uma representação textual dos dados do objeto.

Na classe Ponto3D, esse método é sobrescrito para acrescentar a coordenada Z à representação herdada da classe Ponto2D.
```
public String toString() {
    return "Ponto3D [z=" + z + "]" + super.toString();
}
```
super.toString() permite aproveitar a representação das coordenadas X e Y definida na classe pai.

imprimir() também é sobrescrito na classe Ponto3D, adaptando a apresentação das informações.
```
public void imprimir() {
    System.out.println(this);
}
```
---
PRINCIAPAL | INSTANCIAÇÃO E EXECUÇÃO

Aqui são criados dois objetos: um do Ponto2D e outro do Ponto3D.
```
public static void main(String[] args) {
    Ponto2D p2d = new Ponto2D(2, 1);
    Ponto3D p3d = new Ponto3D(3, 2, 1);

    p2d.imprimir();
    p3d.imprimir();
}
```
Os valores são passados diretamente aos construtores durante a instanciação dos objetos.

Depois o método imprimir() é chamado para apresentar as informações de cada ponto.
```
Ponto2D  [x=2.0] [ y=1.0]
Ponto3D [z=1.0] [x=3.0] [ y=2.0]
```
