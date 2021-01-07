package com.spotify.music;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.google.common.base.Optional;
import com.spotify.android.flags.c;
import com.spotify.android.flags.d;
import com.spotify.mobile.android.ui.fragments.BottomNavigationFragment;
import com.spotify.rxjava2.p;
import io.reactivex.g;
import io.reactivex.y;

public class d0 implements ahb, wgb {
    private final vgb a;
    private final y b;
    private final g<c> c;
    private c f;
    private final p n = new p();

    public d0(vgb vgb, y yVar, g<c> gVar) {
        this.a = vgb;
        this.b = yVar;
        this.c = gVar;
    }

    @Override // defpackage.ahb
    public void a() {
        this.n.b(this.c.Q(this.b).subscribe(new d(this)));
    }

    @Override // defpackage.wgb
    public Optional<Fragment> b() {
        c cVar = this.f;
        if (cVar == null) {
            return Optional.absent();
        }
        BottomNavigationFragment bottomNavigationFragment = new BottomNavigationFragment();
        d.a(bottomNavigationFragment, cVar);
        return Optional.of(bottomNavigationFragment);
    }

    @Override // defpackage.ahb
    public void c() {
    }

    public /* synthetic */ void d(c cVar) {
        this.f = cVar;
        this.a.m0();
    }

    @Override // defpackage.ahb
    public void e() {
        this.n.a();
    }

    @Override // defpackage.ahb
    public void f(ViewGroup viewGroup) {
    }
}
