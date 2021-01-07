package defpackage;

import defpackage.mg5;
import java.util.List;

/* renamed from: fg5  reason: default package */
public final /* synthetic */ class fg5 implements ti0 {
    public final /* synthetic */ kg5 a;
    public final /* synthetic */ List b;
    public final /* synthetic */ int c;
    public final /* synthetic */ String d;

    public /* synthetic */ fg5(kg5 kg5, List list, int i, String str) {
        this.a = kg5;
        this.b = list;
        this.c = i;
        this.d = str;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        return this.a.d(this.b, this.c, this.d, (mg5.b) obj);
    }
}
