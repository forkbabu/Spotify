package defpackage;

import android.content.Context;
import com.spotify.mobile.android.ui.contextmenu.ContextMenuFragment;
import com.spotify.mobile.android.ui.contextmenu.b4;
import com.spotify.music.libs.viewuri.c;

/* renamed from: i42  reason: default package */
public class i42<T> {
    private final b4<T> a;
    private final T b;

    public i42(b4<T> b4Var, T t) {
        this.a = b4Var;
        this.b = t;
    }

    public void a(Context context, c cVar) {
        ContextMenuFragment.b5(context, this.a, this.b, cVar);
    }
}
