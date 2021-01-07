package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: al5  reason: default package */
public final /* synthetic */ class al5 implements g {
    public static final /* synthetic */ al5 a = new al5();

    private /* synthetic */ al5() {
    }

    /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x0010: APUT  (r0v1 java.lang.Object[]), (0 ??[int, short, byte, char]), (r2v0 java.lang.Object) */
    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        b91 b91 = (b91) obj;
        Object[] objArr = new Object[2];
        Object obj2 = "NULL";
        objArr[0] = b91 != null ? b91.id() : obj2;
        if (b91 != null) {
            obj2 = Integer.valueOf(b91.body().size());
        }
        objArr[1] = obj2;
        Logger.b("HomeLoad: fetch(). Got after combineLatest HubsVM: id %s body.size %s", objArr);
    }
}
