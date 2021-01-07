package defpackage;

import com.spotify.nowplaying.core.orientation.OrientationMode;
import io.reactivex.functions.l;

/* renamed from: i0c  reason: default package */
public final /* synthetic */ class i0c implements l {
    public final /* synthetic */ boolean a;

    public /* synthetic */ i0c(boolean z) {
        this.a = z;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return (((Boolean) obj).booleanValue() || this.a) ? OrientationMode.UNSPECIFIED : OrientationMode.PORTRAIT_ONLY;
    }
}
