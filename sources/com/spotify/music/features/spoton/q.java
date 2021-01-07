package com.spotify.music.features.spoton;

import android.content.Context;
import com.spotify.music.features.spoton.SpotOnPlaybackManager;
import com.spotify.music.genie.p;
import io.reactivex.y;

public class q {
    private final wlf<p> a;
    private final wlf<y> b;
    private final wlf<y> c;
    private final wlf<m> d;
    private final wlf<pea> e;

    public q(wlf<p> wlf, wlf<y> wlf2, wlf<y> wlf3, wlf<m> wlf4, wlf<pea> wlf5) {
        a(wlf, 1);
        this.a = wlf;
        a(wlf2, 2);
        this.b = wlf2;
        a(wlf3, 3);
        this.c = wlf3;
        a(wlf4, 4);
        this.d = wlf4;
        a(wlf5, 5);
        this.e = wlf5;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public SpotOnPlaybackManager b(ifd ifd, Context context, uk8 uk8, cte cte, yk8 yk8, SpotOnPlaybackManager.OnboardingMode onboardingMode, SpotOnPlaybackManager.TtsMode ttsMode) {
        p pVar = this.a.get();
        a(pVar, 1);
        p pVar2 = pVar;
        y yVar = this.b.get();
        a(yVar, 2);
        y yVar2 = yVar;
        y yVar3 = this.c.get();
        a(yVar3, 3);
        y yVar4 = yVar3;
        m mVar = this.d.get();
        a(mVar, 4);
        m mVar2 = mVar;
        pea pea = this.e.get();
        a(pea, 6);
        a(context, 7);
        a(uk8, 8);
        a(cte, 9);
        a(yk8, 10);
        a(onboardingMode, 11);
        a(ttsMode, 12);
        return new SpotOnPlaybackManager(pVar2, yVar2, yVar4, mVar2, ifd, pea, context, uk8, cte, yk8, onboardingMode, ttsMode);
    }
}
