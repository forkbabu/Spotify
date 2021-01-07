package defpackage;

import com.google.protobuf.u;
import com.spotify.messages.PushNotificationInteractionErrorV1;
import com.spotify.messages.PushNotificationInteractionV1;

/* renamed from: yv7  reason: default package */
public class yv7 implements cw7 {
    private final cqe a;
    private final gl0<u> b;

    public yv7(cqe cqe, gl0<u> gl0) {
        this.a = cqe;
        this.b = gl0;
    }

    public void a(String str, String str2, String str3, String str4) {
        PushNotificationInteractionV1.b o = PushNotificationInteractionV1.o();
        o.o(str);
        if (str2 != null) {
            o.p(str2);
        }
        if (str3 != null) {
            o.m(str3);
        }
        if (str4 != null) {
            o.n(str4);
        }
        gl0<u> gl0 = this.b;
        o.q(this.a.d());
        gl0.c(o.build());
    }

    public void b(String str, String str2, String str3, String str4, String str5) {
        PushNotificationInteractionErrorV1.b p = PushNotificationInteractionErrorV1.p();
        p.p(str);
        if (str2 != null) {
            p.q(str2);
        }
        if (str3 != null) {
            p.m(str3);
        }
        if (str4 != null) {
            p.n(str4);
        }
        if (str5 != null) {
            p.o(str5);
        }
        gl0<u> gl0 = this.b;
        p.r(this.a.d());
        gl0.c(p.build());
    }
}
