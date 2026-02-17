public class UserService{

    public void createUser(String name){
        Logger logger = new Logger.getInstance();
        logger.log("User Creatde"+ name);
    }
}