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

Esse projeto também depende da biblioteca matemática [JOML](https://github.com/JOML-CI/JOML), configurada no pom.xml, mas não utiliza qualquer biblioteca 
3D, como a OpenGL. Todo desenho será realizado pixel-a-pixel na imagem.

# Sobre este projeto

Este projeto contém o código base, vazio, da aula sobre raytracing. 
Trata-se dos arquivos necessários para acompanhar a aula em sala.

Nele, você encontrará algumas classes, já programadas. 

* Uma classe chamada [Raytracer](https://github.com/progjogos3d/raytracing-01/blob/master/src/br/pucpr/raytracer/Raytracer.java), vazia. É nela que iremos trabalhar.
* Uma classe chamada [Canvas](https://github.com/progjogos3d/raytracing-01/blob/master/src/br/pucpr/raytracer/Canvas.java), que encapsula o desenho de em uma BufferedImage;
* Classes para guardar informações sobre a luz ([Light](https://github.com/progjogos3d/raytracing-01/blob/master/src/br/pucpr/raytracer/Light.java)), materiais ([Material](https://github.com/progjogos3d/raytracing-01/blob/master/src/br/pucpr/raytracer/Material.java)) e sobre os feixes ([Ray](https://github.com/progjogos3d/raytracing-01/blob/master/src/br/pucpr/raytracer/Ray.java));
* Classes representando as primitivas [Plane](https://github.com/progjogos3d/raytracing-01/blob/master/src/br/pucpr/raytracer/primitives/Plane.java) e [Sphere](https://github.com/progjogos3d/raytracing-01/blob/master/src/br/pucpr/raytracer/primitives/Sphere.java).
* Uma classe chamada [Scene](https://github.com/progjogos3d/raytracing-01/blob/master/src/br/pucpr/raytracer/Scene.java), contendo alguns objetos já definidos.