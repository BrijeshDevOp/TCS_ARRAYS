import java.util.*;

public class ReverseArrayCollections {
    public static void main(String[] x){

	Integer array[] = {1,2 ,4,5,6,7,8};
	
	Collections.reverse(Arrays.asList(array));

	for(Integer arr : array){
		System.out.println(arr);
	}
	
	}
}
