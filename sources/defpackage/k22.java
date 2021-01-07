package defpackage;

import com.spotify.mobile.android.ui.contextmenu.y3;
import com.spotify.music.libs.collection.model.a;
import io.reactivex.functions.l;
import java.util.Map;

/* renamed from: k22  reason: default package */
public final /* synthetic */ class k22 implements l {
    public final /* synthetic */ y3 a;

    public /* synthetic */ k22(y3 y3Var) {
        this.a = y3Var;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return (a) ((Map) obj).get(this.a.j());
    }
}
