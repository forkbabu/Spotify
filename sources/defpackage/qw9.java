package defpackage;

import android.os.Debug;
import com.comscore.util.crashreport.CrashReportManager;
import com.github.anrwatchdog.ANRError;
import com.github.anrwatchdog.a;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.Assertion;
import java.util.Random;

/* renamed from: qw9  reason: default package */
public class qw9 implements a.f {
    private final Random a;
    private final cqe b;
    private boolean c;
    private long d;

    public qw9(Random random, cqe cqe) {
        this.a = random;
        this.b = cqe;
    }

    private void d(Runnable runnable) {
        this.c = true;
        Logger.l("ANR listener has been muzzled", new Object[0]);
        try {
            runnable.run();
            this.c = false;
            Logger.l("ANR listener has been unmuzzled", new Object[0]);
        } catch (Throwable th) {
            this.c = false;
            Logger.l("ANR listener has been unmuzzled", new Object[0]);
            throw th;
        }
    }

    @Override // com.github.anrwatchdog.a.f
    public void a(ANRError aNRError) {
        if (!Debug.isDebuggerConnected()) {
            boolean z = true;
            if (this.c) {
                if (this.b.d() >= this.d) {
                    Logger.e(aNRError, "ANR detected, but listener was muzzled", new Object[0]);
                    e();
                    return;
                }
            }
            Logger.n("ANR detected", new Object[0]);
            if (((double) this.a.nextFloat()) >= 0.15d) {
                z = false;
            }
            if (z) {
                Assertion.t(aNRError);
            }
        }
    }

    public synchronized void b(Runnable runnable) {
        this.d = this.b.d() + ((long) CrashReportManager.TIME_WINDOW);
        d(runnable);
    }

    public synchronized void c(Runnable runnable, long j) {
        this.d = this.b.d() + j;
        d(runnable);
    }

    public void e() {
        a aVar = new a(CrashReportManager.TIME_WINDOW);
        aVar.c(this);
        aVar.d();
        aVar.start();
        Logger.l("ANR listener has been started with a timeout of %d", Integer.valueOf((int) CrashReportManager.TIME_WINDOW));
    }
}
