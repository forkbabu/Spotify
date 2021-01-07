package com.spotify.music.features.followfeed.mobius.effecthandlers;

import android.content.Context;
import com.spotify.mobile.android.ui.contextmenu.ContextMenuFragment;
import com.spotify.mobile.android.ui.contextmenu.r3;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;
import defpackage.d42;
import defpackage.n25;
import io.reactivex.functions.g;
import kotlin.jvm.internal.h;

public final class e0 implements g<n25.l> {
    private final c a = ViewUris.e;
    private final Context b;
    private final b42 c;

    public e0(Context context, b42 b42) {
        h.e(context, "context");
        h.e(b42, "contextMenuBuilder");
        this.b = context;
        this.c = b42;
    }

    public static final r3 a(e0 e0Var, n25.l lVar) {
        d42.f w = e0Var.c.a(lVar.c(), lVar.b(), e0Var.a.toString()).a(e0Var.a).t(lVar.a()).g(true).r(true).w(false);
        w.l(!lVar.a());
        w.e(kfd.d0);
        r3 b2 = w.b();
        h.d(b2, "contextMenuBuilder\n     …FEED)\n            .fill()");
        return b2;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.g
    public void accept(n25.l lVar) {
        n25.l lVar2 = lVar;
        h.e(lVar2, "effect");
        Context context = this.b;
        d0 d0Var = new d0(new ShowTrackContextMenuEffectHandler$accept$1(this));
        c cVar = this.a;
        int i = ContextMenuFragment.J0;
        ContextMenuFragment.f5(d0Var.p0(lVar2), (androidx.fragment.app.c) context, cVar);
    }
}
