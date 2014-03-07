package org.devlog.groovy101.g00

// afficher, c'est l'instruction print
println "l'instruction 'println' permet d'imprimer une ligne à l'écran"
println "une chaîne de caractères"
println 10

// Avec println tu sais déjà faire un HelloWorld

/***********************************************************
* Definition des variables 
************************************************************/

// La version paresseuse
def maVariable = "un chaine"

// Laisson Groovy deviner la bonne classe
assert maVariable.getClass() == String.class

//Avez vous remarqué le mot clef assert ?
// Qu'est-ce que cela fait ?
// Décommenter les lignes suivantes pour le savoir
/*
String langageName = "Boofy"
assert langageName == "Groovy": "la raison de cette erreur est que le nom du langage n'est pas correct."
*/
