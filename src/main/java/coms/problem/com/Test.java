package coms.problem.com;

import java.util.concurrent.ForkJoinPool;

public class Test {
    public static void main(String[] args) {
        Problem test=new Problem();
        int nThread=Runtime.getRuntime().availableProcessors();
        System.out.println(nThread);
        Solver mfj=new Solver(test.getList());
//        ForkJoinExecutor pool=new ForkJoinPool(nThread);
//        pool.invoke(mfj);
//        long result=mfj.getResult();
//        System.out.println("Done. Result :"+result);
        long sum=0;
        for (int i=0;i<test.getList().length;i++){
            sum+=test.getList()[i];
        }
        System.out.println("Done . Result :"+sum);
    }
}
