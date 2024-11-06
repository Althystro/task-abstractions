class Teacher extends Person {
    private String school;
    private String subject;

    public Teacher(String name, String school, String subject) {
        super(name);
        setSchool(school);
        setSubject(subject);
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    void describeRole() {
        System.out.println("Teacher: " + getName() + "\nSubject: " + subject + "\nSchool: " + school);
    }


}