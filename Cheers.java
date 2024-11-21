// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
                String word = (args[0]).toUpperCase();
                int times = Integer.parseInt(args[1]);
                int spelling = 0;
                int count = 0;
                String tone = " ";
                String specialLetters = "AEFHILMNORSXaefhilmnorsx";       
                
    
                while (spelling < word.length()) {
                    char Letter = word.charAt(spelling);
    
                    tone = "a ";  
                    if (specialLetters.indexOf(Letter) != -1) {
                        tone = "an";  
                    }
    
                    
                    System.out.println("Give me " +tone + " " + word.charAt(spelling) + ": " + word.charAt(spelling) + "!");
                    spelling ++;
                    }
                
                System.out.println("What does that spell?");
    
                
                while (count < times){
                    System.out.println(word + "!!!");
                    count++;
                }
              }
            }
    
        

