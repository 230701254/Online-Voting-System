#  Online Voting System (Java)

##  Problem Statement

To develop a console-based Online Voting System that allows voters to vote for candidates in an election. The system ensures that each voter can vote only once and that votes are recorded and counted correctly.

---

## 🎯 Objective

To build a simple and secure voting system using Java that ensures fair voting by allowing each voter to vote only once and accurately counting votes.

---

##  System Description

This system allows:

* Creation of candidates
* Registration of voters
* Casting votes
* Counting and displaying results

The system is implemented using Java and follows Object-Oriented Programming principles.

---

##  Classes Used

### 1. Voter (voter.java)

**Attributes:**

* voterId
* name
* age
* hasVoted

**Methods:**

* authenticate()
* castVote()
* getStatus()

---

### 2. Candidate (candidate.java)

**Attributes:**

* candidateId
* name
* party
* voteCount

**Methods:**

* incrementVote()
* getDetails()

---

### 3. Election (election.java)

**Attributes:**

* electionId
* name
* startDate
* endDate
* status

**Methods:**

* addCandidate()
* closeElection()
* declareResult()

---

### 4. VoteRecord (voteRecord.java)

**Attributes:**

* recordId
* voterId
* electionId

**Methods:**

* validate()
* save()

---

### 5. VotingSystem (votingSystem.java)

**Methods:**

* createElection()
* registerVoter()
* getResult()

---

### 6. Main Class (main.java)

* Initializes candidates
* Stores candidates using ArrayList
* Accepts user input using Scanner
* Controls voting flow

---

##  Working / Logic

1. Candidates are created and stored in an ArrayList
2. Voters are registered
3. User enters voter ID
4. System checks if voter has already voted
5. If not, voter selects a candidate
6. Vote count of the selected candidate is increased
7. Voter status is updated to "hasVoted = true"
8. After voting, results are displayed

---

##  Business Rules Implemented

* A voter can vote only once
* Votes are counted correctly for each candidate
* Voter status is updated after voting
* System uses in-memory storage (ArrayList)

---

##  Technologies Used

* Java
* Object-Oriented Programming (Encapsulation, Classes, Objects)
* ArrayList (Java Collections)

---

##  Steps to Run

1. Open terminal

2. Navigate to project folder:

   ```
   cd Online_Voting_System/src
   ```

3. Compile all files:

   ```
   javac *.java
   ```

4. Run the program:

   ```
   java main
   ```

---

##  Output

* Displays candidate list
* Allows voter to vote
* Updates vote count
* Shows final result

---

##  Exception Handling

* Prevents duplicate voting
* Handles invalid voter input
* Ensures system runs without crashing

