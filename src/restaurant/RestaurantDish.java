package restaurant;

class RestaurantDish {
    private String nameOfDish;
    private int costInCents;
    private boolean wouldRecommend;
    private void eat() {
        System.out.println("Nom nom nom!");
    }

//    setters

    public void setNameOfDish (String name) {
        this.nameOfDish = name;
    }
    public void setCostInCents (int cost) {
        this.costInCents = cost;
    }
    public void setWouldRecommend (boolean trueOrFalse) {
        this.wouldRecommend = trueOrFalse;
    }



//    getters

    public String getNameOfDish() {
        return nameOfDish;
    }
    public int getCostInCents(){
        return costInCents;
    }
    public boolean getWouldRecommend () {
        return wouldRecommend;
    }

    public void letsEat() {
        eat();
    }


}
