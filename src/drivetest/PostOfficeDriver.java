package drivetest;

import iterator.Operator;
import iterator.PostOfficeCollection;
import template.BranchOffice;
import template.HeadOffice;
import template.PostOffice;
import template.SubOffice;

public class PostOfficeDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		PostOffice headOffice = new HeadOffice();
		PostOffice branchOffice = new BranchOffice();
		PostOffice subOffice = new SubOffice();
		
		PostOfficeCollection poCollection = new PostOfficeCollection();
		
		poCollection.addItem(subOffice);
		poCollection.addItem(branchOffice);
		poCollection.addItem(headOffice);
		
		Operator mailOperator = new Operator(poCollection);
		
		mailOperator.processMail();
		
	}

}
