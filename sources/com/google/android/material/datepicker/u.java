package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;

/* access modifiers changed from: package-private */
public class u {
    private static final u c = new u(null, null);
    private final Long a = null;
    private final TimeZone b = null;

    private u(Long l, TimeZone timeZone) {
    }

    static u b() {
        return c;
    }

    /* access modifiers changed from: package-private */
    public Calendar a() {
        TimeZone timeZone = this.b;
        Calendar instance = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l = this.a;
        if (l != null) {
            instance.setTimeInMillis(l.longValue());
        }
        return instance;
    }
}
