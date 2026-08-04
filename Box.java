public class Box {
    double width, height, depth;   
    Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    } 
    double volume() {
        return width * height * depth;
    } 
    public static void main(String[] args) {
        Box b = new Box(12,4,6);
    
        System.out.println("Width:"+b.width);
        System.out.println("Height:"+b.height);
        System.out.println("Depth:"+b.depth);
        System.out.println("Volume:"+b.volume());
    }
}
    

