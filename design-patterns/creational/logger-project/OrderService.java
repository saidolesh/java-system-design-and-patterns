public class OrderService{

    public void createOrder(String orderId){
        Logger logger = Logger.getInstance();
        logger.log("Order Created: "+ orderId);
    }
}