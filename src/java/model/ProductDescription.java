/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author admin
 */
public class ProductDescription {
    private int productID;
    private String img1;
    private String img2;
    private String img3;
    private String img4;
    private String sale;
    private String giaxesale;
    private String namsanxuat;
    private int hopso;
    private int tinhtrang;
    private String xuatxu;
    private String mausac;
    private String nhienlieu;
    private int soghe;

    public ProductDescription() {
    }

    public ProductDescription(int productID, String img1, String img2, String img3, String img4, String sale, String giaxesale, String namsanxuat, int hopso, int tinhtrang, String xuatxu, String mausac, String nhienlieu, int soghe) {
        this.productID = productID;
        this.img1 = img1;
        this.img2 = img2;
        this.img3 = img3;
        this.img4 = img4;
        this.sale = sale;
        this.giaxesale = giaxesale;
        this.namsanxuat = namsanxuat;
        this.hopso = hopso;
        this.tinhtrang = tinhtrang;
        this.xuatxu = xuatxu;
        this.mausac = mausac;
        this.nhienlieu = nhienlieu;
        this.soghe = soghe;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getImg1() {
        return img1;
    }

    public void setImg1(String img1) {
        this.img1 = img1;
    }

    public String getImg2() {
        return img2;
    }

    public void setImg2(String img2) {
        this.img2 = img2;
    }

    public String getImg3() {
        return img3;
    }

    public void setImg3(String img3) {
        this.img3 = img3;
    }

    public String getImg4() {
        return img4;
    }

    public void setImg4(String img4) {
        this.img4 = img4;
    }

    public String getSale() {
        return sale;
    }

    public void setSale(String sale) {
        this.sale = sale;
    }

    public String getGiaxesale() {
        return giaxesale;
    }

    public void setGiaxesale(String giaxesale) {
        this.giaxesale = giaxesale;
    }

    public String getNamsanxuat() {
        return namsanxuat;
    }

    public void setNamsanxuat(String namsanxuat) {
        this.namsanxuat = namsanxuat;
    }

    public int getHopso() {
        return hopso;
    }

    public void setHopso(int hopso) {
        this.hopso = hopso;
    }

    public int getTinhtrang() {
        return tinhtrang;
    }

    public void setTinhtrang(int tinhtrang) {
        this.tinhtrang = tinhtrang;
    }

    public String getXuatxu() {
        return xuatxu;
    }

    public void setXuatxu(String xuatxu) {
        this.xuatxu = xuatxu;
    }

    public String getMausac() {
        return mausac;
    }

    public void setMausac(String mausac) {
        this.mausac = mausac;
    }

    public String getNhienlieu() {
        return nhienlieu;
    }

    public void setNhienlieu(String nhienlieu) {
        this.nhienlieu = nhienlieu;
    }

    public int getSoghe() {
        return soghe;
    }

    public void setSoghe(int soghe) {
        this.soghe = soghe;
    }

    @Override
    public String toString() {
        return "ProductDescription{" + "productID=" + productID + ", img1=" + img1 + ", img2=" + img2 + ", img3=" + img3 + ", img4=" + img4 + ", sale=" + sale + ", giaxesale=" + giaxesale + ", namsanxuat=" + namsanxuat + ", hopso=" + hopso + ", tinhtrang=" + tinhtrang + ", xuatxu=" + xuatxu + ", mausac=" + mausac + ", nhienlieu=" + nhienlieu + ", soghe=" + soghe + '}';
    }
    
    
}
