package defpackage;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.o;
import androidx.fragment.app.x;
import com.spotify.music.C0707R;
import com.spotify.music.nowplaying.core.modes.NowPlayingMode;
import io.reactivex.disposables.b;
import io.reactivex.g;
import io.reactivex.z;
import java.util.Map;

/* renamed from: av5  reason: default package */
public class av5 implements hv5 {
    private final o a;
    private final g<ev5> b;
    Map<NowPlayingMode, wlf<z<Fragment>>> c;
    wlf<z<Fragment>> f;
    private b n;
    private boolean o;

    public av5(o oVar, g<ev5> gVar) {
        this.b = gVar;
        this.a = oVar;
    }

    public static void b(av5 av5, Fragment fragment) {
        x i = av5.a.i();
        i.q(C0707R.id.now_playing_mini_container, fragment, "NowPlayingMiniTag");
        i.i();
    }

    @Override // defpackage.ahb
    public void a() {
        if (this.o) {
            this.n = this.b.J(new vu5(this)).C(new xu5(this)).subscribe(new tu5(this));
        }
    }

    @Override // defpackage.ahb
    public void c() {
    }

    public boolean d(Fragment fragment) {
        Fragment U = this.a.U("NowPlayingMiniTag");
        if ((U != null && U.getClass() == fragment.getClass()) || this.a.o0()) {
            return false;
        }
        return true;
    }

    @Override // defpackage.ahb
    public void e() {
        b bVar = this.n;
        if (bVar != null) {
            bVar.dispose();
        }
    }

    @Override // defpackage.ahb
    public void f(ViewGroup viewGroup) {
        boolean z = true;
        boolean z2 = q4.G(viewGroup, C0707R.id.now_playing_mini_container).getVisibility() == 0;
        this.o = z2;
        Fragment U = this.a.U("NowPlayingMiniTag");
        if (U == null || z2) {
            z = false;
        }
        if (z) {
            x i = this.a.i();
            i.p(U);
            i.i();
        }
    }
}
