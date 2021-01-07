package defpackage;

import com.spotify.mobius.e0;
import com.spotify.music.C0707R;
import defpackage.uue;
import defpackage.vue;

/* renamed from: bue  reason: default package */
public final /* synthetic */ class bue implements ti0 {
    public final /* synthetic */ dve a;

    public /* synthetic */ bue(dve dve) {
        this.a = dve;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        dve dve = this.a;
        vue.n nVar = (vue.n) obj;
        dve y = dve.y(eve.g(!dve.g()));
        if (!dve.i() || !dve.h()) {
            return e0.g(y, z42.l(new uue.l(C0707R.raw.voice_earcon_listening)));
        }
        return e0.f(y);
    }
}
