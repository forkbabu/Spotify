package com.google.android.exoplayer2.util;

import java.util.concurrent.ThreadFactory;

public final /* synthetic */ class e implements ThreadFactory {
    public final /* synthetic */ String a;

    public /* synthetic */ e(String str) {
        this.a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, this.a);
    }
}
