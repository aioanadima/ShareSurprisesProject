# ShareSurprisesProject

This project implements an application designed to manage a set of surprises, obtaining a generic system capable of:
- using multiple surprise types (implement a common interface);
- implementing various algorithms for storing and giving surprises;
- using a random mechanism to generate a (new) set of surprises.

The application has the following functionalities:
1. Each surprise will implement the ISurprise interface, which allows it to open the surprise.
2. The types of surprises are the following: FortuneCookie, Candies and MinionToy. Each of the surprise classes will implement the methods toString() and enjoy() that will print specific messages and the method generate() that will create a surprise of that type.
3. All the surprises will be stored in various types of containers, which will dictate the storage method and especially the order in which the surprises will be distributed. Since we want to operate with any type of container in a transparent, implementation-independent way, we will use the IBag interface that will define the concrete communication protocol.
4. To generate a set of random surprises, the special class GatherSurprises is implemented and it contains: a static method, gather(int n), that receives an integer n and returns an array containing n surprises and a static method, gather(), which will return a single surprise.
5. Since there are several types of containers, we want to implement a unique mechanism to spawn a new (empty) container. The common interface for creating containers will be IBagFactory. 
6. Depending on the value of the String, a new collection will be created. The possible types correspond to the containers are: "RANDOM" , "FIFO" and "LIFO"
 7.The abstract class AbstractGiveSurprises is defined according to the following specifications in order to implement a mechanism to share surprise: 
void put() - adds a new surprise to the container;
void put(IBag surprises) - moves all surprises from the parameter container to this container;
give() - gives a surprise (the order of distribution of surprises depends on the type of quiver);
giveAll() - gives all surprises in the quiver, one at a time;
boolean isEmpty() - returns true if the quiver is empty, false otherwise;
abstract void giveWithPassion() - holds the place of an action that will be performed after giving each surprise.
8. The abstract class will be extended by 3 types of normal classes that will implement the abstract method, printing specific messages:GiveSurpriseAndApplause, GiveSurpriseAndSing, GiveSurpriseAndHug.
