## Rendu TP 7





## Question 2.2

- Ajout d'une liste(duppliquer)
- dupliquer les méthodes 
- Modifier toString/ activerTout

Une bonne dizaine de lignes ont été modifié.

## Question 2.3



![Image](https://media.discordapp.net/attachments/1095314373972590643/1095329660251947108/fP8zRiCm38LtdOAZYy8Nw9Hk6Rer5r0jjc0WaOKaUobozvgI0ob_Kpm8DhydlYTQkvHjp7FmHf_9svJWW1ud2S6ompy3yDeNXXUjB48Ex57cZF73XbySojgnATDoPiIv4OVfCTp8OMryQxIdRnfqkT4Nyi2biTFvWCLOJpQo1FZCaVX7lwptSq3u4l5eMNlLY5NHkHPTx19YHc8Nj-bKFMIfBxMuTGLAxsNxq0NIZ2LFabN0MVKbzpEUf_v_BfH8-DgZaMUTog10nl7Yzi1RdRNHmzoZMZSjnJr9eyRiaDrwL_y1.png?width=514&height=418)

## Question 2.4



Si le code était bugé , on va aussi copier le bug dans la nouvelle classe donc il faudra corriger la classe de base et la classe copié. Non il ne sera pas maintenable au long terme car si il y a un bug dans le texte de base et qu'on le copie-colle partout dans notre programme cela va devenir ingérable.



## Question 2.5



La direction de la flèche (association "liste") indique que  Télecommande dépend de toutes les autres classes. Cela implique que, lorsqu'on modifie les autres classes (Lampe,..) il faut modifier la classe Télécommande.

Si on change le nom des méthodes Hifi, comme on a copié les méthodes de lampes dans la Télécommande, dans les méthodes copiés, on utilise les méthodes allumer et éteindre or si on change leurs noms il faudrait changer aussi les noms dans les fonctions de Télécommande.



## Question 3.1

