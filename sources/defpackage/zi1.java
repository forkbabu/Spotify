package defpackage;

import android.content.Context;
import com.spotify.mobile.android.service.media.browser.o;
import com.spotify.playlist.endpoints.p;
import com.spotify.playlist.endpoints.policy.rootlist.FolderMetadataDecorationPolicy;
import com.spotify.playlist.endpoints.policy.rootlist.PlaylistMetadataDecorationPolicy;
import com.spotify.remoteconfig.x4;
import io.reactivex.s;

/* renamed from: zi1  reason: default package */
public final class zi1 implements fjf<yi1> {
    private final wlf<Context> a;
    private final wlf<p> b;
    private final wlf<PlaylistMetadataDecorationPolicy> c;
    private final wlf<FolderMetadataDecorationPolicy> d;
    private final wlf<x4> e;
    private final wlf<o> f;
    private final wlf<s<String>> g;

    public zi1(wlf<Context> wlf, wlf<p> wlf2, wlf<PlaylistMetadataDecorationPolicy> wlf3, wlf<FolderMetadataDecorationPolicy> wlf4, wlf<x4> wlf5, wlf<o> wlf6, wlf<s<String>> wlf7) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new yi1(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get());
    }
}
