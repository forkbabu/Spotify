package defpackage;

import android.view.ViewGroup;
import com.squareup.picasso.Picasso;

/* renamed from: yo2  reason: default package */
public final class yo2 {
    private final wlf<Picasso> a;

    public yo2(wlf<Picasso> wlf) {
        a(wlf, 1);
        this.a = wlf;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public xo2 b(ViewGroup viewGroup) {
        Picasso picasso = this.a.get();
        a(picasso, 1);
        a(viewGroup, 2);
        return new xo2(picasso, viewGroup);
    }
}
