package com.spotify.music.features.partneraccountlinking;

import com.google.protobuf.u;
import com.spotify.messages.PartnerAccountLinkingDialogImpression;
import com.spotify.messages.PartnerAccountLinkingResult;
import com.spotify.music.features.partneraccountlinking.PartnerAccountLinkingError;
import com.spotify.ubi.specification.factories.i2;

public class PartnerAccountLinkingLogger {
    private final rv5 a;
    private final ere b;
    private final i2 c;
    private final gl0<u> d;
    private final String e;

    enum ImpressionReason {
        FIRST_STARTUP("first_startup"),
        WEEK_TWO_REMINDER("week_two_reminder"),
        WEEK_THREE_REMINDER("week_three_reminder");
        
        private final String mValue;

        private ImpressionReason(String str) {
            this.mValue = str;
        }

        public String d() {
            return this.mValue;
        }
    }

    public PartnerAccountLinkingLogger(rv5 rv5, ere ere, i2 i2Var, gl0<u> gl0, yyd yyd) {
        this.a = rv5;
        this.b = ere;
        this.c = i2Var;
        this.d = gl0;
        this.e = yyd.a();
    }

    private void g(String str, boolean z, String str2, String str3) {
        PartnerAccountLinkingResult.b o = PartnerAccountLinkingResult.o();
        o.o(str);
        o.q(z);
        o.p(this.e);
        o.n(str2);
        o.m(str3);
        this.d.c(o.build());
    }

    public void a() {
        this.b.a(this.c.b().b().a());
    }

    public void b() {
        this.b.a(this.c.b().e());
    }

    public void c() {
        this.b.a(this.c.b().d().b());
    }

    public void d() {
        this.b.a(this.c.b().d().a(this.a.d()));
    }

    public void e(int i) {
        String str;
        mqe c2 = this.c.b().c();
        this.b.a(c2);
        PartnerAccountLinkingDialogImpression.b m = PartnerAccountLinkingDialogImpression.m();
        m.m(c2.b());
        if (i == 0) {
            str = ImpressionReason.FIRST_STARTUP.d();
        } else if (i != 1) {
            str = ImpressionReason.WEEK_THREE_REMINDER.d();
        } else {
            str = ImpressionReason.WEEK_TWO_REMINDER.d();
        }
        m.n(str);
        m.o(i);
        this.d.c(m.build());
    }

    public void f(PartnerAccountLinkingError.ErrorType errorType, String str) {
        g(this.a.b(), false, errorType.d(), str);
    }

    public void h() {
        g(this.a.b(), true, "", "");
    }
}
