package fitInstructor;

class Trainee {
    private Instructor instructor;

    public Trainee(Instructor instructor) {
        this.instructor = instructor;
    }

    public void doPushUp() {
        instructor.instructPushUp();
    }

    public void doSitDown() {
        instructor.instructSitDown();
    }
}