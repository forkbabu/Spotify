package defpackage;

import com.spotify.mobile.android.ui.contextmenu.y3;
import com.spotify.mobile.android.ui.contextmenu.z3;
import com.spotify.playlist.models.b;
import io.reactivex.s;
import java.util.concurrent.TimeUnit;

/* renamed from: z22  reason: default package */
public final class z22 implements z3<b> {
    private final a8a b;

    public z22(a8a a8a) {
        this.b = a8a;
    }

    @Override // com.spotify.mobile.android.ui.contextmenu.z3
    public s<y3<b>> a(y3<b> y3Var) {
        return this.b.e(y3Var.e(), y3Var.j()).I(10, TimeUnit.SECONDS).A(new s22(y3Var)).A(new t22(y3Var)).P();
    }
}
