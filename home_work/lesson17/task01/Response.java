package home_work.lesson17.task01;


enum Response {
    HI("Hi", "Hello"),
    BYE("Bye", "Good bye"),
    HOW("How are you", "How are your doing"),
    UNKNOWN("", "Unknown message");

    private final String greeting;
    private final String answer;


    Response(String greeting, String answer) {
        this.greeting = greeting;
        this.answer = answer;
    }

    public String getGreeting() {
        return this.greeting;
    }

    public String getAnswer() {
        return this.answer;
    }
}
