public class Pro_12916 {
	public static void main(String[] args) {
		solution("Pyy");
	}
	static boolean solution(String s) {
        boolean answer = true;   
        int p=0; int y=0;
        String change = s.toLowerCase();
        
        for(int i =0; i<s.length();i++){
            if(change.charAt(i) =='y'){
                y++;
            }else if(change.charAt(i) =='p'){
                p++;
            }
        }
        if( p == y){
            answer=true;
        }else{
            answer=false;
        }
        return answer;
    }
}