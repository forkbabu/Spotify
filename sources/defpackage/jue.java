package defpackage;

import com.spotify.mobius.e0;
import defpackage.vue;

/* renamed from: jue  reason: default package */
public final /* synthetic */ class jue implements ti0 {
    public final /* synthetic */ dve a;

    public /* synthetic */ jue(dve dve) {
        this.a = dve;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        eve eve;
        dve dve = this.a;
        vue.j jVar = (vue.j) obj;
        String t = jVar.t();
        if (jVar.s()) {
            eve = eve.b(t);
        } else {
            eve = eve.f(t);
        }
        return e0.f(dve.y(eve));
    }
}
