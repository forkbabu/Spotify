package defpackage;

import defpackage.yf9;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: fg9  reason: default package */
public abstract class fg9 {
    public static final fg9 a = a(null, null);
    static final ThreadLocal<DateFormat> b = new a();

    /* renamed from: fg9$a */
    static class a extends ThreadLocal<DateFormat> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public DateFormat initialValue() {
            return new SimpleDateFormat("yyyyMMdd", Locale.ENGLISH);
        }
    }

    /* renamed from: fg9$b */
    public interface b {
    }

    public static fg9 a(Date date, String str) {
        yf9.b bVar = new yf9.b();
        bVar.b(date);
        yf9.b bVar2 = bVar;
        bVar2.c(str);
        return bVar2.a();
    }

    public static fg9 c(String str) {
        Date date;
        boolean z = false;
        if (str == null || !str.contains(":")) {
            return a;
        }
        String[] split = str.split(":");
        if (split.length < 2) {
            return a;
        }
        String str2 = split[0];
        if (!str2.equals("S") && !str2.equals("D")) {
            z = true;
        }
        if (z) {
            return a;
        }
        String str3 = split[1];
        if (str2.equals("S")) {
            return a(null, str3);
        }
        try {
            DateFormat dateFormat = b.get();
            dateFormat.getClass();
            date = dateFormat.parse(str3);
        } catch (ParseException unused) {
            date = null;
        }
        return a(date, null);
    }

    public abstract Date b();

    public abstract String d();
}
