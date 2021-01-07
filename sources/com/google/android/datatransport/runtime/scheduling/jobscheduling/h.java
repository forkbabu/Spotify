package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.synchronization.a;

/* access modifiers changed from: package-private */
public final /* synthetic */ class h implements a.AbstractC0087a {
    private final l a;
    private final tg b;

    private h(l lVar, tg tgVar) {
        this.a = lVar;
        this.b = tgVar;
    }

    public static a.AbstractC0087a a(l lVar, tg tgVar) {
        return new h(lVar, tgVar);
    }

    @Override // com.google.android.datatransport.runtime.synchronization.a.AbstractC0087a
    public Object h() {
        return this.a.c.f1(this.b);
    }
}
