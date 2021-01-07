package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.playlist.endpoints.p;
import com.spotify.playlist.endpoints.policy.rootlist.FolderMetadataDecorationPolicy;
import com.spotify.playlist.endpoints.policy.rootlist.FolderRequestPolicy;
import com.spotify.playlist.endpoints.policy.rootlist.PlaylistMetadataDecorationPolicy;
import com.spotify.playlist.endpoints.policy.rootlist.PlaylistUserDecorationPolicy;
import com.spotify.playlist.endpoints.policy.rootlist.RootlistRequestDecorationPolicy;
import com.spotify.playlist.endpoints.policy.rootlist.RootlistRequestPayload;
import com.spotify.playlist.models.f;
import io.reactivex.s;
import io.reactivex.subjects.a;
import io.reactivex.v;

/* renamed from: mj3  reason: default package */
public class mj3 {
    private static final RootlistRequestPayload f;
    public static final /* synthetic */ int g = 0;
    private final Optional<String> a;
    private final p b;
    private final p.a c;
    private final a<String> d = a.i1("");
    private s<f> e;

    static {
        PlaylistUserDecorationPolicy.a builder = PlaylistUserDecorationPolicy.builder();
        builder.c(true);
        builder.d(true);
        PlaylistUserDecorationPolicy a2 = builder.a();
        PlaylistMetadataDecorationPolicy.a builder2 = PlaylistMetadataDecorationPolicy.builder();
        builder2.i(true);
        builder2.g(true);
        builder2.m(true);
        builder2.n(true);
        builder2.l(a2);
        PlaylistMetadataDecorationPolicy c2 = builder2.c();
        FolderMetadataDecorationPolicy.a builder3 = FolderMetadataDecorationPolicy.builder();
        builder3.f(true);
        builder3.e(true);
        builder3.j(true);
        builder3.g(true);
        builder3.c(true);
        builder3.h(true);
        builder3.i(true);
        FolderMetadataDecorationPolicy b2 = builder3.b();
        RootlistRequestDecorationPolicy.a builder4 = RootlistRequestDecorationPolicy.builder();
        builder4.d(true);
        builder4.c(true);
        builder4.b(true);
        RootlistRequestDecorationPolicy a3 = builder4.a();
        RootlistRequestPayload.a builder5 = RootlistRequestPayload.builder();
        FolderRequestPolicy.a builder6 = FolderRequestPolicy.builder();
        builder6.c(c2);
        builder6.b(b2);
        builder6.d(a3);
        builder5.b(builder6.a());
        f = builder5.a();
    }

    public mj3(p pVar, pj3 pj3, di3 di3) {
        this.b = pVar;
        l0 z = l0.z(di3.i());
        if (z.q() == LinkType.COLLECTION_PLAYLIST_FOLDER) {
            this.a = Optional.fromNullable(z.g());
        } else {
            this.a = Optional.absent();
        }
        p.a.C0375a b2 = p.a.b();
        b2.e(f);
        b2.c(false);
        b2.d(Boolean.TRUE);
        b2.g(pj3.a());
        this.c = b2.b();
    }

    public s<f> a() {
        if (this.e == null) {
            this.e = this.d.J0(new bj3(this)).v0(1).h1();
        }
        return this.e;
    }

    public /* synthetic */ v b(String str) {
        Optional<String> optional;
        p pVar = this.b;
        if (str.isEmpty()) {
            optional = this.a;
        } else {
            optional = Optional.absent();
        }
        p.a.C0375a k = this.c.k();
        k.c(!str.isEmpty());
        k.h(str);
        return pVar.d(optional, k.b()).F(cj3.a);
    }

    public void c(String str) {
        this.d.onNext(str);
    }
}
