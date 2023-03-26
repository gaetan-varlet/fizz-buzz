Feature: Fonction qui renvoie les entiers de 1 à 100 en remplaçant certains nombres selon des règles
    Règles à prendre en compte :
    - pour les multiples de 3, remplacer le nombre par "Fizz"
    - pour les multiples de 5, remplacer le nombre par "Buzz"
    - pour les multiples de 15, remplacer le nombre par "FizzBuzz"

    Scenario Outline: doit retourner la chaîne de caractères attendue en fonction des nombres en entrée
        When les nombres en entrée sont <nombre1> et <nombre2>
        Then la chaine de caractères en sortie est "<resultat>"
        Examples:
            | nombre1 | nombre2 | resultat                                    |
            | 1       | 1       | 1                                           |
            | 2       | 2       | 2                                           |
            | 3       | 3       | Fizz                                        |
            | 6       | 6       | Fizz                                        |
            | 5       | 5       | Buzz                                        |
            | 10      | 10      | Buzz                                        |
            | 15      | 15      | FizzBuzz                                    |
            | 30      | 30      | FizzBuzz                                    |
            | 1       | 2       | 12                                          |
            | 1       | 3       | 12Fizz                                      |
            | 1       | 5       | 12Fizz4Buzz                                 |
            | 1       | 15      | 12Fizz4BuzzFizz78FizzBuzz11Fizz1314FizzBuzz |
