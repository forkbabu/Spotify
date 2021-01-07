package defpackage;

import android.os.Bundle;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.k;
import defpackage.bf;

/* renamed from: af  reason: default package */
class af implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ Bundle b;

    af(bf.a aVar, String str, Bundle bundle) {
        this.a = str;
        this.b = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!uf.c(this)) {
            try {
                AppEventsLogger.g(k.d()).f(this.a, this.b);
            } catch (Throwable th) {
                uf.b(th, this);
            }
        }
    }
}
