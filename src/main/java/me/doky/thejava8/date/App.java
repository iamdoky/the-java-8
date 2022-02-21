package me.doky.thejava8.date;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class App {

    public static void main(String[] args) throws InterruptedException {

        // 기존   = mutable 변한다. thread safe / time safe 하지 않다.
        //Date date = new Date();
        //long time = date.getTime();
        //System.out.println(date);
        //System.out.println(time);

        //Thread.sleep(1000 * 3);
        //Date afteer3sec = new Date();
        //System.out.println(afteer3sec);
        //afteer3sec.setTime(time);
        //System.out.println(afteer3sec);

        Calendar dokyBirthDay = new GregorianCalendar(1992, Calendar.OCTOBER, 24);
        System.out.println(dokyBirthDay.getTime());

        /*  Immutable 하다. 변하지 않는다.  */
        // 사람용 시간 / 기계용 시간
        Date date = new Date();
        long time = date.getTime();






    }

}
