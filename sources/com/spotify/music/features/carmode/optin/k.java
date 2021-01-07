package com.spotify.music.features.carmode.optin;

import android.view.ViewGroup;
import com.spotify.music.C0707R;
import com.spotify.music.libs.carmodeengine.util.y;

public class k implements ahb {
    private final y a;
    private final m b;
    private final n c;
    private final q f;
    private ViewGroup n;
    private boolean o;

    public k(y yVar, m mVar, n nVar, q qVar) {
        this.a = yVar;
        this.b = mVar;
        this.c = nVar;
        this.f = qVar;
    }

    @Override // defpackage.ahb
    public void a() {
        ViewGroup viewGroup;
        if (this.a.f()) {
            if (!this.o && (viewGroup = this.n) != null) {
                this.b.e(this.f.b((j) viewGroup.findViewById(C0707R.id.car_mode_opt_in_button)), this.c);
                this.o = true;
            }
            if (this.o) {
                this.b.c();
            }
        }
    }

    @Override // defpackage.ahb
    public void c() {
    }

    @Override // defpackage.ahb
    public void e() {
        if (this.o) {
            this.b.d();
        }
    }

    @Override // defpackage.ahb
    public void f(ViewGroup viewGroup) {
        this.n = viewGroup;
        this.o = false;
    }
}
