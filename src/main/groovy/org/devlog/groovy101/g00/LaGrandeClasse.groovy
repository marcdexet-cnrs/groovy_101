/*
En Groovy tout est une classe.
Une classe, c'est un ensemble de propriétés et de méthodes (fonctions) pour interagir avec ces propriétés.
Pour ceux qui n'ont jamais fait de POO, voyez cela comme une strcture de données 
et des fonctions liées à la structure de donnée pour agir ou obtenir les données.

Dans cette partie nous allons créer quelques classes pour découvrir de façon pragmatique le concept.

Que les puristes puissent me pardonner un jour :)
*/

/*
Nous allons modéliser une salle de serveurs linux 

Quand nous parlons d'une salle de serveur, nous parlons d'un salle, constitués de Serveur
*/

/**
 * classe Server avec un nom et une version d'OS
 */
class Server {
  def name
  OsVersion osVersion
}

/**
 * Une version d'OS
 */
class OsVersion {
    def os
    String version
}
/**
 * La salle est un ensemble de serveurs
 */
class ServerRoom {
    String name
    Map serverByName = [:]
}

/*
 * -----------------------------------------------------------------------------------
 *    Instancier un objet
 * -----------------------------------------------------------------------------------
 */

/**
 * La version d'OS centos3.9
 * Première façon d'instancier
 */
OsVersion centos39 = new OsVersion()
centos39.os = 'centos'
centos39.version = '3.9'

// 2nd façon
OsVersion redhat60 = new OsVersion(os: 'redhat', version: '6.0')

//3eme façon avec une map
OsVersion ubuntu12 = [os: 'ubuntu', version: '12.0' ]


Server s01 = new Server(name:'aragorn.nowhere.com', osVersion: redhat60)
assert s01.name == 'aragorn.nowhere.com'

Server s02 = new Server(name: 'Gandalf', osVersion: centos39)
