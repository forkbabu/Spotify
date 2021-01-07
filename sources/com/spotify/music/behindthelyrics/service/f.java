package com.spotify.music.behindthelyrics.service;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.behindthelyrics.model.business.TracksAndResources;
import io.reactivex.internal.observers.c;
import io.reactivex.s;
import java.util.concurrent.TimeUnit;

public class f implements Runnable {
    final s<TracksAndResources> a;
    final zk2 b;

    public f(s<TracksAndResources> sVar, zk2 zk2) {
        this.a = sVar;
        this.b = zk2;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            s<R> r0 = ((al2) this.b).a().v(new b(this)).r0(c.a);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            Boolean bool = Boolean.FALSE;
            s<R> S0 = r0.S0(30, timeUnit, s.i0(bool));
            c cVar = new c();
            S0.subscribe(cVar);
            Object a2 = cVar.a();
            if (a2 != null) {
                bool = a2;
            }
            Logger.b("Behind the lyrics cache refreshed: %s", bool.toString());
        } catch (Exception e) {
            Assertion.i("A crash happened while fetching BTL resources", e);
        }
    }
}
