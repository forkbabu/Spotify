package com.spotify.mobile.android.hubframework.defaults;

import android.content.Context;
import com.spotify.mobile.android.hubframework.defaults.components.common.HubsCommonComponent;
import com.spotify.mobile.android.hubframework.defaults.l;
import com.spotify.mobile.android.ui.contextmenu.v3;
import com.spotify.music.follow.m;
import com.spotify.music.libs.viewuri.c;
import defpackage.w51;
import java.util.Map;

public class v {
    private final ere a;
    private final f71 b;
    private final m c;
    private final j d;
    private final h e;
    private final t f;
    private final String g;

    public static class c {
        private final w51.b a;

        c(w51.b bVar, a aVar) {
            this.a = bVar;
        }

        @Deprecated
        public w51.b a(l.a aVar) {
            w51.b bVar = this.a;
            bVar.k(new l(aVar));
            return bVar;
        }

        public w51.b b() {
            return this.a;
        }
    }

    public v(ere ere, f71 f71, m mVar, j jVar, h hVar, t tVar, String str) {
        this.a = ere;
        this.b = f71;
        this.c = mVar;
        this.d = jVar;
        this.e = hVar;
        this.f = tVar;
        str.getClass();
        this.g = str;
    }

    public b a(Context context, c.a aVar) {
        w51.b bVar = new w51.b();
        bVar.c(h.a());
        bVar.m(HubsCommonComponent.i());
        bVar.k(h.c());
        bVar.k(new e());
        bVar.k(this.d);
        bVar.h(this.f);
        bVar.e(com.spotify.mobile.android.hubframework.defaults.fallbacks.b.b(aVar));
        bVar.d(com.spotify.mobile.android.hubframework.defaults.fallbacks.b.a(aVar));
        bVar.g(this.e.b(), d61.b(HubsCommonComponent.h()).a());
        return new b(context, bVar, aVar, this.a, this.b, this.c, this.g, null);
    }

    public static class b {
        private final Context a;
        private final w51.b b;
        private final c.a c;
        private final ere d;
        private final f71 e;
        private final m f;
        private final String g;

        private b(Context context, w51.b bVar, c.a aVar, ere ere, f71 f71, m mVar, String str) {
            this.a = context;
            this.b = bVar;
            this.c = aVar;
            this.d = ere;
            this.e = f71;
            this.f = mVar;
            str.getClass();
            this.g = str;
        }

        public c a(Map<String, a71> map) {
            w51.b bVar = this.b;
            int i = a71.h;
            x61 x61 = x61.a;
            int i2 = p61.a;
            bVar.b(z61.b(map, x61, g61.b));
            return new c(bVar, null);
        }

        public c b(v3 v3Var, p71 p71) {
            return a(this.e.a(this.a, v3Var, this.c, p71, this.d));
        }

        @Deprecated
        public b c(p71 p71) {
            l71 l71 = new l71(this.a, this.c, p71, this.f, this.g);
            Context context = this.a;
            w51.b bVar = this.b;
            bVar.f(l71);
            return new b(context, bVar, this.c, this.d, this.e, this.f, this.g);
        }

        b(Context context, w51.b bVar, c.a aVar, ere ere, f71 f71, m mVar, String str, a aVar2) {
            this.a = context;
            this.b = bVar;
            this.c = aVar;
            this.d = ere;
            this.e = f71;
            this.f = mVar;
            str.getClass();
            this.g = str;
        }
    }
}
