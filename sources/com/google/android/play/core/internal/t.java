package com.google.android.play.core.internal;

final class t extends q {
    private final s a = new s();

    t() {
    }

    @Override // com.google.android.play.core.internal.q
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
