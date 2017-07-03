public class Main {
    public static void main(String[] args) {
        Currency curr = Currency.UAN;
        
        switch(curr) {
            case USD:
                System.out.println("ITS usd");
                break;
            case UAN:
                System.out.println("ITS uan");
                break;
            case CAD:
                System.out.println("ITS cad");
                break;
            case EUR:
                System.out.println("ITS eur");
                break;
            case JPY:
                System.out.println("ITS jpy");
                break;
            case GBP:
                System.out.println("ITS gbp");
                break;                
            default:
                System.out.println("Other");
        }
    }
}
