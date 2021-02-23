package api;

import com.google.gson.Gson;

import java.util.ArrayList;

import static spark.Spark.*;

public class Starter {
    private static JsonParcer parser = new JsonParcer();

    public static void main(String[] args) {
//        http://localhost:4567/
        post("/", (req, res) -> {
            if(req.body() == null)
                return 0;

            MainCode main = new MainCode();

            return main.mainFunction(parser.fromJson(req.body()));
        });
    }
}

class MedicalHistory{
    private int a;
    private int b;

    public MedicalHistory(){}

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}

class AllHistories{
    private ArrayList<MedicalHistory> histories = new ArrayList<>();
    
    public AllHistories(){
    }

    public ArrayList<MedicalHistory> getHistories() {
        return histories;
    }

    public void setHistories(ArrayList<MedicalHistory> histories) {
        this.histories = histories;
    }
}

class JsonParcer{
    private static Gson gson = new Gson();

    public JsonParcer(){
    }

    public AllHistories fromJson(String reqBody){
        return gson.fromJson(reqBody, AllHistories.class);
    }
}

class MainCode{
    public MainCode(){
    }

    public ArrayList<Integer> mainFunction(AllHistories histories){
        ArrayList<Integer> result = new ArrayList<>();

        for (MedicalHistory history: histories.getHistories()) {
            result.add(history.getA() + history.getB());
        }

        return result;
    }
}

