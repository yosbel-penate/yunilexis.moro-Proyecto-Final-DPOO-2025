# Proyecto-ChronoConflux

"ChronoConflux: Fractures of Eternity"
Documento de visión inicial.

Géneros: Acción, RPG, Estrategia, Cooperativo, Multijugador (4 jugadores).


Descripción:
En ChronoConflux, los jugadores se convierten en hábiles viajeros del tiempo que tienen como objetivo detener a Oblivion Core, una poderosa entidad cósmica y el villano de esta historia, que busca desestabilizar la línea temporal mediante la destrucción de realidades.



El juego dispone de 24 personajes jugables agrupados en facciones pertenecientes a distintos períodos de la historia; cada uno de ellos cuenta con un ataque básico, una habilidad activa y una pasiva, una o dos categorías (soporte, asesino, control, etc) y estadísticas base que pueden mejorar mientras se juega.

Papel de cada integrante en el desarrollo del juego:
•Yunilexis Moro Martínez, jefa del proyecto, programadora de interfaces y asistente de diseño: encargada de dirigir el proyecto y programar la mayoría de interfaces del juego, además de diseñar algunos escenarios. 

•Jonathan Medina García, programador de jugabilidad: encargado de implementar el movimiento y las habilidades de combate.

•Roxana Roque López, programadora de IA y guionista: encargada de implementar el comportamiento de los enemigos y NPCs y de la escritura del guion.

•Luis Alberto Ramos Aponte, diseñador y  programador de gráficos y guionista: encargado de diseñar a los personajes, enemigos y escenarios e implementar sus animaciones, además de la integración de assets y escritura del guion.

•Alejandro Sarria Toledo, programador de red y de niveles: encargado de implementar la función multijugador y de programar y diseñar todos los niveles del juego.

Herramientas:

-Lenguaje: Java

-IDE: .Intelli J IDEA
      .Netbeans

-Asesoría de la IA

-Aseprite

-BandLab

-PlantUML 

-Scene Builder 

-Tiled:para la edicion de mapas

Nota: Puede que se utilice otras herramientas a medida que avanza el proyecto. 


Librerías:

-Java FX

-LibGDX

Nota: Puede que se utilice otras librerías a medida que avanza el proyecto. 


Gráficos:
Los personajes y escenarios del juego están adaptados a la 2D con un estilo pixel art.


Jugabilidad:
Los personajes jugables son capaces de moverse en 4 direcciones (arriba, abajo, izquierda y derecha), lanzar ataques (de corto o largo alcance), recolectar objetos, entre otras funciones. 


Modos de juego:
ChronoConflux posee varios modos de juego:
•Modo historia (por niveles): Modo principal, centrado en derrotar a Oblivion Core y rescatar la línea temporal. En este modo, el jugador inicia su aventura con una pequeña cantidad de energía temporal (recurso necesario para iniciar misiones) que lo limita a utilizar un único personaje, esta cantidad de energía aumenta a medida que se avanza; el máximo de personajes activos es 4, entre ellos habrá un líder (el que sea controlado por el jugador), el resto lo seguirá. En la versión multijugador del modo historia todos los jugadores deben elegir a su héroe sin repetir ninguno, las decisiones que afectan la trama las tomará el anfitrión. Las misiones tienen varios niveles de dificultad, siendo las últimas del mapa las más difíciles. En este modo, el jugador tendrá gestionar recursos limitados para subsistir en el trayecto. Se deberá tomar decisiones que serán clave para definir el final de la historia.


•Torre del Infinito: Modo sin fin, en el que el jugador deberá seleccionar sus personajes y enfrentarse a oleadas de enemigos hasta que cada uno de ellos perezca.


•Conflux PvP: Modo competitivo donde dos jugadores enfrentarán a sus equipos de cuatro personajes por la victoria.


•Cooperativo asincromático: Podrás ayudar a otros jugadores en su aventura enviándoles héroes.


En juego cuenta con un modo especial de estrategia:

•Conflux Wars: Modo estrategia en el que el jugador escogerá una facción de héroes e intentará apoderarse de todo el terreno mediante combates estratégicos por turnos. Cada facción posee ventajas y desventajas. En este modo el jugador tendrá que gestionar recursos y reclutar unidades para alzarse con la victoria.


Sistema de carpetas:

●ChronoConflux/
•Screens: Gestión de pantalla del juego.
-Pantalla principal del juego.
-Menú principal.
•Entitis: Gestión de entidades.
-Personajes jugables.
-Personajes no jugables.
-Enemigos.
•Combat: Sistema de combate.
•Maps: Mapas y escenarios.
•UI: Interfaces.
-Barra de vida.
-Barra de energía temporal.
•Sounds: Efectos de sonido y música.
•Sprites: Gestión de sprites.
-Sprites de personajes y enemigos.
Nota: Algunas carpetas pueden ser añadidas o reorganizadas a medida que avanza el proyecto.


Conclusiones:
Este documento tiene como objetivo brindar una visión general del proyecto a desarrollar de la forma más simplificada posible. 

Requisitos del sistema :

Requisitos mínimos :
-Sistema Operativo: Windows 7/8/10 (32-bit)

-Procesador: Intel Core i3 o equivalente

-Memoria RAM: 2 GB mínimo 

-Gráficos: Tarjeta gráfica compatible con DirectX 11 con 1 GB de VRAM

-DirectX: Versión 11


-Almacenamiento: 500 MB de espacio disponible 

-Sonido: Tarjeta de sonido compatible con DirectX
 
Requisitos recomendados:
Memoria RAM:4GB

Almacenamiento: 1GB de espacio disponible
