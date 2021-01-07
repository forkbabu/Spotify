package com.google.android.play.core.assetpacks;

import com.google.android.play.core.internal.a0;
import com.google.android.play.core.internal.m;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class e3 implements a0<Executor> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.play.core.internal.a0
    public final Executor e() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(v2.a);
        m.e(newSingleThreadExecutor);
        return newSingleThreadExecutor;
    }
}
