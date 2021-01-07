package defpackage;

import android.os.Parcelable;
import com.spotify.music.navigation.t;
import io.reactivex.a;
import io.reactivex.internal.operators.completable.b;

/* renamed from: iw8  reason: default package */
final class iw8 implements hze {
    final /* synthetic */ nsb a;
    final /* synthetic */ t b;

    iw8(nsb nsb, t tVar) {
        this.a = nsb;
        this.b = tVar;
    }

    @Override // defpackage.hze
    public a a() {
        nsb nsb = this.a;
        nsb.getClass();
        return a.u(new fw8(nsb));
    }

    @Override // defpackage.hze
    public a b(String str) {
        return a.u(new ew8(this.b, str));
    }

    @Override // defpackage.hze
    public a c(String str, Parcelable parcelable) {
        return a.u(new ew8(this.b, str));
    }

    @Override // defpackage.hze
    public a dismiss() {
        return b.a;
    }
}
