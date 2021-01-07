package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.player.model.PlayerState;
import io.reactivex.g;
import io.reactivex.k;

/* renamed from: tl9  reason: default package */
public class tl9 implements k<PlayerState, PlayerState> {
    private static final SpSharedPreferences.b<Object, Long> c = SpSharedPreferences.b.e("freetier.precuration.dialog1");
    private final SpSharedPreferences<Object> a;
    private final cqe b;

    public tl9(SpSharedPreferences<Object> spSharedPreferences, cqe cqe) {
        this.a = spSharedPreferences;
        this.b = cqe;
    }

    /* Return type fixed from 'tpf' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [io.reactivex.g] */
    @Override // io.reactivex.k
    public tpf<PlayerState> a(g<PlayerState> gVar) {
        return gVar.C(new il9(this));
    }

    public /* synthetic */ boolean b(PlayerState playerState) {
        SpSharedPreferences<Object> spSharedPreferences = this.a;
        SpSharedPreferences.b<Object, Long> bVar = c;
        if (this.b.d() < spSharedPreferences.j(bVar, 1800000) + 1800000) {
            return false;
        }
        SpSharedPreferences.a<Object> b2 = this.a.b();
        b2.e(bVar, this.b.d());
        b2.j();
        return true;
    }
}
