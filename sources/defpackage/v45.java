package defpackage;

import com.google.common.base.Optional;
import defpackage.t45;
import io.reactivex.functions.h;
import java.util.ArrayList;

/* renamed from: v45  reason: default package */
public final /* synthetic */ class v45 implements h {
    public static final /* synthetic */ v45 a = new v45();

    private /* synthetic */ v45() {
    }

    @Override // io.reactivex.functions.h
    public final Object a(Object obj, Object obj2, Object obj3) {
        int i = a55.o;
        t45.a a2 = t45.a();
        a2.a((String) ((Optional) obj2).orNull());
        a2.c((ArrayList) obj);
        a2.d(((Boolean) obj3).booleanValue());
        return a2.build();
    }
}
