package defpackage;

import com.spotify.nowplaying.core.orientation.OrientationMode;
import io.reactivex.functions.l;

/* renamed from: r5c  reason: default package */
public final /* synthetic */ class r5c implements l {
    public static final /* synthetic */ r5c a = new r5c();

    private /* synthetic */ r5c() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return ((Boolean) obj).booleanValue() ? OrientationMode.PORTRAIT_ONLY : OrientationMode.UNSPECIFIED;
    }
}
