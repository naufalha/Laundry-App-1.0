package com.laundry.PBOmaven;

public class Customer extends  code {
    private String nama;
    private String email;
    private double berat;
    private double Harga;

    public void setCustomer(int Paket,int TipeBaju,String nama,String email,double berat){
        this.nama = nama;
        this.email = email;
        this.berat = berat;

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
    
    public String getNama(){
        return nama;
    }
    public String getEmail(){
        return email;
    }

    public Double getBerat(){
        return  berat;
    }

    public Double getTotal(){
        return Harga*berat;
    }
    //method untuk menambahkan pemasukan
    public void setIncome(){
        income += getTotal();
    }
    public double getIncomedata(){
        return income ;
    }
    //method untuk mendapat code customer
    public int getCode(){
        return customerCode;
    }
    public void setCode(){
        customerCode = customerCode + 1;
    }

}
