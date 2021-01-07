package defpackage;

import com.spotify.playlist.endpoints.d;
import io.reactivex.functions.l;

/* renamed from: si3  reason: default package */
public final /* synthetic */ class si3 implements l {
    public final /* synthetic */ gj3 a;
    public final /* synthetic */ String b;

    public /* synthetic */ si3(gj3 gj3, String str) {
        this.a = gj3;
        this.b = str;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.x(this.b, (d.c) obj);
    }
}
