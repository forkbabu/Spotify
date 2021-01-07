package com.spotify.mobile.android.service.media;

import com.spotify.player.model.AudioStream;
import com.spotify.player.model.PlayerState;
import com.spotify.rxjava2.p;
import io.reactivex.s;
import java.util.HashSet;
import java.util.Set;

public class t1 extends r1 {
    private final pc1 c;
    private final String d;
    private final Set<yda> e;
    private final p f = new p();

    public t1(pc1 pc1, String str, yda yda) {
        pc1.getClass();
        this.c = pc1;
        str.getClass();
        this.d = str;
        HashSet hashSet = new HashSet();
        this.e = hashSet;
        yda.getClass();
        hashSet.add(yda);
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.mobile.android.service.media.r1
    public void b(String str, AudioStream audioStream) {
        for (yda yda : this.e) {
            this.c.d(this.d, str, yda, audioStream);
        }
    }

    public void d(s<PlayerState> sVar) {
        this.f.a();
        this.f.b(sVar.subscribe(new a(this), c.a));
    }

    public void e() {
        this.f.a();
    }
}
