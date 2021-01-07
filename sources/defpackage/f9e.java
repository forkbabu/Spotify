package defpackage;

import com.google.common.base.Optional;
import com.spotify.music.C0707R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: f9e  reason: default package */
public final class f9e implements fjf<List<o8e>> {
    private final wlf<Set<Map.Entry<Integer, o8e>>> a;
    private final wlf<Optional<g6e>> b;

    public f9e(wlf<Set<Map.Entry<Integer, o8e>>> wlf, wlf<Optional<g6e>> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    public static List<o8e> a(Set<Map.Entry<Integer, o8e>> set, Optional<g6e> optional) {
        o8e o8e;
        LinkedHashMap linkedHashMap = new LinkedHashMap(set.size());
        for (Map.Entry<Integer, o8e> entry : set) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        ArrayList arrayList = new ArrayList();
        for (Integer num : p8e.a) {
            int intValue = num.intValue();
            if ((intValue != C0707R.id.share_app_download || optional.isPresent()) && (o8e = (o8e) linkedHashMap.get(Integer.valueOf(intValue))) != null) {
                arrayList.add(o8e);
            }
        }
        return arrayList;
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get(), this.b.get());
    }
}
