package defpackage;

import com.spotify.music.features.nowplayingbar.domain.c;
import com.spotify.music.features.nowplayingbar.domain.d;
import io.reactivex.e;
import io.reactivex.functions.l;
import io.reactivex.internal.operators.completable.i;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;
import io.reactivex.z;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
/* renamed from: zs5  reason: default package */
public final class zs5<Upstream, Downstream> implements w<c.a, d> {
    final /* synthetic */ com.spotify.player.controls.d a;

    /* renamed from: zs5$a */
    static final class a<T, R> implements l<c.a, e> {
        final /* synthetic */ zs5 a;

        a(zs5 zs5) {
            this.a = zs5;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public e apply(c.a aVar) {
            c.a aVar2 = aVar;
            h.e(aVar2, "it");
            z<zwd> a2 = this.a.a.a(aVar2.a());
            a2.getClass();
            return new i(a2);
        }
    }

    zs5(com.spotify.player.controls.d dVar) {
        this.a = dVar;
    }

    @Override // io.reactivex.w
    public final v<d> apply(s<c.a> sVar) {
        h.e(sVar, "controlPlayerEffect");
        return sVar.Y(new a(this)).N();
    }
}
