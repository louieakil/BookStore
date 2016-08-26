package lendinglibrary.models;

public class DVD extends Material{
	
	private String director;
	private String catalogNo;
	private int runningTime;
	private boolean licensed;


	public DVD(String id, String title, String branch, String director, String catalogNo, int runningTime) {
		super(id, title, branch);
		this.director = director;
		this.setCatalogNo(catalogNo);
		this.setRunningTime(runningTime);
		this.licensed = false;
	}

	public void license(){
		this.licensed = true;
	}

	public boolean getlicense(){
		return licensed;
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
	
	@Override
	public String toString(){
		return "DVD: " + getID() + " " + getTitle() + " / " + director;
	}

	public String getCatalogNo() {
		return catalogNo;
	}

	public void setCatalogNo(String catalogNo) {
		this.catalogNo = catalogNo;
	}

	public int getRunningTime() {
		return runningTime;
	}

	public void setRunningTime(int runningTime) {
		this.runningTime = runningTime;
	}

	
	
}
