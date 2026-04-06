package headfirst.designpatterns.observer.myObserver.MiniSubstackD2;

public class Reader implements Observer {
    private String name; 
    private Writer writer;

    public Reader(String name, Writer writer){
        this.name = name;
        this.writer = writer;
        writer.registerObserver(this);
    }

    public void update(){
        System.out.printf("Reader (%s) recieved article from %s \n", name, writer.getLatestTitle());
    }
}
