package defpackage;

import com.spotify.music.libs.podcast.download.DownloadDialogLifecycleAwareUtil;

/* renamed from: psc  reason: default package */
public final class psc implements fjf<osc> {
    private final wlf<tsc> a;
    private final wlf<m8a> b;
    private final wlf<DownloadDialogLifecycleAwareUtil> c;

    public psc(wlf<tsc> wlf, wlf<m8a> wlf2, wlf<DownloadDialogLifecycleAwareUtil> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new osc(this.a.get(), this.b.get(), this.c.get());
    }
}
