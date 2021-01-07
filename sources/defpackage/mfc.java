package defpackage;

import com.spotify.playlist.endpoints.d;
import defpackage.ffc;

/* renamed from: mfc  reason: default package */
public class mfc implements ffc.a {
    private final wlf<d> a;

    public mfc(wlf<d> wlf) {
        b(wlf, 1);
        this.a = wlf;
    }

    private static <T> T b(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    @Override // defpackage.ffc.a
    public ffc a(String str) {
        d dVar = this.a.get();
        b(dVar, 1);
        b(str, 2);
        return new gfc(dVar, str);
    }
}
