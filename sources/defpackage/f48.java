package defpackage;

import com.spotify.music.connection.l;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;

/* renamed from: f48  reason: default package */
public final /* synthetic */ class f48 implements w {
    public final /* synthetic */ l a;
    public final /* synthetic */ l38 b;
    public final /* synthetic */ g48 c;

    public /* synthetic */ f48(l lVar, l38 l38, g48 g48) {
        this.a = lVar;
        this.b = l38;
        this.c = g48;
    }

    @Override // io.reactivex.w
    public final v apply(s sVar) {
        return sVar.W(new d48(this.a, this.b, this.c), false, Integer.MAX_VALUE);
    }
}
