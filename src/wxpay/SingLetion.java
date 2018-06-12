package wxpay;

public class SingLetion {
	//ÀÁºº
//	private SingLetion(){}
//	private static SingLetion singLetion= null;
//	public static synchronized SingLetion getInstance(){
//		if(singLetion == null){
//			singLetion = new SingLetion();
//		}
//		return singLetion;
//	}
	
	//¶öººÄ£Ê½
	private SingLetion(){}
	private static final SingLetion singLetion = new SingLetion();
	public static SingLetion getInstance(){
		return singLetion;
	}
}
