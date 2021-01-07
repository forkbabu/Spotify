package defpackage;

import android.content.Context;
import com.spotify.music.C0707R;
import java.util.AbstractMap;
import java.util.Map;

/* renamed from: c3e  reason: default package */
public final class c3e implements fjf<Map.Entry<Integer, x2e>> {
    private final wlf<Context> a;
    private final wlf<x9e> b;

    public c3e(wlf<Context> wlf, wlf<x9e> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new AbstractMap.SimpleImmutableEntry(Integer.valueOf((int) C0707R.id.share_app_facebook_stories), new q3e(this.a.get(), this.b.get()));
    }
}
