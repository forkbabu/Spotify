package defpackage;

import com.google.protobuf.u;
import com.spotify.messages.StorylinesLoad;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;

/* renamed from: fjd  reason: default package */
public class fjd {
    private final gl0<u> a;

    public fjd(gl0<u> gl0) {
        this.a = gl0;
    }

    private void a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        gl0<u> gl0 = this.a;
        StorylinesLoad.b r = StorylinesLoad.r();
        r.r(str);
        r.t(str2);
        r.m(str3);
        r.q(str4);
        r.p(str5);
        r.s(str6);
        r.n(str7);
        r.o(str8);
        gl0.c(r.build());
    }

    public void b(String str) {
        a("", "", "", "entities", AppProtocol.LogMessage.SEVERITY_ERROR, "disk_cache", str, "");
    }

    public void c() {
        a("", "", "", "entities", "success", "disk_cache", "", "");
    }

    public void d(String str) {
        a("", "", "", "entities", AppProtocol.LogMessage.SEVERITY_ERROR, "network", str, "");
    }

    public void e() {
        a("", "", "", "entities", "success", "network", "", "");
    }

    public void f() {
        a("", "", "", "entities", "loading", "", "", "");
    }

    public void g(String str, String str2, String str3) {
        a(str, "", "", "entity", AppProtocol.LogMessage.SEVERITY_ERROR, "memory_cache", str3, str2);
    }

    public void h(String str, String str2, String str3) {
        a(str, str3, "", "entity", "success", "memory_cache", "", str2);
    }

    public void i(String str, String str2, String str3) {
        a(str, "", "", "entity", AppProtocol.LogMessage.SEVERITY_ERROR, "network", str3, str2);
    }

    public void j(String str, String str2, String str3) {
        a(str, str3, "", "entity", "success", "network", "", str2);
    }

    public void k(String str, String str2) {
        a(str, "", "", "entity", "loading", "", "", str2);
    }

    public void l(String str, String str2, String str3, String str4) {
        a(str, str3, str2, "image", AppProtocol.LogMessage.SEVERITY_ERROR, "library", "", str4);
    }

    public void m(String str, String str2, String str3, String str4) {
        a(str, str3, str2, "image", "loading", "", "", str4);
    }

    public void n(String str, String str2, String str3, String str4) {
        a(str, str3, str2, "image", "success", "library", "", str4);
    }
}
