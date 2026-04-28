import java.util.*;    

class candidate{
    int candidateID;
    String name;    
    String party;
    int voteCount;


candidate(int candidateID, String name, String party) {
    this.candidateID = candidateID;
    this.name = name;
    this.party = party;
    this.voteCount = 0;
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Candidate ID:");
    int candidateID = sc.nextInt();
    sc.nextLine(); 
    System.out.println("Enter Name:");
    String name = sc.nextLine();
    System.out.println("Enter Party:");
    String party = sc.nextLine();
    
    candidate newCandidate = new candidate(candidateID, name, party);
    System.out.println("Candidate added: " + newCandidate.name);
    getDetails(newCandidate);
    sc.close();
   
}

public static void incrementVote(candidate newCandidate){
    newCandidate.voteCount++;
}
static void getDetails(candidate newCandidate){
    System.out.println("Candidate name:"+newCandidate.name);
}

}

