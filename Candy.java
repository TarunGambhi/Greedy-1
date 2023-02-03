//https://leetcode.com/problems/candy
//TC : O(n)
//SC : O(n)
class Solution {
    public int candy(int[] ratings) {
        int[] result = new int[ratings.length];
        Arrays.fill(result,1);
        //left pass - compare with elements on left
        for(int i=1;i<ratings.length;i++){
            if(ratings[i] > ratings[i-1]){
                result[i]++;
            }
        }
        //right pass - compare with elements on right
        int sum = result[ratings.length-1];
        for(int i=ratings.length-2;i>=0;i--){
            if(ratings[i] > ratings[i+1]){
                result[i] = Math.max(result[i],result[i+1]+1);
            }
            sum += result[i];
        }
        return sum;
    }
}
