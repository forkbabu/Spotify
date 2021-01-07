package defpackage;

import android.net.Uri;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;

/* renamed from: lwc  reason: default package */
public class lwc implements nq0 {
    private static final String a;

    static {
        s52 a2 = t52.a(LinkType.HOME_ROOT);
        a2.getClass();
        a = a2.b().get(0);
    }

    @Override // defpackage.nq0
    public String a(String str) {
        l0 z = l0.z(str);
        if (Uri.EMPTY.equals(z.a)) {
            return null;
        }
        StringBuilder V0 = je.V0("spotify://");
        V0.append(z.a.getEncodedPath());
        return V0.toString();
    }

    @Override // defpackage.nq0
    public String b(String str) {
        return l0.z(str).a.getQueryParameter("utm_medium");
    }

    @Override // defpackage.nq0
    public String c() {
        return "ndjczk";
    }

    @Override // defpackage.nq0
    public String d() {
        return a;
    }

    @Override // defpackage.nq0
    public String e(String str) {
        return l0.z(str).a.getQueryParameter("utm_campaign");
    }

    @Override // defpackage.nq0
    public boolean f(String str) {
        return l0.z(str).w();
    }

    @Override // defpackage.nq0
    public String g(String str) {
        return l0.z(str).a.getQueryParameter("utm_source");
    }

    @Override // defpackage.nq0
    public String h() {
        return "6ypk9q";
    }
}
