package com.spotify.music.features.followfeed.mobius.effecthandlers;

import android.content.Context;
import com.spotify.mobile.android.ui.contextmenu.ContextMenuFragment;
import com.spotify.mobile.android.ui.contextmenu.r3;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;
import defpackage.n22;
import defpackage.n25;
import io.reactivex.functions.g;
import kotlin.jvm.internal.h;

public final class b0 implements g<n25.k> {
    private final c a = ViewUris.e;
    private final Context b;
    private final l22 c;

    public b0(Context context, l22 l22) {
        h.e(context, "context");
        h.e(l22, "albumContextMenuBuilder");
        this.b = context;
        this.c = l22;
    }

    public static final r3 a(b0 b0Var, n25.k kVar) {
        n22.e d = b0Var.c.a(kVar.c(), kVar.b()).a(b0Var.a).g(true).c(true).d(kVar.a());
        d.e(kfd.d0);
        r3 b2 = d.b();
        h.d(b2, "albumContextMenuBuilder\n…FEED)\n            .fill()");
        return b2;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.g
    public void accept(n25.k kVar) {
        n25.k kVar2 = kVar;
        h.e(kVar2, "effect");
        Context context = this.b;
        a0 a0Var = new a0(new ShowEntityContextMenuEffectHandler$accept$1(this));
        c cVar = this.a;
        int i = ContextMenuFragment.J0;
        ContextMenuFragment.f5(a0Var.p0(kVar2), (androidx.fragment.app.c) context, cVar);
    }
}
