package com.google.android.gms.internal.measurement;

final class w2 extends u2 {
    private final t2 a = new t2();

    w2() {
    }

    @Override // com.google.android.gms.internal.measurement.u2
    public final void a(Throwable th, Throwable th2) {
        if (th2 == th) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th2);
        } else if (th2 != null) {
            this.a.a(th).add(th2);
        } else {
            throw new NullPointerException("The suppressed exception cannot be null.");
        }
    }
}
