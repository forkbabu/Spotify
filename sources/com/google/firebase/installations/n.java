package com.google.firebase.installations;

import android.text.TextUtils;
import com.google.firebase.installations.local.c;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* access modifiers changed from: package-private */
public class n {
    public static final long a = TimeUnit.HOURS.toSeconds(1);
    private static final Pattern b = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static final /* synthetic */ int c = 0;

    n() {
    }

    static boolean c(String str) {
        return b.matcher(str).matches();
    }

    public long a() {
        return TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
    }

    public boolean b(c cVar) {
        if (TextUtils.isEmpty(cVar.a())) {
            return true;
        }
        if (cVar.b() + cVar.g() < a() + a) {
            return true;
        }
        return false;
    }
}
