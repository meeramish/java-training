package DataStructure;

public class Arrays {

	public static void main(String[] args) {
		String[]alphabet= {"a","b","c","d","e","f"};
		
		for(int i=0;i<alphabet.length; i++) {
		System.out.print(alphabet[i]+"  ");
	}
		int size= alphabet.length;
		for(int n=0; n<size; n++) {
			System.out.print(alphabet[n]+ " ");
		}
		for(String letter: alphabet) {
			System.out.print(letter+ " ");
		}
		// Get the size of Arrays
		
		String[][]users= {{"John","Williams","jw@","12345"},{"Sarah","Mendel","sw@","678910"},
				{"Major","ketty","mk@","111213"}};
		
		int numOfUsers=users.length;
		int numOfFields=users[0].length;
		System.out.println("\nNumber of Users: " +numOfUsers );
		System.out.println("Number of fields: "+ numOfFields);
		
		//Traverse the double array-------------------------------------------------------
		
		for(int j=0;j<numOfUsers;j++) {
			String firstName= users[j][0];
			String lastName= users[j][1];
			String email= users[j][2];
			String phone= users[j][3];
			System.out.println(firstName + " " + lastName+ " "+ email+ " "+ phone);
		}
		
		for(String[]user:users) {
			for(String field:user) {
				System.out.println(field);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
