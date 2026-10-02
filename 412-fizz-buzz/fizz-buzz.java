
class Solution {
    public List<String> fizzBuzz(int n) {
       
        List<String> ans = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            int j = i + 1;
            
            if (j % 3 == 0 && j % 5 == 0) {
                ans.add("FizzBuzz"); // Use .add() instead of [i]
            } else if (j % 3 == 0) {
                ans.add("Fizz");
            } else if (j % 5 == 0) {
                ans.add("Buzz");
            } else {
                ans.add(String.valueOf(j));
            }
        }

        return ans;
    }
}
