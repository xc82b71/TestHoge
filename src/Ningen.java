
public class Ningen {
	private String name;
	private int shincho;
	public Ningen(String name,int shincho){
		this.setName(name);
		this.setShincho(shincho);
	}

	public void taberu(){
		System.out.println("たべる");
	}
	public void neru(){
		System.out.println("ねる");
	}

	public int getShincho() {
		return shincho;
	}

	public void setShincho(int shincho) {
		this.shincho = shincho;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
