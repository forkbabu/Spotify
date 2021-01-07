package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.synchronization.a;

/* access modifiers changed from: package-private */
public final /* synthetic */ class j implements a.AbstractC0087a {
    private final nh a;

    private j(nh nhVar) {
        this.a = nhVar;
    }

    public static a.AbstractC0087a a(nh nhVar) {
        return new j(nhVar);
    }

    @Override // com.google.android.datatransport.runtime.synchronization.a.AbstractC0087a
    public Object h() {
        return Integer.valueOf(this.a.j());
    }
}
