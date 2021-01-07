package com.google.firebase.installations;

/* access modifiers changed from: package-private */
public final /* synthetic */ class c implements Runnable {
    private final f a;

    private c(f fVar) {
        this.a = fVar;
    }

    public static Runnable a(f fVar) {
        return new c(fVar);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.a.b(false);
    }
}
