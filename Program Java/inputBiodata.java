/**
 *
 * NIM : 1822500014
 * NAMA : DEFRIANDA
 * KEL : SI4C
 *
 *
 */


import java.io.*;

class biodata {
	String nama;
	String umur;
	String alamat;
	String tanggal_lahir;
	String nama_ayah;
	
	void setNama(String nm){
		nama = nm;
	}
	
	void setUmur(String umr) {
		umur = umr;
	}
	
	void setAlamat(String almt) {
		alamat = almt;
	}
	
	void setTglLahir(String tgl_lhr) {
		tanggal_lahir = tgl_lhr;
	}
	
	void setNamaAyah(String nm_ayah) {
		nama_ayah = nm_ayah;
	}
	
	void tampilBiodata() {
		System.out.println ("\n\n\n\n\n--------------------------------");
		System.out.println ("--------- Biodata --------------");
		System.out.println ("Nama : "+ nama);
		System.out.println ("Umur : "+umur);
		System.out.println ("Alamat : "+alamat);
		System.out.println ("Tanggal Lahir : "+tanggal_lahir);
		System.out.println ("Nama Ayah : "+nama_ayah);
		System.out.println ("--------------------------------");
	}
	
}

class inputBiodata {
	public static void main (String[] args) throws Exception {
		String nama;
		String umur;
		String alamat;
		String tanggal_lahir;
		String nama_ayah;
		
		biodata data = new biodata();
		BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
		
		System.out.print ("Input Nama Anda :");
		nama = input.readLine();
		System.out.print ("Input Umur Anda :");
		umur = input.readLine();
		System.out.print ("Input Alamat Anda :");
		alamat = input.readLine();
		System.out.print ("Input Tanggal Lahir Anda :");
		tanggal_lahir = input.readLine();
		System.out.print ("Input Nama Ayah Anda :");
		nama_ayah = input.readLine();
		
		data.setNama(nama);
		data.setAlamat(alamat);
		data.setTglLahir(tanggal_lahir);
		data.setUmur(umur);
		data.setNamaAyah(nama_ayah);
		
		data.tampilBiodata();
	}
}