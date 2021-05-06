# CalculadoraAndroid
<p>Este repositorio contiene la aplicación android de una calculadora</p>
<h2>1º El diseño de la calculadora🐱‍🏍✨</h2>
<p>El diseño de la calculadora se divide en dos fases en la primera que es la actividad que se ejecuta </br>
<img  src="./images/diseño.PNG"/></br></br>
<img  src="./images/vista.PNG"/></br></br>
Y la segunda parte que es la actividad que se ejecuta cuando se da al igual que muestra el resultado de la cuenta</br>
<img  src="./images/diseño2.PNG"/></br></br>
<img  src="./images/vista2.PNG"/></br></br>
</p>
<h2>2º El codigo de la calculadora🐱‍🏍✨</h2>
<p>El codigo de la calculadora tambien se divide en dos fases:</p>
 <h3>1ª Fase: 🥇🥈🥉</h3> 
<p>
 Es la actividad que se ejecuta en la cual hace falta crear diferentes propiedades de la clase MainActivity.java las cuales son dos StringBuffer donde se acomularan los numeros de los botones un string para el tipo de cuenta que se realizara, un int y un float este ultimo es para el resultado y el anterior para saber si a pulsado el +, -, / o * y tantos TextView como paneles tengas en este caso hay tres.</br>
<img  src="./images/metodos11.PNG"/></br></br>
 En el metodo onCreate a los paneles se busca por el id de los paneles que sale en el diseño a la derecha de la pantalla.</br>
 También hay que crear un metodo que mande el texto que contienen los StringBuffer a los paneles con un setText</br>
 <img  src="./images/metodos12.PNG"/></br></br>
 Hay que crear tantos metodos como numeros en la calculadora donde al StringBuffer se le añade el numero del pulson botado.</br>
 <img  src="./images/metodos13.PNG"/></br></br>
 Cuando se pulsa el boton del signo para operar hay que cambiar de StringBuffer y al resultado que en ese momento era cero sumarle el contenido el StringBuffer pasado a float por si contiene el punto.</br>
 <img  src="./images/metodos14.PNG"/></br></br>
 Por Ultimo se crea el metodo que se enlaza en el igual en el se utilaza un switch para saber si es una suma, resta, multiplicacion o division al final se crea un Intent que sirve para conectar dos actividades al que se le pasa el resultado, tambien se vacian los TextView y se incializan las propiedades para poder volveer a calcular.</br>
 Todos los metodos de los numeros igual y signos se tendran que enlazar con su crrespondiente boton en el xml</br>
 <img  src="./images/metodos15.PNG"/></br></br>
</p>
<h3>2ª Fase: 🥇🥈🥉</h3>
<p>
Esta fase se centra en la actividad segundaria que se lanzara para cuando pulsemos el boton de igual</br>
<img  src="./images/metodos21.PNG"/></br></br>
En esta lo que se hace es poner en resultado en un TextView
</p>
<h2>Añadido🐱‍🏍✨<h2>
<p>
Lo siguiente no influye en el funcionamiento de la calculadora pero sirve para que se vea mejor.
</p>
<h3>Icono de la aplicación 🥇🥈🥉</h3>
<p>
El icono utilizado es el siguiente</br>
<img width="100px" src="./images/web_hi_res_512 - copia.png"/></br></br>
<img src="./images/pantalla.PNG"/></br></br>
En la bibliografia se encuentra el enlace al video tutorial.
</p>
<h3>Boton para volver a la calculadora🥇🥈🥉</h3>
<p>
El boton se consigue con el siguiente codigo.</br>
<img  src="./images/androidmanifest.PNG"/></br></br>
y el resultado es el siguiente.</br>
<img  src="./images/botonatras.PNG"/></br></br>
</p>
<h2>Funcionamiento de la aplicación🐱‍🏍✨<h2>
<p>
<img width="500px" src="./images/Android-Emulator-Galaxy_Nexus_API_30_5554-2021-05-06-17-27-39.gif"/></br></br>
</p>
<h2>Bibliografia🐱‍🏍✨<h2>
-Video para el icono</br>
https://www.youtube.com/watch?v=OACRVxwWYrM&ab_channel=Rackcode.info</br>
-Pagina para crear el icono</br>
https://romannurik.github.io/AndroidAssetStudio/icons-launcher.html#foreground.type=clipart&foreground.clipart=android&foreground.space.trim=1&foreground.space.pad=0.25&foreColor=rgba(96%2C%20125%2C%20139%2C%200)&backColor=rgb(68%2C%20138%2C%20255)&crop=0&backgroundShape=square&effects=none&name=ic_launcher

<h2>Autor🐱‍🏍✨<h2>
<h4>David Parejo Aliaga 1ºDAW</h4>
