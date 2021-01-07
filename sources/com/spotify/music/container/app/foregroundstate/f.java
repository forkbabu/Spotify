package com.spotify.music.container.app.foregroundstate;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;
import io.reactivex.functions.l;
import io.reactivex.s;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.h;

public final class f implements h {
    public static final a d = new a(null);
    private final ActivityManager a;
    private final io.reactivex.subjects.a<Long> b;
    private final s<Long> c;

    public static final class a {
        public a(kotlin.jvm.internal.f fVar) {
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b<T, R> implements l<Long, ForegroundServicesStatus> {
        final /* synthetic */ f a;

        b(f fVar) {
            this.a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public ForegroundServicesStatus apply(Long l) {
            h.e(l, "<anonymous parameter 0>");
            List<ActivityManager.RunningServiceInfo> runningServices = this.a.a.getRunningServices(Integer.MAX_VALUE);
            int myPid = Process.myPid();
            for (ActivityManager.RunningServiceInfo runningServiceInfo : runningServices) {
                if (runningServiceInfo.pid == myPid && runningServiceInfo.foreground) {
                    return ForegroundServicesStatus.FOREGROUND;
                }
            }
            return ForegroundServicesStatus.BACKGROUND;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c<T> implements g<ForegroundServicesStatus> {
        public static final c a = new c();

        c() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(ForegroundServicesStatus foregroundServicesStatus) {
            ForegroundServicesStatus foregroundServicesStatus2 = foregroundServicesStatus;
            h.e(foregroundServicesStatus2, "foregroundServicesStatus");
            if (ForegroundServicesStatus.FOREGROUND == foregroundServicesStatus2) {
                Logger.g("Foreground service running", new Object[0]);
            } else {
                Logger.g("No foreground service running", new Object[0]);
            }
        }
    }

    public f(Context context) {
        h.e(context, "context");
        Object systemService = context.getApplicationContext().getSystemService("activity");
        if (systemService != null) {
            this.a = (ActivityManager) systemService;
            io.reactivex.subjects.a<Long> i1 = io.reactivex.subjects.a.i1(0L);
            h.d(i1, "BehaviorSubject.createDefault(0L)");
            this.b = i1;
            this.c = s.g0((long) 3, TimeUnit.SECONDS);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.ActivityManager");
    }

    @Override // com.spotify.music.container.app.foregroundstate.h
    public void b() {
        this.b.onNext(0L);
    }

    public final s<ForegroundServicesStatus> c() {
        s<ForegroundServicesStatus> h1 = s.k0(this.b, this.c).j0(new b(this)).N(c.a).v0(1).h1();
        h.d(h1, "Observable.merge(explici…)\n            .refCount()");
        return h1;
    }
}
