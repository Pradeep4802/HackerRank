:- discontiguous male/1, female/1, parent/2.
male(dicky).
male(randy).
male(mike).
male(don).
male(elmer).
female(anne).
female(rosie).
female(esther).
female(mildred).
female(greatgramma).
male(blair).
male(god).
female(god).

parent(don,randy).
parent(don,mike).
parent(don,anne).
parent(rosie,randy).
parent(rosie,mike).
parent(rosie,anne).
parent(elmer,don).
parent(mildred,don).
parent(esther,rosie).
parent(esther,dicky).
parent(greatgramma,esther).
parent(randy,blair).

male(mel).
male(teo).
parent(melsr,mel).
parent(melsr,teo).
/*uncle(X, Y) :– male(X), sibling(X, Z), parent(Z, Y).*/
/*uncle(X, Y) :– male(X), spouse(X, W), sibling(W, Z), parent(Z, Y).*/

uncle(X,Y) :-
  parent(Z,Y), brother(X,Z).

aunt(X,Y) :-
  parent(Z,Y), sister(X,Z).

sibling(X, Y) :-
      parent(Z, X),
      parent(Z, Y),
      X \= Y.

sister(X, Y) :-
      sibling(X, Y),
      female(X).

brother(X, Y) :-
      sibling(X, Y),
      male(X).

parent(Z,Y) :- father(Z,Y).
parent(Z,Y) :- mother(Z,Y).

grandparent(C,D) :- parent(C,E), parent(E,D).

aunt(X, Y) :– female(X), sibling(X, Z), parent(Z, Y).
aunt(X, Y) :– female(X), spouse(X, W), sibling(W, Z), parent(Z, Y).

male(john).
male(bob).
male(bill).
male(ron).
male(jeff).

female(mary).
female(sue).
female(nancy).

mother(mary, sue).
mother(mary, bill).
mother(sue, nancy).
mother(sue, jeff).
mother(jane, ron).

father(john, sue).
father(john, bill).
father(bob, nancy).
father(bob, jeff).
father(bill, ron).
american(anne).
american(X) :-  ancestor(X,anne).
american(X) :- ancestor(anne,X).
relation(X,Y) :- ancestor(A,X), ancestor(A,Y).

father(X,Y) :- male(X),parent(X,Y).
father(god, _) :- male(god).
mother(X,Y) :- female(X),parent(X,Y).
son(X,Y) :- male(X),parent(Y,X).
daughter(X,Y) :- female(X),parent(Y,X).
grandfather(X,Y) :- male(X),parent(X,Somebody),parent(Somebody,Y).
aunt(X,Y) :- female(X),sister(X,Mom),mother(Mom,Y).
aunt(X,Y) :- female(X),sister(X,Dad),father(Dad,Y).
sister(X,Y) :- female(X),parent(Par,X),parent(Par,Y), X \= Y.
uncle(X,Y) :- brother(X,Par),parent(Par,Y).
cousin(X,Y) :- uncle(Unc , X),father(Unc,Y).
ancestor(X,Y) :- parent(X,Y).
ancestor(X,Y) :- parent(X,Somebody),ancestor(Somebody,Y).
brother(X,Y) :-  male(X),parent(Somebody,X),parent(Somebody,Y), X \= Y.

