package com.bin.soundcloud.Data;

public class SingleItemRecycleview {
    private String image;
    private String tencasi;
    private String tenbaihat;
    private String urlbaihat;



    public SingleItemRecycleview() {
    }
    public SingleItemRecycleview(String image, String tencasi, String tenbaihat, String urlbaihat) {
        this.image = image;
        this.tencasi = tencasi;
        this.tenbaihat = tenbaihat;
        this.urlbaihat = urlbaihat;
    }
    public SingleItemRecycleview(String image, String tencasi, String tenbaihat) {
        this.image = image;
        this.tencasi = tencasi;
        this.tenbaihat = tenbaihat;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTencasi() {
        return tencasi;
    }

    public void setTencasi(String tencasi) {
        this.tencasi = tencasi;
    }

    public String getTenbaihat() {
        return tenbaihat;
    }

    public void setTenbaihat(String tenbaihat) {
        this.tenbaihat = tenbaihat;
    }
    public String getUrlbaihat() {
        return urlbaihat;
    }

    public void setUrlbaihat(String urlbaihat) {
        this.urlbaihat = urlbaihat;
    }


}
