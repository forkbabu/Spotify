package defpackage;

import com.google.common.base.MoreObjects;
import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.functions.n;

/* renamed from: r14  reason: default package */
public final /* synthetic */ class r14 implements n {
    public static final /* synthetic */ r14 a = new r14();

    private /* synthetic */ r14() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        return !MoreObjects.isNullOrEmpty(((SessionState) obj).currentUserName());
    }
}
