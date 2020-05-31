package com.company;

class SecondChapterToString {
    private String nameOrder;
    private String countOrder;
    private int price;

    SecondChapterToString(String nameOrder, String countOrder, int price){
        this.nameOrder = nameOrder;
        this.countOrder = countOrder;
        this.price = price;
    }

    @Override
    public String toString(){
        return this.nameOrder+" "+this.countOrder+" "+this.price;
    }

}
