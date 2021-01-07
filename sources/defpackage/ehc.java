package defpackage;

import android.app.Activity;
import com.spotify.mobile.android.ui.contextmenu.ContextMenuFragment;
import com.spotify.mobile.android.ui.contextmenu.b4;
import com.spotify.music.libs.viewuri.c;
import kotlin.jvm.internal.h;

/* renamed from: ehc  reason: default package */
public final class ehc implements chc {
    private final c a;
    private final Activity b;
    private final b4<msc> c;

    public ehc(c cVar, Activity activity, b4<msc> b4Var) {
        h.e(cVar, "viewUri");
        h.e(activity, "activity");
        h.e(b4Var, "contextmenuListener");
        this.a = cVar;
        this.b = activity;
        this.c = b4Var;
    }

    @Override // defpackage.chc
    public void a(msc msc) {
        h.e(msc, "model");
        ContextMenuFragment.b5(this.b, this.c, msc, this.a);
    }
}
