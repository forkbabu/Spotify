package defpackage;

import android.content.Intent;
import com.spotify.mobile.android.service.session.e;
import io.reactivex.a;
import io.reactivex.functions.l;

/* renamed from: if0  reason: default package */
public final /* synthetic */ class if0 implements l {
    public final /* synthetic */ nf0 a;
    public final /* synthetic */ Intent b;

    public /* synthetic */ if0(nf0 nf0, Intent intent) {
        this.a = nf0;
        this.b = intent;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        nf0 nf0 = this.a;
        Intent intent = this.b;
        nf0.getClass();
        return a.u(new jf0(nf0, (e) obj, intent));
    }
}
