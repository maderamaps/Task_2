/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taskdua;

/**
 * nim : 1301154203
 * nama : made rama priyana sugina
 * @author GL552JX
 */
public class Taskdua {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa m1 = new Mahasiswa();
            m1.setNIM("001");
            m1.setNama("Budi");
            m1.addNilai('C');
            m1.addNilai('D');
            m1.addNilai('B');
            m1.addNilai('D');
            System.out.println(m1);
            System.out.println(m1.getNilai(2));
            
            Mahasiswa m2 = new Mahasiswa("002", "Eka");
            m2.addNilai('A');
            m2.addNilai('B');
            m2.addNilai('E');
            m2.addNilai('C');
            m2.addNilai('B');
            m2.setStatus("Lulus");
            System.out.println(m2);
            
            char h1 = m1.cekNilai(m2);
            char h2 = m2.cekNilai(m1);
            System.out.println("Hasil = "+h1+", "+h2);
            
        
        }
    }
    