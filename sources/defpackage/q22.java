package defpackage;

import com.spotify.mobile.android.ui.contextmenu.y3;
import com.spotify.mobile.android.ui.contextmenu.z3;
import com.spotify.music.libs.collection.model.a;
import io.reactivex.s;
import java.util.concurrent.TimeUnit;

/* renamed from: q22  reason: default package */
public final class q22 implements z3<a> {
    private final w7a b;

    public q22(w7a w7a) {
        this.b = w7a;
    }

    @Override // com.spotify.mobile.android.ui.contextmenu.z3
    public s<y3<a>> a(y3<a> y3Var) {
        w7a w7a = this.b;
        y3Var.e();
        return w7a.a(y3Var.j()).I(10, TimeUnit.SECONDS).A(new k22(y3Var)).A(new j22(y3Var)).P();
    }
}
