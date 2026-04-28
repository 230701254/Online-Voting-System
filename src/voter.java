import java.util.*;


class voter
{ 
    int voterID;
    String name;
    int age;
    boolean hasVoted;

voter(int voterID, String name, int age)
{
    this.voterID = voterID;
    this.name = name;
    this.age = age;
    this.hasVoted = false;
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Voter ID:");
    int voterID = sc.nextInt();
    sc.nextLine();
    System.out.println("Enter Name:");
    String name = sc.nextLine();
    System.out.println("Enter Age:");
    int age = sc.nextInt();

    voter newVoter = new voter(voterID, name, age);
    System.out.println("Voter registered: " + newVoter.name);
    sc.close();
}

void authenticate() 
{
    if (age >= 18 && !hasVoted)
    {
        System.out.println("Voter authenticated: " +name);
    }
    else
    {
        System.out.println("Voter not eligible: " +name);
    }
}


void castVote(int electionID, int candidateID) 
{
    if (!hasVoted) 
    {
        
        System.out.println(name + " cast vote for Candidate ID: " + candidateID + " in Election ID: " + electionID);
        hasVoted = true;
    } 
    else 
    {
        
        System.out.println(name + " has already voted.");
    }
}

}