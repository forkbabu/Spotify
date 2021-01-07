package defpackage;

import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.functions.l;

/* renamed from: tk1  reason: default package */
public final /* synthetic */ class tk1 implements l {
    public static final /* synthetic */ tk1 a = new tk1();

    private /* synthetic */ tk1() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return ((SessionState) obj).currentUser();
    }
}
