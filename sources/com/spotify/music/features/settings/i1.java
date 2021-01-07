package com.spotify.music.features.settings;

import com.spotify.mobile.android.rx.w;
import io.reactivex.s;
import io.reactivex.y;
import java.util.concurrent.TimeUnit;

public class i1 {
    private final w a;
    private final y b;

    public i1(w wVar, y yVar) {
        this.a = wVar;
        this.b = yVar;
    }

    public s<h1> a() {
        return s.j(this.a.a("offline").j0(new a("1")), this.a.a("shows-collection").j0(new a("1")), this.a.a("audio-quality").j0(new a("1")), this.a.a("local-files-import").j0(new a("1")), this.a.a("nft-disabled").j0(new a("1")), this.a.a("ads").j0(new a("1")), this.a.a("loudness-levels").j0(i0.a).R0(300, TimeUnit.MILLISECONDS).p0(s.i0(Boolean.FALSE)), this.a.a("language-onboarding").j0(new a("1")), d.a).o0(this.b);
    }
}
