package defpackage;

import com.google.protobuf.u;
import com.spotify.messages.PartnerBannerSessionEvent;
import java.util.List;

/* renamed from: tla  reason: default package */
public class tla {
    private final gl0<u> a;

    public tla(gl0<u> gl0) {
        this.a = gl0;
    }

    public void a(String str, String str2, long j, String str3, List<String> list, String str4) {
        PartnerBannerSessionEvent.b q = PartnerBannerSessionEvent.q();
        q.n(str);
        q.q("end");
        q.p(str2);
        q.r(j);
        q.s(str3);
        q.m(list);
        if ("no_app_connected".equals(str4)) {
            str4 = "";
        }
        q.o(str4);
        this.a.c(q.build());
    }

    public void b(String str, String str2, String str3, List<String> list, String str4) {
        PartnerBannerSessionEvent.b q = PartnerBannerSessionEvent.q();
        q.n(str);
        q.q("start");
        q.p(str2);
        q.r(0);
        q.s(str3);
        q.m(list);
        if ("no_app_connected".equals(str4)) {
            str4 = "";
        }
        q.o(str4);
        this.a.c(q.build());
    }
}
