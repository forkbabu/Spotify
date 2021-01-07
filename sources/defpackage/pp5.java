package defpackage;

import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.functions.l;

/* renamed from: pp5  reason: default package */
public final /* synthetic */ class pp5 implements l {
    public static final /* synthetic */ pp5 a = new pp5();

    private /* synthetic */ pp5() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return Boolean.valueOf(((SessionState) obj).connected());
    }
}
