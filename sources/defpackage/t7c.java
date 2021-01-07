package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.squareup.picasso.Picasso;

/* renamed from: t7c  reason: default package */
public final class t7c {
    private final wlf<LayoutInflater> a;
    private final wlf<Picasso> b;

    public t7c(wlf<LayoutInflater> wlf, wlf<Picasso> wlf2) {
        a(wlf, 1);
        this.a = wlf;
        a(wlf2, 2);
        this.b = wlf2;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public s7c b(ViewGroup viewGroup) {
        LayoutInflater layoutInflater = this.a.get();
        a(layoutInflater, 1);
        Picasso picasso = this.b.get();
        a(picasso, 2);
        a(viewGroup, 3);
        return new s7c(layoutInflater, picasso, viewGroup);
    }
}
