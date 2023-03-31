package com.laundry.PBOmaven;

import java.io.Serializable;

public class hitung implements Serializable {
        private Double Harga;
        private Double berat;
        public hitung(int Paket,int TipeBaju,Double berat){
            if (Paket == 0 && TipeBaju == 0){
                Harga = 5000.0;

            } else if (Paket == 1 && TipeBaju == 0){
                Harga = 10000.0;

            } else if (Paket == 0 && TipeBaju == 1){
                Harga = 10000.0;

            }else if (Paket == 1 && TipeBaju == 1){
                Harga = 15000.0;

            }
        }
        public Double getTotal(){
            return  Harga * berat;
        }

}
