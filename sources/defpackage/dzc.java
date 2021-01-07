package defpackage;

import android.content.Context;
import com.spotify.music.share.logging.ShareMenuLogger;
import com.spotify.music.share.logging.c;
import com.spotify.ubi.specification.factories.s3;
import com.spotify.ubi.specification.factories.t3;

/* renamed from: dzc  reason: default package */
public final class dzc implements fjf<ShareMenuLogger> {
    private final wlf<Context> a;
    private final wlf<ere> b;

    public dzc(wlf<Context> wlf, wlf<ere> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new c(this.a.get(), this.b.get(), new s3(), new t3());
    }
}
