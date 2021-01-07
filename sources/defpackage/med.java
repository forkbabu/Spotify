package defpackage;

import com.squareup.picasso.Picasso;
import com.squareup.picasso.f0;
import defpackage.ved;
import io.reactivex.a0;
import io.reactivex.c0;

/* renamed from: med  reason: default package */
public final /* synthetic */ class med implements c0 {
    public final /* synthetic */ ved.a a;
    public final /* synthetic */ Picasso b;
    public final /* synthetic */ int c;
    public final /* synthetic */ String f;

    public /* synthetic */ med(ved.a aVar, Picasso picasso, int i, String str) {
        this.a = aVar;
        this.b = picasso;
        this.c = i;
        this.f = str;
    }

    @Override // io.reactivex.c0
    public final void subscribe(a0 a0Var) {
        ved.a aVar = this.a;
        Picasso picasso = this.b;
        int i = this.c;
        String str = this.f;
        f0 f0Var = aVar.a;
        if (f0Var != null) {
            picasso.c(f0Var);
        }
        aVar.a = new ued(a0Var, i);
        picasso.m(str).o(aVar.a);
    }
}
