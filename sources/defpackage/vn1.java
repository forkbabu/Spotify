package defpackage;

import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.functions.l;

/* renamed from: vn1  reason: default package */
public final /* synthetic */ class vn1 implements l {
    public static final /* synthetic */ vn1 a = new vn1();

    private /* synthetic */ vn1() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return Boolean.valueOf(((SessionState) obj).connected());
    }
}
