
public class XunhuanPanduan {
	public static void main(String[] args) {
		XunhuanPanduan xp=new XunhuanPanduan();
		xp.xunHuan();
	}
	
	
	public void xunHuan() {
		int i=0,j=0;
		testlabel:
		for(;i<100;i++) {
			for(j=i;j<100;j++) {
				System.out.println("i="+i+" j="+j);
				if(j==105) {
					System.out.println("i="+i+" j="+j);
					break testlabel;
				}
			}
		}
	}
}
