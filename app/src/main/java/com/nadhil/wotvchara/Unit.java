package com.nadhil.wotvchara;

public class Unit {
    private String name, detail, series, limName, limVideo, skDes;
    private int photo, tabel, skDraw, mRare, mElement;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getSeries() {
        return series;
    }
    public void setSeries(String series){
        this.series = series;
    }
    public int getTabel(){
        return tabel;
    }
    public void setTabel(int tabel){
        this.tabel = tabel;
    }
    public String getLimitName(){
        return limName;
    }
    public void setLimName(String limName){
        this.limName = limName;
    }
    public String getLimVideo(){
        return limVideo;
    }
    public void setLimVideo(String limVideo){
        this.limVideo = limVideo;
    }
    public int getSkillDraw(){
        return skDraw;
    }
    public void setSkillDraw(int skDraw){
        this.skDraw = skDraw;
    }
    public String getSkillDes(){
        return skDes;
    }
    public void setSkillDes(String skDes){
        this.skDes = skDes;
    }
    public int getElement(){
        return mElement;
    }
    public void setElement(int mElement) {
        this.mElement = mElement;
    }
    public int getRarity(){
        return mRare;
    }
    public void setRarity(int mRare) {
        this.mRare = mRare;
    }
}
