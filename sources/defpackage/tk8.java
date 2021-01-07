package defpackage;

import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.functions.l;

/* renamed from: tk8  reason: default package */
public final /* synthetic */ class tk8 implements l {
    public static final /* synthetic */ tk8 a = new tk8();

    private /* synthetic */ tk8() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return ((SessionState) obj).currentUserName();
    }
}
