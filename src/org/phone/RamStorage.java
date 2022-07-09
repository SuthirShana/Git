package org.phone;

public class RamStorage  extends InternalStorage {
	private void internalRam() {
		System.out.println("4GB");
	}
	private void interRam() {
		System.out.println("6GB");
		
	}
	public static void main(String[] args) {
		RamStorage rs = new RamStorage();
		rs.internalRam();
		rs.interRam();
		rs.ProcessorName();
		rs.RamSize();
		rs.size();
		rs.storage();
		
		
	}
	

}
