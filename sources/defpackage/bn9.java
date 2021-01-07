package defpackage;

import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.functions.l;

/* renamed from: bn9  reason: default package */
public final /* synthetic */ class bn9 implements l {
    public static final /* synthetic */ bn9 a = new bn9();

    private /* synthetic */ bn9() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return ((SessionState) obj).currentUserName();
    }
}
