public class AccountSystem {
    private String[] usernames = {"user1", "alice", "bob"};
    private String[] passwords = {"pass123", "abc456", "xyz789"};
    
    // 登入驗證方法
    public boolean login(String username, String password){
        for(int i =0;i < usernames.length;i++){
            if(usernames[i].equals(username) && passwords[i].equals(password)){
                return true;
            }
        }
        return false;
    }
}