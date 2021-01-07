package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.pageloader.s0;
import com.spotify.playlist.models.k;
import defpackage.fy4;
import defpackage.px4;
import io.reactivex.z;

/* renamed from: jy4  reason: default package */
public class jy4 implements s0 {
    private final px4.a a;
    private final fy4.a b;
    private View c;
    private k f;
    private Bundle n;
    private px4 o;
    private fy4 p;

    public jy4(px4.a aVar, fy4.a aVar2) {
        this.a = aVar;
        this.b = aVar2;
    }

    public void a(int i, int i2, Intent intent) {
        fy4 fy4 = this.p;
        if (fy4 != null) {
            ((gy4) fy4).o(i, i2, intent);
        }
    }

    public void b() {
        px4 px4 = this.o;
        if (px4 != null) {
            px4.b();
        }
    }

    public void c(int i, String[] strArr, int[] iArr) {
        fy4 fy4 = this.p;
        if (fy4 != null) {
            ((gy4) fy4).q(i, strArr, iArr);
        }
    }

    public void e(Bundle bundle) {
        px4 px4 = this.o;
        if (px4 != null) {
            px4.g(bundle);
        }
    }

    public void g(Bundle bundle) {
        this.n = bundle;
    }

    @Override // com.spotify.pageloader.s0
    public View getView() {
        return this.c;
    }

    @Override // com.spotify.pageloader.s0
    public void i(Context context, ViewGroup viewGroup, LayoutInflater layoutInflater) {
        if (this.o == null) {
            this.o = ((rx4) this.a).b(z.z(this.f));
        }
        this.o.d(this.n);
        fy4 b2 = ((hy4) this.b).b(this.o);
        this.p = b2;
        this.c = ((gy4) b2).p(layoutInflater, viewGroup, this.n);
    }

    public jy4 j(k kVar) {
        this.f = kVar;
        return this;
    }

    @Override // com.spotify.pageloader.s0
    public void start() {
        px4 px4 = this.o;
        if (px4 != null) {
            px4.start();
        }
    }

    @Override // com.spotify.pageloader.s0
    public void stop() {
        px4 px4 = this.o;
        if (px4 != null) {
            px4.stop();
        }
    }
}
