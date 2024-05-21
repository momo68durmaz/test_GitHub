package stack;

	import java.util.LinkedList;


	public class StringReverser {
		    
		    public static String reverseString(String input) {
		    	LinkedList<Character> stack = new LinkedList<Character>();
		    	for(char c : input.toCharArray()) {
		    		stack.push(c);
		    	}
		    	StringBuilder reversedString = new StringBuilder();
		    	while(!stack.isEmpty()) {
		    		reversedString.append(stack.pop());
		    	}
		    	return reversedString.toString();
		    			
		    }
		    	/*
		        Stack<String> stack = new Stack<String>();
		        
		        // Schieben Sie alle Zeichen des Strings als String in den Stapel
		        for (int i = 0; i < input.length(); i++) {
		            stack.push(input.substring(i, i+1));
		        }
		        
		        // Initialisiert eine Variable für den umgedrehten String
		        String reversed = "";
		        while (!stack.isEmpty()) {
		            // Hängen Sie das Zeichen oben auf dem Stapel an die umgekehrte Zeichenfolge an
		            reversed += stack.pop();
		        }
		        
		        return reversed;
		        }
		        */
		    
		    
		    public static void main(String[] args) {
		        System.out.println("Hello World!");
		        System.out.println(reverseString("Hello World!"));
		    	
		    	
		    	//String original = "Noah";
		        //String reversed = reverseString(original);
		        
		        //System.out.println("original: " + original);
		        //System.out.println("reversed: " + reversed);
		        
		        
		    }
		}




