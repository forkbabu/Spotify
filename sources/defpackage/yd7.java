package defpackage;

import android.content.Context;
import com.spotify.android.glue.patterns.toolbarmenu.h0;
import com.spotify.music.features.podcast.episode.u0;
import com.spotify.music.libs.podcast.download.DownloadDialogLifecycleAwareUtil;
import com.spotify.music.spotlets.scannables.c;
import defpackage.wd7;

/* renamed from: yd7  reason: default package */
public final class yd7 implements fjf<xd7> {
    private final wlf<Context> a;
    private final wlf<h0> b;
    private final wlf<c> c;
    private final wlf<wd7.a> d;
    private final wlf<DownloadDialogLifecycleAwareUtil> e;
    private final wlf<u0> f;

    public yd7(wlf<Context> wlf, wlf<h0> wlf2, wlf<c> wlf3, wlf<wd7.a> wlf4, wlf<DownloadDialogLifecycleAwareUtil> wlf5, wlf<u0> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new xd7(this.a.get(), this.b.get(), this.c.get(), ejf.a(this.d), this.e.get(), this.f.get());
    }
}
