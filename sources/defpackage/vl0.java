package defpackage;

import com.facebook.q;
import com.google.common.base.MoreObjects;
import defpackage.yl0;
import io.reactivex.functions.l;
import org.json.JSONObject;

/* renamed from: vl0  reason: default package */
public final /* synthetic */ class vl0 implements l {
    public static final /* synthetic */ vl0 a = new vl0();

    private /* synthetic */ vl0() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        q qVar = (q) obj;
        JSONObject f = qVar.f();
        if (f == null || MoreObjects.isNullOrEmpty(f.optString("id"))) {
            return new yl0.a(qVar.e().toString());
        }
        return new yl0.c(f);
    }
}
