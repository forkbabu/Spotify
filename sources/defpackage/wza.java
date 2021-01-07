package defpackage;

import com.spotify.searchview.proto.MainViewResponse;
import io.reactivex.functions.l;

/* renamed from: wza  reason: default package */
public final /* synthetic */ class wza implements l {
    public final /* synthetic */ tz0 a;

    public /* synthetic */ wza(tz0 tz0) {
        this.a = tz0;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        tz0 tz0 = this.a;
        return cza.a(tz0.b() != null ? tz0.b() : "", (MainViewResponse) obj);
    }
}
