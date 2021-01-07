package defpackage;

import android.content.Context;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableViewModel;
import com.spotify.music.C0707R;
import com.spotify.music.features.browse.view.f;

/* renamed from: aa4  reason: default package */
public final class aa4 implements fjf<b91> {
    private final wlf<Context> a;
    private final wlf<Boolean> b;
    private final wlf<String> c;
    private final wlf<Boolean> d;
    private final wlf<f> e;

    public aa4(wlf<Context> wlf, wlf<Boolean> wlf2, wlf<String> wlf3, wlf<Boolean> wlf4, wlf<f> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        b91 b91;
        Context context = this.a.get();
        boolean booleanValue = this.b.get().booleanValue();
        String str = this.c.get();
        boolean booleanValue2 = this.d.get().booleanValue();
        f fVar = this.e.get();
        if (booleanValue) {
            b91 = fVar.a(str, context.getString(C0707R.string.find_search_field_hint), context.getString(C0707R.string.find_search_field_hint_voice), booleanValue2);
        } else {
            b91 = HubsImmutableViewModel.EMPTY;
        }
        yif.g(b91, "Cannot return null from a non-@Nullable @Provides method");
        return b91;
    }
}
