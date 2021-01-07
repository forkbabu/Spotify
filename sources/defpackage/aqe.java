package defpackage;

import android.os.Build;
import android.os.SystemClock;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* renamed from: aqe  reason: default package */
public class aqe implements cqe {
    @Override // defpackage.cqe
    public long a() {
        return SystemClock.uptimeMillis();
    }

    @Override // defpackage.cqe
    public long b() {
        return SystemClock.elapsedRealtime();
    }

    @Override // defpackage.cqe
    public long c() {
        if (Build.VERSION.SDK_INT >= 17) {
            return SystemClock.elapsedRealtimeNanos();
        }
        return TimeUnit.MILLISECONDS.toNanos(SystemClock.elapsedRealtime());
    }

    @Override // defpackage.cqe
    public long d() {
        return System.currentTimeMillis();
    }

    @Override // defpackage.cqe
    public Calendar e() {
        return Calendar.getInstance();
    }

    @Override // defpackage.cqe
    public TimeZone f() {
        return TimeZone.getDefault();
    }

    @Override // defpackage.cqe
    public void g(long j) {
        SystemClock.sleep(j);
    }
}
