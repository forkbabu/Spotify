package com.spotify.music.preloadlogger;

import androidx.work.ListenableWorker;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.service.session.e;
import com.spotify.music.preloadlogger.LoginTimeReporterWorker;
import io.reactivex.functions.l;

public final /* synthetic */ class a implements l {
    public final /* synthetic */ LoginTimeReporterWorker a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ a(LoginTimeReporterWorker loginTimeReporterWorker, long j, boolean z) {
        this.a = loginTimeReporterWorker;
        this.b = j;
        this.c = z;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        LoginTimeReporterWorker loginTimeReporterWorker = this.a;
        long j = this.b;
        boolean z = this.c;
        LoginTimeReporterWorker.a aVar = new LoginTimeReporterWorker.a((e) obj, j, loginTimeReporterWorker.r);
        Logger.b("LoginTimeReporter - Reporting login time a %s", aVar.call());
        if (z) {
            loginTimeReporterWorker.q.c(aVar);
        } else {
            loginTimeReporterWorker.q.b(aVar);
        }
        return new ListenableWorker.a.c();
    }
}
