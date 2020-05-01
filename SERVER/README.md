# Guía de configuración de AwesomeChat Notification Server

Esta es una aplicación de servidor simple que permite habilitar Firebase Cloud Messaging Push Notification para AwesomeChat.

# Empezando

Instalar Nodo js. Consulta el siguiente enlace [AQUI](https://nodejs.org/en/download/package-manager/) y Ejecuta * node -v * en la terminal.

# Agregar clave de servidor

Abra el archivo index.js y cambie la siguiente línea

* databaseURL: "[YOUR_FIREBASE_DATABASE_URL]" *
* var serverKey = '[YOUR_LEGACY_SERVER_KEY]'; * 

# Configurar funciones de firebase

Siga las instrucciones [aquí] (https://firebase.google.com/docs/functions/get-started) para configurar sus funciones de firebase. <br/>
Vaya a [google cloud console] (https://console.cloud.google.com/iam-admin/iam/iam-zero), seleccione su proyecto, vaya a cuentas de servicio, cree una nueva cuenta de servicio, luego cree una nueva clave json, cambie el nombre del archivo * serviceAccountKey.json * y colóquelo en la carpeta * funciones *. <br/>
Ejecute * npm install * para recuperar todas las dependencias necesarias. <br/>
Ejecute * firebase use --add *. <br/>
Ejecute * firebase deploy: solo funciones *. <br/>
