package fitInstructor;

public class OnlineViewer implements Observer{
    private String name;
    private Instructor instructor;

    public OnlineViewer(String name, Instructor instructor) {
        this.name = name;
        this.instructor = instructor;
        this.instructor.addObserver(this);
    }

    @Override
    public void update() {
        System.out.println(name + " is following the instructor's move.");
    }
}