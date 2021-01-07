package defpackage;

import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.functions.l;

/* renamed from: rc3  reason: default package */
public final /* synthetic */ class rc3 implements l {
    public static final /* synthetic */ rc3 a = new rc3();

    private /* synthetic */ rc3() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return ((SessionState) obj).currentUser();
    }
}
