package defpackage;

import com.google.common.base.Optional;
import com.spotify.playlist.endpoints.p;
import com.spotify.playlist.endpoints.policy.rootlist.FolderMetadataDecorationPolicy;
import com.spotify.playlist.endpoints.policy.rootlist.FolderRequestPolicy;
import com.spotify.playlist.endpoints.policy.rootlist.PlaylistMetadataDecorationPolicy;
import com.spotify.playlist.endpoints.policy.rootlist.RootlistRequestPayload;
import com.spotify.playlist.models.f;
import defpackage.o1e;
import io.reactivex.s;
import io.reactivex.y;
import kotlin.collections.EmptyList;

/* renamed from: yg5  reason: default package */
public class yg5 {
    private final p a;
    private final y b;

    yg5(p pVar, y yVar) {
        this.a = pVar;
        this.b = yVar;
    }

    public s<f> a() {
        f b2 = new f.a("", 0, "", 0, null, 0, 0, 0, false, null, 0, 0, EmptyList.a).b();
        o1e a2 = new o1e.b(b2, this.b).a();
        PlaylistMetadataDecorationPolicy.a builder = PlaylistMetadataDecorationPolicy.builder();
        builder.a(true);
        builder.i(true);
        builder.g(true);
        builder.m(true);
        builder.j(true);
        PlaylistMetadataDecorationPolicy c = builder.c();
        FolderMetadataDecorationPolicy.a builder2 = FolderMetadataDecorationPolicy.builder();
        builder2.h(true);
        FolderMetadataDecorationPolicy b3 = builder2.b();
        RootlistRequestPayload.a builder3 = RootlistRequestPayload.builder();
        FolderRequestPolicy.a builder4 = FolderRequestPolicy.builder();
        builder4.c(c);
        builder4.b(b3);
        builder3.b(builder4.a());
        RootlistRequestPayload a3 = builder3.a();
        p.a.C0375a b4 = p.a.b();
        b4.c(true);
        b4.e(a3);
        b4.a(Boolean.TRUE);
        b4.g(p.a.c.e);
        b4.i(200);
        b4.f(new qxd(0, 20));
        return this.a.b(Optional.absent(), b4.b()).F(b2).P().q(a2);
    }
}
