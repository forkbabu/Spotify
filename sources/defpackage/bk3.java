package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.pageloader.s0;
import defpackage.fj3;
import defpackage.wj3;

/* renamed from: bk3  reason: default package */
public class bk3 implements s0 {
    private final fj3.a a;
    private final wj3.a b;
    private View c;
    private Bundle f;
    private fj3 n;
    private wj3 o;

    public bk3(fj3.a aVar, wj3.a aVar2) {
        this.a = aVar;
        this.b = aVar2;
    }

    public boolean a() {
        fj3 fj3 = this.n;
        return fj3 != null && fj3.b();
    }

    public void b(Bundle bundle) {
        wj3 wj3 = this.o;
        if (wj3 != null) {
            ((yj3) wj3).q(bundle);
        }
    }

    public void c(Bundle bundle) {
        this.f = bundle;
    }

    @Override // com.spotify.pageloader.s0
    public View getView() {
        return this.c;
    }

    @Override // com.spotify.pageloader.s0
    public void i(Context context, ViewGroup viewGroup, LayoutInflater layoutInflater) {
        if (this.n == null) {
            this.n = ((hj3) this.a).b();
        }
        wj3 b2 = ((zj3) this.b).b(this.n);
        this.o = b2;
        this.c = ((yj3) b2).o(layoutInflater, viewGroup, this.f);
    }

    @Override // com.spotify.pageloader.s0
    public void start() {
        fj3 fj3 = this.n;
        if (fj3 != null) {
            fj3.onStart();
        }
    }

    @Override // com.spotify.pageloader.s0
    public void stop() {
        fj3 fj3 = this.n;
        if (fj3 != null) {
            fj3.onStop();
        }
    }
}
