/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e.ktp;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class EKTP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //kbm 12-01-2022 (bu ratih)
        String Nama, NIK, Alamat, Gol_darah, TTL, Jenis_kelamin;

        Scanner input = new Scanner(System.in);

        System.out.print("Nama : ");
        Nama = input.nextLine();
        System.out.print("Alamat : ");
        Alamat = input.nextLine();
        System.out.print("NIK : ");
        NIK = input.nextLine();
        System.out.print("Gol darah : ");
        Gol_darah = input.nextLine();
        System.out.print("TTL : ");
        TTL = input.nextLine();
        System.out.print("Jenis Kelamin : ");
        Jenis_kelamin = input.nextLine();

        System.out.println(" ");
        System.out.println("=================================================================================");
        System.out.println(" ");
        System.out.println("Nama : " + Nama);
        System.out.println("NIK : " + NIK);
        System.out.println("Alamat : " + Alamat);
        System.out.println("Gol darah : " + Gol_darah);
        System.out.println("TTL : " + TTL);
        System.out.println("Jenis kelamin : " + Jenis_kelamin);
    }

}
