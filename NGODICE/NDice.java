import java.util.Random;

public class NDice{
	private Random random = new Random();
	private int value = 0;
	private String[] face = {"さ","だ","げ","か","ご","ん"};
	public NDice(){
		
	}
	public void cast(){
		this.value = this.random.nextInt(6);
	}
	public String getFace(){
		return this.face[this.value];
	}
}