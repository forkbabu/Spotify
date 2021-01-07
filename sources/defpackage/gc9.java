package defpackage;

import com.spotify.music.features.yourlibrary.musicpages.filtertags.loader.b;
import defpackage.wb9;
import io.reactivex.functions.l;
import io.reactivex.s;

/* renamed from: gc9  reason: default package */
public final /* synthetic */ class gc9 implements l {
    public final /* synthetic */ lf9 a;
    public final /* synthetic */ b b;
    public final /* synthetic */ lb9 c;
    public final /* synthetic */ s f;

    public /* synthetic */ gc9(lf9 lf9, b bVar, lb9 lb9, s sVar) {
        this.a = lf9;
        this.b = bVar;
        this.c = lb9;
        this.f = sVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        wb9.b bVar = (wb9.b) obj;
        return this.a.a(true).Q(mc9.a).j0(ac9.a).W(new nc9(this.b, this.c, this.f), false, Integer.MAX_VALUE);
    }
}
