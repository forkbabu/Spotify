package defpackage;

import defpackage.g60;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.h;

/* renamed from: z50  reason: default package */
public final class z50 implements g60 {
    private final Map<String, Pair<Integer, Integer>> a = new LinkedHashMap();

    @Override // defpackage.g60
    public void a(g60.a aVar) {
        h.e(aVar, "entry");
        Pair<Integer, Integer> pair = this.a.get(aVar.a());
        if (pair != null) {
            this.a.put(aVar.a(), new Pair<>(Integer.valueOf((pair.c().intValue() + aVar.c()) / 2), Integer.valueOf((pair.d().intValue() + aVar.b()) / 2)));
            return;
        }
        this.a.put(aVar.a(), new Pair<>(Integer.valueOf(aVar.c()), Integer.valueOf(aVar.b())));
    }

    @Override // defpackage.g60
    public g60.a get(String str) {
        h.e(str, "componentId");
        Pair<Integer, Integer> pair = this.a.get(str);
        if (pair != null) {
            return new g60.a(str, pair.c().intValue(), pair.d().intValue());
        }
        return new g60.a(str, 0, 0);
    }
}
