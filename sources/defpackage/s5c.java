package defpackage;

import com.spotify.nowplaying.core.orientation.Orientation;
import io.reactivex.functions.l;

/* renamed from: s5c  reason: default package */
public final /* synthetic */ class s5c implements l {
    public final /* synthetic */ Orientation a;

    public /* synthetic */ s5c(Orientation orientation) {
        this.a = orientation;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return Boolean.valueOf(((Boolean) obj).booleanValue() || this.a == Orientation.LANDSCAPE);
    }
}
