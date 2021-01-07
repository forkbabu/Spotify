package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import com.google.android.material.appbar.AppBarLayout;

/* renamed from: b47  reason: default package */
public class b47 implements n47 {
    private final wlf<d47> a;
    private final wlf<g47> b;

    public b47(wlf<d47> wlf, wlf<g47> wlf2) {
        b(wlf, 1);
        this.a = wlf;
        b(wlf2, 2);
        this.b = wlf2;
    }

    private static <T> T b(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    @Override // defpackage.n47
    public j47 a(LayoutInflater layoutInflater, Context context, AppBarLayout appBarLayout) {
        b(layoutInflater, 1);
        b(context, 2);
        b(appBarLayout, 3);
        d47 d47 = this.a.get();
        b(d47, 4);
        d47 d472 = d47;
        g47 g47 = this.b.get();
        b(g47, 5);
        return new a47(layoutInflater, context, appBarLayout, d472, g47);
    }
}
