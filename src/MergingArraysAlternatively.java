
public class MergingArraysAlternatively {

	public void merge(){
	
		int a[] ={1,3,5,7,9,11};
		int b[] ={2,4,6,8,10,12};
		int lengthA = a.length;
		int lengthB = b.length;
		int c[] = new int[lengthA+lengthB];
		int i,k=0,j=0,l=0;
	
	        for(i=0;i<c.length;i++){
	        	
	           if( j < a.length){
	        	   c[l++] = a[j++];
	           }
			   if(k<b.length){
				  c[l++] =b[k++];
			  }
	        	
				System.out.println(c[i]);
			}
		
	        
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergingArraysAlternatively m = new MergingArraysAlternatively();
		m.merge();
		}
	

}
