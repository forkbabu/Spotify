package defpackage;

import com.spotify.mobius.e0;
import defpackage.uue;
import defpackage.vue;

/* renamed from: rue  reason: default package */
public final /* synthetic */ class rue implements ti0 {
    public final /* synthetic */ dve a;

    public /* synthetic */ rue(dve dve) {
        this.a = dve;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        dve dve = this.a;
        String s = ((vue.a) obj).s();
        return e0.g(dve.z(s), z42.l(new uue.c(dve.j().i(s))));
    }
}
