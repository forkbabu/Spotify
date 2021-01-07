package defpackage;

/* renamed from: pu  reason: default package */
final class pu extends ou {
    private final nu a = new nu();

    pu() {
    }

    @Override // defpackage.ou
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
