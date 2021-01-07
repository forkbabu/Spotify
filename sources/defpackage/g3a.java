package defpackage;

import android.content.Context;
import io.reactivex.functions.g;

/* renamed from: g3a  reason: default package */
public final /* synthetic */ class g3a implements g {
    public final /* synthetic */ q3a a;
    public final /* synthetic */ Context b;

    public /* synthetic */ g3a(q3a q3a, Context context) {
        this.a = q3a;
        this.b = context;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.b(this.b, (Boolean) obj);
    }
}
