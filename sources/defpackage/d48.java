package defpackage;

import defpackage.x38;
import io.reactivex.functions.l;

/* renamed from: d48  reason: default package */
public final /* synthetic */ class d48 implements l {
    public final /* synthetic */ com.spotify.music.connection.l a;
    public final /* synthetic */ l38 b;
    public final /* synthetic */ g48 c;

    public /* synthetic */ d48(com.spotify.music.connection.l lVar, l38 l38, g48 g48) {
        this.a = lVar;
        this.b = l38;
        this.c = g48;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        x38.a aVar = (x38.a) obj;
        return this.a.b().W(new e48(this.b, this.c), false, Integer.MAX_VALUE);
    }
}
