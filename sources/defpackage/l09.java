package defpackage;

import com.squareup.picasso.Picasso;
import kotlin.jvm.internal.h;

/* renamed from: l09  reason: default package */
public final class l09 implements k09 {
    private final Picasso a;
    private final ngc b;
    private final etc c;

    public l09(Picasso picasso, ngc ngc, etc etc) {
        h.e(picasso, "picasso");
        h.e(ngc, "actionCardViewBinder");
        h.e(etc, "cardStateLogic");
        this.a = picasso;
        this.b = ngc;
        this.c = etc;
    }

    @Override // defpackage.k09
    public i09 a() {
        return new j09(this.a, this.b, this.c);
    }
}
