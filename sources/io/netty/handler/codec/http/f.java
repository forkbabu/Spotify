package io.netty.handler.codec.http;

public abstract class f extends g implements t {
    private d0 b;
    private final r c;

    protected f(d0 d0Var, boolean z, boolean z2) {
        r bVar = z2 ? new b(z) : new e(z);
        if (d0Var != null) {
            this.b = d0Var;
            this.c = bVar;
            return;
        }
        throw new NullPointerException("version");
    }

    @Override // io.netty.handler.codec.http.t
    public d0 c() {
        return this.b;
    }

    @Override // io.netty.handler.codec.http.g
    public boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (!this.c.equals(fVar.c) || !this.b.equals(fVar.b) || !super.equals(obj)) {
            return false;
        }
        return true;
    }

    @Override // io.netty.handler.codec.http.t
    public r f() {
        return this.c;
    }

    @Override // io.netty.handler.codec.http.g
    public int hashCode() {
        return ((this.b.hashCode() + ((this.c.hashCode() + 31) * 31)) * 31) + super.hashCode();
    }
}
