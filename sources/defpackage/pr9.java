package defpackage;

import com.spotify.remoteconfig.a6;
import io.reactivex.z;
import java.util.List;

/* renamed from: pr9  reason: default package */
public class pr9 implements or9 {
    private final a6 a;
    private final ps9 b;

    pr9(a6 a6Var, ps9 ps9) {
        this.a = a6Var;
        this.b = ps9;
    }

    @Override // defpackage.or9
    public z<List<us9>> a() {
        return this.b.a("homething");
    }

    @Override // defpackage.or9
    public boolean b() {
        return this.a.a();
    }
}
