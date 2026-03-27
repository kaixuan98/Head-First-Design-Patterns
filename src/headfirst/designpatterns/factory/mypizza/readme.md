This folder includes my own implementation of the pizza store example from the book. 

The pizza store will be using the 2 factory pattern 
- Factory Method pattern -> create one type of pizza
- Abstract Factory Pattern. -> create a family of ingredients for the pizza 

### Factory Method Pattern 

##### Classes needed for Factory Method
- (Abstract) Pizza class 
- (Abstract) PizzaStore Class 
- Concrete Pizza 
    - NYCheesePizza
    - NYVeggiePizza 
    - NYClamPizza
    - NYPepperoniPizza
    - ChicagoCheesePizza
    - ChicagoVeggiePizza
    - ChicagoClamPizza
    - ChicagoPepperoniPizza
    - CaliCheesePizza
    - CaliVeggiePizza
    - CaliClamPizza
    - CaliPepperoniPizza
- Concrete Pizza Stores
    - NYPizzaStore
    - ChicagoPizzaStore 
    - CaliPizzaStore

##### The benefit of Factory Method Pattern 
- It satisfy the open-closed principle by encapsulating the creation code
- In the pizza example, if we would create different pizza in the pizza store, when a new pizza store need to support a new region like California, we would need to open the PizzaStore class and modify (violate open-closed)
- With Factory Method, instead of using "new" keyword to create new object, we would use a factory method (`createPizza` and abstract method) to delegate the pizza creation. 
- The region that neeed to update their store, all they need to do is to extends this createPizza method for their store. 
- When ordering Pizza in a pizza store, we are letting the subclass(NYPizzaStore and ChicagoPizzaStore) to create their own regional style of pizza
- It satisfy dependency inversion principle 
- Because both of the Concrete Pizza and Abstract Pizza store is depend on the pizza. Not the Pizza store depends on the concreate pizzas.

### Abstract Factory Pattern

##### Classes needed for Abstract Factory 
- (Abstract) Pizza class 
- (Abstract) PizzaStore Class 
- PizzaIngredientFactory interface 
- Concrete Pizza 
    - NY
- Concrete Pizza Stores
    - NYPizzaStore
    - ChicagoPizzaStore 
    - CaliPizzaStore
- Concrete Pizza Ingredients 


