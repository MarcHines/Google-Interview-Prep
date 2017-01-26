  public ArrayList<Vertex> topologicalSort(Vertex orgin){  
      ArrayList<Vertex> result = new ArrayList<>();
      Stack<Vertex> stack = new Stack<>();
      result.add(orgin);
      orgin.setVisted();
      stack.push(orgin);
      
      while(!stack.isEmpty()){
        Vertex realVertex = stack.pop(); 
        
        for(Vertex v : realVertex.getNeighbors()){
          if(!v.getVisited()){
            result.add(v);
            v.setVisted();
            v.setPrevious(realVertex);
            stack.push(v);
          } 
        }
      }
     return result;
    }  
