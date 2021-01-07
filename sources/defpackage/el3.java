package defpackage;

import com.spotify.music.features.ads.api.f;
import com.spotify.music.features.ads.model.State;
import io.reactivex.s;

/* renamed from: el3  reason: default package */
public class el3 implements f {
    private final sl3 a;

    public el3(sl3 sl3) {
        this.a = sl3;
    }

    @Override // com.spotify.music.features.ads.api.f
    public s<State> getState() {
        return this.a.getState().A(qk3.a).P();
    }
}
