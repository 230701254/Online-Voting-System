import java.util.*;
public class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<election> elections = new ArrayList<>();
        ArrayList<candidate> candidates = new ArrayList<>();
        candidate newCandidate1 = new candidate(1, "RAHUL", "MI");
        candidate newCandidate2 = new candidate(2, "RAKESH", "RCB");
        candidate newCandidate3 = new candidate(3, "ASIF", "CSK");
        
        candidates.add(newCandidate1);
        candidates.add(newCandidate2);
        candidates.add(newCandidate3);
        

        ArrayList<voter> voters = new ArrayList<>();

        voter newVoter1 = new voter(1, "RAHUL", 18);
        voter newVoter2 = new voter(2, "virat", 19);
        voter newVoter3 = new voter(3, "dhoni", 20);

        voters.add(newVoter1);
        voters.add(newVoter2);
        voters.add(newVoter3);


        System.out.println("Welcome to Tn elections 2026");
        System.out.println();
        
        
        for(int i=0;i<voters.size();i++)
        {
            System.out.println("Voter name: "+ voters.get(i).name);
            System.out.println();
            System.out.println("Candidates are....");
            for(int j=0;j<candidates.size();j++)
            {
                int candNum = j+1;
            System.out.println(candidates.get(j).name+" press "+ candNum +" to vote");
            }
        
            int vote = sc.nextInt();
            if(vote == 1)
            {
                candidates.get(vote-1).voteCount++;
                System.out.println("Vote for "+candidates.get(vote-1).name);
            }
            else if(vote == 2)
            {
                candidates.get(vote-1).voteCount++;
                System.out.println("Vote for "+candidates.get(vote-1).name);
            }
            else if(vote == 3)
            {
                candidates.get(vote-1).voteCount++;
                System.out.println("Vote for "+candidates.get(vote-1).name);
            }
            System.out.println("THANKYOU FOR VOTING");
            
        }
        int max=0;
        String cand ="";
        for(int j=0;j<candidates.size();j++)
            {
                if(candidates.get(j).voteCount > max)
                {
                    max=candidates.get(j).voteCount;
                    cand = candidates.get(j).name;
                }
            }
        System.out.println();
        System.out.println();
        System.out.println("Election Results:");
        System.out.println(cand+" won the election with a vote of "+max);



        











        sc.close();
       
    }
}
