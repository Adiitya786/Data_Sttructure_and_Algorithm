public class input_output1D{

    public static void update(int marks[],int non_changable){
        for(int i=0;i<marks.length;i++){
            marks[i]= marks[i]+1;
        }
    }
    public static void main(String[] args) {
             int non_changable =5;
             int marks[] = new int[3];
             marks[0]=97;
             marks[1]=98;
             marks[2]=99;
            update(marks,non_changable);
            for(int i=0;i<marks.length;i++){ 
            System.out.println(marks[i]+"  ");    //   arrays works on call by  reference.
            }
            System.out.println(non_changable);   // int variable works on call by value.
    }
}
