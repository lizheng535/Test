package wxpay;

public class SingLetion {
	//����
//	private SingLetion(){}
//	private static SingLetion singLetion= null;
//	public static synchronized SingLetion getInstance(){
//		if(singLetion == null){
//			singLetion = new SingLetion();
//		}
//		return singLetion;
//	}
	
	//����ģʽ
	private SingLetion(){}
	private static final SingLetion singLetion = new SingLetion();
	public static SingLetion getInstance(){
		return singLetion;
	}
}
