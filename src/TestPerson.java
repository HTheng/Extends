/**
 * Created by hengjiang on 16/5/3.
 */
 class Person {
    private String Name;
    private String Sex;
    private int Age;

    public void setName(String _Name){
        this.Name = _Name;
    }

    public void setSex(String _Sex){
        this.Sex = _Sex;
    }

    public void setAge(int _Age){
        this.Age = _Age;
    }


    public String getName(){
        return Name;
    }

    public String getSex(){
        return Sex;
    }

    public int getAge(){
        return Age;
    }
}

class Actress extends Person{
    private String BB;

    public void setBB(String _BB){
        this.BB = _BB;
    }

    public String getBB(){
        return BB;
    }

}

 class Test{
    public static void main(String arg[]){
        Actress at = new Actress();
        at.setName("Jingtian");
        at.setBB("big");
        //Name是Person私有,不能直接访问;只能通过Person中public的方法来访问
        System.out.println(at.getName()+":"+at.getBB());
    }



}