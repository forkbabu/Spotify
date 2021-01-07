package io.netty.handler.codec.http;

public class i extends f implements z {
    private b0 f;

    public i(d0 d0Var, b0 b0Var, boolean z) {
        super(d0Var, z, false);
        this.f = b0Var;
    }

    @Override // io.netty.handler.codec.http.z
    public b0 b() {
        return this.f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(256);
        s.f(sb, this);
        return sb.toString();
    }

    public i(d0 d0Var, b0 b0Var, boolean z, boolean z2) {
        super(d0Var, z, z2);
        if (b0Var != null) {
            this.f = b0Var;
            return;
        }
        throw new NullPointerException("status");
    }
}
