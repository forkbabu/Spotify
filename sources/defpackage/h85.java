package defpackage;

import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.util.t;
import com.spotify.mobile.android.util.v;
import io.reactivex.g;
import java.util.Map;
import java.util.TreeSet;

/* renamed from: h85  reason: default package */
public class h85 {
    private final v a;
    private final t b;
    private final vxd c;
    private final rf3 d;

    public h85(v vVar, t tVar, vxd vxd, rf3 rf3) {
        this.a = vVar;
        this.b = tVar;
        this.c = vxd;
        this.d = rf3;
    }

    public static ImmutableMap b(h85 h85, Map map) {
        h85.getClass();
        ImmutableMap.Builder builder = ImmutableMap.builder();
        if (!map.isEmpty()) {
            builder.putAll(map);
        }
        String b2 = h85.a.b();
        String bool = Boolean.toString(h85.b.e());
        builder.mo51put("device_id", b2);
        builder.mo51put("purchase_allowed", bool);
        if (!h85.c.isEmpty()) {
            TreeSet treeSet = new TreeSet(h85.c.b());
            StringBuilder V0 = je.V0("ondemand:");
            V0.append(Joiner.on(",").join(treeSet));
            builder.mo51put("signal", V0.toString());
        }
        return builder.build();
    }

    public g<Map<String, String>> a() {
        return this.d.a().O(new f85(this));
    }
}
