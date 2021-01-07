package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.rxjava2.r;
import com.spotify.rxjava2.y;
import io.reactivex.s;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: dv0  reason: default package */
public class dv0 {
    private final Map<String, r<?>> a = new ConcurrentHashMap();

    public /* synthetic */ void a(String str) {
        this.a.remove(str);
    }

    public <T> s<T> b(String str, s<T> sVar) {
        r<?> rVar = new r<>(str, sVar);
        StringBuilder V0 = je.V0(str);
        V0.append(Integer.toHexString(rVar.hashCode()));
        String sb = V0.toString();
        this.a.put(sb, rVar);
        Logger.b("Profiling %s", sb);
        return s.y(rVar).I(new cv0(this, sb));
    }

    public synchronized List<y> c() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (r<?> rVar : this.a.values()) {
            arrayList.addAll(rVar.a());
        }
        this.a.clear();
        return arrayList;
    }
}
