package defpackage;

import com.spotify.mobile.android.ui.contextmenu.y3;
import com.spotify.playlist.models.o;
import io.reactivex.functions.l;
import java.util.Map;

/* renamed from: z32  reason: default package */
public final /* synthetic */ class z32 implements l {
    public final /* synthetic */ y3 a;

    public /* synthetic */ z32(y3 y3Var) {
        this.a = y3Var;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return (o) ((Map) obj).get(this.a.j());
    }
}
