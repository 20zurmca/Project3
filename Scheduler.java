import java.util.ArrayList;
/**
 * Write a description of class Scheduler here.
 * 
 * @author Emmett O'Toole 
 * @version 3:06 P.M 5-2-17
 */
public class Scheduler
{
    public static void schedule(Warehouse a,DirectedGraph grid){
        //All the facilities
        ArrayList<Facility>allF=grid.getNeighbors(a);
        ArrayList<Facility> shops=new ArrayList<Facility>();
        //Loop puts all shops into separate arrayList
        for(int i=0;i<allF.size();i++){
            if(allF.get(i).getChar().equals('S')){
                shops.add(allF.get(i));
            }
        }
        //These prints help to test that the method is working
        /*for(Facility s:shops){

        System.out.println("Shop:"+" "+s.toString()+" Distance "+s.distanceFrom(a));
        }
        for(Facility s:allF){
        System.out.println("Facilities"+" "+s.toString());
        }
        System.out.println(shops.size());
        System.out.println(allF.size());*/
        //While the warehouse still has trucks left
        while(a.trucksLeft()){
            //Sets this truck equals to the next truck that the warehouse has
            Truck current=a.getNextTruck();
            //while the trucks weight is less than 500
            while(current.getWeight()<500){
                //Goes through the shops
                //for(int i=0;i<shops.size(){
                    
                //}
            }
        }
    }
}
