package com.comscore.streaming;

import com.comscore.util.cpp.CppJavaBinder;

public abstract class AssetMetadata extends CppJavaBinder {
    private long a;

    AssetMetadata(long j) {
        this.a = j;
    }

    /* access modifiers changed from: package-private */
    public long b() {
        return this.a;
    }
}
