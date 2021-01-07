package com.google.android.material.datepicker;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* access modifiers changed from: package-private */
public class v {
    static AtomicReference<u> a = new AtomicReference<>();

    static long a(long j) {
        Calendar f = f();
        f.setTimeInMillis(j);
        return b(f).getTimeInMillis();
    }

    static Calendar b(Calendar calendar) {
        Calendar g = g(calendar);
        Calendar f = f();
        f.set(g.get(1), g.get(2), g.get(5));
        return f;
    }

    static DateFormat c(Locale locale) {
        DateFormat dateInstance = DateFormat.getDateInstance(0, locale);
        dateInstance.setTimeZone(d());
        return dateInstance;
    }

    private static TimeZone d() {
        return TimeZone.getTimeZone("UTC");
    }

    static Calendar e() {
        u uVar = a.get();
        if (uVar == null) {
            uVar = u.b();
        }
        Calendar a2 = uVar.a();
        a2.set(11, 0);
        a2.set(12, 0);
        a2.set(13, 0);
        a2.set(14, 0);
        a2.setTimeZone(d());
        return a2;
    }

    static Calendar f() {
        return g(null);
    }

    static Calendar g(Calendar calendar) {
        Calendar instance = Calendar.getInstance(d());
        if (calendar == null) {
            instance.clear();
        } else {
            instance.setTimeInMillis(calendar.getTimeInMillis());
        }
        return instance;
    }

    static SimpleDateFormat h() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("LLLL, yyyy", Locale.getDefault());
        simpleDateFormat.setTimeZone(d());
        return simpleDateFormat;
    }
}
