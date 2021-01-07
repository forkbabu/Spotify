package defpackage;

import com.squareup.picasso.Picasso;

/* renamed from: u3d  reason: default package */
public final class u3d {
    private final wlf<Picasso> a;
    private final wlf<Runnable> b;
    private final wlf<l3d> c;

    public u3d(wlf<Picasso> wlf, wlf<Runnable> wlf2, wlf<l3d> wlf3) {
        a(wlf, 1);
        this.a = wlf;
        a(wlf2, 2);
        this.b = wlf2;
        a(wlf3, 3);
        this.c = wlf3;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public s3d b(k3d k3d) {
        Picasso picasso = this.a.get();
        a(picasso, 1);
        Runnable runnable = this.b.get();
        a(runnable, 2);
        l3d l3d = this.c.get();
        a(l3d, 3);
        a(k3d, 4);
        return new s3d(picasso, runnable, l3d, k3d);
    }
}
