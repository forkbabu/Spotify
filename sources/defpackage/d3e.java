package defpackage;

import android.content.Context;
import com.spotify.music.C0707R;
import java.util.AbstractMap;
import java.util.Map;

/* renamed from: d3e  reason: default package */
public final class d3e implements fjf<Map.Entry<Integer, x2e>> {
    private final wlf<Context> a;
    private final wlf<aae> b;

    public d3e(wlf<Context> wlf, wlf<aae> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new AbstractMap.SimpleImmutableEntry(Integer.valueOf((int) C0707R.id.share_app_instagram_stories), new q3e(this.a.get(), this.b.get()));
    }
}
