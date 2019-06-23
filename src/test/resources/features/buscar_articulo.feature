Feature: buscar articulos en la pagina web
  yo como usuario deseo una aplicacion que permita buscar articulos en la pagina web dada para la practica de automatizacion en sofka

  @tag1
  Scenario: buscar articulos en la pagina web
    Given que el usuario esta en la pagina web
    When busca Dress a traves de la opcion expuesta en la pagina
    Then podra ver el resultado de la busqueda