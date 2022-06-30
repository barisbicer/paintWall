import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class WallPainting {
	
	
	public static int paintWall(int[] A) {
        // write your code in Java SE 8
		
		Deque<Integer> stack =new ArrayDeque<>();
		List<Integer> list=new ArrayList<>(); 
		
		stack.push(A[0]);
		list.add(A[0]);
		int count=A[0];
		for (int i = 1; i < A.length; i++) {
	         
			 if(A[i] > stack.peek())
			 {
				 count+=A[i]- stack.peek();
				 list.add(A[i]- stack.pop());
			 }
			 stack.push(A[i]);
			
		}
		
		 
		System.out.println(list);
	  
        return count;
    }
	
	public static void main(String[] args) {
		
		System.out.println(paintWall(new int[] {1, 3, 2, 1, 3, 1, 5, 3, 3, 4, 2}));
		System.out.println(paintWall(new int[] {5,8}));
		System.out.println(paintWall(new int[] {4, 3, 2, 1, 3, 1, 5, 3, 3, 4, 2}));
		System.out.println(paintWall(new int[] {1,1,1,1}));
		
	}

}
