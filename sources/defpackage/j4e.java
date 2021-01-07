package defpackage;

import com.spotify.share.base.linkgeneration.proto.CustomData;
import com.spotify.share.base.linkgeneration.proto.GenerateUrlRequest;
import com.spotify.share.base.linkgeneration.proto.UtmParameters;
import io.reactivex.z;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: j4e  reason: default package */
public class j4e implements x3e {
    private final i4e a;

    public j4e(i4e i4e) {
        this.a = i4e;
    }

    @Override // defpackage.x3e
    public z<w3e> a(b4e b4e) {
        String d = b4e.d();
        String b = b4e.b();
        UtmParameters e = b4e.e();
        Map<String, String> c = b4e.c();
        GenerateUrlRequest.b m = GenerateUrlRequest.m();
        m.n(d);
        if (e != null) {
            m.o(e);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (b != null) {
            linkedHashMap.put("context", b);
        }
        if (c != null) {
            linkedHashMap.putAll(c);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            CustomData.b l = CustomData.l();
            l.m((String) entry.getKey());
            l.n((String) entry.getValue());
            m.m((CustomData) l.build());
        }
        return this.a.a((GenerateUrlRequest) m.build()).A(d4e.a);
    }
}
