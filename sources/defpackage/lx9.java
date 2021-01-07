package defpackage;

import android.os.SystemClock;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.spotify.mobile.android.util.k0;

/* renamed from: lx9  reason: default package */
public class lx9 implements k0 {
    private final yw9 a;
    private final nx9 b;
    private long c = Long.MIN_VALUE;

    lx9(yw9 yw9, nx9 nx9) {
        this.a = yw9;
        this.b = nx9;
    }

    @Override // com.spotify.mobile.android.util.k0
    public void a(Throwable th) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime > this.c + 30000) {
            if (this.a.a()) {
                this.b.a();
                FirebaseCrashlytics.getInstance().recordException(th);
            }
            this.c = elapsedRealtime;
        }
    }
}
