package lendinglibrary.models;

public class DVD extends Material{
	
	private String director;
	private String catalogNo;
	private int runningTime;
	private boolean licensed;


	public DVD(int id, String title, String branch, String director, String catalogNo, int runningTime) {
		super(id, title, branch);
		this.director = director;
		this.catalogNo = catalogNo;
		this.runningTime = runningTime;
		this.licensed = false;
	}

	public void license(){
		this.licensed = true;
	}
	
	public boolean lend(Customer customer){
		if(licensed){
			return super.lend(customer);
		}
		else{
			return false;
		}
		
	}
	
	@Override
	public int getLoanPeriod() {
		return 7;
	}
	
	
}
