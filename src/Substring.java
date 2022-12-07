import java.util.ArrayList;

public class Substring {

    public static String[] kmerArrayCreation(String Input,int k){
        ArrayList<String> temp=new ArrayList<>();
        int i = 0;
        while(i+k<Input.length()){
            temp.add(Input.substring(i,i+k));
            i++;
        }
        String[] output= new String[temp.size()];
        output=temp.toArray(output);
        return output;
    }
    public static String createRandomString(int n){
        String Input ="acgt";
        StringBuilder s = new StringBuilder(n);
        for ( int i=0; i<n; i++) {
            int ch = (int)(Input.length() * Math.random());
            s.append(Input.charAt(ch));
        }

        return s.toString();

    }

}
