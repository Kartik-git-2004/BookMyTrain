import java.util.HashMap;
import java.util.Map;

public class UserService {

    private Map<String,User> userMap= new HashMap<>();
     private User currentUser = null;

     public boolean register(String username, String password , String fullname , String contact){
         System.out.println("® Welcome To Registration ®");
         if(userMap.containsKey(username)){
             System.out.println(" User already exist . Please Choose different UserName ");
         }
         User user = new User(username,password,fullname,contact);
         userMap.put(username,user);
         System.out.println(" ✅Successfully Register ");
         return true ;
     }

     public boolean login(String username,String password){
         if(!userMap.containsKey(username)){
             System.out.println(" No User Found ");
         }
         User user = userMap.get(username);
         if(!user.getPassword().equals(password)){
             System.out.println(" Incorrect Password ");
         }
         currentUser = user;
         System.out.println("Login Successfull .Welcome : "+currentUser.getFullName());
         return true;
     }
     public void logout(){
         if(currentUser!=null){
             System.out.println("Logged Out "+currentUser.getFullName());
         }
         currentUser =null;
     }


     public User getCurrentUser(){
         return currentUser;
    }
}
