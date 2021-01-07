package com.google.firebase.installations;

/* access modifiers changed from: package-private */
public final /* synthetic */ class e implements Runnable {
    private final f a;
    private final boolean b;

    private e(f fVar, boolean z) {
        this.a = fVar;
        this.b = z;
    }

    public static Runnable a(f fVar, boolean z) {
        return new e(fVar, z);
    }

    @Override // java.lang.Runnable
    public void run() {
        f.h(this.a, this.b);
    }
}
