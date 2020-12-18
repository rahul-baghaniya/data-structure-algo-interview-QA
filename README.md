# data-structure-algo-interview-QA

Main method questions 

---------------------------------------------------------------------------------------------------------------------------------------- 

Can we overload the main method in java? 

Yes we can overload the main method 

 

Can we override the main method in java? 

No- since overriding the method is considered as dynamic biding and main method is static. 

If you override the main method it will be called the method hiding. And @override annotation will show compilation error. 

 

Can we make main method as final in java? 

Yes, we can make. 

 

How to call non static methods from main method (static method)? 

Create an object of class in static method and call the non-static method of object. 

 

Can we make main method as synchronized in java? 

Yes, main can be synchronized in Java,  synchronized modifier is allowed in the main signature and you can make your main method synchronized in Java. 

 

Why main method is static public? 

If main method is declared as non-static then JVM will not be able to call the main method directly. 

Main method should be public otherwise JVM cannot access it. 

We can define the main method as private it won`t show any compilation error but JVM will not be able to access it. 

 

What happens if we declare main method as non-static? 

Defining main method as non-static won't show any compilation errror but when we run the class it will throw run time error: main method is not static in class. 

 

 

Can we define class without class without main method and can still run the class? 

We cannot run class if main method is not there. 

 

Can we declare main() method with different access modifier other than public? 

No. We cannot declare main method other than public. 

It won't show any compilation time error but will throw an run time error. 

 

Can we change the return type of main method? 

We cannot change the return type of main() method. 

It won't show any compilation error but will throw runtime error. 

 

 

Immutability keyword questions 

---------------------------------------------------------------------------------------------------------------------------------------- 

How to make class as Immutable? 

A) make class as final so no other class can extends it. 

B) make all instance variables as private and final 

C) provide only getter methods not provide setter methods 

D) if class contains mutable object then: 

     Then always return clone copy of that field, never return the original object instance. 

 

Do all properties of an Immutable Object need to be final in java? 

No. By declaring a property as final only ensures that its reference is not changed but its state can still be changed. So by declaring a property as final does not guarantee the immutability 

 

 

Differences between final and immutability  

final means that you can’t change the object’s reference to point to another reference or another object, but you can still mutate its state (using setter methods e.g). Whereas immutable means that the object’s actual value can’t be changed, but you can change its reference to another one.  

final modifier is applicable for variable but not for objects, Whereas immutability applicable for an object but not for variables. 

 By declaring a reference variable as final, we won’t get any immutability nature, Even though reference variable is final. We can perform any type of change in the corresponding Object. But we can't perform reassignment for that variable. 

 final ensures that the address of the object remains the same whereas the Immutable suggests that we can’t change the state of the object once created. 

 

---------------------------------------------------------------------------------------------------------------------------------------- 

 

 

Static keyword questions 

---------------------------------------------------------------------------------------------------------------------------------------- 

 

 

Why we can't use "this" inside static context? 

this :- "this" means current class OBJECT , so its clear that "this" only come in the picture once we intended to create an Object of that class.  

static method:- there is no need to create an object in order to use static method. means "instance" or object creation doesn't make any sense with "static" as per Java rule. 

 

 

---------------------------------------------------------------------------------------------------------------------------------------- 

 

 

Stack and Heap area of JVM Memory 

---------------------------------------------------------------------------------------------------------------------------------------- 

Difference between Stack and Heap memory in Java? 

JVM has divided memory space between two parts one is Stack and another one is Heap space.  

Stack space is mainly used for storing order of method execution and local variables. Stack always stored blocks in LIFO order whereas heap memory used dynamic allocation for allocating and deallocating memory blocks. 

Sr. No. 

Key 

Stack 

Heap Memory 

1 
 

Basic 
 

Stack memory is used to store items which have a very short life like local variables, a reference variable of objects  
 

Heap memory is allocated to store objects and JRE classes. 
 

2 
 

Ordering  
 

The stack is always reserved in a LIFO (last in first out) order 
 

Heap memory is dynamic allocation there is no fixed pattern for allocating and deallocating blocks in memory  
 

3 
 

Size 
 

We can increase stack memory size by using JVM parameter -XSS 
 

We can increase or decrease heap memory size by using JVM option -Xms and -Xmx 
 

4 
 

Visibility  
 

Variables are visible to only to owner thread  
 

It is visible to all threads  
 

  5  
 

Exception 
 

JVM will throw java.lang.StackOverFlowError 
 

JVM will throw java.lang.OutOfMemoryError 
 

 

 

 

 

---------------------------------------------------------------------------------------------------------------------------------------- 
