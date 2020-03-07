package calculator;
/**
 * Created by Fil on 8/7/2020.
 */
public class Calculator1 {
    private int result;
    int first;
    int second;

    public void add(Integer integer, Integer integer1) {
    }

    public int getResult() {
        return  this.result = first + second;


    }


    public void cleanResult() {
        this.result=0;

    }

    public void calculate(String ... args) throws Exception {
/*        this.args = args;
        checkArgsCount();*/
        executeOperation();
    }

    private void executeOperation() {
    }


