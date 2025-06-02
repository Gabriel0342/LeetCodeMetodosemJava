public class Count_Operations_to_Obtain_Zero {
    public static void main(String[] args) {
        int x = 0;
        int y = 1;
        int z = countZeros(x, y);
        System.out.println(z);
    }
    public static int countZeros(int num1,int num2) {
        int cout = 0;
        while (num1 != num2) {
            if(num1 > num2) {
                num1 = num1 - num2;
                if(num2 == 0) {
                    return cout;
                }
            }
            else {
                num2 = num2 - num1;
                if(num1 == 0) {
                    return cout;
                }
            }
            cout++;
        }
        if(num1 != 0 && num2 != 0) {
            return cout + 1;
        }else {
            return cout;
        }
    }
}
