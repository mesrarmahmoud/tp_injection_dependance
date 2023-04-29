# tp_injection_dependance
Activité Pratique N°1 - Injection des dépendances
Rendre un compte rendu en reprenant l'exemple traité dans les vidéos des deux dernières séances

Ressources vidéo à utiliser 
  - Part 1 : https://www.youtube.com/watch?v=ADh3clrTp_0
 - Part 2 :  https://www.youtube.com/watch?v=xBt4mvY9ZE0

Partie 1 : (Voir support et vidéo)
1. Créer l'interface IDao avec une méthode getDate
2. Créer une implémentation de cette interface 
3. Créer l'interface IMetier avec une méthode calcul
4. Créer une implémentation de cette interface en utilisant le couplage faible
5. Faire l'injection des dépendances :
  a. Par instanciation statique
  b. Par instanciation dynamique
  c. En utilisant le Framework Spring
       - Version XML
       - Version annotations
Partie 2 :  Exercice
L'unité centrale d'un ordinateur est liée à deux interfaces VGA et USB. Sur l'interface VGA on peut brancher un Moniteur ou un vidéo projecteur. Sur l'interface USB, on peut brancher un clavier ou une souris. Nous disposons aussi d'un écran TB qui implémente uniquement l'interface HDMI et on souhaite le brancher sur l'interface VGA de l'unité centrale. 
On suppose que l'interface VGA contient un méthode print(String message)
On suppose que l'interface USB contient une méthode  int read()
On suppose que l'interface HDMI contient une méthode print(byte[] data)

1. Créer l'interface VGA
2. Créer les implémentation de l'interface VGA (Ecran et Vidéo projecteur)
3. Créer l'interface USB
4. Créer les deux implémentation de l'interface USB (Souris et Clavier)
5. Créer l'unité centrale ayant les deux opération int readData() et printData(String data)
6. Créer l'interface HDMI et son implémentation TV 
7. Créer un adaptateur qui permet d'adapter l'interface HDMI à l'interface VGA pour pouvoir brancher l'écran TV à l'unité centrale
8. Faire l'injection des dépendances en utilisant Spring Framework
