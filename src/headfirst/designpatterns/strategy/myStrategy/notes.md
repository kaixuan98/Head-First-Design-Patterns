This folder consists of my own idea on how to create a strategy pattern. 

Strategy pattern is a family of algorithms where each of them is independent from the client. Each of the algorithm can be swap out or interchangable easily. 


#### Duck example from Head First design pattern 
A duck can quack and fly. There are different type of ducks like MallardDuck, RedHeadDuck. Each of the ducks has their own quack and fly, but not all duck can quack or/and fly.

Initially the used of inheritance, where MallardDuck, RedHeadDuck are the subclasses of Duck
    - Functionality change : When we add Rubber duck which cannot fly; Decoy Duck which cannot fly and cannot quack 
    - maintainance nightmare due to violation of deisgn principle:seperation of concern (encapsulation) 

Second method is a little better with use of Flyable and Quackable interface, where all the concrete ducks that need flyable and quackable will implement what they need
    - Data Format Change: this means for all the ducks that can actually fly and quack will just be repeating code
    - maintainance nightmare due to violation of deisgn principle: code duplication 

Strategy Pattern - Create interface of Flyable and Quackable, then create concrete classes of Flyable and Quackable 
    - When Duck has both flyable and quackable, they can select which flyable "object" and quackable "object"
    - When add new fly or quack method, we just create new concrete flyable and quackable 
    


