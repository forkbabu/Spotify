package defpackage;

import android.content.Context;
import com.spotify.music.C0707R;
import java.util.AbstractMap;
import java.util.Map;

/* renamed from: e3e  reason: default package */
public final class e3e implements fjf<Map.Entry<Integer, x2e>> {
    private final wlf<Context> a;
    private final wlf<dae> b;

    public e3e(wlf<Context> wlf, wlf<dae> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new AbstractMap.SimpleImmutableEntry(Integer.valueOf((int) C0707R.id.share_app_snapchat_stories), new q3e(this.a.get(), this.b.get()));
    }
}
