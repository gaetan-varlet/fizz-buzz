# Exercice de TDD FizzBuzz

- Ecrire un programme qui retourne les entiers de 1 à 100
- Règles à prendre en compte :
    - pour les multiples de 3, remplacer le nombre par "Fizz"
    - pour les multiples de 5, remplacer le nombre par "Buzz"
    - pour les multiples de 15, remplacer le nombre par "FizzBuzz"

Exemple : 12Fizz4BuzzFizz78FizzBuzz11Fizz1314FizzBuzz


## Test-First vs TDD

- Test-First : test validant notre programme
- Test-Driven Development : guide le développeur avec un feedback permet, en avançant pas à pas (baby-steps)

les lois du TDD :
- interdiction d'écrire du nouveau code sauf pour faire passer un test qui échoue
- interdiction d'écrire plus de code qu'il n'en faut pour réussir le test ayant échoué

## Pourquoi faire du TDD ?

Avantages :
- plus de code mort
- fautes d'inattention décelées immédiatement
- presque plus besoin du mode debug
- moins de maintenance corrective => amélioration de la productivité
- sérénite pour le refactor
- plaisir de coder avec le confort généré
- documentation gratuite
- délégation aux collègues plus facile

Inconvénients :
- courbe d'apprentissage importante
- nécessite une discipline sansa faille
- pratique mal interprétée qui peut mener à des tests fragiles et un surcoût
