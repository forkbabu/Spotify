package com.spotify.music.features.navigation;

import com.spotify.instrumentation.InteractionIntent;
import com.spotify.instrumentation.InteractionType;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;
import com.spotify.ubi.specification.factories.c4;
import kotlin.jvm.internal.h;

public final class f implements b {
    private final c4 a = new c4();
    private final cqe b;
    private final jz1 c;
    private final ere d;

    public f(cqe cqe, jz1 jz1, ere ere) {
        h.e(cqe, "clock");
        h.e(jz1, "logMessageLogger");
        h.e(ere, "ubiLogger");
        this.b = cqe;
        this.c = jz1;
        this.d = ere;
    }

    @Override // com.spotify.music.features.navigation.b
    public void a(c cVar, int i) {
        h.e(cVar, "targetTabUri");
        ere ere = this.d;
        c4.b.c d2 = this.a.b().d();
        c cVar2 = ViewUris.f2;
        ere.a(d2.b(cVar2.toString()));
        jz1 jz1 = this.c;
        ifd ifd = kfd.B1;
        h.d(ifd, "FeatureIdentifiers.VOICE");
        jz1.a(new fa1(null, ifd.getName(), cVar.toString(), "tabbar", (long) i, cVar2.toString(), InteractionType.LONG_PRESS.d(), InteractionIntent.NAVIGATE.d(), (double) this.b.d()));
    }

    @Override // com.spotify.music.features.navigation.b
    public void b(BottomTab bottomTab, BottomTab bottomTab2, int i) {
        String str;
        h.e(bottomTab, "toTab");
        h.e(bottomTab2, "fromTab");
        c g = bottomTab2.g();
        c g2 = bottomTab.g();
        if (g2 != null) {
            String cVar = g2.toString();
            h.d(cVar, "targetTabUri.toString()");
            int ordinal = bottomTab.ordinal();
            if (ordinal == 0) {
                this.d.a(this.a.b().b().a(cVar));
            } else if (ordinal == 1) {
                this.d.a(this.a.b().d().a(cVar));
            } else if (ordinal == 2) {
                this.d.a(this.a.b().e().a(cVar));
            } else if (ordinal == 4) {
                this.d.a(this.a.b().c().a(cVar));
            }
            jz1 jz1 = this.c;
            ifd ifd = kfd.L;
            h.d(ifd, "FeatureIdentifiers.BOTTOM_NAVIGATION");
            String name = ifd.getName();
            if (g == null || (str = g.toString()) == null) {
                str = "";
            }
            jz1.a(new fa1(null, name, str, "tabbar", (long) i, cVar, "hit", "tab-selected", (double) this.b.d()));
        }
    }
}
