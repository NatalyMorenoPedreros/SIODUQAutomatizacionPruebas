#autor: Nataly Moreno Pedreros
  #language: es

Característica: Yo como usuario quiero realizar una solicitud en SIODUQ

  Antecedentes: Que el usuario desea iniciar sesión para crear una solicitud
    Dado que ingreso las credenciales en la aplicacion
      | username  | password |
      | 1097407998| 1234     |

  Esquema del escenario: El usuario quiere realizar una solicitud de tipo producto premio
    Dado que ingresa la informacion del formulario premio
      | fechapresentacion | nombreautores | numeroautores | titulotrabajo | premio| presentadoantes | fechaantes | institucion | fechaotorgamiento | universidades | difusion | mensaje |
      | <fechapresentacion> | <nombreautores> | <numeroautores> | <titulotrabajo> | <premio>| <presentadoantes> | <fechaantes> | <institucion> | <fechaotorgamiento> | <universidades> | <difusion> | <mensaje> |
    Entonces puedo ver la tabla de solicitudes
      | mensaje |
      | Lista de Solicitudes|

    Ejemplos:
      | fechapresentacion | nombreautores | numeroautores | titulotrabajo | premio| presentadoantes | fechaantes | institucion | fechaotorgamiento | universidades | difusion | mensaje |
      | 08/12/2022        | Denilson Andre| 1             | Esto es una prueba automatica| Golden| NO | N/A      | Universidad de los andes| 20/08/2022 | Universidad del Quindio | Nacional | Lista de Solicitudes|

  Esquema del escenario: El usuario quiere realizar una solicitud de tipo producto ponencia
    Dado que ingresa la informacion del formulario ponencia
      |fechapresentacion| nombreautores| numeroautores |titulo | isbn| aniopublicacion| lugarevento| fechaevento| nombreevento| certificaprimervez| difusion|
      |<fechapresentacion>| <nombreautores>| <numeroautores> |<titulo> | <isbn>| <aniopublicacion>| <lugarevento>| <fechaevento>| <nombreevento>| <certificaprimervez>| <difusion>|
    Entonces puedo ver la tabla de solicitudes
      | mensaje |
      | Lista de Solicitudes|

    Ejemplos:
      |fechapresentacion| nombreautores| numeroautores |titulo | isbn| aniopublicacion| lugarevento| fechaevento| nombreevento| certificaprimervez| difusion| mensaje |
      | 08/12/2022        | Denilson Andre| 1          | Prueba de ponencia| 123| 2022|Nariño      |20/09/2019  |TERZAR       |SI                 |Internacional|Lista de Solicitudes|