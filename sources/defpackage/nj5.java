package defpackage;

import android.content.Context;
import com.spotify.android.paste.graphics.SpotifyIconV2;

/* renamed from: nj5  reason: default package */
public final class nj5 implements fjf<m71> {
    private final wlf<Context> a;

    public nj5(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new m71(this.a.get(), SpotifyIconV2.TRACK);
    }
}
