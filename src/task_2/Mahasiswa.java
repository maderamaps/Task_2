/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taskdua;

/**
 *
 * @author GL552JX
 */
public class Mahasiswa {
 private String Nama, NIM, stat;
    char [] Nilai;
    int i ;
    
public Mahasiswa(){
    stat = "Tidak Lulus";
    i = 0;
    Nilai = new char[10];
}

public Mahasiswa(String nim, String nama){
    Nama = nama;
    NIM = nim;
    stat = "Tidak Lulus";
    i = 0;
    Nilai = new char [10];
} 

public String getNIM(){
    return NIM;
}

public void setNIM(String NIM){
    this.NIM = NIM;
}

public String getNama(){
    return Nama;
}

public void setNama(String Nama){
    this.Nama = Nama;
}

public String getStatus(){
    return stat;
}

public void setStatus(String Status){
    this.stat = Status;
}

public void addNilai (char nilai){
    if (i <= 10){
        Nilai[i] = nilai;
        i++;
    }
}

public char getNilai(int i){
    return Nilai[i];
}

public String toString(){
    String j;
    int k;
    j = NIM +","+Nama +","+stat+",nilai = ";
    for(k=0; k<i; k++){
        j = j + Nilai[k]+ ",";
    }
    return j;
}

public char cekNilai(Mahasiswa m) {
    char o = 0;
    for (char p = 'A'; p <= 'E'; p++){
        for(int hasil = 0; hasil < i; hasil++){
            if(Nilai[hasil] == p){
                for (int z = 0 ; z < m.i ; z++){
                    if (m.Nilai[z]==p){
                        return p;
                    }
                }
            } 
        }
    }
return 0;
}
}

