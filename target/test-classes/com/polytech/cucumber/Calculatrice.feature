# language: fr

@imsexyandiknowit
Fonctionnalité: Calculatrice

  Valider le bon comportement du module Calculator

 Scénario: Additionner deux nombre entiers
 Soit deux operandes a et b
 Lorsque je donne à a la valeur "1"
 Lorsque je donne à b la valeur "2"
 Alors a plus b doit me donner la valeur entière "3"

Plan du scénario: Additionner deux nombre entiers (tableau)
 Soit deux operandes a et b
 Lorsque je donne à a la valeur "<operande1>"
 Lorsque je donne à b la valeur "<operande2>"
 Alors a plus b doit me donner la valeur entière "<resultat>"
 
 Exemples:
 | operande1 | operande2 | resultat |
 | 1  | 2  | 3  |
 | 2  | 2  | 4  |
 | -1 | 1  | 0  |
 