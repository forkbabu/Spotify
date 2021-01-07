package com.spotify.ubi.specification.factories;

import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import defpackage.rqe;

public final class u {
    private final rqe a;

    public final class b {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(b bVar, a aVar) {
                rqe.b p = bVar.a.p();
                je.l("retry_button", p);
                p.f(Boolean.TRUE);
                this.a = p.d();
            }

            public rqe a() {
                return this.a;
            }
        }

        b(u uVar, a aVar) {
            rqe.b p = uVar.a.p();
            je.l(AppProtocol.LogMessage.SEVERITY_ERROR, p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public a b() {
            return new a(this, null);
        }
    }

    public final class c {
        private final rqe a;

        c(u uVar, Integer num, String str, a aVar) {
            rqe.b p = uVar.a.p();
            je.o("result_item", num, str, p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public rqe a() {
            return this.a;
        }
    }

    public u(String str, String str2, String str3) {
        rqe.b e = rqe.e();
        e.c("music");
        e.l("mobile-assisted-curation-search-drilldown-see-more");
        e.m("3.0.1");
        e.g(str);
        e.j(str2);
        e.i(str3);
        this.a = e.d();
    }

    public b b() {
        return new b(this, null);
    }

    public c c(Integer num, String str) {
        return new c(this, num, str, null);
    }
}
