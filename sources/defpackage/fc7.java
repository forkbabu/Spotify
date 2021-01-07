package defpackage;

import com.spotify.music.libs.podcast.download.DownloadDialogLifecycleAwareUtil;
import defpackage.dc7;

/* renamed from: fc7  reason: default package */
public final class fc7 implements fjf<ec7> {
    private final wlf<dc7.a> a;
    private final wlf<apa> b;
    private final wlf<DownloadDialogLifecycleAwareUtil> c;

    public fc7(wlf<dc7.a> wlf, wlf<apa> wlf2, wlf<DownloadDialogLifecycleAwareUtil> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ec7(ejf.a(this.a), this.b.get(), this.c.get());
    }
}
