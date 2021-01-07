package defpackage;

import android.content.Context;
import com.spotify.music.share.logging.ShareMenuLogger;
import java.util.List;

/* renamed from: d1d  reason: default package */
public final class d1d implements fjf<c1d> {
    private final wlf<Context> a;
    private final wlf<List<o8e>> b;
    private final wlf<ShareMenuLogger> c;

    public d1d(wlf<Context> wlf, wlf<List<o8e>> wlf2, wlf<ShareMenuLogger> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new c1d(this.a.get(), this.b.get(), this.c.get());
    }
}
