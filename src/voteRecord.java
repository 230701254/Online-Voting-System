public class voteRecord {
    int recordID;
    int voterID;
    int electionID;
    int timestamp;


voteRecord(int recordID, int voterID, int electionID, int timestamp) {
    this.recordID = recordID;
    this.voterID = voterID;
    this.electionID = electionID;
    this.timestamp = timestamp;
}
}