class Solution {
    public boolean isHappy(int n) {
        int aux = 0, slow = n, fast = n;

        do{
            while(slow != 0){
                aux += Math.pow(slow % 10, 2);
                slow /= 10;
            }

            slow = aux;
            aux = 0;

            while(fast != 0){
                aux += Math.pow(fast % 10, 2);
                fast /= 10;
            }

            fast = aux;
            aux = 0;
            
            while(fast != 0){
                aux += Math.pow(fast % 10, 2);
                fast /= 10;
            }

            fast = aux;
            aux = 0;
            
        }while(fast != 1 && fast != slow);

        return fast == 1 ? true : false;
    }
}