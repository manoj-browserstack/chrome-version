Feature: Ingresar al login

  @login
  Scenario: Ingreso a la nueva SVP con usuario valido de cliente activo
    Given el cliente accede a la nueva SVP
    When el cliente nuevo con cobisId 151376 ingresa su usuario y contraseña
    Then el cliente nuevo deberia ver el mensaje Swag Labs en la pantalla de inicio



