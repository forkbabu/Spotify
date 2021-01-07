package defpackage;

import android.text.TextUtils;
import com.google.protobuf.u;
import com.spotify.messages.DeeplinkOpen;
import com.spotify.messages.PlaybackFromDeeplink;
import com.spotify.messages.Share;

/* renamed from: s4e  reason: default package */
public class s4e implements r4e {
    private final gl0<u> a;

    public s4e(gl0<u> gl0) {
        this.a = gl0;
    }

    @Override // defpackage.r4e
    public void a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        Share.b s = Share.s();
        s.p(str);
        s.o(str2);
        s.r(str4);
        s.m(str3);
        s.q(str9);
        if (!TextUtils.isEmpty(str5)) {
            s.t(str5);
        }
        if (!TextUtils.isEmpty(str6)) {
            s.s(str6);
        }
        if (!TextUtils.isEmpty(str8)) {
            s.n(str8);
        }
        if (!TextUtils.isEmpty(str7)) {
            s.u(str7);
        }
        this.a.c(s.build());
    }

    @Override // defpackage.r4e
    public void b(String str, String str2, String str3, String str4) {
        DeeplinkOpen.b p = DeeplinkOpen.p();
        p.n(str2);
        p.o(str);
        p.m(str3);
        if (!TextUtils.isEmpty(str4)) {
            p.r(str4);
        }
        this.a.c(p.build());
    }

    @Override // defpackage.r4e
    public void c(String str, String str2, String str3, String str4) {
        PlaybackFromDeeplink.b n = PlaybackFromDeeplink.n();
        n.m(str2);
        n.n(str);
        n.p(str3);
        if (!TextUtils.isEmpty(str4)) {
            n.o(str4);
        }
        this.a.c(n.build());
    }

    @Override // defpackage.r4e
    public void d(String str, String str2, String str3, String str4, String str5, String str6) {
        DeeplinkOpen.b p = DeeplinkOpen.p();
        p.n(str2);
        p.o(str);
        p.m(str3);
        p.p(str5);
        p.q(str6);
        if (!TextUtils.isEmpty(str4)) {
            p.r(str4);
        }
        this.a.c(p.build());
    }
}
