package defpackage;

import com.google.common.base.Function;
import com.google.common.collect.Collections2;
import com.spotify.mobius.e0;
import com.spotify.voice.results.model.e;
import defpackage.eve;
import defpackage.uue;
import defpackage.vue;
import java.util.List;
import java.util.Set;

/* renamed from: lue  reason: default package */
public final /* synthetic */ class lue implements ti0 {
    public final /* synthetic */ dve a;

    public /* synthetic */ lue(dve dve) {
        this.a = dve;
    }

    /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x005e: APUT  (r2v4 uue[]), (0 ??[int, short, byte, char]), (r0v2 uue) */
    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        Set set;
        uue uue;
        dve dve = this.a;
        vue.l lVar = (vue.l) obj;
        eve l = dve.l();
        l.getClass();
        e n = ((eve.c) l).n();
        dve y = dve.y(eve.c(e.a(n.f(), Collections2.transform((List) n.c(), (Function) new gue(lVar)))));
        e.a s = lVar.s();
        if (s.f()) {
            uue[] uueArr = new uue[1];
            if (s.a()) {
                uue = new uue.d(s.g());
            } else {
                uue = new uue.k(dve.n(), s.h(), s.g());
            }
            uueArr[0] = uue;
            set = z42.l(uueArr);
        } else {
            set = z42.l(new uue.j(dve.n(), s.h()));
        }
        return e0.g(y, set);
    }
}
