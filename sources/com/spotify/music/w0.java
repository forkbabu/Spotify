package com.spotify.music;

import android.app.Application;
import com.spotify.libs.instrumentation.performance.ColdStartTracker;
import com.spotify.libs.instrumentation.performance.m;
import com.spotify.music.internal.util.process.ProcessType;
import com.spotify.music.libs.performance.tracking.ColdStartLegacyHolder;
import com.spotify.music.libs.performance.tracking.d0;
import com.spotify.music.libs.performance.tracking.p;
import java.util.concurrent.TimeUnit;

public class w0 {
    private final ColdStartTracker a;
    private final d0 b;
    private final ProcessType c;
    private final cqe d;
    private final String e;

    public w0(ColdStartTracker coldStartTracker, d0 d0Var, ProcessType processType, cqe cqe, String str) {
        this.a = coldStartTracker;
        this.b = d0Var;
        this.c = processType;
        this.d = cqe;
        this.e = str;
    }

    public void a(String str) {
        this.a.e(str);
    }

    public void b(Application application, m mVar) {
        if (!ig0.b() && this.c == ProcessType.MAIN) {
            long millis = TimeUnit.SECONDS.toMillis(10);
            this.a.z("release");
            this.a.A(this.d.b());
            this.a.q(mVar);
            ColdStartTracker coldStartTracker = this.a;
            coldStartTracker.y(new p(coldStartTracker, this.e, millis));
            application.registerActivityLifecycleCallbacks(this.b);
            ColdStartLegacyHolder.setInstance(this.a);
        }
    }

    public void c(String str) {
        this.a.B(str);
    }
}
