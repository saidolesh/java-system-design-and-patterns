public class Main {

    public static void main(String[] args) {

        UserService userService = new UserService();
        OrderService orderService = new OrderService();

        userService.createUser("Sai");
        orderService.createOrder("ORD123");

        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        System.out.println(logger1 == logger2);  // Should print true
    }
}
