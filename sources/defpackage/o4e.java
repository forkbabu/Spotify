package defpackage;

import android.net.Uri;
import com.google.common.base.MoreObjects;
import com.google.common.io.BaseEncoding;
import com.spotify.share.base.linkgeneration.proto.UtmParameters;
import io.reactivex.z;
import java.nio.ByteBuffer;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;

/* renamed from: o4e  reason: default package */
public class o4e implements x3e {
    private final a a;
    private final c4e b;

    /* renamed from: o4e$a */
    public static class a {
    }

    public o4e(a aVar, c4e c4e) {
        this.a = aVar;
        this.b = c4e;
    }

    @Override // defpackage.x3e
    public z<w3e> a(b4e b4e) {
        return z.y(new h4e(this, b4e));
    }

    public w3e b(b4e b4e) {
        this.a.getClass();
        UUID randomUUID = UUID.randomUUID();
        ByteBuffer wrap = ByteBuffer.wrap(new byte[16]);
        wrap.putLong(randomUUID.getMostSignificantBits());
        wrap.putLong(randomUUID.getLeastSignificantBits());
        String encode = BaseEncoding.base64Url().omitPadding().encode(wrap.array());
        String a2 = this.b.a(b4e.d());
        if (a2 != null) {
            String b2 = b4e.b();
            UtmParameters e = b4e.e();
            Map<String, String> c = b4e.c();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("si", encode);
            if (!MoreObjects.isNullOrEmpty(b2)) {
                linkedHashMap.put("context", b2);
            }
            if (e != null) {
                if (!MoreObjects.isNullOrEmpty(e.r())) {
                    linkedHashMap.put("utm_source", e.r());
                }
                if (!MoreObjects.isNullOrEmpty(e.q())) {
                    linkedHashMap.put("utm_medium", e.q());
                }
                if (!MoreObjects.isNullOrEmpty(e.o())) {
                    linkedHashMap.put("utm_campaign", e.o());
                }
                if (!MoreObjects.isNullOrEmpty(e.p())) {
                    linkedHashMap.put("utm_content", e.p());
                }
                if (!MoreObjects.isNullOrEmpty(e.s())) {
                    linkedHashMap.put("utm_term", e.s());
                }
            }
            if (c != null) {
                for (Map.Entry<String, String> entry : c.entrySet()) {
                    if (!MoreObjects.isNullOrEmpty(entry.getKey()) && !MoreObjects.isNullOrEmpty(entry.getValue()) && !linkedHashMap.containsKey(entry.getKey())) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
            }
            Uri.Builder buildUpon = Uri.parse(a2).buildUpon();
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                buildUpon.appendQueryParameter((String) entry2.getKey(), (String) entry2.getValue());
            }
            return w3e.a(buildUpon.build().toString(), encode, b4e.d());
        }
        StringBuilder V0 = je.V0("Invalid uri ");
        V0.append(b4e.d());
        throw new IllegalArgumentException(V0.toString());
    }
}
