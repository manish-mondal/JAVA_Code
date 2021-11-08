class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       // HashSet<node> h = new HashSet();
        int[] result = new int[k];
        HashMap<Integer,node>  h= new HashMap();
        PriorityQueue<node> p = new PriorityQueue<node>((a,b) -> a.count - b.count);
        for(int i = 0 ; i<nums.length ; i++)
        {
            if(h.containsKey(nums[i])) h.get(nums[i]).count++;
                else{
                    node n = new node(nums[i],1);
                    h.put(nums[i],n);
                    }
               
        }
        for(node n : h.values())
        {
            p.add(n);
            if(p.size()>k)p.poll();
        }
        int j = 0;
        while(!p.isEmpty())
        {result[j] = p.poll().num; j++;}
    return result;
    }
    
}
class node{
    int num;
    int count;
    public node(int n, int count)
    {this.num = n; this.count = count;}
    
}
