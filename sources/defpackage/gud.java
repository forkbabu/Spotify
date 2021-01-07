package defpackage;

import com.spotify.pageloader.NetworkErrorReason;
import com.spotify.pageloader.l0;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;
import io.reactivex.z;

/* renamed from: gud  reason: default package */
public class gud<T> implements w<l0<T>, l0<T>> {
    private final z<NetworkErrorReason> a;

    public gud(z<NetworkErrorReason> zVar) {
        this.a = zVar;
    }

    public z a(l0.d dVar) {
        Throwable i = dVar.i();
        NetworkErrorReason j = dVar.j();
        if (j != NetworkErrorReason.UNKNOWN) {
            return z.z(l0.f(i, j));
        }
        return this.a.A(new bud(i));
    }

    @Override // io.reactivex.w
    public v<l0<T>> apply(s<l0<T>> sVar) {
        return sVar.L0(new fud(this));
    }
}
