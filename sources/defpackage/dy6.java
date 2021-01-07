package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.l;
import io.reactivex.s;

/* renamed from: dy6  reason: default package */
public final /* synthetic */ class dy6 implements l {
    public final /* synthetic */ String a;

    public /* synthetic */ dy6(String str) {
        this.a = str;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        String str = this.a;
        Logger.e((Throwable) obj, "Failed to load web token for abuse url. Skip token.", new Object[0]);
        return s.i0(str);
    }
}
