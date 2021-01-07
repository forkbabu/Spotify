package defpackage;

import com.google.common.base.Optional;
import com.spotify.music.sociallistening.models.b;
import defpackage.bdd;

/* renamed from: edd  reason: default package */
public abstract class edd {
    public static final edd a;

    /* renamed from: edd$a */
    public static abstract class a {
        public abstract edd a();

        public abstract a b(Optional<b> optional);

        public abstract a c(Optional<String> optional);
    }

    static {
        bdd.b bVar = new bdd.b();
        bVar.b(Optional.absent());
        bVar.c(Optional.absent());
        a = bVar.a();
    }

    public abstract Optional<b> a();

    public abstract a b();

    public abstract Optional<String> c();
}
