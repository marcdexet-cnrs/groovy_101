/*
* ============================================
* Les chaines en groovy
* ============================================
*/


/*
 * Chaine simple quote sans interpolation
 */

def str0 = 'une chaine simple et directe'
def myName = 'Bond, James Bond'

/*
* Chaine interpolée avec double quote
*/
def str1 ="My name is $myName"
println str1



/*
 * chaine sur plusieurs lignes : 3 quotes
 */ 
def str2 = """Voici une chaine sur plusieurs lignes
première ligne
seconde ligne
dernière ligne"""

println str2

/*
 * Il est possible de le faire directement avec un print ou un println
 */
 
println """
-----------------------------------------------------------

  My name is $str1

-----------------------------------------------------------

"""