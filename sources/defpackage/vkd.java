package defpackage;

import io.reactivex.functions.g;
import java.util.List;

/* renamed from: vkd  reason: default package */
public final /* synthetic */ class vkd implements g {
    public final /* synthetic */ bld a;
    public final /* synthetic */ String b;
    public final /* synthetic */ List c;

    public /* synthetic */ vkd(bld bld, String str, List list) {
        this.a = bld;
        this.b = str;
        this.c = list;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.h(this.b, this.c, (Boolean) obj);
    }
}
