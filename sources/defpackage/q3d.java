package defpackage;

import com.squareup.picasso.Picasso;

/* renamed from: q3d  reason: default package */
public final class q3d {
    private final wlf<Picasso> a;
    private final wlf<Runnable> b;

    public q3d(wlf<Picasso> wlf, wlf<Runnable> wlf2) {
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

    public p3d b(j3d j3d) {
        Picasso picasso = this.a.get();
        a(picasso, 1);
        Runnable runnable = this.b.get();
        a(runnable, 2);
        a(j3d, 3);
        return new p3d(picasso, runnable, j3d);
    }
}
