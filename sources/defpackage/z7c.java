package defpackage;

import com.spotify.libs.connect.picker.view.ConnectView;

/* renamed from: z7c  reason: default package */
public final class z7c {
    private final wlf<uba> a;

    public z7c(wlf<uba> wlf) {
        a(wlf, 1);
        this.a = wlf;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public y7c b(ConnectView connectView) {
        uba uba = this.a.get();
        a(uba, 1);
        a(connectView, 2);
        return new y7c(uba, connectView);
    }
}
