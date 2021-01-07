package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: qt1  reason: default package */
public final /* synthetic */ class qt1 implements g {
    public static final /* synthetic */ qt1 a = new qt1();

    private /* synthetic */ qt1() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.d("Error multimedia streaming card data: %s", ((Throwable) obj).getMessage());
    }
}
