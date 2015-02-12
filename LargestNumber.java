public class Solution {
    public String largestNumber(int[] num) {
        Comparator<String> comp = new StringComparator();
        PriorityQueue<String> queue = new PriorityQueue<String>(num.length, comp);
        for (int i = 0; i < num.length; i++) {
            queue.add(String.valueOf(num[i]));
        }

        StringBuffer bf = new StringBuffer();
        while (!queue.isEmpty()) {
            bf.append(queue.poll());
        }
        return bf.charAt(0) == '0' ? "0":bf.toString();
    }

    private class StringComparator implements Comparator<String>{
        public int compare(String x,String y){
            if(x==y){return 0;}
            return -(x+y).compareTo(y+x);
        }
    }
}