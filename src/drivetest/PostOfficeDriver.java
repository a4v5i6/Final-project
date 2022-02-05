package drivetest;

import template.BranchOffice;
import template.HeadOffice;
import template.PostOffice;
import template.SubOffice;

public class PostOfficeDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		PostOffice headOffice = new HeadOffice();
		headOffice.send();
		
		System.out.println();
		PostOffice branchOffice = new BranchOffice();
		branchOffice.send();
		
		System.out.println();
		PostOffice subOffice = new SubOffice();
		subOffice.send();
	}

}
