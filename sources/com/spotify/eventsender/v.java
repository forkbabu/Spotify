package com.spotify.eventsender;

import com.google.common.base.Joiner;
import com.google.common.base.Optional;
import com.google.common.collect.FluentIterable;
import com.spotify.eventsender.l0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class v implements l0 {
    private final al0 a;
    private final d0 b;
    private final kl0 c;
    private final l0.a d;
    private final f0 e;

    v(al0 al0, d0 d0Var, l0.a aVar, kl0 kl0, f0 f0Var) {
        this.a = al0;
        this.b = d0Var;
        this.d = aVar;
        this.c = kl0;
        this.e = f0Var;
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
        Optional<String> a2 = this.e.a();
        if (!this.e.b(a2)) {
            return Collections.emptyList();
        }
        List<uk0> c2 = this.a.c(20, a2.get());
        ArrayList arrayList = (ArrayList) c2;
        if (arrayList.size() <= 0) {
            return Collections.emptyList();
        }
        kl0 kl0 = this.c;
        kl0.d(arrayList.size() + " Authenticated events to be sent to server: " + Joiner.on(" ").join(FluentIterable.from(c2).transform(b.a)));
        FluentIterable from = FluentIterable.from(c2);
        d0 d0Var = this.b;
        d0Var.getClass();
        return from.transform(new r(d0Var)).toList();
    }
}
