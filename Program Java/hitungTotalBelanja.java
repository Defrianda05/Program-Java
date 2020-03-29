/**
 *
 * NIM : 1822500014
 * NAMA : DEFRIANDA
 * KEL : SI4C
 *
 *
 */

import java.io.*;

class belanja {
	int i, bykbrg, bayar, j;
	int harga = 0;
	
	void setBayar (int byr) {
		bayar = byr;
	}
	
	
	void totalBelanja () throws Exception {
		try {
			BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
				for (j = 1; j <= 99; i++) {
					System.out.print ("Masukan Banyak Barang Belanja : ");
					bykbrg = Integer.parseInt(input.readLine());
						for (i = 1; i <= bykbrg; i++) {
							System.out.print ("Input harga barang ke-"+i+" : Rp. ");
							harga += Integer.parseInt(input.readLine());
						}
					System.out.print ("Ada Tambahan Transaksi ? : [1. ya/ 100. tidak] ");
					j = Integer.parseInt(input.readLine());
				}
			System.out.println ("Total Harga : Rp. "+ harga);
		} catch (Exception ie) {
			System.out.println ("Data yang Diinput Harus Angka");
			System.exit(0);
		}
		
	}
	
	int cekHarga () {
		int a;
		if (bayar < harga) {
			 a = harga - bayar;
			 System.out.println ("Kurang Bayar : Rp. "+ a);
			 System.out.println ("Terima Kasih :)");
		} else {
			a = bayar - harga;
			System.out.println ("Kembalian : Rp. "+ a);
		}
		return (0);
	}
	
}

class hitungTotalBelanja {
	public static void main (String[] args) throws Exception {
		try {
			int bayar;
		
			BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
			belanja data = new belanja();
			
			data.totalBelanja();
			
			System.out.print ("Jumlah Bayar : Rp. ");
			bayar = Integer.parseInt(input.readLine());
			data.setBayar(bayar);
			
			data.cekHarga();
		} catch (Exception ie) {
			System.out.println ("Data yang Diinput Harus Angka");
			System.exit(0);
		}
		
	}
}