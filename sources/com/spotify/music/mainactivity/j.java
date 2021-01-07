package com.spotify.music.mainactivity;

import android.view.ViewGroup;
import com.spotify.rxjava2.q;
import io.reactivex.a;

public class j implements ahb {
    private final y a;
    private final q b = new q();

    public j(y yVar) {
        this.a = yVar;
    }

    @Override // defpackage.ahb
    public void a() {
        for (ahb ahb : this.a.a()) {
            q qVar = this.b;
            ahb.getClass();
            qVar.a(a.x(new b(ahb)).G(io.reactivex.schedulers.a.a()).subscribe(a.a));
        }
    }

    @Override // defpackage.ahb
    public void c() {
        for (ahb ahb : this.a.a()) {
            ahb.c();
        }
    }

    @Override // defpackage.ahb
    public void e() {
        this.b.c();
        for (ahb ahb : this.a.a()) {
            ahb.e();
        }
    }

    @Override // defpackage.ahb
    public void f(ViewGroup viewGroup) {
        for (ahb ahb : this.a.a()) {
            ahb.f(viewGroup);
        }
    }
}
