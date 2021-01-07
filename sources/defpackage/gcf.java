package defpackage;

import com.google.common.base.MoreObjects;
import com.spotify.libs.connect.volume.controllers.p;
import defpackage.kef;
import io.reactivex.functions.a;

/* renamed from: gcf  reason: default package */
public final /* synthetic */ class gcf implements a {
    public final /* synthetic */ kef.r a;
    public final /* synthetic */ p b;

    public /* synthetic */ gcf(kef.r rVar, p pVar) {
        this.a = rVar;
        this.b = pVar;
    }

    @Override // io.reactivex.functions.a
    public final void run() {
        kef.r rVar = this.a;
        p pVar = this.b;
        MoreObjects.checkArgument(true, "min (%s) must be less than or equal to max (%s)", (Object) Float.valueOf(0.0f), (Object) Float.valueOf(10.0f));
        pVar.g(Float.valueOf(Math.min(Math.max((float) rVar.t(), 0.0f), 10.0f) / 10.0f));
    }
}
