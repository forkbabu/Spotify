package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.l;

/* renamed from: m9a  reason: default package */
public final /* synthetic */ class m9a implements l {
    public static final /* synthetic */ m9a a = new m9a();

    private /* synthetic */ m9a() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        int i = faa.e;
        Logger.e((Throwable) obj, "Error from endpoint getting user tracks", new Object[0]);
        return ni0.a();
    }
}
