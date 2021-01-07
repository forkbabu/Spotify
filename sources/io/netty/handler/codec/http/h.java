package io.netty.handler.codec.http;

public class h extends f implements x {
    private u f;
    private String n;

    public h(d0 d0Var, u uVar, String str) {
        super(d0Var, true, false);
        if (uVar != null) {
            this.f = uVar;
            if (str != null) {
                this.n = str;
                return;
            }
            throw new NullPointerException("uri");
        }
        throw new NullPointerException("method");
    }

    @Override // io.netty.handler.codec.http.f, io.netty.handler.codec.http.g
    public boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (!this.f.equals(hVar.f) || !this.n.equalsIgnoreCase(hVar.n) || !super.equals(obj)) {
            return false;
        }
        return true;
    }

    @Override // io.netty.handler.codec.http.f, io.netty.handler.codec.http.g
    public int hashCode() {
        return je.Y0(this.n, (this.f.hashCode() + 31) * 31, 31) + super.hashCode();
    }

    @Override // io.netty.handler.codec.http.x
    public u method() {
        return this.f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(256);
        s.e(sb, this);
        return sb.toString();
    }

    @Override // io.netty.handler.codec.http.x
    public String uri() {
        return this.n;
    }
}
