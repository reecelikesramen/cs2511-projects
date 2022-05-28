package com.example.myfirstapp.framework.solution;

import com.example.myfirstapp.framework.graph.Vertex;
import com.example.myfirstapp.framework.problem.Problem;
import java.util.LinkedList;

/**
 * A problem solver that does a depth-first search of
 * the problem graph.
 * @author tcolburn
 */
public class DFSGraphSolver extends GraphSolver {
    
    public DFSGraphSolver(Problem problem) {
        super(problem);
        super.getStatistics().setHeader("Depth-First Graph Search");
    }
    
    @Override
    public void add(Vertex v) {
        ((LinkedList<Vertex>)getQueue()).addFirst(v); // DFS
    }
    
}
