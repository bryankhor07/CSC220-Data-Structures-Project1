/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Timer.java
 * @author: Duc Ta
 * @author: Bryan Khor
 * **********************************************
 */

package CSC220ASMT2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Timer {

    //
    // Instance Data Fields
    //
    private String defaultTimeZone;
    private TimeZone timeZone;

    //
    // Constructors
    //
    public Timer() {

    }

    public Timer(String defaultTimeZone) {
        this.defaultTimeZone = defaultTimeZone;
    }

    //
    // Instance Methods
    //
    public String getDefaultTimeZone() {
        return defaultTimeZone;
    }

    public void setDefaultTimeZone(String defaultTimeZone) {
        this.defaultTimeZone = defaultTimeZone;
    }

    //
    // Additional Instance Methods
    //
    public String getCurrentTime(String timeFormat, TimeZone timeZone) {
        DateFormat dateFormat = new SimpleDateFormat(timeFormat);
        Calendar calendar = Calendar.getInstance(timeZone);
        dateFormat.setTimeZone(calendar.getTimeZone());
        String currentTime = dateFormat.format(calendar.getTime());
        return currentTime;
    }

    public String getTodayDate(String dateFormat, TimeZone timeZone)
    {
        Date todaysDate = new Date();
        DateFormat todayDateFormat = new SimpleDateFormat(dateFormat);
        todayDateFormat.setTimeZone(timeZone);
        String todayDate = todayDateFormat.format(todaysDate);
        return todayDate;
    }

    //
    // Additional Methods
    //
    public Object getTimeZoneFormatted() {
        Timer getTime = new Timer(Language.getTimeZone());
        if (Language.getTimeZone().equals("PST")) {
            getTime.setDefaultTimeZone("Pacific Standard Time in Day Light Saving");
            return getTime.getDefaultTimeZone();
        } else if (Language.getTimeZone().equals("CST")) {
            getTime.setDefaultTimeZone("Central Standard Time in Day Light Saving");
            return getTime.getDefaultTimeZone();
        }
        getTime.setDefaultTimeZone("Eastern Standard Time not in Day Light Saving");
        return getTime.getDefaultTimeZone();
    }

    public Object getTime() {
        Timer obtainDate = new Timer(Language.getTimeZone());
        TimeZone PST = TimeZone.getTimeZone("America/Los_Angeles");
        TimeZone CST = TimeZone.getTimeZone("America/Chicago");
        TimeZone EST = TimeZone.getTimeZone("America/New_York");
        String timeFormat = "hh:mm:ss a zzz";
        String dateFormat = "yyyy/MM/dd";
        if (Language.getTimeZone().equals("PST")) {
            return obtainDate.getTodayDate(dateFormat, PST) + " " + obtainDate.getCurrentTime(timeFormat,PST);
        } else if (Language.getTimeZone().equals("CST")) {
            return obtainDate.getTodayDate(dateFormat, CST) + " " + obtainDate.getCurrentTime(timeFormat,CST);
        }
        return obtainDate.getTodayDate(dateFormat, EST) + " " + obtainDate.getCurrentTime(timeFormat,EST);
    }

    //
    // Static Methods
    //
    public static Timer setTimeZonePreference() {
        String timeZonePreference;
        if (Language.getTimeZone().equals("PST")) {
            timeZonePreference = "Pacific Standard Time in Day Light Saving";
        } else if (Language.getTimeZone().equals("CST")) {
            timeZonePreference = "Central Standard Time in Day Light Saving";
        } else {
            timeZonePreference = "Eastern Standard Time not in Day Light Saving";
        }
        return new Timer(timeZonePreference);
    }
}
