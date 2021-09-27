# Traveaux dirigés pour le cours DEV1
## Petit mémo pour les commandes `git` basiques
Lorsque tu commences à travailler sur un repository, il est toujours bon de 
commencer par taper la commande 

```bash
git pull
```
de manière à se mettre à jour et éviter de faire des modifications sur une 
version ancienne de ton projet (il est possible que tu aies fait des modifs 
depuis un autre PC et que celles-ci ne sont pas encore rapatriées sur le pc 
sur lequel tu travailles).

Après avoir modifié ou ajouté un fichier, il faut faire 

```bash
git add <nom du fichier>
```

pour include les modifications dans le prochain commit ou ajouter celui-ci 
au projet.

Avant de faire ton commit, vérifie l'état de la branche avec 

```bash
git status
```

ce qui s'affiche en vert correspond à ce qui a été inclu et ce qui s'affiche 
en rouge correspond à ce qui sera ignoré dans le prochain commit.

Le "commit" est l'action de valider les changements que tu as fait pour 
créer une nouvelle version de ton projet. Il s'accompagne obligatoirement 
d'un message pour expliquer les changements

```bash
git commit -m 'Message qui exique les changements'
```

Enfin, il ne reste plus qu'à uploader ta nouvelle version sur ton serveur 
`git` (en l'occurence `github`) avec la commande 

```bash
git push
```
