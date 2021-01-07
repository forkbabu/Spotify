package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.spotify.music.sociallistening.models.Participant;
import com.spotify.music.sociallistening.models.Session;
import defpackage.f6d;
import defpackage.g6d;

/* renamed from: k6d  reason: default package */
public abstract class k6d {
    public static final k6d a;

    /* renamed from: k6d$a */
    public static abstract class a {
        public abstract k6d a();

        public abstract a b(Optional<Boolean> optional);

        public abstract a c(Optional<com.spotify.music.sociallistening.models.b> optional);

        public abstract a d(b bVar);
    }

    /* renamed from: k6d$b */
    public static abstract class b {
        public static final b a;

        /* renamed from: k6d$b$a */
        public static abstract class a {
            public abstract a a(boolean z);

            public abstract b b();

            public abstract a c(boolean z);

            public abstract a d(boolean z);

            public abstract a e(boolean z);

            public abstract a f(boolean z);

            public abstract a g(boolean z);

            public abstract a h(boolean z);

            public abstract a i(ImmutableList<Session> immutableList);

            public abstract a j(ImmutableList<Participant> immutableList);

            public abstract a k(boolean z);

            public abstract a l(boolean z);

            public abstract a m(boolean z);

            public abstract a n(boolean z);
        }

        static {
            g6d.b bVar = new g6d.b();
            bVar.j(ImmutableList.of());
            bVar.i(ImmutableList.of());
            bVar.f(false);
            bVar.a(false);
            bVar.m(false);
            bVar.h(false);
            bVar.e(false);
            bVar.n(false);
            bVar.l(false);
            bVar.k(false);
            bVar.g(false);
            bVar.c(false);
            bVar.d(false);
            a = bVar.b();
        }

        public abstract boolean a();

        public abstract boolean b();

        public abstract boolean c();

        public abstract boolean d();

        public abstract boolean e();

        public abstract boolean f();

        public abstract boolean g();

        public abstract ImmutableList<Session> h();

        public abstract ImmutableList<Participant> i();

        public abstract boolean j();

        public abstract boolean k();

        public abstract boolean l();

        public abstract boolean m();

        public abstract a n();
    }

    static {
        f6d.b bVar = new f6d.b();
        bVar.c(Optional.absent());
        bVar.b(Optional.absent());
        bVar.d(b.a);
        a = bVar.a();
    }

    public abstract Optional<Boolean> a();

    public abstract Optional<com.spotify.music.sociallistening.models.b> b();

    public abstract a c();

    public abstract b d();
}
