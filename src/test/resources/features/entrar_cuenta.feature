Feature: ingresar a cuenta en la pagina web
  yo como usuario deseo una aplicacion que permita ingresar con una cuenta en la pagina web dada para la practica de automatizacion en sofka

  @tag1
  Scenario Outline: ingresar con una cuenta en la pagina web
    Given que el usuario esta en la pagina web
    When le da click en la opcion para agregar cuenta
    And escribe las credenciales para entrar "<strEmail>" "<strPassword>"
    Then podra ver el resultado de la creacion con el mensaje Welcome to your account

    Examples: 
      | strEmail          | strPassword |
      | prueba4@gmail.com | qwer1234    |
