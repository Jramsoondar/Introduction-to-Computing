public class TwoSumm
{
    public static void main(String[] args)
    {
        int[] nums = {5, 3, 10, 4, 11};
        int target1 = 7;
        int target2 = 19;

        System.out.println("For target 7: " + findTwoSum(nums, target1));
        System.out.println("For target 19: " + findTwoSum(nums, target2));
    }


    public static boolean findTwoSum(int[] nums, int target)
    {
        for (int i = 0; i < nums.length; i++)
        {
            for (int j = i + 1; j < nums.length; j++)
            {
                if (nums[i] + nums[j] == target)
                {
                    return true;
                }
            }
        }
        return false;
    }


}