package defpackage;

import android.content.Intent;
import com.spotify.mobile.android.service.session.e;
import io.reactivex.functions.a;

/* renamed from: jf0  reason: default package */
public final /* synthetic */ class jf0 implements a {
    public final /* synthetic */ nf0 a;
    public final /* synthetic */ e b;
    public final /* synthetic */ Intent c;

    public /* synthetic */ jf0(nf0 nf0, e eVar, Intent intent) {
        this.a = nf0;
        this.b = eVar;
        this.c = intent;
    }

    @Override // io.reactivex.functions.a
    public final void run() {
        this.a.c(this.b, this.c);
    }
}
