package defpackage;

import com.spotify.player.controls.c;
import com.spotify.player.controls.d;
import defpackage.zwd;
import io.reactivex.functions.l;
import io.reactivex.z;

/* renamed from: f97  reason: default package */
public final /* synthetic */ class f97 implements l {
    public final /* synthetic */ d a;

    public /* synthetic */ f97(d dVar) {
        this.a = dVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        d dVar = this.a;
        zwd zwd = (zwd) obj;
        zwd.getClass();
        if (zwd instanceof zwd.b) {
            return dVar.a(c.e());
        }
        return z.z(zwd);
    }
}
