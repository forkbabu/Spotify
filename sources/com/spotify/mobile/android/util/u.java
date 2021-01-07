package com.spotify.mobile.android.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public final class u {
    private static final SimpleDateFormat a;

    static {
        Locale locale = Locale.US;
        a = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", locale);
        new SimpleDateFormat("HH:mm:ss", locale);
        new SimpleDateFormat("yyyy-MM-dd--HH-mm-ss-SSS", locale);
    }

    public static synchronized String a(Calendar calendar) {
        String format;
        synchronized (u.class) {
            calendar.getClass();
            SimpleDateFormat simpleDateFormat = a;
            simpleDateFormat.setTimeZone(calendar.getTimeZone());
            format = simpleDateFormat.format(calendar.getTime());
        }
        return format;
    }
}
