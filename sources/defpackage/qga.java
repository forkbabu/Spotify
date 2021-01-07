package defpackage;

import android.content.Context;
import com.spotify.http.w;
import com.spotify.mobile.android.video.q;
import com.spotify.mobile.android.video.u;
import java.io.File;
import kotlin.jvm.internal.h;

/* renamed from: qga  reason: default package */
public final class qga implements fjf<u> {
    private final wlf<Context> a;
    private final wlf<w> b;

    public qga(wlf<Context> wlf, wlf<w> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        Context context = this.a.get();
        w wVar = this.b.get();
        h.e(context, "context");
        h.e(wVar, "spotifyOkHttp");
        return new q(new File(context.getCacheDir(), "fullscreen-story-promo-card-video-cache"), 10000000, wVar.a());
    }
}
