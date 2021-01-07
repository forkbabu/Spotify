package defpackage;

import com.spotify.music.features.ads.api.b;
import io.reactivex.a;
import io.reactivex.e;
import java.util.HashMap;
import java.util.Map;

/* renamed from: tk3  reason: default package */
public class tk3 implements b {
    private final ml3 a;

    public tk3(ml3 ml3) {
        this.a = ml3;
    }

    @Override // com.spotify.music.features.ads.api.b
    public a a(String str, String str2, long j, Map<String, String> map) {
        HashMap hashMap = new HashMap();
        if (map != null) {
            hashMap.put("event_data", map);
        }
        hashMap.put("playback_position", Long.valueOf(j));
        return a.n(new ek3(this, hashMap, str, str2));
    }

    @Override // com.spotify.music.features.ads.api.b
    public a b(String str, String str2) {
        return a(str, str2, -1, null);
    }

    public /* synthetic */ e c(Map map, String str, String str2) {
        return this.a.a(map, str, str2);
    }
}
