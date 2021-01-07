package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.spotify.music.sociallistening.models.Participant;
import defpackage.ged;

/* renamed from: jed  reason: default package */
public abstract class jed {
    public static final a a;

    /* renamed from: jed$a */
    public static abstract class a {
        public abstract jed a();

        public abstract a b(boolean z);

        public abstract a c(boolean z);

        public abstract a d(String str);

        public abstract a e(String str);

        public abstract a f(int i);

        public abstract a g(Optional<ImmutableList<Participant>> optional);

        public abstract a h(Optional<Integer> optional);

        public abstract a i(Optional<String> optional);

        public abstract a j(boolean z);

        public abstract a k(boolean z);

        public abstract a l(boolean z);

        public abstract a m(boolean z);

        public abstract a n(Optional<String> optional);
    }

    static {
        ged.b bVar = new ged.b();
        bVar.g(Optional.absent());
        bVar.n(Optional.absent());
        bVar.d("");
        bVar.e("");
        bVar.c(false);
        bVar.f(0);
        bVar.j(false);
        bVar.k(false);
        bVar.m(false);
        bVar.b(false);
        bVar.l(false);
        bVar.i(Optional.absent());
        bVar.h(Optional.absent());
        a = bVar;
        bVar.a();
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract String c();

    public abstract String d();

    public abstract int e();

    public abstract Optional<ImmutableList<Participant>> f();

    public abstract Optional<Integer> g();

    public abstract Optional<String> h();

    public abstract boolean i();

    public abstract boolean j();

    public abstract boolean k();

    public abstract boolean l();

    public abstract a m();

    public abstract Optional<String> n();
}
