package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import io.reactivex.h;
import io.reactivex.i;

/* renamed from: dhd  reason: default package */
public final /* synthetic */ class dhd implements i {
    public final /* synthetic */ ihd a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ ViewGroup c;

    public /* synthetic */ dhd(ihd ihd, Context context, ViewGroup viewGroup) {
        this.a = ihd;
        this.b = context;
        this.c = viewGroup;
    }

    @Override // io.reactivex.i
    public final void subscribe(h hVar) {
        this.a.b(this.b, this.c, hVar);
    }
}
