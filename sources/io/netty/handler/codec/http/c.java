package io.netty.handler.codec.http;

import io.netty.buffer.j;
import io.netty.buffer.j0;
import io.netty.util.IllegalReferenceCountException;
import io.netty.util.o;

public class c extends i implements l {
    private final j n;
    private final r o;
    private int p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(d0 d0Var, b0 b0Var, boolean z) {
        super(d0Var, b0Var, z, false);
        j a = j0.a(0);
        if (a != null) {
            this.n = a;
            this.o = new e(z);
            return;
        }
        throw new NullPointerException("content");
    }

    @Override // io.netty.buffer.l
    public j content() {
        return this.n;
    }

    @Override // io.netty.util.o
    public boolean d() {
        return this.n.d();
    }

    @Override // io.netty.handler.codec.http.f, io.netty.handler.codec.http.g
    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (!super.equals(cVar) || !this.n.equals(cVar.n) || !this.o.equals(cVar.o)) {
            return false;
        }
        return true;
    }

    @Override // io.netty.handler.codec.http.f, io.netty.handler.codec.http.g
    public int hashCode() {
        int i;
        int i2 = this.p;
        if (i2 != 0) {
            return i2;
        }
        if (this.n.n() != 0) {
            try {
                i = this.n.hashCode() + 31;
            } catch (IllegalReferenceCountException unused) {
            }
            int hashCode = this.o.hashCode();
            int hashCode2 = super.hashCode() + ((hashCode + (i * 31)) * 31);
            this.p = hashCode2;
            return hashCode2;
        }
        i = 31;
        int hashCode3 = this.o.hashCode();
        int hashCode22 = super.hashCode() + ((hashCode3 + (i * 31)) * 31);
        this.p = hashCode22;
        return hashCode22;
    }

    @Override // io.netty.util.o
    public int n() {
        return this.n.n();
    }

    @Override // io.netty.handler.codec.http.i
    public String toString() {
        StringBuilder sb = new StringBuilder(256);
        s.b(sb, this);
        return sb.toString();
    }

    @Override // io.netty.handler.codec.http.e0
    public r u() {
        return this.o;
    }

    @Override // io.netty.util.o
    public o z(Object obj) {
        this.n.z(obj);
        return this;
    }
}
