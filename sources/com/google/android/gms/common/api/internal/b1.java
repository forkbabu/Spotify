package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AvailabilityException;
import com.google.android.gms.common.api.d;
import com.google.android.gms.tasks.g;
import com.google.android.gms.tasks.h;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class b1 {
    private final m1<b<?>, ConnectionResult> a = new m1<>();
    private final m1<b<?>, String> b = new m1<>();
    private final h<Map<b<?>, String>> c = new h<>();
    private int d;
    private boolean e = false;

    public b1(Iterable<? extends d<?>> iterable) {
        Iterator<? extends d<?>> it = iterable.iterator();
        while (it.hasNext()) {
            this.a.put(((d) it.next()).b(), null);
        }
        this.d = this.a.keySet().size();
    }

    public final Set<b<?>> a() {
        return this.a.keySet();
    }

    public final void b(b<?> bVar, ConnectionResult connectionResult, String str) {
        this.a.put(bVar, connectionResult);
        this.b.put(bVar, str);
        this.d--;
        if (!connectionResult.q2()) {
            this.e = true;
        }
        if (this.d != 0) {
            return;
        }
        if (this.e) {
            this.c.b(new AvailabilityException(this.a));
            return;
        }
        this.c.c(this.b);
    }

    public final g<Map<b<?>, String>> c() {
        return this.c.a();
    }
}
