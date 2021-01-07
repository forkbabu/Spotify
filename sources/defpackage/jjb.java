package defpackage;

import com.google.protobuf.u;
import com.spotify.messages.MarqueeOptOutEvent;

/* renamed from: jjb  reason: default package */
public class jjb {
    private final gl0<u> a;

    public jjb(gl0<u> gl0) {
        this.a = gl0;
    }

    private void c(String str, String str2, String str3, String str4) {
        MarqueeOptOutEvent.b n = MarqueeOptOutEvent.n();
        n.n(str);
        n.p(str2);
        n.m(str3);
        n.o(str4);
        this.a.c(n.build());
    }

    public void a(String str, String str2) {
        c("optout_artist", "", str, str2);
    }

    public void b(String str, String str2) {
        c("optout_cancel", "", str, str2);
    }

    public void d(String str, String str2, String str3) {
        c("optout_marquee", str, str2, str3);
    }
}
