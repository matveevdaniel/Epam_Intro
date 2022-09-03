package by.epam.module1.branching;

public class BranchingTask1 {

    public static void main(String[] args) {
	// TODO Auto-generated method stub

    }
    
    public static boolean isRightTriangle(int firstAngle,int secondAngle) {
	    if((firstAngle+secondAngle<180)&((firstAngle!=0)&(secondAngle!=0))) 
		if((firstAngle+secondAngle==90)||(firstAngle==90||secondAngle==90)) return true;
	    
	    return false;
	}

}
