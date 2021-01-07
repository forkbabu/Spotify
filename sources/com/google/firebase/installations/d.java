package com.google.firebase.installations;

final /* synthetic */ class d implements Runnable {
    private final f a;
    private final boolean b;

    private d(f fVar, boolean z) {
        this.a = fVar;
        this.b = z;
    }

    public static Runnable a(f fVar, boolean z) {
        return new d(fVar, z);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.a.b(this.b);
    }
}
