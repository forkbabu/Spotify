package defpackage;

import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.functions.n;

/* renamed from: wn1  reason: default package */
public final /* synthetic */ class wn1 implements n {
    public static final /* synthetic */ wn1 a = new wn1();

    private /* synthetic */ wn1() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        return ((SessionState) obj).connected();
    }
}
