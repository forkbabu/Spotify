package defpackage;

import com.google.common.base.Optional;
import com.spotify.playlist.endpoints.p;
import com.spotify.playlist.endpoints.policy.rootlist.FolderMetadataDecorationPolicy;
import com.spotify.playlist.endpoints.policy.rootlist.FolderRequestPolicy;
import com.spotify.playlist.endpoints.policy.rootlist.PlaylistMetadataDecorationPolicy;
import com.spotify.playlist.endpoints.policy.rootlist.RootlistRequestPayload;
import com.spotify.playlist.models.f;
import io.reactivex.s;

/* renamed from: wk1  reason: default package */
public final class wk1 implements fjf<s<f>> {
    private final wlf<p> a;
    private final wlf<PlaylistMetadataDecorationPolicy> b;
    private final wlf<FolderMetadataDecorationPolicy> c;

    public wk1(wlf<p> wlf, wlf<PlaylistMetadataDecorationPolicy> wlf2, wlf<FolderMetadataDecorationPolicy> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        RootlistRequestPayload.a builder = RootlistRequestPayload.builder();
        FolderRequestPolicy.a builder2 = FolderRequestPolicy.builder();
        builder2.c(this.b.get());
        builder2.b(this.c.get());
        builder.b(builder2.a());
        RootlistRequestPayload a2 = builder.a();
        p.a.C0375a b2 = p.a.b();
        b2.c(true);
        b2.e(a2);
        b2.a(Boolean.TRUE);
        b2.g(p.a.c.e);
        b2.i(200);
        s<f> P = this.a.get().b(Optional.absent(), b2.b()).P();
        yif.g(P, "Cannot return null from a non-@Nullable @Provides method");
        return P;
    }
}
