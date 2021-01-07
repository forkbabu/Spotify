package com.spotify.eventsender;

import com.google.common.base.Optional;
import com.google.common.collect.FluentIterable;
import com.google.protobuf.InvalidProtocolBufferException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* access modifiers changed from: package-private */
public class b0 {
    private final al0 a;
    private final wk0 b;
    private final t c;
    private final kl0 d;
    private AtomicBoolean e = new AtomicBoolean(false);

    b0(al0 al0, wk0 wk0, t tVar, kl0 kl0) {
        this.a = al0;
        this.b = wk0;
        this.c = tVar;
        this.d = kl0;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        try {
            if (this.e.compareAndSet(false, true)) {
                List<uk0> e2 = this.a.e(this.c.a());
                LinkedList linkedList = new LinkedList();
                LinkedList linkedList2 = new LinkedList();
                Iterator it = ((ArrayList) e2).iterator();
                while (it.hasNext()) {
                    uk0 uk0 = (uk0) it.next();
                    if (!this.c.a().equals(b(uk0))) {
                        linkedList.add(Long.valueOf(uk0.a));
                        linkedList2.add(uk0.d);
                    }
                }
                this.a.a(linkedList, linkedList2, this.b);
            }
        } catch (Exception e3) {
            this.d.a(e3, "Error when trying to delete cloned events");
        }
    }

    /* access modifiers changed from: package-private */
    public String b(uk0 uk0) {
        String str = uk0.h;
        if (str != null) {
            return str;
        }
        FragmentsContainer l = FragmentsContainer.l();
        try {
            l = FragmentsContainer.o(uk0.f);
        } catch (InvalidProtocolBufferException e2) {
            this.d.a(e2, "Error in parsing contexts.");
        }
        return (String) FluentIterable.from(l.m()).transform(d.a).filter(c.a).first().transform(e.a).or((Optional) "");
    }
}
