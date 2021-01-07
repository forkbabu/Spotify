package defpackage;

import com.google.common.collect.Collections2;
import com.spotify.mobius.e0;
import com.spotify.voice.results.model.e;
import defpackage.eve;
import defpackage.vue;
import java.util.ArrayList;

/* renamed from: hue  reason: default package */
public final /* synthetic */ class hue implements ti0 {
    public final /* synthetic */ dve a;

    public /* synthetic */ hue(dve dve) {
        this.a = dve;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        dve dve = this.a;
        ugf s = ((vue.i) obj).s();
        eve l = dve.l();
        l.getClass();
        if (!(l instanceof eve.c)) {
            return e0.h();
        }
        eve l2 = dve.l();
        l2.getClass();
        e n = ((eve.c) l2).n();
        ArrayList newArrayList = Collections2.newArrayList(n.c());
        boolean z = false;
        for (int i = 0; i < newArrayList.size(); i++) {
            e.a aVar = (e.a) newArrayList.get(i);
            if (z || !vgf.a(aVar, s)) {
                newArrayList.set(i, aVar.k(false));
            } else {
                newArrayList.set(i, aVar.k(true));
                z = true;
            }
        }
        return e0.f(dve.y(eve.c(e.b(n.f(), newArrayList, n.e()))));
    }
}
