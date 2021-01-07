package com.facebook.appevents;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.facebook.FacebookException;
import com.facebook.a;
import com.facebook.k;

public class AppEventsLogger {
    private e a;

    public enum FlushBehavior {
        AUTO,
        EXPLICIT_ONLY
    }

    private AppEventsLogger(Context context, String str, a aVar) {
        this.a = new e(context, (String) null, (a) null);
    }

    public static void a(Application application, String str) {
        int i = e.g;
        if (!uf.c(e.class)) {
            try {
                if (k.u()) {
                    a.d();
                    l.g();
                    if (str == null) {
                        str = k.e();
                    }
                    k.y(application, str);
                    com.facebook.appevents.internal.a.s(application, str);
                    return;
                }
                throw new FacebookException("The Facebook sdk must be initialized before calling activateApp");
            } catch (Throwable th) {
                uf.b(th, e.class);
            }
        }
    }

    public static String c(Context context) {
        return e.b(context);
    }

    public static String d() {
        return a.b();
    }

    public static void e(Context context, String str) {
        e.e(context, str);
    }

    public static AppEventsLogger g(Context context) {
        return new AppEventsLogger(context, null, null);
    }

    public static void h() {
        int i = e.g;
        if (!uf.c(e.class)) {
            try {
                c.n();
            } catch (Throwable th) {
                uf.b(th, e.class);
            }
        }
    }

    public void b() {
        e eVar = this.a;
        eVar.getClass();
        if (!uf.c(eVar)) {
            try {
                c.j(FlushReason.EXPLICIT);
            } catch (Throwable th) {
                uf.b(th, eVar);
            }
        }
    }

    public void f(String str, Bundle bundle) {
        this.a.h(str, bundle);
    }
}
