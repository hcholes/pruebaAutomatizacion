Feature: crear cuenta en la pagina web
  yo como usuario deseo una aplicacion que permita crear una cuenta en la pagina web dada para la practica de automatizacion en sofka

  @tag1
  Scenario Outline: crear cuenta en la pagina web
    Given que el usuario esta en la pagina web
    When le da click en la opcion para agregar cuenta
    And escribe el correo electronico para entrar a registrarse "<strEmail>"
    And digita los demas datos hasta completar el registro
      | strGenero | strFirstName | strLastNaame | strPassword | strDiaNac | strMesNac | strAnoNac | strAddress | strCity | strState | strPostal | strInfAdiocional | strMobile  | strAlias |
      | Mr        | Luis maria   | Perez Lopez  | qwer1234    |        12 | May       |      1986 | xxxx       | Arizona | Alabama  |     00041 | registro normal  | 3232323232 | luisl    |
    Then podra ver el resultado de la creacion con el mensaje Welcome to your account

    Examples: 
      | strEmail         |
      | prueba6@gmail.com |