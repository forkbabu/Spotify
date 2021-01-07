package com.spotify.music.preloadlogger;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.google.common.base.Optional;
import com.spotify.libs.instrumentation.performance.ColdStartTracker;
import com.spotify.mobile.android.service.session.e;
import com.spotify.mobile.android.service.session.f;
import com.spotify.workmanager.DaggerRxWorker;
import io.reactivex.BackpressureStrategy;
import io.reactivex.z;

public class LoginTimeReporterWorker extends DaggerRxWorker {
    f p;
    f q;
    cqe r;
    ColdStartTracker s;

    static class a implements e {
        private final e a;
        private final long b;
        private final cqe c;

        a(e eVar, long j, cqe cqe) {
            this.a = eVar;
            this.b = j;
            this.c = cqe;
        }

        @Override // com.spotify.mobile.android.service.session.e
        public Optional<Long> call() {
            Optional<Long> call = this.a.call();
            if (!call.isPresent()) {
                return Optional.absent();
            }
            return Optional.of(Long.valueOf(call.get().longValue() - ((this.c.d() - this.b) / 1000)));
        }
    }

    public LoginTimeReporterWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // com.spotify.workmanager.DaggerRxWorker, androidx.work.RxWorker
    public z<ListenableWorker.a> p() {
        super.p();
        this.s.m(getClass().getSimpleName());
        boolean b = e().b("afterAccountCreation", false);
        return this.p.b().Y0(BackpressureStrategy.BUFFER).h0(1).a0().A(new a(this, e().d("timeInMillisWhenCreatedWork", 0), b));
    }
}
