package defpackage;

import com.spotify.mobile.android.ui.contextmenu.y3;
import com.spotify.mobile.android.ui.contextmenu.z3;
import com.spotify.playlist.models.o;
import io.reactivex.s;
import java.util.concurrent.TimeUnit;

/* renamed from: g42  reason: default package */
public final class g42 implements z3<o> {
    private final c8a b;

    public g42(d8a d8a) {
        this.b = d8a.create();
    }

    @Override // com.spotify.mobile.android.ui.contextmenu.z3
    public s<y3<o>> a(y3<o> y3Var) {
        return this.b.e(y3Var.e(), y3Var.j()).I(10, TimeUnit.SECONDS).A(new z32(y3Var)).A(new a42(y3Var)).P();
    }
}
