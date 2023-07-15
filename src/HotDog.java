public class HotDog {
    private String name;
    private String origin;
    private String span;

    public HotDog(String name, String origin, String span){
        this.name =name;
        this.origin = origin;
        this.span = span;
    }
    public String getName(){
        return name;
    }
    public String getOrigin(){
        return origin;
    }
    public String getSpan(){
        return span;
    }
    public String detail(){
        return "あなたにオススメの犬はこれだ！ 犬種：" + this.name + ",原産国：" + this.origin + ",寿命:" + this.span;
    }
}