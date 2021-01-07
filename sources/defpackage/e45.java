package defpackage;

import android.os.Build;
import com.adjust.sdk.Constants;
import defpackage.c45;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.h;

/* renamed from: e45  reason: default package */
public final class e45 {
    private static final Locale a;
    private static final SimpleDateFormat b;

    static {
        SimpleDateFormat simpleDateFormat;
        Locale locale = Locale.getDefault();
        a = locale;
        if (Build.VERSION.SDK_INT >= 24) {
            simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX", locale);
        } else {
            simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", locale);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }
        b = simpleDateFormat;
    }

    public static final c45 a(String str, Calendar calendar) {
        h.e(str, "isoReleaseTime");
        h.e(calendar, "currentCalendar");
        Date time = calendar.getTime();
        Date parse = b.parse(str);
        if (parse != null) {
            calendar.setTime(parse);
            h.d(time, "currentDate");
            long time2 = time.getTime() - parse.getTime();
            long j = (long) 60000;
            if (Long.MIN_VALUE <= time2 && j > time2) {
                return c45.d.a;
            }
            long j2 = (long) Constants.ONE_HOUR;
            if (j <= time2 && j2 > time2) {
                return new c45.e((int) TimeUnit.MILLISECONDS.toMinutes(time2));
            }
            long j3 = (long) 86400000;
            if (j2 <= time2 && j3 > time2) {
                return new c45.c((int) TimeUnit.MILLISECONDS.toHours(time2));
            }
            long j4 = (long) 691200000;
            if (j3 <= time2 && j4 > time2) {
                return new c45.b((int) TimeUnit.MILLISECONDS.toDays(time2));
            }
            return new c45.a(calendar);
        }
        throw new ParseException("Could not parse release timestamp", 0);
    }
}
