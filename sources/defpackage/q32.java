package defpackage;

import com.spotify.mobile.android.ui.contextmenu.y3;
import com.spotify.playlist.models.Show;
import io.reactivex.functions.l;

/* renamed from: q32  reason: default package */
public final /* synthetic */ class q32 implements l {
    public final /* synthetic */ y3 a;

    public /* synthetic */ q32(y3 y3Var) {
        this.a = y3Var;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return y3.b(this.a, (Show) obj);
    }
}
