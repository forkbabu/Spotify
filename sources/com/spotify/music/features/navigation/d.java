package com.spotify.music.features.navigation;

import android.view.View;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;

public class d {
    private e a;
    private final a b;
    private final b c;
    private final bk9 d;

    public d(a aVar, b bVar, bk9 bk9) {
        aVar.getClass();
        this.b = aVar;
        this.c = bVar;
        this.d = bk9;
    }

    public void a() {
        this.d.e();
    }

    public void b(BottomTab bottomTab, boolean z) {
        e eVar = this.a;
        if (eVar != null) {
            this.c.b(bottomTab, eVar.b(), this.a.a(bottomTab));
        }
        if (!z) {
            this.b.n2(bottomTab);
        } else {
            this.b.R0(bottomTab);
        }
        e eVar2 = this.a;
        if (eVar2 != null) {
            eVar2.c(bottomTab, false);
            if (bottomTab == BottomTab.FREE_TIER_PREMIUM) {
                this.d.d();
            }
        }
    }

    public boolean c(BottomTab bottomTab, View view) {
        c g = bottomTab.g();
        if (!ViewUris.p0.equals(g) && !ViewUris.n0.equals(g)) {
            return false;
        }
        e eVar = this.a;
        if (eVar != null) {
            this.c.a(g, eVar.a(bottomTab));
        }
        this.b.D1(view);
        return true;
    }

    public void d(g gVar) {
        gVar.getClass();
        this.a = gVar;
        this.d.f(this);
    }

    public void e(boolean z) {
        this.a.c(BottomTab.FREE_TIER_PREMIUM, z);
    }

    public void f() {
        this.d.g();
    }
}
