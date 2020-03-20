/**
 * Monster
 */
import java.util.* ;
 public class Monster {
    Scanner scn = new Scanner(System.in) ;
    private String name ;
    private String constellation ;
    private int hp ;
    private int attack ;
    private int age ;
    public static int counts = 0 ;

    public Monster()
    {
        setMonster() ;
        counts ++ ;
    }

    public void setMonster()
    {
        System.out.println("Monster name") ;
        String newname = scn.next() ;
        this.name = newname ; 

        System.out.println("Monster constellation") ;
        String newconstellation = scn.next() ;
        this.constellation = newconstellation ;

        System.out.println("Monster hp") ;
        int newhp = scn.nextInt() ;
        this.hp = newhp ;

        System.out.println("Monster attack") ;
        int newattack = scn.nextInt() ;
        this.age = newattack ;
        
        System.out.println("Monster age") ;
        int newage = scn.nextInt() ;
        this.attack = newage ;
    }

    public void showinfo()
    {
        System.out.println("Monster name : " + name) ;
        System.out.println("Monster constellation : " + constellation) ;
        System.out.println("Monster hp : " + hp) ;
        System.out.println("Monster attack : " + attack) ;
        System.out.println("Monster age : " + age) ;
    }
}