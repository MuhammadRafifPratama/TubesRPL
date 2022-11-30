/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author A C E R
 */
import java.util.*;
public class PerhitunganNilai {

    public static void main(String[] args) {
        //input jumlah komponenilai
        
        //input masing masing komponen nilai oleh dosbing
        
        //input masing-masing komponen nilai oleh penguji
        
        //compute nilai
        
    }
}

class RubrikPenilaian {
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
        return listPenilaianPenguji.get(i);
    }
}

class KomponenNilai {
    String title;
    float bobot;
    
    public KomponenNilai(String title, float bobot){
        this.title = title;
        this.bobot = (float)bobot/100;
    }
}
