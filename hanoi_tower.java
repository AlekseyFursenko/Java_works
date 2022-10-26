public class hanoi_tower {
    public static void main(String[] args) {
        int num = 5; // number of rings
        char a = 'A'; // 1-st rod
        char b = 'B'; // 2-nd rod
        char c = 'C'; // 3-rd rod

        hanoi(num, a, b, c);
        System.out.println("Total " + (Math.pow(2, num) - 1) + " operations");
    }

    static void hanoi(int num, char a, char b, char c){
        if(num > 0) {
            
            hanoi(num-1, a, c, b);
        
            System.out.printf("Move ring %d from %c--->%c\n", num, a, c);
            
            hanoi(num-1, b, a, c);
        
        }
    }
}
