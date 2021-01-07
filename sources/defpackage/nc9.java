package defpackage;

import com.spotify.music.features.yourlibrary.musicpages.filtertags.loader.b;
import io.reactivex.functions.l;
import io.reactivex.s;

/* renamed from: nc9  reason: default package */
public final /* synthetic */ class nc9 implements l {
    public final /* synthetic */ b a;
    public final /* synthetic */ lb9 b;
    public final /* synthetic */ s c;

    public /* synthetic */ nc9(b bVar, lb9 lb9, s sVar) {
        this.a = bVar;
        this.b = lb9;
        this.c = sVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        b bVar = this.a;
        lb9 lb9 = this.b;
        return bVar.a(((Integer) obj).intValue()).v(new hc9(this.c, lb9)).j0(fc9.a).r0(cc9.a);
    }
}
