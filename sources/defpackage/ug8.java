package defpackage;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.mobile.android.hubframework.defaults.m;
import defpackage.sg8;

/* renamed from: ug8  reason: default package */
public final class ug8 implements sg8.a {
    private final wlf<m> a;
    private final wlf<RecyclerView.q> b;
    private final wlf<ic8> c;

    public ug8(wlf<m> wlf, wlf<RecyclerView.q> wlf2, wlf<ic8> wlf3) {
        b(wlf, 1);
        this.a = wlf;
        b(wlf2, 2);
        this.b = wlf2;
        b(wlf3, 3);
        this.c = wlf3;
    }

    private static <T> T b(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    @Override // defpackage.sg8.a
    public sg8 a(Context context) {
        m mVar = this.a.get();
        b(mVar, 1);
        RecyclerView.q qVar = this.b.get();
        b(qVar, 2);
        ic8 ic8 = this.c.get();
        b(ic8, 3);
        b(context, 4);
        return new tg8(mVar, qVar, ic8, context);
    }
}
