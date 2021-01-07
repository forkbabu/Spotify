package defpackage;

import com.spotify.mobile.android.util.SortOption;
import com.spotify.music.libs.podcast.loader.i;
import io.reactivex.y;

/* renamed from: vg5  reason: default package */
public final class vg5 implements fjf<ug5> {
    private final wlf<i> a;
    private final wlf<String> b;
    private final wlf<SortOption> c;
    private final wlf<Boolean> d;
    private final wlf<y> e;

    public vg5(wlf<i> wlf, wlf<String> wlf2, wlf<SortOption> wlf3, wlf<Boolean> wlf4, wlf<y> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    public static vg5 a(wlf<i> wlf, wlf<String> wlf2, wlf<SortOption> wlf3, wlf<Boolean> wlf4, wlf<y> wlf5) {
        return new vg5(wlf, wlf2, wlf3, wlf4, wlf5);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ug5(this.a.get(), this.b.get(), this.c.get(), this.d.get().booleanValue(), this.e.get());
    }
}
