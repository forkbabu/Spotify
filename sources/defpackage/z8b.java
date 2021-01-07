package defpackage;

import com.google.common.base.Optional;
import io.reactivex.functions.c;

/* renamed from: z8b  reason: default package */
public final /* synthetic */ class z8b implements c {
    public static final /* synthetic */ z8b a = new z8b();

    private /* synthetic */ z8b() {
    }

    @Override // io.reactivex.functions.c
    public final Object a(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        Optional optional = (Optional) obj2;
        return (bool.booleanValue() || !optional.isPresent() || !((String) optional.get()).startsWith("opt-in-trial")) ? bool : Boolean.TRUE;
    }
}
