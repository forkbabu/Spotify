package defpackage;

import com.spotify.playlist.endpoints.policy.rootlist.PlaylistMetadataDecorationPolicy;
import com.spotify.playlist.endpoints.policy.rootlist.PlaylistUserDecorationPolicy;

/* renamed from: ze1  reason: default package */
public final class ze1 implements fjf<PlaylistMetadataDecorationPolicy> {

    /* access modifiers changed from: private */
    /* renamed from: ze1$a */
    public static final class a {
        private static final ze1 a = new ze1();
    }

    public static ze1 a() {
        return a.a;
    }

    @Override // defpackage.wlf
    public Object get() {
        PlaylistUserDecorationPolicy.a builder = PlaylistUserDecorationPolicy.builder();
        builder.c(true);
        PlaylistUserDecorationPolicy a2 = builder.a();
        PlaylistMetadataDecorationPolicy.a builder2 = PlaylistMetadataDecorationPolicy.builder();
        builder2.g(true);
        builder2.i(true);
        builder2.p(true);
        builder2.m(true);
        builder2.l(a2);
        builder2.k(true);
        builder2.o(true);
        builder2.j(true);
        builder2.f(true);
        return builder2.c();
    }
}
