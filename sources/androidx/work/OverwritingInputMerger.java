package androidx.work;

import androidx.work.d;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public final class OverwritingInputMerger extends g {
    @Override // androidx.work.g
    public d b(List<d> list) {
        d.a aVar = new d.a();
        HashMap hashMap = new HashMap();
        for (d dVar : list) {
            hashMap.putAll(Collections.unmodifiableMap(dVar.a));
        }
        aVar.c(hashMap);
        return aVar.a();
    }
}
