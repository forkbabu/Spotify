package com.spotify.mobile.android.util.connectivity;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import io.reactivex.disposables.c;
import io.reactivex.s;
import io.reactivex.t;

public class i0 {
    private final s<Boolean> a;

    /* access modifiers changed from: package-private */
    public static class a extends ContentObserver {
        final /* synthetic */ t a;
        final /* synthetic */ Context b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Handler handler, t tVar, Context context) {
            super(handler);
            this.a = tVar;
            this.b = context;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            this.a.onNext(Boolean.valueOf(i0.b(this.b)));
        }
    }

    public i0(Context context) {
        this.a = s.B(new p(context)).E().s0(Boolean.FALSE);
    }

    /* access modifiers changed from: private */
    public static boolean b(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            int phoneCount = telephonyManager.getPhoneCount();
            for (int i = 0; i < phoneCount; i++) {
                if (telephonyManager.getSimState(i) == 5) {
                    return c(context);
                }
            }
        } else if (telephonyManager.getSimState() == 5) {
            return c(context);
        }
        return false;
    }

    private static boolean c(Context context) {
        if (Build.VERSION.SDK_INT >= 17) {
            if (Settings.Global.getInt(context.getContentResolver(), "mobile_data", 1) != 1) {
                return true;
            }
            return false;
        } else if (Settings.Secure.getInt(context.getContentResolver(), "mobile_data", 1) != 1) {
            return true;
        } else {
            return false;
        }
    }

    static /* synthetic */ void e(Handler handler, Context context, ContentResolver contentResolver, Uri uri, t tVar) {
        a aVar = new a(handler, tVar, context);
        contentResolver.registerContentObserver(uri, false, aVar);
        tVar.a(c.c(new o(contentResolver, aVar)));
        tVar.onNext(Boolean.valueOf(b(context)));
    }

    public s<Boolean> d() {
        return this.a;
    }
}
