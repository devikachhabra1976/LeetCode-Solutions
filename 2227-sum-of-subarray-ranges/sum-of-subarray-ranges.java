class Solution {

    long sumMin(int[] arr){
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        long ans = 0;
        for(int i=0;i<=n;i++){
            while(!st.isEmpty() && (i==n || arr[st.peek()]>=arr[i])){
                int mid = st.pop();
                int left = st.isEmpty() ? -1:st.peek();
                int right = i;
                long leftCount = mid - left;
                long rightCount = right - mid;

                ans = ans + ((long) arr[mid] * leftCount * rightCount);
            }
            if(i<n){

            st.push(i);
            }
        }
        return ans;
    }

    long sumMax(int[] arr){
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        long ans = 0;

        for(int i=0;i<=n;i++){
            while(!st.isEmpty() && (i==n || arr[st.peek()]<arr[i])){
                int mid = st.pop();
                int left = st.isEmpty() ?-1:st.peek();
                int right = i ;
                long leftCount = mid - left;
                long rightCount = right - mid;
                ans = ans + ((long) arr[mid] * leftCount * rightCount);


            }
            if(i<n){
            st.push(i);
            }
        }
        return ans;
    }
    public long subArrayRanges(int[] nums) {
        return sumMax(nums) - sumMin(nums);

    }
}