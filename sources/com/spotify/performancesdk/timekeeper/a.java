package com.spotify.performancesdk.timekeeper;

import kotlin.jvm.internal.h;

public final class a implements m {
    private final cqe a;

    public a(cqe cqe) {
        h.e(cqe, "clock");
        this.a = cqe;
    }

    @Override // com.spotify.performancesdk.timekeeper.m
    public long a() {
        return this.a.b();
    }
}
