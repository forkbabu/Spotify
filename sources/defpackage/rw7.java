package defpackage;

import com.spotify.libs.connect.picker.view.ConnectView;

/* renamed from: rw7  reason: default package */
public final class rw7 {
    private final wlf<uba> a;

    public rw7(wlf<uba> wlf) {
        a(wlf, 1);
        this.a = wlf;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public qw7 b(ConnectView connectView) {
        uba uba = this.a.get();
        a(uba, 1);
        a(connectView, 2);
        return new qw7(uba, connectView);
    }
}
