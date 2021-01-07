package defpackage;

import android.content.Context;
import com.squareup.picasso.Picasso;
import defpackage.hed;
import defpackage.ved;
import io.reactivex.functions.l;
import io.reactivex.s;
import io.reactivex.y;
import io.reactivex.z;
import java.util.concurrent.TimeUnit;

/* renamed from: led  reason: default package */
public final /* synthetic */ class led implements l {
    public final /* synthetic */ Context a;
    public final /* synthetic */ Picasso b;
    public final /* synthetic */ ved.a c;
    public final /* synthetic */ y f;

    public /* synthetic */ led(Context context, Picasso picasso, ved.a aVar, y yVar) {
        this.a = context;
        this.b = picasso;
        this.c = aVar;
        this.f = yVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Context context = this.a;
        Picasso picasso = this.b;
        ved.a aVar = this.c;
        y yVar = this.f;
        hed.a aVar2 = (hed.a) obj;
        int color = context.getResources().getColor(mdd.a(aVar2.a()));
        if (!aVar2.b().isPresent()) {
            return s.i0(Integer.valueOf(color));
        }
        return z.g(new med(aVar, picasso, color, aVar2.b().get())).K(5, TimeUnit.SECONDS, yVar, z.z(Integer.valueOf(color))).P();
    }
}
