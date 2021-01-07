package defpackage;

import android.support.v4.media.session.MediaSessionCompat;
import com.spotify.music.libs.mediasession.m0;

/* renamed from: ha3  reason: default package */
public final class ha3 implements fjf<MediaSessionCompat> {
    private final wlf<m0> a;

    public ha3(wlf<m0> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        MediaSessionCompat h = this.a.get().h();
        yif.g(h, "Cannot return null from a non-@Nullable @Provides method");
        return h;
    }
}
