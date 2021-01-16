    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj)
    {
        ArrayList<Integer> result= new ArrayList<Integer>();
        boolean visited[] = new boolean[V];
        dfs(0,adj,result,visited);
        return result;
        
    
 }

    public void dfs(int s, ArrayList<ArrayList<Integer>> adj , ArrayList<Integer> result, boolean visited[]){
        visited[s] = true;
        result.add(s);
        for(Integer neighbour : adj.get(s)){
            if(!visited[neighbour]){
                    dfs(neighbour, adj, result,visited);
                }
        }
    }
}
