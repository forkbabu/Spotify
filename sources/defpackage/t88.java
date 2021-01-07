package defpackage;

import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: t88  reason: default package */
public final class t88 implements fjf<String> {
    private final wlf<String> a;

    public t88(wlf<String> wlf) {
        this.a = wlf;
    }

    public static String a(String str) {
        str.getClass();
        if (ViewUris.q0.a(str)) {
            String o = ((r52) q52.a()).a(str).o(1);
            o.getClass();
            return o;
        }
        je.p("Unable to extract search drillDown type from URI: ", str);
        return "";
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get());
    }
}
