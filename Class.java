/**
 * Class
 */
import java.util.* ;
public class Class {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in) ;
        ArrayList <Monster> MonsterList = new ArrayList <Monster>() ;
        String str = " " ;

        while(true)
        {
            System.out.println("Continue") ;
            str = scn.next() ;

            if(str.equals("Y")  || str.equals("y"))
            {
                System.out.println("Add New Obj") ;
                MonsterList.add(new Monster()) ;
            }
            
            else if(str.equals("N") || str.equals("n"))
            {
                break ;
            }
        }

        for(int i = 0 ; i < MonsterList.size() ; i ++)
        {
            MonsterList.get(i).showinfo() ;
        }
        
        System.out.println("Total : " + Monster.counts) ;
        System.out.println("End") ;
    }


    
}