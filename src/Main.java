import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        int target = 2;
        int[] input = {-1,1,2,3,1};
        List<Integer> nums = new ArrayList<Integer>();
        for (int i = 0; i < input.length; i++) {
            nums.add(input[i]);
        }

        System.out.println(countPairs(nums, target));
    }

    public static int countPairs(List<Integer> nums, int target) {
        int count = 0;
        for (int i = 0; i < nums.size(); i++) {
            for (int j = 0; j < nums.size(); j++) {
                if( i < j && nums.get(i) + nums.get(j) < target){
                    count++;
                    //System.out.println("-" + "(" + i + "+" + j +") since " + i + "<" + j + "and " + nums.get(i) + "+" + nums.get(j) + "=" + nums.get(i) + nums.get(j) + "< " + target);
                }
            }
        }
        return count;
    }
}
