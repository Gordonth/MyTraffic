package koregame.kaisorn.mytraffic;

/**
 * Created by Administrator on 20/5/2560.
 */

public class MyData {
    //Explicit
    private String[] titleStrings = new String[]{"หัวข้อที่1","หัวข้อที่2","หัวข้อที่3","หัวข้อที่4","หัวข้อที่5",
            "หัวข้อที่6","หัวข้อที่7","หัวข้อที่8","หัวข้อที่9","หัวข้อที่10","หัวข้อที่11","หัวข้อที่12","หัวข้อที่13",
            "หัวข้อที่14","หัวข้อที่15","หัวข้อที่16","หัวข้อที่17","หัวข้อที่18","หัวข้อที่19","หัวข้อที่20"};

    private String[] detaiStrings;

    private int[] ints = new int[]{R.drawable.traffic_01, R.drawable.traffic_02, R.drawable.traffic_03,
            R.drawable.traffic_04, R.drawable.traffic_05, R.drawable.traffic_06, R.drawable.traffic_07,
            R.drawable.traffic_08, R.drawable.traffic_09, R.drawable.traffic_10, R.drawable.traffic_10,
            R.drawable.traffic_11, R.drawable.traffic_12, R.drawable.traffic_13, R.drawable.traffic_14,
            R.drawable.traffic_15, R.drawable.traffic_16, R.drawable.traffic_17, R.drawable.traffic_18,
            R.drawable.traffic_19, R.drawable.traffic_20};

    public int[] getInts() {
        return ints;
    }

    public String[] getTitleStrings() {
        return titleStrings;
    }

    public String[] getDetaiStrings() {

        String [] resultStrings =new String[titleStrings.length];
        String s = "รายละเอียด ";

        for (int i=0;i<resultStrings.length;i++) {

            resultStrings[i] = s + titleStrings[i] + manyDetail();
        } //for1


        return resultStrings;
    }

    private String manyDetail() {

        String s = "";
        for (int i=0;i<10;i++) {
            s = s + "รายละเอียด ";
        }

        return s;
    }


} // Main Class นี่คือคลาสหลัก
