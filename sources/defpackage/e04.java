package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobile.android.util.ui.k;
import com.spotify.pageloader.s0;
import io.reactivex.s;

/* renamed from: e04  reason: default package */
public class e04 implements s0 {
    private final s<wv3> a;
    private final xz3 b;
    private final d04 c;

    public e04(xz3 xz3, b61 b61, e61 e61, Resources resources, k kVar, xv3 xv3, b91 b91) {
        this.a = xv3.a(b91);
        this.b = xz3;
        this.c = new d04(e61, b61, resources, kVar);
    }

    @Override // com.spotify.pageloader.s0
    public View getView() {
        return this.c.c();
    }

    @Override // com.spotify.pageloader.s0
    public void i(Context context, ViewGroup viewGroup, LayoutInflater layoutInflater) {
        bd0.i(this.c.c());
    }

    @Override // com.spotify.pageloader.s0
    public void start() {
        this.b.d(this.a, this.c);
    }

    @Override // com.spotify.pageloader.s0
    public void stop() {
        this.b.a();
    }
}
