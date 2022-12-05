/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author Rafif, Erwin, Andrianho
 */
import java.util.*;
public class PerhitunganNilai {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RubrikPenilaian rubrik =  new RubrikPenilaian();
        

        
        int[] inputNilaiPenguji1 = new int[rubrik.getSizeListPenilaianPenguji()];
        int[] inputNilaiPenguji2 = new int[rubrik.getSizeListPenilaianPenguji()];
        int[] inputNilaiPembimbing = new int[rubrik.getSizeListPenilaianPembimbing()];
        
        //input masing masing komponen nilai oleh dosbing
        
        //input masing-masing komponen nilai oleh penguji
        
        //compute nilai
        
    }
    
    public double hitungNilaiPenguji(RubrikPenilaian rubrik, int[] inputNilaiPenguji){
        double total = 0;
        for(int i=0; i<rubrik.listPenilaianPenguji.size(); i++){
            KomponenNilai curr = rubrik.listPenilaianPenguji.get(i);
            total+= (curr.getBobot()*inputNilaiPenguji[i]);
        }
        return total;
    }
    
    public double hitungNilaiPembimbing(RubrikPenilaian rubrik, int[] inputNilaiPembimbing){
        double total = 0;
        for(int i=0; i<rubrik.listPenilaianPembimbing.size(); i++){
            KomponenNilai curr = rubrik.listPenilaianPembimbing.get(i);
            total+= (curr.getBobot()*inputNilaiPembimbing[i]);
        }
        return total;
    }
    
    public double hitungTotal(List<Double> rekapNilai){
        double curr = 0;
        for(int i=0; i<rekapNilai.size(); i++){
            curr+= rekapNilai.get(i);
        }
        double total = curr/rekapNilai.size();
        return total;
    }
}

final class RubrikPenilaian {
    ArrayList<KomponenNilai> listPenilaianPenguji;
    ArrayList<KomponenNilai> listPenilaianPembimbing;
    
    public RubrikPenilaian() {
        listPenilaianPenguji =  new ArrayList<>();
        listPenilaianPenguji.add(new KomponenNilai("Komponen Nilai 1", 30 ));
        listPenilaianPenguji.add(new KomponenNilai("Komponen Nilai 2", 30 ));
        listPenilaianPenguji.add(new KomponenNilai("Komponen Nilai 3", 40 ));
        
        listPenilaianPembimbing =  new ArrayList<>();
        listPenilaianPembimbing.add(new KomponenNilai("Komponen Nilai 1", 30));
        listPenilaianPembimbing.add(new KomponenNilai("Komponen Nilai 2", 30));
        listPenilaianPembimbing.add(new KomponenNilai("Komponen Nilai 3", 20));
        listPenilaianPembimbing.add(new KomponenNilai("Komponen Nilai 4", 20));
    }
    
    public KomponenNilai getKomponenNilaiPenguji(int i){
        return listPenilaianPenguji.get(i);
    }
    
    public KomponenNilai getKomponenNilaiPembimbing(int i){
        return listPenilaianPembimbing.get(i);
    }
    
    public int getSizeListPenilaianPenguji() {
        return listPenilaianPenguji.size();
    }
    
    public int getSizeListPenilaianPembimbing() {
        return listPenilaianPembimbing.size();
    }
}

final class KomponenNilai {
    private String title;
    private double bobot;
    
    public KomponenNilai(String title, float bobot){
        this.title = title;
        this.bobot = (double)bobot/100;
    }
    
    public double getBobot() {
        return this.bobot;
    }
    
    public String getTitle(){
        return this.title;
    }
}

