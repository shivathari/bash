package callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.callable2.MyTask1;

public class ClientTest {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Callable<String> task22 = new Callable()
				{

					@Override
					public Object call() throws Exception {
						// TODO Auto-generated method stub
						return "My Task is done";
					}
			
				};
			  ExecutorService executorService = Executors.newSingleThreadExecutor();
			  Future<String> future = executorService.submit(task22);
			  if(future.isDone()) {
				  try {
					System.out.println(future.get());
				} catch (InterruptedException | ExecutionException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			  }
			 MyTask1 mytask = new MyTask1(10);
			 Future future2 = executorService.submit(mytask);
			 try {
				System.out.println(future2.get());
			} catch (InterruptedException | ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
			  
			  

	}

}
