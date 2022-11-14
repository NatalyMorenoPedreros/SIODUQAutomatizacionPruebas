#autor: Nataly Moreno Pedreros
  #language: es

  Característica: Yo como usuario quiero iniciar sesión dentro de SIODUQ

    Escenario: Iniciar sesión en SIODUQ
      Dado que ingreso las credenciales en la aplicacion
      | username | password |
      | admin    | 123      |
      Entonces puedo ver la tabla de solicitudes
      | mensaje |
      | Lista de Solicitudes|
