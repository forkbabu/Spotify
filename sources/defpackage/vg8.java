package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.spotify.mobile.android.hubframework.defaults.m;

/* renamed from: vg8  reason: default package */
public final class vg8 implements fjf<ug8> {
    private final wlf<m> a;
    private final wlf<RecyclerView.q> b;
    private final wlf<ic8> c;

    public vg8(wlf<m> wlf, wlf<RecyclerView.q> wlf2, wlf<ic8> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ug8(this.a, this.b, this.c);
    }
}
