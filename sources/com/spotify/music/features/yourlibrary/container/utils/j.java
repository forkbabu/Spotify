package com.spotify.music.features.yourlibrary.container.utils;

import android.widget.ImageView;
import androidx.lifecycle.n;
import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.g;
import io.reactivex.y;

public class j {
    private final wlf<n> a;
    private final wlf<g<SessionState>> b;
    private final wlf<bqa> c;
    private final wlf<lqa> d;
    private final wlf<y> e;
    private final wlf<y> f;

    public j(wlf<n> wlf, wlf<g<SessionState>> wlf2, wlf<bqa> wlf3, wlf<lqa> wlf4, wlf<y> wlf5, wlf<y> wlf6) {
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
        a(wlf6, 6);
        this.f = wlf6;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public AvatarLoader b(ImageView imageView) {
        n nVar = this.a.get();
        a(nVar, 1);
        n nVar2 = nVar;
        g<SessionState> gVar = this.b.get();
        a(gVar, 2);
        g<SessionState> gVar2 = gVar;
        bqa bqa = this.c.get();
        a(bqa, 3);
        bqa bqa2 = bqa;
        lqa lqa = this.d.get();
        a(lqa, 4);
        lqa lqa2 = lqa;
        y yVar = this.e.get();
        a(yVar, 5);
        y yVar2 = yVar;
        y yVar3 = this.f.get();
        a(yVar3, 6);
        a(imageView, 7);
        return new AvatarLoader(nVar2, gVar2, bqa2, lqa2, yVar2, yVar3, imageView);
    }
}
