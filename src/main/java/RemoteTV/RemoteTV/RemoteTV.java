package RemoteTV.RemoteTV;
import java.util.ArrayList;
/*Imitation of the remote TV 
 * given an remote that only has direction buttons and OK button
 * Notes:
*The cursor always starts on the letter a (top left)
*The alpha characters are initially lowercase (as shown above)
*Remember to also press OK to "accept" each letter
*Take a direct route from one letter to the next
*The cursor does not wrap (e.g. you cannot leave one edge and reappear on the opposite edge)
*Although the blank keys have no function, you may navigate through them if you want to
*Spaces may occur anywhere in the words string.
*Do not press the SHIFT key until you need to. For example, with the word e.Z, the SHIFT change happens after the . is pressed (not before)*/
public class RemoteTV {
	/*Takes the string to be typed on the screen, as argument, and returns the number of steps needed to do this.*/
	
	public static int tvRemote(final String words) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		char[][] table ={ 
				{'a','b','c','d','e','1','2','3'},
				{'f','g','h','i','j','4','5','6'},
				{'k','l','m','n','o','7','8','9'},
				{'p','q','r','s','t','.','@','0'},
				{'u','v','w','x','y','z','_','/'},
				{'$',' ','�','�','�','�','�','�'}};
				
				boolean upper = false;
			    int currentRow = 0;
			    int currentColumn = 0;
			    for(char letter : words.toCharArray()){
			    	
			    	if(Character.isUpperCase(letter)){
			    		if(upper == false){
	    					upper = true;
	    					for(int x = 0; x < 6; x++){
	    						for(int y = 0; y < 8; y++){
	    			
	    							if(table[x][y] == '$'){
	    				
	    								int nextResult = Math.abs(x - currentRow) + Math.abs(y - currentColumn);
	    								list.add(nextResult + 1);
	    								currentRow = x;
	    								currentColumn = y;
	    			
	    				}}}}}
			    	
			    	if(Character.isLowerCase(letter)){
			    		if(upper == true){
	    					
	    					upper = false;
	    					for(int x = 0; x < 6; x++){
	    						for(int y = 0; y < 8; y++){
	    			
	    							if(table[x][y] == '$'){
	    				
	    								int nextResult = Math.abs(x - currentRow) + Math.abs(y - currentColumn);
	    								list.add(nextResult + 1);
	    								currentRow = x;
	    								currentColumn = y;
	    							
	    			
	    				}}}}}
			    	
			    		for(int i = 0; i < 6; i++){
			    		for(int j = 0; j < 8;j++){
			    			if(table[i][j] == Character.toLowerCase(letter)){
			    				
			    				int result = Math.abs(i - currentRow) + Math.abs(j - currentColumn);
			    				list.add(result);
			    				currentRow = i;
			    				currentColumn = j;
			    				
			    			}}}
			    	}
			    
	   int sum = 0;
	   for(int i : list){
		   sum += i;
	   }
	    	
	    return sum + words.length();
	  }
	
}
