package defpackage;

import com.spotify.mobile.android.ui.contextmenu.y3;
import com.spotify.mobile.android.ui.contextmenu.z3;
import com.spotify.playlist.models.Show;
import io.reactivex.s;
import java.util.concurrent.TimeUnit;

/* renamed from: w32  reason: default package */
public final class w32 implements z3<Show> {
    private final ona b;

    public w32(ona ona) {
        this.b = ona;
    }

    @Override // com.spotify.mobile.android.ui.contextmenu.z3
    public s<y3<Show>> a(y3<Show> y3Var) {
        String j = y3Var.j();
        return this.b.e(y3Var.e(), j).I(10, TimeUnit.SECONDS).A(new p32(j)).A(new q32(y3Var)).P();
    }
}
