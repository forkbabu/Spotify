package defpackage;

import io.reactivex.functions.g;

/* renamed from: erb  reason: default package */
public final /* synthetic */ class erb implements g {
    public final /* synthetic */ grb a;

    public /* synthetic */ erb(grb grb) {
        this.a = grb;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        grb.a(this.a, ((Integer) obj).intValue());
    }
}
