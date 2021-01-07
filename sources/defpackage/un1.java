package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.l;
import io.reactivex.internal.operators.observable.o;
import io.reactivex.s;

/* renamed from: un1  reason: default package */
public final /* synthetic */ class un1 implements l {
    public final /* synthetic */ s a;

    public /* synthetic */ un1(s sVar) {
        this.a = sVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        s sVar = this.a;
        Boolean bool = (Boolean) obj;
        Logger.b("Applying Flag. Value is:%s", bool);
        return bool.booleanValue() ? sVar : o.a;
    }
}
