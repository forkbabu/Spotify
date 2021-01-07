package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.backends.BackendResponse;
import com.google.android.datatransport.runtime.synchronization.a;

/* access modifiers changed from: package-private */
public final /* synthetic */ class i implements a.AbstractC0087a {
    private final l a;
    private final BackendResponse b;
    private final Iterable c;
    private final tg d;
    private final int e;

    private i(l lVar, BackendResponse backendResponse, Iterable iterable, tg tgVar, int i) {
        this.a = lVar;
        this.b = backendResponse;
        this.c = iterable;
        this.d = tgVar;
        this.e = i;
    }

    public static a.AbstractC0087a a(l lVar, BackendResponse backendResponse, Iterable iterable, tg tgVar, int i) {
        return new i(lVar, backendResponse, iterable, tgVar, i);
    }

    @Override // com.google.android.datatransport.runtime.synchronization.a.AbstractC0087a
    public Object h() {
        l.b(this.a, this.b, this.c, this.d, this.e);
        return null;
    }
}
