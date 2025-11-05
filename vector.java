import java.util.Vector; 
public class vector {
    public static void main(String args[]){
        Vector <String> v=new Vector<>();
        v.add("omm");
        v.add("liku");
        v.add("Ayusman");
        System.out.print(v);
        v.remove("omm");
        System.out.print(v);
        v.add(2,"banana");
        System.out.print(v);
        System.out.print(v.firstElement());
    }
}
