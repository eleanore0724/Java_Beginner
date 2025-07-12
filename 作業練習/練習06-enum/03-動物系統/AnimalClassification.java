public enum AnimalClassification{
    Birds("鳥類"),Mammals("哺乳類"),Insect("昆蟲"),Aquatic("水生動物"),Amphibians("兩棲類");

    private final String chineseName;

    AnimalClassification(String chineseName){
        this.chineseName = chineseName;
    }

    public String getChineseName(){
        return chineseName;
    }
}