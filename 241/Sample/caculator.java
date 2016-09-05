package week09;
import java.util.Arrays;
/**
 *  caculator class reads input and do the caculation.
 *
 */
public class caculator{
    /** we make a simple stack. */
    private  int[] stack=new int[9];
    /** the stack pointer.*/
    private  int index=0;
    /**error flags.*/
    private  int flag=0;
    /**used for commond <code>o</code>.*/
    private String end="";

    /**
     *  method of stack to push.
     *
     * @param value input value.
     */
    public  void push(int value){
        stack[index]=value;
        index++;
    }
    /**
     *  method of stack to pop.
     *@return the return value.
     */
    public  int pull(){
        index--;
        if(index<0){
            index++;
            flag=2;
            return 0;
        }
        
        return stack[index];
    }
    /**
     *  to read input and make input easy for later use.
     *
     * @param intake input value.
     */
    public void inTake(String intake){
        String value[]=intake.split(" ");
        String special[];
        for(int i=0;i<value.length;i++){
            /**this part is to loop through ()*/
            if(value[i].equals("(")){
                /**number requried too loop*/
                int loper=pull();
                /**index of the first stuff to loop*/
                int zoper=i+1;
                
                for(int counter=0; counter<loper;counter++){
                    i=zoper;
                    while(!value[i].equals(")")){
                        if(i==value.length-1){
                            flag=1;
                            return;
                        }
                        caculon(value[i]);
                        i++;
                    }
                }
            }else {
                caculon(value[i]);
            }
        }
       
         
    }
    /**
     *  method to get good sorted input and do the caculation.
     *
     * @param  inpute sorted value.
     */
    public void caculon(String inpute){
        int result=0;
        int tester;
        int tested;

