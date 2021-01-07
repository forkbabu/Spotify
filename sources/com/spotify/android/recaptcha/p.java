package com.spotify.android.recaptcha;

import com.google.protobuf.u;
import com.spotify.messages.MobileClientRecaptchaErrorNonAuth;
import com.spotify.messages.MobileClientRecaptchaEventNonAuth;

public class p implements o {
    private final gl0<u> a;
    private final l b;

    public p(gl0<u> gl0, l lVar) {
        this.a = gl0;
        this.b = lVar;
    }

    private void d(String str, String str2, long j, String str3) {
        MobileClientRecaptchaErrorNonAuth.b q = MobileClientRecaptchaErrorNonAuth.q();
        q.s(this.b.a());
        q.r(this.b.b());
        q.n(str);
        q.q("signup");
        q.m(str2);
        q.o(j);
        q.p(str3);
        this.a.d(q.build());
    }

    private void e(String str, String str2) {
        MobileClientRecaptchaEventNonAuth.b o = MobileClientRecaptchaEventNonAuth.o();
        o.q(this.b.a());
        o.p(this.b.b());
        o.n(str);
        o.o("signup");
        o.m(str2);
        this.a.d(o.build());
    }

    public void a(String str, String str2) {
        d("onAssessFailure", str, -1, str2);
    }

    public void b(String str) {
        e("onAssess", str);
    }

    public void c(String str) {
        e("onAssessSuccess", str);
    }

    public void f(String str) {
        e(str, "");
    }

    public void g(String str, long j, String str2) {
        d(String.format("on%sFailure", str), "", j, str2);
    }

    public void h(String str, String str2) {
        e(String.format("on%sSuccess", str), str2);
    }

    public void i(String str, String str2) {
        e(str, str2);
    }
}
