import java.util.List;
import java.util.ArrayList;

public class Directory implements Component {
    private List<Component> children;
    private String name;
    
    public Directory(String n){
        children = new ArrayList<Component>();
        name = n;
        
    }
    public String getName(){
        return name;
    }
    public int getSize(){
        int size = 0;
        for(Component c : children){
            size += c.getSize();
        }
        return size;
    }
    public int getCount(){
        int count = 0;
        for(Component c: children){
            count += c.getCount();
        }
        return count;
    }
    public void add(Component c){
        children.add(c);
        }
    public void remove(Component c){
        children.remove(c);
    }

    public String display(String prefix){
        String directoryContent = prefix + name + ": (count=" + getCount() + ", size=" + getSize() + ")";
        for(Component c : children){
            directoryContent += "\n" + c.display(prefix + "    ");
        }
        return directoryContent;
    }
    public Component search(String n){
        for(Component c : children){
            if(c.getName().equals(n)){
                return c;
            }
            Component match = c.search(n);
            if(match != null){
                return match;
            }
        }
        return null;
    }
}