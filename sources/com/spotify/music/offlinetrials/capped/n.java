package com.spotify.music.offlinetrials.capped;

import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.playlist.model.policy.DecorationPolicy;
import com.spotify.mobile.android.playlist.model.policy.Policy;
import com.spotify.playlist.endpoints.p;
import com.spotify.playlist.endpoints.policy.rootlist.FolderMetadataDecorationPolicy;
import com.spotify.playlist.endpoints.policy.rootlist.FolderRequestPolicy;
import com.spotify.playlist.endpoints.policy.rootlist.PlaylistMetadataDecorationPolicy;
import com.spotify.playlist.endpoints.policy.rootlist.RootlistRequestPayload;
import com.spotify.rxjava2.q;
import io.reactivex.s;
import io.reactivex.y;

public class n {
    private static final RootlistRequestPayload i;
    private static final p.a j;
    public static final /* synthetic */ int k = 0;
    protected final q a = new q();
    private final p b;
    private final s9a c;
    private final m d;
    private final k e;
    private final s<Boolean> f;
    private final y g;
    private final Policy h;

    static {
        RootlistRequestPayload.a builder = RootlistRequestPayload.builder();
        FolderRequestPolicy.a builder2 = FolderRequestPolicy.builder();
        FolderMetadataDecorationPolicy.a builder3 = FolderMetadataDecorationPolicy.builder();
        builder3.h(true);
        builder2.b(builder3.b());
        PlaylistMetadataDecorationPolicy.a builder4 = PlaylistMetadataDecorationPolicy.builder();
        builder4.j(true);
        builder2.c(builder4.c());
        builder.b(builder2.a());
        RootlistRequestPayload a2 = builder.a();
        i = a2;
        p.a.C0375a b2 = p.a.b();
        b2.a(Boolean.TRUE);
        b2.c(false);
        b2.e(a2);
        j = b2.b();
    }

    public n(p pVar, s9a s9a, m mVar, k kVar, s<Boolean> sVar, y yVar) {
        this.b = pVar;
        this.c = s9a;
        this.d = mVar;
        this.e = kVar;
        this.f = sVar;
        this.g = yVar;
        this.h = new Policy(new DecorationPolicy());
        s9a.a().d(false, true, false);
    }

    public /* synthetic */ void a(Boolean bool) {
        if (bool.booleanValue()) {
            this.e.b();
        }
    }

    public /* synthetic */ void b(Boolean bool) {
        if (bool.booleanValue()) {
            Logger.b("OfflineTrialsFeatureObserver: album or playlist added to downloaded content", new Object[0]);
            this.e.a();
        }
    }

    public void c() {
        this.a.c();
        this.a.a(s.n(this.b.d(Optional.absent(), j).j0(b.a).e(2, 1).j0(h.a).n0(this.c.d(this.h).j0(d.a).e(2, 1).j0(g.a)), this.f, a.a).o0(this.g).s0(Boolean.FALSE).subscribe(new i(this)));
        this.a.a(s.n(this.d.a().j0(f.a), this.f, e.a).o0(this.g).subscribe(new c(this)));
    }

    public void d() {
        this.a.c();
    }
}
