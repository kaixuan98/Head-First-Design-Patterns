package headfirst.designpatterns.observer.myObserver.MiniSubstackD2;

public class Newsletter {
    public static void main(String[] args) {
        Writer techCrunch = new Writer("TechCrunch");

        Reader reader1 = new Reader("James", techCrunch); 
        Reader reader2 = new Reader("Daniel", techCrunch);

        techCrunch.publishArticle("10 must learn OOP patterns.");
        techCrunch.publishArticle("OpenAI’s vision for the AI economy: public wealth funds, robot taxes, and a four-day workweek");

        techCrunch.removeObserver(reader2);
        techCrunch.publishArticle("Ticket savings of up to $500 this week for TechCrunch Disrupt 2026");

    }
}
