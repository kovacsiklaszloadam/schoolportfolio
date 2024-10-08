Object-Oriented Programming

Basics exercises to introduce object-oriented programming, I will include the tasks here, in theis readme file:

Animal package:

Create an Animal class
Every animal has a hunger value, which is a whole number
Every animal has a thirst value, which is a whole number
When creating a new animal instance these values must be set to the default 50 value
Every animal can eat() which decreases its hunger by one
Every animal can drink() which decreases its thirst by one
Every animal can play() which increases both its hunger and thirst by one

Blog post package:

Create a BlogPost class that has

an authorName
a title
a text
a publicationDate (string)

Create a few blog post objects:
"Lorem Ipsum" titled by John Doe posted at "2000.05.04."
Lorem ipsum dolor sit amet.
"Wait but why" titled by Tim Urban posted at "2010.10.10."
A popular long-form, stick-figure-illustrated blog about almost everything.
"One Engineer Is Trying to Get IBM to Reckon With Trump" titled by William Turton at "2017.03.28."
Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his 
picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile
thing.

Counter package:

Create Counter class
which has a counter (integer) field
at creation it should have a default value 0
there are two ways to create the class:
with 0 input parameters
with 1 input parameter called counter which is set as the initial value of the counter field
we can add another whole number to this counter: add(number)
we can just increase the counter's value by one: add() (no parameters)
we can get() the current counter value
and we can reset() the counter to the initial value set during the construction of the class

Dice set package:

You have a `DiceSet` class which has a list for 6 dice
You can roll all of them with the rollSet() method 
You can check the current rolled numbers with getCurrentSet() and getCurrentItem() method
You can reroll all with the rerollSet(), or reroll one with the rerollItem() method
Your task is to roll the dice until all the dice are 6.

Dominoes package:

You have the list of Dominoes
Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
eg: [2, 4], [4, 3], [3, 5] ...

PostIt package:

Create a PostIt class that has
a backgroundColor represented by a string
a text on it
a textColor represented by a string
Create a few example post-it objects:
an orange with blue text: "Idea 1"
a pink with black text: "Awesome"
a yellow with green text: "Superb!"

Sharpie package:

Create a Sharpie class
We should know the followings about each sharpie:
color (which should be a string),
width (which will be a number) and the
inkAmount (another number)
We need to specify the color and the width at creation
Every sharpie is created with a default inkAmount value: 100
We can use() the sharpie objects: using it decreases inkAmount by 10