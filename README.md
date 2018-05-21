# Projeto base - Ray tracing

Este projeto contém o código base da aula 1. Ele já possui algumas implementações, descritas a seguir
 
# Instalação

## Aplicativos

Para executar os exemplos da aula você precisará:
 - Do JDK instalado, na versão 8. Você pode baixa-lo [aqui](http://www.oracle.com/technetwork/java/javase/downloads/index.html).
 - De uma IDE para desenvolvimento Java, preferencialmente o [IntelliJ Idea](https://www.jetbrains.com/idea/?fromMenu). 
 A Jetbrains libera a licença da versão premium para estudantes, porém, todos os exemplos rodam na versão community. 
 Outra alternativa é a IDE [Eclipse](https://www.eclipse.org/downloads/eclipse-packages/). Baixe o package 
 "for Java Developers", não utilizaremos os recursos da versão Enterprise, bem mais pesada.
 
 ## Bibliotecas

Utilizaremos as bibliotecas [JOML](https://github.com/JOML-CI/JOML), que contém as classes matemáticas e 
a [LWJGL](https://www.lwjgl.org/), que dá acesso as bibliotecas OpenGL, GLFW e stb. 

# Sobre este projeto

Este projeto contém o código base, vazio, da aula sobre raytracing. 
Trata-se dos arquivos necessários para acompanhar a aula em sala.

Nele, você encontrará algumas classes, já programadas. 

* Uma classe chamada Canvas, que encapsula o desenho de em uma BufferedImage;
* Classes para guardar informações sobre a luz (Light), materiais (Material) e sobre os feixes (Ray);
* Classes representando as primitivas Plane e Sphere.
* Uma classe chamada Scene, contendo alguns objetos já definidos.
* Uma classe chamada Raytracer, vazia. É nela que iremos trabalhar.

Esse projeto também depende da biblioteca matemática JOML, configurada no pom.xml, mas não utiliza qualquer biblioteca 
3D, como a OpenGL. Todo desenho será realizado pixel-a-pixel na imagem.