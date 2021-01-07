package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.features.home.common.viewbinder.v;
import com.spotify.pageloader.s0;
import io.reactivex.s;

/* renamed from: xh5  reason: default package */
public class xh5 implements s0 {
    private final s<b91> a;
    private final v b;
    private final fi5 c;

    public xh5(s<b91> sVar, v vVar, fi5 fi5) {
        this.a = sVar;
        this.b = vVar;
        this.c = fi5;
    }

    @Override // com.spotify.pageloader.s0
    public View getView() {
        return this.b.K();
    }

    @Override // com.spotify.pageloader.s0
    public void i(Context context, ViewGroup viewGroup, LayoutInflater layoutInflater) {
        this.b.P();
    }

    @Override // com.spotify.pageloader.s0
    public void start() {
        this.c.h(this.a);
    }

    @Override // com.spotify.pageloader.s0
    public void stop() {
        this.c.i();
    }
}
