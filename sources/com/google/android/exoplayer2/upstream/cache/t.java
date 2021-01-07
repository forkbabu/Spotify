package com.google.android.exoplayer2.upstream.cache;

import android.os.ConditionVariable;

/* access modifiers changed from: package-private */
public class t extends Thread {
    final /* synthetic */ ConditionVariable a;
    final /* synthetic */ u b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    t(u uVar, String str, ConditionVariable conditionVariable) {
        super(str);
        this.b = uVar;
        this.a = conditionVariable;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        synchronized (this.b) {
            this.a.open();
            u.m(this.b);
            this.b.b.f();
        }
    }
}
