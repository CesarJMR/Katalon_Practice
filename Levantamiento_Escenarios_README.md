
Automatización de 5 escenarios de prueba para la web app "Automation Practice".


Escenario 1

ID de la HU: 123
ID del escenario de prueba: 1
Versión: 1
Título: Verificar funcionamiento del módulo "Contact us".
Cantidad de casos de prueba: 3
Importancia: Medio
Descripción: con este escenario se probará que el módulo "Contact us", permita mandar mensajes tanto a customer service como al web master, y
			 que se deban completar los campos requeridos. Se excluirá de la automatización la prueba con el campo para adjuntar documentos,
			 ya que la funcionalidad sale de la web app, y esta debe probarse de manera manual.



Escenario 2

ID de la HU: 1234
ID del escenario de prueba: 1
Versión: 1
Título: Verificar validación de email para crear una cuenta.
Cantidad de casos de prueba: 4
Importancia: Alto
Descripción: con este escenario se probará el funcionamiento de la sección "CREATE AN ACCOUNT" del módulo "AUTHENTICATION"; específicamente la
			 validación que la web app realiza con los correos, antes de pasar al formulario para crear una cuenta.



Escenario 3

ID de la HU: 12345
ID del escenario de prueba: 1
Versión: 1
Título: Verificar funcionamiento del log in.
Cantidad de casos de prueba: 10
Importancia: Alto
Descripción: con este escenario se probará el funcionamiento general del log in, y de la sección "Forgot your password?", solamente la 
			 validación del email mas la confirmación de que supuestamente se mandó el correo para cambiar la clave (este nunca llega).
			 
			 
			 
Escenario 4

ID de la HU: 123456
ID del escenario de prueba: 1
Versión: 1
Título: Verificar funcionamiento del módulo para administrar las direcciones del usuario.
Cantidad de casos de prueba: 7
Importancia: Alto
Descripción: con este escenario se probará la creación, actualización, y eliminación de una dirección, mas que se deban completar los campos
			 requeridos del formulario para crear y actualizar direcciones.
			 
			 
			 
Escenario 5

ID de la HU: 1234567
ID del escenario de prueba: 1
Versión: 1
Título: Verificar funcionamiento del módulo para administrar la información personal del usuario.
Cantidad de casos de prueba: 2
Importancia: Alto
Descripción: con este escenario se probará la actualización de la información personal del usuario, mas que se deban completar los campos
			 requeridos del formulario para actualizar la información personal del usuario. Se excluirá de la automatización, las pruebas con
			 los campos para inscribirse en las noticias de la web app, y recibir ofertas especiales de los socios de la web app, ya que estas 
			 funcionalidades salen de esta, y deben probarse de manera manual. También se excluirán las pruebas con los campos para cambiar
			 la contraseña y confirmar la nueva contraseña, ya que estas implicarán cambios manuales en los scripts automatizados, donde por ende,
			 lo ideal sería realizar estas pruebas manualmente para luego realizar los cambios pertinentes en los scripts de prueba.