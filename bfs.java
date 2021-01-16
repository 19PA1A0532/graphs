class Solution
{
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj)
    {
        boolean []visited =new boolean[V];
        LinkedList<Integer> queue=new LinkedList<Integer>();
        ArrayList<Integer> result=new ArrayList<Integer>();
        visited[0]=true;
        queue.add(0);
        result.add(0);
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i=0;i<size;i++){     
                int c=queue.removeFirst();
                for(Integer neighbour:adj.get(c)){
                    if(!visited[neighbour]){
                        visited[neighbour]=true;
                        queue.add(neighbour);
                        result.add(neighbour);
                    }
                }
            }
        }
        return result;
    }
}
