public class File implements Component {
    private String name;
    private int size;

    public File(String n, int s){
        name = n;
        size = s;
    }
    public String getName(){
        return name;
    }
    public int getSize(){
        return size;
    }
    public int getCount(){
        return 1;
    }
    public String display (String prefix){
        return prefix + name + " (" + size + ")";
    }
    public Component search(String n){
        if(this.name.equals(n)){
            return this;
        }
        return null;
    }
}