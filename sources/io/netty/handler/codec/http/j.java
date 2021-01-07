package io.netty.handler.codec.http;

import io.netty.buffer.j0;
import io.netty.handler.codec.e;
import io.netty.util.internal.r;
import io.netty.util.o;
import java.util.Iterator;
import java.util.Map;

public class j extends d implements e0 {
    private final r c;

    private static final class a extends e {
        private static final e.d<CharSequence> f = new C0605a();

        /* renamed from: io.netty.handler.codec.http.j$a$a  reason: collision with other inner class name */
        static class C0605a implements e.d<CharSequence> {
            C0605a() {
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // io.netty.handler.codec.e.d
            public void a(CharSequence charSequence) {
                CharSequence charSequence2 = charSequence;
                e.c.a(charSequence2);
                if (p.c.i(charSequence2) || p.l.i(charSequence2) || p.k.i(charSequence2)) {
                    throw new IllegalArgumentException("prohibited trailing header: " + ((Object) charSequence2));
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(boolean z) {
            super(z, z ? f : e.d.a);
        }
    }

    public j() {
        super(j0.a(0));
        this.c = new a(true);
    }

    @Override // io.netty.handler.codec.http.d
    public o g(Object obj) {
        super.z(obj);
        return this;
    }

    @Override // io.netty.handler.codec.http.d
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append(r.a);
        Iterator<Map.Entry<String, String>> it = this.c.iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> next = it.next();
            sb.append(next.getKey());
            sb.append(": ");
            sb.append(next.getValue());
            sb.append(r.a);
        }
        sb.setLength(sb.length() - r.a.length());
        return sb.toString();
    }

    @Override // io.netty.handler.codec.http.e0
    public r u() {
        return this.c;
    }

    @Override // io.netty.handler.codec.http.d, io.netty.util.o
    public o z(Object obj) {
        super.z(obj);
        return this;
    }

    public j(io.netty.buffer.j jVar) {
        super(jVar);
        this.c = new a(true);
    }

    public j(io.netty.buffer.j jVar, boolean z) {
        super(jVar);
        this.c = new a(z);
    }
}
