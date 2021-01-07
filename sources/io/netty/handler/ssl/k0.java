package io.netty.handler.ssl;

public final class k0 {
    public static final k0 b = new k0();
    private final Throwable a;

    private k0() {
        this.a = null;
    }

    public String toString() {
        Throwable th = this.a;
        if (th == null) {
            return "SslHandshakeCompletionEvent(SUCCESS)";
        }
        return "SslHandshakeCompletionEvent(" + th + ')';
    }

    public k0(Throwable th) {
        if (th != null) {
            this.a = th;
            return;
        }
        throw new NullPointerException("cause");
    }
}
