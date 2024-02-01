class Solution {
    public List<String> fizzBuzz(int n) {
        List <String> ans= new ArrayList();
        for(int i=1;i<=n;i++){
            boolean Is3=i%3==0;
            boolean Is5=i%5==0;
            if(Is5 && Is3)
                ans.add("FizzBuzz");
            else if(Is3)
                ans.add("Fizz");
            else if(Is5)
                ans.add("Buzz");
            else{
                ans.add(Integer.toString(i));
            }

        }
        return ans;
    }
}