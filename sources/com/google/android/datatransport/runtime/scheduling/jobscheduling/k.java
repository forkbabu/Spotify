package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.synchronization.a;

/* access modifiers changed from: package-private */
public final /* synthetic */ class k implements a.AbstractC0087a {
    private final l a;
    private final tg b;
    private final int c;

    private k(l lVar, tg tgVar, int i) {
        this.a = lVar;
        this.b = tgVar;
        this.c = i;
    }

    public static a.AbstractC0087a a(l lVar, tg tgVar, int i) {
        return new k(lVar, tgVar, i);
    }

    @Override // com.google.android.datatransport.runtime.synchronization.a.AbstractC0087a
    public Object h() {
        this.a.d.a(this.b, this.c + 1);
        return null;
    }
}
