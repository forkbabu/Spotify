package com.spotify.mobile.android.coreintegration;

import android.app.NotificationManager;
import android.content.Context;
import java.util.Random;

public final class z implements fjf<y> {
    private final wlf<Context> a;
    private final wlf<NotificationManager> b;
    private final wlf<Random> c;
    private final wlf<String> d;

    public z(wlf<Context> wlf, wlf<NotificationManager> wlf2, wlf<Random> wlf3, wlf<String> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    public static y a(Context context, NotificationManager notificationManager, Random random, String str) {
        return new y(context, notificationManager, random, str);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new y(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
