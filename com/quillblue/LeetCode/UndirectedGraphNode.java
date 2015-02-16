package com.quillblue.LeetCode;
import java.util.*;
/**
 * Created by Sharon on 2015-02-16.
 */
public class UndirectedGraphNode {
    int label;
    List<UndirectedGraphNode> neighbors;
    UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
}
