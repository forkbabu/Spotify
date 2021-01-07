package defpackage;

import android.util.Log;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* access modifiers changed from: package-private */
/* renamed from: wf0  reason: default package */
public class wf0 {
    private static final DateFormat g = new SimpleDateFormat("MM-dd HH:mm:ss.SSS", Locale.US);
    private static final Date h = new Date();
    private char a;
    private String b;
    private String c;
    private Throwable d;
    private long e;
    long f;

    wf0() {
    }

    public void a(char c2, String str, String str2, Throwable th, long j) {
        this.a = c2;
        this.b = str;
        this.c = str2;
        this.d = th;
        this.e = j;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(256);
        sb.append(this.a);
        sb.append('\t');
        Date date = h;
        date.setTime(this.e);
        DateFormat dateFormat = g;
        synchronized (dateFormat) {
            sb.append(dateFormat.format(date));
        }
        sb.append('\t');
        sb.append(this.b);
        sb.append('\t');
        sb.append(this.c);
        if (this.d != null) {
            sb.append(' ');
            sb.append(Log.getStackTraceString(this.d));
        }
        return sb.toString();
    }
}
