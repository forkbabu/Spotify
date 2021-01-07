package defpackage;

import io.reactivex.functions.g;
import java.util.List;

/* renamed from: ukd  reason: default package */
public final /* synthetic */ class ukd implements g {
    public final /* synthetic */ bld a;
    public final /* synthetic */ String b;

    public /* synthetic */ ukd(bld bld, String str) {
        this.a = bld;
        this.b = str;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.i(this.b, (List) obj);
    }
}
