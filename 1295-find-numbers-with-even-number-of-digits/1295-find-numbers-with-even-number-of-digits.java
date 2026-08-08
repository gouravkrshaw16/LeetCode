class Solution {
    public int findNumbers(int[] nums) {
        int even=0;
        for(int i=0;i<nums.length;i++)
        {
            int c=0;
            int temp=nums[i];
            while(temp!=0)
            {
                c++;
                temp=temp/10;
            }
            if((c%2)==0)
            even++;
        }
        return even;
    }
}