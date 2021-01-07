package com.spotify.music.ads.voice.domain;

import com.spotify.mobius.s;
import com.spotify.music.ads.voice.domain.r;
import com.spotify.music.ads.voice.domain.v;
import com.spotify.music.ads.voice.domain.w;

public final class t {
    /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x0036: APUT  
      (r1v3 com.spotify.music.ads.voice.domain.r[])
      (0 ??[int, short, byte, char])
      (r5v1 com.spotify.music.ads.voice.domain.r)
     */
    public static s<v, r> a(v vVar) {
        r rVar;
        w.c cVar = new w.c();
        v.a f = vVar.f();
        f.g(cVar);
        v i = f.a().i(vVar.e() + 1);
        r[] rVarArr = new r[1];
        if (i.c()) {
            rVar = new r.b();
        } else {
            rVar = new r.c(vVar.g().h());
        }
        rVarArr[0] = rVar;
        return s.c(i, z42.l(rVarArr));
    }
}
