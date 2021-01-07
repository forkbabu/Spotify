package defpackage;

import android.content.Context;
import android.view.View;
import com.spotify.mobile.android.ui.contextmenu.ContextMenuFragment;
import com.spotify.mobile.android.ui.contextmenu.b4;
import com.spotify.music.libs.viewuri.c;

/* renamed from: n42  reason: default package */
public final /* synthetic */ class n42 implements View.OnClickListener {
    public final /* synthetic */ Context a;
    public final /* synthetic */ b4 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ c f;

    public /* synthetic */ n42(Context context, b4 b4Var, Object obj, c cVar) {
        this.a = context;
        this.b = b4Var;
        this.c = obj;
        this.f = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Context context = this.a;
        b4 b4Var = this.b;
        Object obj = this.c;
        c cVar = this.f;
        int i = ContextMenuFragment.J0;
        ContextMenuFragment.f5(b4Var.p0(obj), (androidx.fragment.app.c) context, cVar);
    }
}
