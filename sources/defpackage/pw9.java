package defpackage;

import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.functions.l;

/* renamed from: pw9  reason: default package */
public final /* synthetic */ class pw9 implements l {
    public static final /* synthetic */ pw9 a = new pw9();

    private /* synthetic */ pw9() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return ((SessionState) obj).currentUser();
    }
}
