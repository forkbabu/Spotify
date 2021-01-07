package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.spotify.music.libs.partnerapps.PartnerType;
import defpackage.zcc;

/* renamed from: ddc  reason: default package */
public abstract class ddc {
    public static final ddc a;

    /* renamed from: ddc$a */
    public static abstract class a {
        public abstract a a(Optional<PartnerType> optional);

        public abstract ddc b();

        public abstract a c(ImmutableMap<PartnerType, bla> immutableMap);

        public abstract a d(Optional<Boolean> optional);
    }

    static {
        zcc.b bVar = new zcc.b();
        bVar.d(Optional.absent());
        bVar.c(ImmutableMap.of());
        bVar.a(Optional.absent());
        a = bVar.b();
    }

    public abstract Optional<PartnerType> a();

    public abstract ImmutableMap<PartnerType, bla> b();

    public abstract Optional<Boolean> c();

    public abstract a d();
}
