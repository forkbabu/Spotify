package defpackage;

import android.content.Context;
import com.squareup.picasso.Picasso;
import defpackage.ved;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;
import io.reactivex.y;

/* renamed from: oed  reason: default package */
public final /* synthetic */ class oed implements w {
    public final /* synthetic */ y a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ Picasso c;
    public final /* synthetic */ ved.a d;

    public /* synthetic */ oed(y yVar, Context context, Picasso picasso, ved.a aVar) {
        this.a = yVar;
        this.b = context;
        this.c = picasso;
        this.d = aVar;
    }

    @Override // io.reactivex.w
    public final v apply(s sVar) {
        y yVar = this.a;
        return sVar.o0(yVar).J0(new led(this.b, this.c, this.d, yVar)).j0(sed.a);
    }
}
