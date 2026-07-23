public class coinchange2 {
    public static void main(String[] args) {
        int[] coins = {1,2,5};
        int amount = 5;
        int ans = coinChange(coins, amount);

        System.out.println(ans);


    }
    public static int coinChange(int[] coins, int amount) {
        int index = 0;
        return solve(coins,amount,index);
    }
    public static int solve(int[]coins,int amount,int index){
        if(amount == 0){
            return 1;
        }
        if(amount < 0){
            return 0;
        }
        if(index >= coins.length){
            return 0;
        }

        int include = solve(coins,amount-coins[index],index);
        int exclude = solve(coins,amount,index+1);

        return include + exclude;
    }
}
