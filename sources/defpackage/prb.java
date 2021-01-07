package defpackage;

import com.spotify.libs.connect.picker.view.ConnectView;

/* renamed from: prb  reason: default package */
public final class prb {
    private final wlf<uba> a;

    public prb(wlf<uba> wlf) {
        a(wlf, 1);
        this.a = wlf;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public orb b(ConnectView connectView) {
        uba uba = this.a.get();
        a(uba, 1);
        a(connectView, 2);
        return new orb(uba, connectView);
    }
}
