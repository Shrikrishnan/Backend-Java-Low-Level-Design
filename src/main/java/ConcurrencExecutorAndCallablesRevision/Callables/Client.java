package ConcurrencExecutorAndCallablesRevision.Callables;

import java.util.List;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws Exception{
        List<Integer> l = List.of(5,8,93,1,2,4,7);
        ExecutorService  s  = Executors.newCachedThreadPool();

        MergerSorter m = new MergerSorter(l,s);
        Future< List<Integer> > list=  s.submit(m);
        List<Integer> i = list.get();

        System.out.print(i);
    }


}
