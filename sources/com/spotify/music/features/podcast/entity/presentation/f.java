package com.spotify.music.features.podcast.entity.presentation;

import android.app.Activity;
import com.spotify.mobile.android.ui.contextmenu.ContextMenuFragment;
import com.spotify.mobile.android.ui.contextmenu.r3;
import com.spotify.mobile.android.ui.contextmenu.s3;
import com.spotify.music.libs.viewuri.c;
import defpackage.t32;
import defpackage.zhc;

public class f implements xhc {
    private final s57 a;
    private final r32 b;
    private final c c;
    private final Activity d;
    private final boolean e;
    private final s3 f;

    public f(s57 s57, r32 r32, c cVar, Activity activity, boolean z, s3 s3Var) {
        this.a = s57;
        this.b = r32;
        this.c = cVar;
        this.d = activity;
        this.e = z;
        this.f = s3Var;
    }

    @Override // defpackage.xhc
    public void a(zhc.a aVar) {
        Activity activity = this.d;
        c cVar = this.c;
        int i = ContextMenuFragment.J0;
        ContextMenuFragment.f5(b(aVar, aVar), (androidx.fragment.app.c) activity, cVar);
        this.a.i();
    }

    public /* synthetic */ r3 b(zhc.a aVar, csc csc) {
        t32.b a2 = this.b.a(aVar.f(), aVar.e()).a(this.c);
        a2.d(false);
        a2.c(this.e);
        a2.g(this.f);
        return a2.b();
    }
}
