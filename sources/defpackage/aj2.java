package defpackage;

import android.content.Context;
import com.squareup.picasso.Picasso;

/* renamed from: aj2  reason: default package */
final class aj2 {
    private final wlf<Context> a;
    private final wlf<Picasso> b;

    aj2(wlf<Context> wlf, wlf<Picasso> wlf2) {
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

    /* access modifiers changed from: package-private */
    public zi2 b(cj2 cj2) {
        Context context = this.a.get();
        a(context, 1);
        Picasso picasso = this.b.get();
        a(picasso, 2);
        a(cj2, 3);
        return new zi2(context, picasso, cj2);
    }
}
