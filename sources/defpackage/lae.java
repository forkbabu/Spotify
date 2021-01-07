package defpackage;

import defpackage.mae;
import java.util.Comparator;

/* renamed from: lae  reason: default package */
public final /* synthetic */ class lae implements Comparator {
    public static final /* synthetic */ lae a = new lae();

    private /* synthetic */ lae() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        mae.a aVar = (mae.a) obj;
        mae.a aVar2 = (mae.a) obj2;
        int i = mae.c;
        int i2 = aVar.c - aVar2.c;
        return i2 == 0 ? aVar.f - aVar2.f : i2;
    }
}
