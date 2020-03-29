/**
 *
 * NIM : 1822500014
 * NAMA : DEFRIANDA
 * KEL : SI4C
 *
 *
 */

import java.io.*;

class nilaiMahasiswa {
	double absen, tugas, uts, uas;
	double a, b, c, d;
	
	void setAbsen (double abs) {
		absen = abs;
	}
	
	void setTugas (double tgs) {
		tugas = tgs;
	}
	
	void setUTS (double ts) {
		uts = ts;
	}
	
	void setUAS (double as) {
		uas = as;
	}
	
	double totalNilai () {
		double total;
		a = absen*0.1;
		b = tugas*0.2;
		c = uts*0.3;
		d = uas*0.4;
		total = a + b + c + d;
		return (total);
	}
}

class hitungNilaiAkhir {
	public static void main (String[] args) throws Exception {
		try {
			double absen, tugas, uts, uas;
		
			BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
			nilaiMahasiswa data = new nilaiMahasiswa();
			
			System.out.println ("---------------------------");
			System.out.println ("Hitung Nilai Akhir Semester");
			System.out.println ("---------------------------");
			System.out.print ("Masukan Nilai Absen [1-100] : ");
			absen = Double.parseDouble(input.readLine());
			System.out.print ("Masukan Nilai Tugas [1-100] : ");
			tugas = Double.parseDouble(input.readLine());
			System.out.print ("Masukan Nilai UTS [1-100] : ");
			uts = Double.parseDouble(input.readLine());
			System.out.print ("Masukan Nilai UAS [1-100] : ");
			uas = Double.parseDouble(input.readLine());
			
			data.setAbsen(absen);
			data.setTugas(tugas);
			data.setUTS(uts);
			data.setUAS(uas);
			
			if (data.totalNilai() >= 81) {
				System.out.println ("Total Nilai Anda "+ (int) data.totalNilai() + " Dan Grade Anda A");
			} else if (data.totalNilai() >= 71) {
				System.out.println ("Total Nilai Anda "+ (int) data.totalNilai() + " Dan Grade Anda B");
			} else if (data.totalNilai() >= 61) {
				System.out.println ("Total Nilai Anda "+ (int) data.totalNilai() + " Dan Grade Anda C");
			} else if (data.totalNilai() >= 51) {
				System.out.println ("Total Nilai Anda "+ (int) data.totalNilai() + " Dan Grade Anda D");
			} else {
				System.out.println ("Total Nilai Anda "+ (int) data.totalNilai() + " Dan Grade Anda E");
			}
			System.out.println ("---------------------------");
		} catch (Exception ie) {
			System.out.println ("Data yang Diinput Harus Angka");
		}
	}
}