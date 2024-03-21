package fitInstructor;

public class Main {
    public static void main(String[] args) {
        Instructor instructor = new Instructor();
        OnlineViewer viewer1 = new OnlineViewer("Ivan",instructor);
        OnlineViewer viewer2 = new OnlineViewer("Georgi",instructor);
        OnlineViewer viewer3 = new OnlineViewer("Pesho",instructor);

        Trainee trainee = new Trainee(instructor);

        trainee.doPushUp();
        System.out.println(".......................");
        trainee.doSitDown();

    }
}
