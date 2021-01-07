package defpackage;

import com.spotify.music.nowplaying.common.view.contextmenu.o;
import io.reactivex.functions.l;

/* renamed from: jxb  reason: default package */
public final /* synthetic */ class jxb implements l {
    public static final /* synthetic */ jxb a = new jxb();

    private /* synthetic */ jxb() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        o.c.a a2 = o.c.a();
        a2.b(false);
        a2.c(true);
        a2.d(false);
        a2.f(false);
        a2.l(false);
        a2.i(booleanValue);
        a2.n(true);
        o.c a3 = a2.a();
        o.b.a a4 = o.b.a();
        a4.b(false);
        a4.c(false);
        a4.f(false);
        o.b a5 = a4.a();
        o.a a6 = o.a();
        a6.c(a3);
        a6.b(a5);
        return a6.a();
    }
}
