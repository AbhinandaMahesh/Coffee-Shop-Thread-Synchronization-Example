# Coffee-Shop-Thread-Synchronization-Example
A Java demonstration of thread synchronization using producer-consumer pattern in a coffee shop scenario.

📖 Description
This project illustrates Java thread synchronization using wait() and notify() methods to coordinate between two threads:

Barista Thread (Producer): Prepares coffee

Customer Thread (Consumer): Waits for and consumes coffee

The program ensures proper thread communication where the customer waits until the coffee is ready before drinking it.


💻 Code Overview
Main Classes
coffeeShop Class
Fields:

coffeeReady: Boolean flag indicating coffee preparation status

Synchronized Methods:

makeCoffee(): Simulates coffee preparation (2-second delay)

drinkCoffee(): Handles coffee consumption with waiting mechanism

code6 Class (Main)
Creates coffeeShop instance

Launches two threads: Customer and Barista (BRU)

🔧 Key Concepts Demonstrated
Thread Synchronization: Using synchronized keyword

Inter-Thread Communication: wait() and notify() methods

Producer-Consumer Pattern: Barista produces, customer consumes

Thread Safety: Proper coordination between concurrent threads



Implement producer-consumer pattern

Handle thread coordination and communication



Pattern: Producer-Consumer

🔄 Program Flow
Customer thread starts and waits for coffee

Barista thread starts making coffee

Barista sleeps for 2 seconds (simulating preparation time)

Barista sets coffeeReady = true and calls notify()

Customer thread wakes up and drinks coffee

📚 Prerequisites
Java Development Kit (JDK) 8 or higher

Basic understanding of Java threads

👥 Contributors
Abhinanda (Barista)

Customer

This project serves as an educational example for understanding thread synchronization concepts in Java programming.

