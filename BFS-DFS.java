/*
Notice that BFS and DFS are indentical with the exception that BFS uses a queue,and DFS uses a Stack 
*We can use BFS for shortest path to any other Vertex in a graph by keeping track of each Vertices previous
Vertex. The FIRST time we reach the vertex we are looking for, THAT is the shortest path. We can then trace
the vertices PREVIOUS vertex all the way back to null to find our how far. Note that this only works for graphs
wall edges have the same distance.
*/


public void BFS(Vertex orgin){
      Queue<Vertex> queue = new LinkedList<>();
      orgin.setVisited();
      queue.add(orgin);
      
      while(!queue.isEmpty()){
        Vertex realvertex = queue.remove();
        System.out.println(realvertex.value);
        
        for(Vertex v : realvertex.getNeighbors()){
          if(!v.isVisited())
              v.setVisited();
              v.setPrevious(); //FOR SHORTEST PATH
              queue.add(v);
        }
      }
    }
    
    public void DFS(Vertex orgin){
      Stack<Vertex> stack = new Stack<>();
      orgin.setVisited();
      stack.push(orgin);
      
      while(!stack.isEmpty()){
        Vertex realvertex = stack.pop();
        System.out.println(realvertex.value);
        
        for(Vertex v : realvertex.getNeighbors()){
          if(!v.isVisited()){
            v.setVisited();
            stack.push(v);
          }
        }
      }
      
