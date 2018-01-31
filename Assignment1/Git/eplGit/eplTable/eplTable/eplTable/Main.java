package eplTable;

public class Main extends Team{

	public Main(String name, int win, int draw, int loss, int gFor, int gAgainst, int points) {
		super(name, win, draw, loss, gFor, gAgainst, points);
		
	}

    public static void main(String[] args) {


		
		Team[] eplTeams = new Team[20];
		eplTeams[0] = new Team("manUtd", 9, 0, 0, 9, 0, 27);
		eplTeams[1] = new Team("chelsea", 0, 3, 0, 2, 2, 3);
		eplTeams[2] = new Team("liverpool", 0, 0, 1, 0, 2, 0);
		eplTeams[3] = new Team("arsenal", 3, 1, 0, 4, 0, 10);
		eplTeams[4] = new Team("stoke", 0, 0, 0, 0, 0, 0);
		eplTeams[5] = new Team("everton", 0, 0, 0, 0, 0, 0);
		eplTeams[6] = new Team("middlesbrough", 0, 0, 0, 0, 0, 0);
		eplTeams[7] = new Team("bornemouth", 0, 0, 0, 0, 0, 0);
		eplTeams[8] = new Team("sunderland", 0, 0, 0, 0, 0, 0);
		eplTeams[9] = new Team("westbrom", 0, 0, 0, 0, 0, 0);
		eplTeams[10] = new Team("leicester", 0, 0, 0, 0, 0, 0);
		eplTeams[11] = new Team("hull city", 0, 0, 0, 0, 0, 0);
		eplTeams[12] = new Team("swansea", 0, 0, 0, 0, 0, 0);
		eplTeams[13] = new Team("crystalPalace", 0, 0, 0, 0, 0, 0);
		eplTeams[14] = new Team("burnley", 0, 0, 0, 0, 0, 0);
		eplTeams[15] = new Team("watford", 0, 0, 0, 0, 0, 0);
		eplTeams[16] = new Team("manCity", 0, 0, 0, 0, 0, 0);
		eplTeams[17] = new Team("southampton", 0, 0, 0, 0, 0, 0);
		eplTeams[18] = new Team("westHam", 0, 0, 0, 0, 0, 0);
		eplTeams[19] = new Team("tottenham", 0, 0, 0, 0, 0, 0);

//		DISPLAY TABLE
        System.out.println("Rank \tTeam Name \tWins \tDraws \tLosses \tPoints");
        int rank = 1;
        for (int i = 114; i >= 0; i --){         
            for (Team eplTeam : eplTeams) {
                if (eplTeam.teamPoints == i) {
                    if (eplTeam.teamName.length()< 8 ) {
                        System.out.println(rank + "\t" + eplTeam.teamName + "\t\t" + eplTeam.teamWin + "\t" + eplTeam.teamDraw + "\t" + eplTeam.teamLoss + "\t" + eplTeam.teamPoints);
                    }
                    else{
                        System.out.println(rank + "\t" + eplTeam.teamName + "\t" + eplTeam.teamWin + "\t" + eplTeam.teamDraw + "\t" + eplTeam.teamLoss + "\t" + eplTeam.teamPoints);
                    }
                rank++;
                }
            }
        }

		
/*
		ADD RESULT
*/
		
/*
		GO BACK TO DISPLAY TABLE
*/
		

        }

	public void displayTable(Team a, Team b){
		
	System.out.println(a.getTeamName());
    System.out.println(b.getTeamWin() +" "+ b.getTeamDraw() );
	
	
	}
    
}
