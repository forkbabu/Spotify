package defpackage;

import com.spotify.mobile.android.util.l0;
import com.spotify.pageloader.ObservableLoadable;
import com.spotify.pageloader.o0;
import io.reactivex.s;

/* renamed from: w87  reason: default package */
public class w87 implements v87 {
    private final s87 a;

    public w87(s87 s87) {
        this.a = s87;
    }

    @Override // defpackage.v87
    public o0<s<k87>> a(l0 l0Var) {
        return ObservableLoadable.a(this.a.a(l0Var));
    }
}
