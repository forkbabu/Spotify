package com.spotify.mobile.android.ui.activity.upsell;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.core.app.k;
import androidx.core.app.q;
import androidx.core.content.a;
import com.google.common.base.MoreObjects;
import com.spotify.encore.foundation.R;
import com.spotify.music.C0707R;
import java.lang.ref.WeakReference;

public class PremiumActivationNotificationStyleStrategy implements g {
    private final WeakReference<Context> a;
    private final q b;
    private final int c;
    private final int d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final String i;
    private final String j;
    private final String k;
    private final String l;
    private final String m;

    public static class NotificationsIntentReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            context.getClass();
            intent.getClass();
            String action = intent.getAction();
            MoreObjects.checkArgument("com.spotify.music.features.upsell.SHOW_MAIN".equals(action));
            if ("com.spotify.music.features.upsell.SHOW_MAIN".equals(action)) {
                context.startActivity(context.getPackageManager().getLaunchIntentForPackage(context.getPackageName()));
            }
        }
    }

    public PremiumActivationNotificationStyleStrategy(Context context, q qVar, int i2, int i3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.a = new WeakReference<>(context);
        this.b = qVar;
        this.c = i2;
        this.d = i3;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = str5;
        this.j = str6;
        this.k = str7;
        this.l = str8;
        this.m = str9;
    }

    private void b(int i2, k kVar) {
        try {
            this.b.h(i2, kVar.a());
        } catch (SecurityException unused) {
            kVar.m(0);
            this.b.h(i2, kVar.a());
        }
    }

    public void a() {
        this.b.b(this.c);
    }

    public void c() {
        Context context = this.a.get();
        if (context != null) {
            k kVar = new k(context, null);
            kVar.j(this.h);
            kVar.i(this.i);
            kVar.D(this.j);
            kVar.z(C0707R.drawable.icn_notification);
            kVar.v(true);
            kVar.s(true);
            kVar.G(0);
            kVar.g(a.b(context, R.color.green));
            kVar.e("status");
            kVar.w(1);
            kVar.d(true);
            kVar.h(PendingIntent.getBroadcast(context, 10, new Intent("com.spotify.music.features.upsell.SHOW_MAIN", null, context, NotificationsIntentReceiver.class), 268435456));
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 18) {
                kVar.m(2);
            }
            if (i2 >= 21) {
                kVar.F(1);
            }
            b(this.d, kVar);
        }
    }

    public void d() {
        Context context = this.a.get();
        if (context != null) {
            k kVar = new k(context, null);
            kVar.j(this.k);
            kVar.i(this.l);
            kVar.D(this.m);
            kVar.z(C0707R.drawable.icn_notification);
            kVar.v(true);
            kVar.s(true);
            kVar.G(0);
            kVar.g(a.b(context, R.color.green));
            kVar.e("status");
            kVar.w(1);
            kVar.d(true);
            kVar.h(PendingIntent.getBroadcast(context, 10, new Intent("com.spotify.music.features.upsell.SHOW_MAIN", null, context, NotificationsIntentReceiver.class), 268435456));
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 18) {
                kVar.m(2);
            }
            if (i2 >= 21) {
                kVar.F(1);
            }
            b(this.d, kVar);
        }
    }

    public void e() {
        Context context = this.a.get();
        if (context != null) {
            k kVar = new k(context, null);
            kVar.j(this.e);
            kVar.i(this.f);
            kVar.D(this.g);
            kVar.z(C0707R.drawable.icn_notification);
            kVar.v(true);
            kVar.s(true);
            kVar.u(true);
            kVar.G(0);
            kVar.g(a.b(context, R.color.green));
            kVar.e("status");
            kVar.w(1);
            kVar.x(0, 0, true);
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 18) {
                kVar.m(2);
            }
            if (i2 >= 21) {
                kVar.F(1);
            }
            b(this.c, kVar);
        }
    }
}
