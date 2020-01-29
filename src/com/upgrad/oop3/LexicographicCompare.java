package com.upgrad.oop3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Question{
    private int id;
    private String title;
    private int upvotes;

    public Question(int id,String title,int upvotes){
        this.id = id;
        this.title = title;
        this.upvotes = upvotes;
    }

    public String getTitle(){
        return this.title;
    }

    public int getId(){
        return this.id;
    }

    public int getUpvotes(){
        return this.upvotes;
    }
}

public class LexicographicCompare {
    public static void main(String[] args){
        ArrayList<Question> qlist = new ArrayList<Question>();
        System.out.println("this is java code, it works good , i write code a lot , i like coding" +
                " it is very good and works well hello this is cool it is very good and cool too " +
                "also its good");
        Question q1 = new Question(1,"interfaces demo",3);
        Question q2 = new Question(2,"abstract class demo",4);
        Question q3 = new Question(3,"inheritance demo",0);
        Question q4 = new Question(4,"method overriding demo",3);

        qlist.add(q1);
        qlist.add(q2);
        qlist.add(q3);
        qlist.add(q4);
        sort(qlist);
        for(Question q:qlist){
            System.out.println(q.getId() + " " + q.getTitle() + " " + q.getUpvotes());
        }

        String text = "welcometojava";
        //System.out.println(text.substring(9,text.length()));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String message = "";
        String line;
        try {
            while ((line = br.readLine()) != null) {
               // System.out.println(line);
                if(line.equals(""))break;
                message = message + "\n" + line;
                //	String[] tokens = line.split("\\s");
                //	System.out.println(Arrays.toString(tokens));
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(message);
       //System.out.println(getLexicographicSubsV2(text));
    }

    public static void sort(ArrayList<Question> questions) {
        Collections.sort(questions, new Comparator<Question>() {
            public int compare(Question q1, Question q2) {
                if (q1.getUpvotes() == q2.getUpvotes())
                    return 0;

                return q1.getUpvotes() > q2.getUpvotes() ? 1 : -1;
            }
        });
    }

    public static String inputFromUser() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        return input;
    }

    public static String getLexicographicSubs(String s){
        int n = s.length();
        int i,j;
        int start,end;
        String res=null;
        ArrayList<String> sublist = new ArrayList<String>();

        for(i=0;i <= n-3;i++){

            start = i;
            end = i + 3;

            while((start < end) && (end <= n)){
                res = s.substring(start,end);
                sublist.add(res);
                start = end;
                end = end + 3;
            }
        }

        Collections.sort(sublist);
        return sublist.get(0) + "\n" + sublist.get(sublist.size() -1);
    }

    public static String getLexicographicSubsV2(String s){
        int n = s.length();
        int i,j;
        int start,end;
        String res=null;
        String smallest = "";
        String largest = "";

        for(i=0;i <= n-3;i++){

            start = i;
            end = i + 3;

            while((start < end) && (end <= n)){
                res = s.substring(start,end);
                if(smallest.equals("")){
                    smallest = res;
                    largest = res;
                }
                else if(res.compareTo(smallest) < 0){
                    smallest = res;
                }
                else if(res.compareTo(largest) > 0){
                    largest = res;
                }

                start = end;
                end = end + 3;
            }
        }

        return smallest + "\n" + largest;
    }
}
