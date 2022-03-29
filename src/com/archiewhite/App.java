package com.archiewhite;

public class App {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View("Ticket 2 Specials");
        Controller controller = new Controller(model, view);
    }
}
