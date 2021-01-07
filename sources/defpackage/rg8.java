package defpackage;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.mobile.android.hubframework.defaults.m;

/* renamed from: rg8  reason: default package */
public final class rg8 implements fjf<qg8> {
    private final wlf<Context> a;
    private final wlf<m> b;
    private final wlf<RecyclerView.q> c;
    private final wlf<ic8> d;

    public rg8(wlf<Context> wlf, wlf<m> wlf2, wlf<RecyclerView.q> wlf3, wlf<ic8> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new qg8(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
