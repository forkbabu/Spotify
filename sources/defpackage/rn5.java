package defpackage;

import android.net.Uri;
import com.google.common.base.Joiner;
import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import defpackage.pn5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: rn5  reason: default package */
public abstract class rn5 {

    /* renamed from: rn5$a */
    public interface a {
        a a(Optional<ane> optional);

        a b(String str);

        rn5 build();

        a c(boolean z);

        a d(List<String> list);

        a e(List<String> list);

        a f(List<String> list);
    }

    public static a a() {
        pn5.b bVar = new pn5.b();
        bVar.a(Optional.absent());
        pn5.b bVar2 = bVar;
        bVar2.e(Collections.emptyList());
        pn5.b bVar3 = bVar2;
        bVar3.d(Collections.emptyList());
        pn5.b bVar4 = bVar3;
        bVar4.f(Collections.emptyList());
        pn5.b bVar5 = bVar4;
        bVar5.c(false);
        return bVar5;
    }

    public abstract List<String> b();

    public abstract List<String> c();

    public Map<String, String> d() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(10);
        Optional<ane> e = e();
        linkedHashMap.put("sort", e.isPresent() ? bne.b(e.get()) : "");
        String f = f();
        ArrayList arrayList = new ArrayList(c());
        if (!MoreObjects.isNullOrEmpty(f)) {
            StringBuilder V0 = je.V0("text contains ");
            V0.append(Uri.encode(f));
            arrayList.add(V0.toString());
        }
        linkedHashMap.put("filter", Joiner.on(',').join(arrayList));
        linkedHashMap.put("tracksFilter", Joiner.on(',').join(h()));
        if (i()) {
            linkedHashMap.put("waitForScanner", String.valueOf(true));
        }
        List<String> b = b();
        if (!b.isEmpty()) {
            StringBuilder sb = new StringBuilder(10);
            for (int i = 0; i < b.size(); i++) {
                if (i > 0) {
                    sb.append(',');
                }
                sb.append(Uri.encode(b.get(i)));
            }
            linkedHashMap.put("excludedPaths", sb.toString());
        }
        return linkedHashMap;
    }

    public abstract Optional<ane> e();

    public abstract String f();

    public abstract a g();

    public abstract List<String> h();

    public abstract boolean i();
}
