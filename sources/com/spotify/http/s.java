package com.spotify.http;

import java.net.InetSocketAddress;
import java.net.Proxy;
import okhttp3.e;
import okhttp3.p;

/* access modifiers changed from: package-private */
public class s implements p.b {
    private final t a;
    private final cqe b;

    class a extends p {
        private final String b;
        private final String c;
        private int d;
        private int e;
        private final long f;
        private long g;
        private boolean h = true;

        a(String str, String str2) {
            this.b = str;
            this.c = str2;
            this.f = s.this.b.b();
        }

        @Override // okhttp3.p
        public void a(e eVar) {
            t tVar = s.this.a;
            String str = this.b;
            String str2 = this.c;
            int i2 = this.e;
            int i3 = this.d;
            tVar.a(new RequestInfo(str, str2, i2, i3, i3, this.f, this.g, this.h));
        }

        @Override // okhttp3.p
        public void d(e eVar, InetSocketAddress inetSocketAddress, Proxy proxy) {
            this.h = false;
        }

        @Override // okhttp3.p
        public void e(e eVar, long j) {
            this.d = (int) j;
        }

        @Override // okhttp3.p
        public void f(e eVar, long j) {
            this.e = (int) j;
            this.g = s.this.b.b();
        }
    }

    s(t tVar, cqe cqe) {
        this.a = tVar;
        this.b = cqe;
    }

    @Override // okhttp3.p.b
    public p a(e eVar) {
        return new a(eVar.i().k().toString(), eVar.i().g());
    }
}
