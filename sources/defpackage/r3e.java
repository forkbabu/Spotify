package defpackage;

import com.spotify.share.base.linkgeneration.proto.UtmParameters;
import com.spotify.share.sharedata.v;

/* renamed from: r3e  reason: default package */
public final class r3e {
    public static UtmParameters a(v vVar) {
        if (vVar == null) {
            return null;
        }
        UtmParameters.b t = UtmParameters.t();
        if (vVar.c() != null) {
            t.n(vVar.c());
        }
        if (vVar.e() != null) {
            t.o(vVar.e());
        }
        if (vVar.b() != null) {
            t.m(vVar.b());
        }
        if (vVar.f() != null) {
            t.p(vVar.f());
        }
        if (vVar.g() != null) {
            t.q(vVar.g());
        }
        return (UtmParameters) t.build();
    }
}
