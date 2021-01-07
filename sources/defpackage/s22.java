package defpackage;

import com.spotify.mobile.android.ui.contextmenu.y3;
import com.spotify.playlist.models.b;
import io.reactivex.functions.l;
import java.util.Map;

/* renamed from: s22  reason: default package */
public final /* synthetic */ class s22 implements l {
    public final /* synthetic */ y3 a;

    public /* synthetic */ s22(y3 y3Var) {
        this.a = y3Var;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return (b) ((Map) obj).get(this.a.j());
    }
}
