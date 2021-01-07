package defpackage;

import com.spotify.music.carmode.navigation.domain.CarModeNavigationModel;
import com.spotify.music.carmode.navigation.domain.o;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.navigation.b;
import com.spotify.music.navigation.o;
import io.reactivex.functions.g;

/* renamed from: pm2  reason: default package */
public final /* synthetic */ class pm2 implements g {
    public final /* synthetic */ o a;
    public final /* synthetic */ b b;

    public /* synthetic */ pm2(o oVar, b bVar) {
        this.a = oVar;
        this.b = bVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        o oVar = this.a;
        b bVar = this.b;
        o.l lVar = (o.l) obj;
        if (!lVar.a().isPresent() || !lVar.a().get().C0()) {
            int ordinal = lVar.d().ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        vn2.a(ViewUris.l1.toString(), oVar, bVar, false);
                    }
                } else if (lVar.c() == CarModeNavigationModel.SearchType.VOICE) {
                    vn2.a(ViewUris.f2.toString(), oVar, bVar, false);
                } else {
                    vn2.a(ViewUris.n0.toString(), oVar, bVar, false);
                }
            } else if (lVar.b().booleanValue()) {
                vn2.a(ViewUris.C.toString(), oVar, bVar, false);
            } else {
                vn2.a(ViewUris.d.toString(), oVar, bVar, false);
            }
        }
    }
}
