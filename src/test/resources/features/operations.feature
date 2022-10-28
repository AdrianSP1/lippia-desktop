Feature: Operaciones basicas de números enteros positivos

    @Smoke
   Scenario Outline: Operaciones de dos numeros enteros positivos
     When ingreso'<numero1>'mas la '<operacion>' con '<numero2>'
     Then El resultado es'<resultado>'

     Examples:
       |  numero1 |operacion | numero2 | resultado |
       |      25        |  plus        |    10        |   35          |
       |      50        |  minus     |    32        |   18          |
       |       9         | multiply   |   100       | 900          |
       |      24        | divide      |   2            |    12         |


