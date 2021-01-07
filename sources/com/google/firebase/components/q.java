package com.google.firebase.components;

import java.util.Map;

/* access modifiers changed from: package-private */
public final /* synthetic */ class q implements Runnable {
    private final Map.Entry a;
    private final o10 b;

    private q(Map.Entry entry, o10 o10) {
        this.a = entry;
        this.b = o10;
    }

    public static Runnable a(Map.Entry entry, o10 o10) {
        return new q(entry, o10);
    }

    @Override // java.lang.Runnable
    public void run() {
        Map.Entry entry = this.a;
        ((p10) entry.getKey()).a(this.b);
    }
}
