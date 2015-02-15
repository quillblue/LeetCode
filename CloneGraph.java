/**
 * Definition for undirected graph.
 * class UndirectedGraphNode {
 *     int label;
 *     List<UndirectedGraphNode> neighbors;
 *     UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
 * };
 */
public class Solution {
    HashMap<Integer,UndirectedGraphNode> nodeList=new HashMap<Integer,UndirectedGraphNode>();
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        if(node==null){return null;}
        UndirectedGraphNode current=new UndirectedGraphNode(node.label);
        nodeList.put(current.label,current);
        for(UndirectedGraphNode ugn:node.neighbors){
            if(ugn.label==current.label){current.neighbors.add(current);}//Self loop
            else{
                if(nodeList.containsKey(ugn.label)){
                    current.neighbors.add(nodeList.get(ugn.label));
                }
                else{
                    current.neighbors.add(cloneGraph(ugn));
                }
            }
        }
        return current;
    }
}