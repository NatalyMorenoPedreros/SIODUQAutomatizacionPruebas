#autor: Nataly Moreno Pedreros
  #language: es

Característica: Yo como usuario quiero realizar una solicitud en SIODUQ

  Antecedentes: Que el usuario desea iniciar sesión para crear una solicitud
    Dado que ingreso las credenciales en la aplicacion
      | username  | password |
      | admin | 123     |

  Esquema del escenario: El usuario quiere realizar el cambio de puntaje en una solicitud
    Dado que ingresa el nuevo puntaje
      | puntaje |
      | <puntaje> |
    Entonces puedo ver la tabla de solicitudes
      | mensaje |
      | Lista de Solicitudes|

    Ejemplos:
      | puntaje |
      | 27 |
