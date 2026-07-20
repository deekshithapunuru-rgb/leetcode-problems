lass Solution {
    public int subtractProductAndSum(int n) {
        int result;
        int add =0;
        int mul=1;
        while(n>0){
            int lastDigit = n %10;
            n = n/10;
            add = add + lastDigit;
            mul = mul * lastDigit;
        }
        result = mul - add;
return result;
    }
    
}
