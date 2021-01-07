package defpackage;

import com.spotify.music.ads.voice.domain.EarconType;
import com.spotify.music.ads.voice.domain.s;
import io.reactivex.z;

/* renamed from: md2  reason: default package */
public class md2 {
    private final cte a;

    public md2(cte cte) {
        this.a = cte;
    }

    public z<s> a(EarconType earconType) {
        return this.a.b(earconType.d()).O(new ld2(earconType)).m(kd2.a);
    }
}
