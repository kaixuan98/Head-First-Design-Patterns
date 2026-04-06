MyObserver files are the code I used for active recalling

Observer pattern ensure **one to many** dependencybetween objects so that when one object changes state, all of its dependencies are notified and update automatically





#### Weather Station Example from Head first
A weather station will collect a few data points (i.e Humidity, temperature, pressure). Weather data object will pull the data from weather station periodically. Our goal is to get the weather data object and used it on 3 type of display - current conditions, weather stats, and simple forecasting. In the future, we might extends the displays. 

weather data is provided

#### Mini Substack Example
Substack is a newsletter subscription platform that allow user to subscribe to their favourite writters. If their writters release a new pieces of article, reader that subscribe to it will get notified. Observer pattern is the best way to implement such feature. 

We would have 2 interfaces: Subject and Observer. These are the interfaces that need to be implemented by Writters and Readers. 
In our example, we would have a tech writters. Different readers can subscribe to tech writter

- D2 review notes
    - emphasize on the one-to-many relationship!!! If it is more than one subject, it can be a litle tricky to setup. 
    - to allow multiple subjects - just pass in the subject in update function



