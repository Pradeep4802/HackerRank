
#Write a program to shuffle a deck of cards.

import random

cardFaces=[]
Suits=['Hearts','Diamond','Clubs','Spades']
royals=['J','Q','K','A']
deck=[]
for i in range(2,11):   
    cardFaces.append(str(i))

for j in range(4):
    cardFaces.append(royals[j])

for k in range(4):
    for l in range(13):
        card= (cardFaces[l]+" of "+ Suits[k])
        deck.append(card)

random.shuffle(deck) 
for m in range(52): 
    print(deck[m])
    