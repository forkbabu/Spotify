package defpackage;

import com.spotify.pageloader.l0;
import io.reactivex.functions.c;

/* renamed from: mud  reason: default package */
public final /* synthetic */ class mud implements c {
    public static final /* synthetic */ mud a = new mud();

    private /* synthetic */ mud() {
    }

    @Override // io.reactivex.functions.c
    public final Object a(Object obj, Object obj2) {
        l0 l0Var = (l0) obj;
        l0 l0Var2 = (l0) obj2;
        l0Var.getClass();
        if (!(l0Var instanceof l0.b) && !(l0Var instanceof l0.e)) {
            return l0Var2;
        }
        throw new IllegalStateException("mustn't change state again after completing loading");
    }
}
