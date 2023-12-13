package com.whut.jifeixitong.utils;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class TugTool {
    static public String gen_Tug_ID(Date date){
        SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
        SimpleDateFormat monthFormat = new SimpleDateFormat("MM");
        SimpleDateFormat dayFormat = new SimpleDateFormat("dd");

        String year = yearFormat.format(date);
        String month = monthFormat.format(date);
        String day = dayFormat.format(date);

        Random random = new Random();
        int randomNumber = random.nextInt(90000) + 10000;
        String randomString = Integer.toString(randomNumber);

        return "AID" + year + month + day + randomString;

    }

    static public String get_tug_time(Date date){
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String formattedDate = formatter.format(date);
        return formattedDate;
    }
}
