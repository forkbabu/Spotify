package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobius.q;
import com.spotify.mobius.rx2.i;
import com.spotify.music.features.yourlibrary.musicpages.domain.s0;
import com.spotify.music.features.yourlibrary.musicpages.g1;
import com.spotify.music.settings.a;
import com.spotify.music.yourlibrary.interfaces.c;
import com.spotify.player.model.PlayerState;
import io.reactivex.g;
import io.reactivex.internal.operators.observable.v;
import io.reactivex.s;
import io.reactivex.y;

/* renamed from: sa9  reason: default package */
public final class sa9 {
    private static s<s0> a(g<PlayerState> gVar, y yVar) {
        gVar.getClass();
        return new v(gVar).j0(ma9.a).E().j0(pa9.a).o0(yVar);
    }

    private static s<s0> b(a aVar, y yVar) {
        return aVar.a().j0(ka9.a).E().o0(yVar).j0(ra9.a);
    }

    public static q<s0> c(g1 g1Var, j79 j79, g<PlayerState> gVar, a aVar, md9 md9, s<Boolean> sVar, y yVar) {
        oa9 oa9 = oa9.a;
        qa9 qa9 = qa9.a;
        Optional<c> i2 = j79.i2();
        if (i2.isPresent()) {
            return i.a(g1Var.b().o0(yVar), b(aVar, yVar), md9.b().E().o0(yVar).j0(qa9), a(gVar, yVar), i2.get().f().E().j0(na9.a).o0(yVar), i2.get().f().j0(la9.a).E().j0(ja9.a).o0(yVar), sVar.o0(yVar).j0(oa9));
        }
        return i.a(g1Var.b().o0(yVar), b(aVar, yVar), md9.b().E().o0(yVar).j0(qa9), a(gVar, yVar), sVar.o0(yVar).j0(oa9));
    }
}
