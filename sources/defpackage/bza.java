package defpackage;

import com.google.common.base.Optional;
import com.spotify.music.connection.g;
import defpackage.dza;
import defpackage.tya;

/* renamed from: bza  reason: default package */
public abstract class bza {
    public static final bza a;

    /* renamed from: bza$a */
    public static abstract class a {
        public abstract bza a();

        public abstract a b(txa txa);

        public abstract a c(g gVar);

        public abstract a d(Optional<yya> optional);

        public abstract a e(String str);

        public abstract a f(dza dza);

        public abstract a g(fza fza);
    }

    static {
        tya.b bVar = new tya.b();
        bVar.e("");
        bVar.d(Optional.absent());
        bVar.f(new dza.b());
        bVar.c(g.c());
        bVar.g(new wya("invalid", "invalid", "invalid"));
        bVar.b(txa.a);
        a = bVar.a();
    }

    public abstract txa a();

    public abstract g b();

    public abstract Optional<yya> c();

    public abstract String d();

    public abstract dza e();

    public abstract a f();

    public abstract fza g();
}
