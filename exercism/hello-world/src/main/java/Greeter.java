class Greeter {

    String getGreeting() {
        return "Hello, World!";
    }

    public static void main(String[] args) {
        System.out.println(new Greeter().getGreeting());
    }

}
