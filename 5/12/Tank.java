public class Tank {
    private boolean empty = false; 
    
    public void finalize() {
        if(!empty) {
            System.out.println("before pour");
        }
    }
    
    public void fill() {
        empty = true;
    }
    
     public void pour() {
        empty = false;;
    }
}
