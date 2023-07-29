package ConcurrencExecutorAndCallablesRevision.Callables;

import com.sun.source.tree.WhileLoopTree;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MergerSorter implements Callable <List<Integer>> {
    private List<Integer> sortList;
    ExecutorService se;

    public MergerSorter(List<Integer> sortList,ExecutorService se) {
        this.sortList = sortList;
        this.se = se;
    }

    @Override
    public List<Integer> call() throws Exception {
        // Logic of Merge sort  -> recursove algoritm
        if(sortList.size()<=1){
            return sortList;
        }
        System.out.println(Thread.currentThread().getName() );
        List<Integer> f = new ArrayList<>();
        List<Integer> s = new ArrayList<>();
        int size = sortList.size();
        for(int i=0;i<size/2;i++){
            f.add(sortList.get(i));
        }
        for(int i=size/2;i<size;i++){
            s.add(sortList.get(i));
        }
        //ExecutorService e = Executors.newCachedThreadPool();

        MergerSorter FC = new MergerSorter(f,se);
        MergerSorter SC = new MergerSorter(s,se);
        Future<List<Integer> > futureF  = se.submit(FC);
        Future<List<Integer> > futureS  = se.submit(SC);
        List<Integer> ff =  futureF.get();
        List<Integer> ss =  futureS.get();

        int i=0;
        int j=0;
        List<Integer> result = new ArrayList<>();

        while(i< ff.size() && j< ss.size()){
            if(ff.get(i)<ss.get(j)){
                result.add(ff.get(i));
                i++;
            }else {
                result.add(ss.get(j));
                j++;
            }
        }

        while (i < ff.size()){
            result.add(ff.get(i));
            i++;
        }
        while (j < ss.size()){
            result.add(ss.get(j));
            j++;
        }
        return result;

    }
}
