public class Solution {
    public int compareVersion(String version1, String version2) {
        String[] v1=version1.split("\\.");
        String[] v2=version2.split("\\.");
        int i=0;
        while(i<v1.length&&i<v2.length){
            if(Integer.parseInt(v1[i])>Integer.parseInt(v2[i])){return 1;}
            if(Integer.parseInt(v1[i])<Integer.parseInt(v2[i])){return -1;}
            i++;
        }
        if(v1.length==v2.length){return 0;}
        if(v1.length>v2.length){
            for(int j=i;j<v1.length;j++){
                if(Integer.parseInt(v1[j])!=0){return 1;}
            }
            return 0;
        }
        else{
            for(int j=i;j<v2.length;j++){
                if(Integer.parseInt(v2[j])!=0){return -1;}
            }
            return 0;
        }
    }
}