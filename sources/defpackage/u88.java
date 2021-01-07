package defpackage;

import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: u88  reason: default package */
public final class u88 implements fjf<String> {
    private final wlf<String> a;

    public u88(wlf<String> wlf) {
        this.a = wlf;
    }

    public static String a(String str) {
        str.getClass();
        if (ViewUris.q0.a(str)) {
            String j = ((r52) q52.a()).a(str).j(2, ":");
            j.getClass();
            return j;
        }
        je.p("Unable to extract search query from URI: ", str);
        return "";
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get());
    }
}
