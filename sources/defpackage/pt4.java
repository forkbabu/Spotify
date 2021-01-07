package defpackage;

import io.reactivex.functions.c;
import java.util.Collections;
import java.util.List;

/* renamed from: pt4  reason: default package */
public final /* synthetic */ class pt4 implements c {
    public static final /* synthetic */ pt4 a = new pt4();

    private /* synthetic */ pt4() {
    }

    @Override // io.reactivex.functions.c
    public final Object a(Object obj, Object obj2) {
        return ((Boolean) obj).booleanValue() ? Collections.emptyList() : (List) obj2;
    }
}
