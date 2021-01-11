public class Pro_42840 {
	public static void main(String[] args) {
		solution(new int[] {1,2,3,4,5});
	}
	public static int[] solution(int[] answers) {
			int[] answer= null;
			int[] studentA = new int[answers.length];
			int[] studentB = new int[answers.length];
			int[] studentC = new int[answers.length];
			int scoreA = 0;
			int scoreB = 0;
			int scoreC = 0;

			for(int i = 1; i < answers.length+1;i++){
				if(i%5 == 1)
					studentA[i-1] = 1;
				if(i%5 ==2)
					studentA[i-1] = 2;
				if(i%5 == 3)
					studentA[i-1] = 3;
				if(i%5 == 4)
					studentA[i-1] = 4;
				if(i%5 == 0)
					studentA[i-1] = 5;
			}

			for(int i = 1; i< answers.length+1;i++){
				if(i%2 == 1) {
					studentB[i-1] = 2;
				}if(i%8 == 2 ){
					studentB[i-1] = 1;
				}if(i%8 == 4){
					studentB[i-1] = 3;
				} if(i%8 == 6){
					studentB[i-1] = 4;
				}if(i%8 == 0){
					studentB[i-1] = 5;
				}
			}

			for(int i = 1; i< answers.length+1;i++){
				if(i%10 == 1 || i%10 ==2){
					studentC[i-1] = 3;
				}
				if(i%10 == 3 || i%10 == 4){
					studentC[i-1] = 1;
				}
				if(i%10 == 5 || i%10 == 6){
					studentC[i-1] = 2;
				}
				if(i%10 == 7 || i%10 == 8){
					studentC[i-1] = 4;
				}
				if(i%10 == 9 || i%10 == 0){
					studentC[i-1] = 5;
				}
			}

			 for(int i = 0; i<answers.length; i++ ){
				 if(answers[i] == studentA[i])
					 scoreA++;
				 if(answers[i] == studentB[i])
					 scoreB++;
				 if(answers[i] == studentC[i])
					 scoreC++;

			 } 


			if(scoreA > scoreB && scoreA > scoreC ){
				answer = new int[1];

				answer[0]=1;

			}else if(scoreA == scoreB && scoreA>scoreC  ){
				answer = new int[2];

				answer[0] =1;
				answer[1] =2;

			}else if(scoreB > scoreA && scoreB > scoreC){
				answer = new int[1];

				answer[0] = 2;

			}else if( scoreB > scoreA && scoreC == scoreB ){
				answer = new int[2];

				answer[0]=2;
				answer[1] =3;

			}else if(scoreC > scoreB && scoreC > scoreA){
				answer = new int[1];

				answer[0] =3;

			}else if(scoreC >scoreB && scoreC == scoreA){
				answer = new int[2];

				answer[0]=1;
				answer[1]=3;

			}else if(scoreA == scoreB && scoreB == scoreC){
				 answer = new int[3];

				answer[0] =1;
				answer[1] =2;
				answer[2] = 3;        
			}

			return answer;
		}
}

