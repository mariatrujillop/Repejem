
Feature: Solicitar un turno en la pagina de Bancolombia




    Scenario: Cliente solicitar una reserva de turno en la aplicacion

        Given ingrese a la pagina de bancolombia
        When ingresar boton Solicitar Turno y luego nueva reserva
        And ingresar el numero de documento
            | Valores    |
            | 123        |

