package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.l;

/* renamed from: u2b  reason: default package */
public final /* synthetic */ class u2b implements l {
    public final /* synthetic */ s7b a;

    public /* synthetic */ u2b(s7b s7b) {
        this.a = s7b;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        s7b s7b = this.a;
        Throwable th = (Throwable) obj;
        Logger.o(th, "Search offline request failed for query = %s", s7b.a());
        return d7b.e(s7b.a(), th);
    }
}
