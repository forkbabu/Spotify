package defpackage;

import io.reactivex.disposables.b;
import io.reactivex.functions.g;
import java.util.List;

/* renamed from: pne  reason: default package */
public final /* synthetic */ class pne implements g {
    public final /* synthetic */ zne a;
    public final /* synthetic */ String b;
    public final /* synthetic */ List c;

    public /* synthetic */ pne(zne zne, String str, List list) {
        this.a = zne;
        this.b = str;
        this.c = list;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.c(this.b, this.c, (b) obj);
    }
}
