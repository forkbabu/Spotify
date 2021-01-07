package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.pageloader.s0;
import defpackage.l16;
import defpackage.z16;
import io.reactivex.s;

/* renamed from: y16  reason: default package */
public class y16 implements s0 {
    private final l16.a a;
    private final z16.a b;
    private View c;
    private Bundle f;
    private l16 n;
    private z16 o;
    private s<k16> p;

    public y16(l16.a aVar, z16.a aVar2) {
        this.a = aVar;
        this.b = aVar2;
    }

    public void a() {
        l16 l16 = this.n;
        if (l16 != null) {
            l16.b();
        }
    }

    public void b(Bundle bundle) {
        l16 l16 = this.n;
        if (l16 != null) {
            l16.g(bundle);
        }
    }

    public void c(Bundle bundle) {
        this.f = bundle;
    }

    public y16 e(s<k16> sVar) {
        this.p = sVar;
        return this;
    }

    @Override // com.spotify.pageloader.s0
    public View getView() {
        return this.c;
    }

    @Override // com.spotify.pageloader.s0
    public void i(Context context, ViewGroup viewGroup, LayoutInflater layoutInflater) {
        if (this.n == null) {
            this.n = ((n16) this.a).b(this.p);
        }
        this.n.d(this.f);
        z16 b2 = ((b26) this.b).b(this.n);
        this.o = b2;
        this.c = ((a26) b2).p(layoutInflater, viewGroup, this.f);
    }

    @Override // com.spotify.pageloader.s0
    public void start() {
        l16 l16 = this.n;
        if (l16 != null) {
            l16.start();
        }
    }

    @Override // com.spotify.pageloader.s0
    public void stop() {
        l16 l16 = this.n;
        if (l16 != null) {
            l16.stop();
        }
    }
}
