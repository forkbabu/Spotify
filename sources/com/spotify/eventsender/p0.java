package com.spotify.eventsender;

import com.google.common.base.Joiner;
import com.google.common.collect.FluentIterable;
import com.spotify.eventsender.l0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class p0 implements l0 {
    private final al0 a;
    private final d0 b;
    private final kl0 c;
    private final l0.a d;

    p0(al0 al0, d0 d0Var, l0.a aVar, kl0 kl0) {
        this.a = al0;
        this.b = d0Var;
        this.d = aVar;
        this.c = kl0;
    }

    @Override // com.spotify.eventsender.l0
    public l0.a a() {
        return this.d;
    }

    @Override // com.spotify.eventsender.l0
    public void b(Set<Long> set) {
        this.a.b(set);
    }

    @Override // com.spotify.eventsender.l0
    public List<c0> get() {
        List<uk0> d2 = this.a.d(20);
        ArrayList arrayList = (ArrayList) d2;
        if (arrayList.size() <= 0) {
            return Collections.emptyList();
        }
        kl0 kl0 = this.c;
        kl0.d(arrayList.size() + " Non authenticated events to be sent to server: " + Joiner.on(" ").join(FluentIterable.from(d2).transform(n.a)));
        FluentIterable from = FluentIterable.from(d2);
        d0 d0Var = this.b;
        d0Var.getClass();
        return from.transform(new r(d0Var)).toList();
    }
}
