package com.spotify.music.features.eventshub.concertslist;

import com.spotify.music.features.eventshub.eventshub.h;
import com.spotify.music.features.eventshub.model.EventResult;
import com.spotify.music.navigation.t;
import java.util.Calendar;

public final class g implements fjf<f> {
    private final wlf<h> a;
    private final wlf<t> b;
    private final wlf<EventResult> c;
    private final wlf<d15> d;
    private final wlf<Calendar> e;
    private final wlf<cqe> f;

    public g(wlf<h> wlf, wlf<t> wlf2, wlf<EventResult> wlf3, wlf<d15> wlf4, wlf<Calendar> wlf5, wlf<cqe> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new f(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
