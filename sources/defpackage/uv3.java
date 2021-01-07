package defpackage;

import com.spotify.mobile.android.util.l0;
import io.reactivex.functions.l;
import java.util.Map;

/* renamed from: uv3  reason: default package */
public final /* synthetic */ class uv3 implements l {
    public final /* synthetic */ zv3 a;
    public final /* synthetic */ l0 b;

    public /* synthetic */ uv3(zv3 zv3, l0 l0Var) {
        this.a = zv3;
        this.b = l0Var;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.b(this.b, (Map) obj);
    }
}
