#autor: Nataly Moreno Pedreros
  #language: es

Característica: Yo como usuario quiero realizar una solicitud en SIODUQ

  Antecedentes: Que el usuario desea iniciar sesión para crear una solicitud
    Dado que ingreso las credenciales en la aplicacion
      | username  | password |
      | admin | 123     |

  Esquema del escenario: El usuario quiere realizar el cambio de estado en una solicitud
    Dado que ingresa el nuevo estado
      | estado |
      | <estado> |
    Entonces puedo ver la tabla de solicitudes
      | mensaje |
      | Lista de Solicitudes|

    Ejemplos:
      | estado |
      | FINALIZADA |