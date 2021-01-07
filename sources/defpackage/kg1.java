package defpackage;

import com.spotify.playlist.models.i;
import io.reactivex.functions.l;

/* renamed from: kg1  reason: default package */
public final /* synthetic */ class kg1 implements l {
    public final /* synthetic */ si1 a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ kg1(si1 si1, boolean z) {
        this.a = si1;
        this.b = z;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.c(this.b, (i) obj);
    }
}
