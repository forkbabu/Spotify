package defpackage;

import com.google.common.base.Function;
import com.google.common.collect.Collections2;
import defpackage.noe;
import io.reactivex.functions.l;
import io.reactivex.s;

/* renamed from: voe  reason: default package */
public final /* synthetic */ class voe implements l {
    public static final /* synthetic */ voe a = new voe();

    private /* synthetic */ voe() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        noe.b bVar = (noe.b) obj;
        return s.d0(Collections2.transform((Iterable) bVar.b(), (Function) new uoe(bVar)));
    }
}
