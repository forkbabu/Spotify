package defpackage;

import com.spotify.music.features.ads.api.h;
import com.spotify.music.features.ads.model.Targetings;
import io.reactivex.s;
import io.reactivex.v;
import java.util.Collections;
import java.util.Map;

/* renamed from: il3  reason: default package */
public class il3 implements h {
    private final tl3 a;

    public il3(tl3 tl3) {
        this.a = tl3;
    }

    @Override // com.spotify.music.features.ads.api.h
    public s<Targetings> a(String str, String str2) {
        return s.B(new ok3(this, str, Collections.singletonMap("value", str2)));
    }

    public /* synthetic */ v b(String str, Map map) {
        return this.a.a(str, map).P();
    }
}
