package com.spotify.mobile.android.service.media;

import com.google.common.base.Optional;
import com.spotify.music.spotlets.radio.formatlist.i;
import io.reactivex.y;
import io.reactivex.z;

public class r2 implements q2 {
    private final y a;
    private final i b;

    public r2(y yVar, i iVar) {
        this.a = yVar;
        this.b = iVar;
    }

    @Override // com.spotify.mobile.android.service.media.q2
    public z<Optional<String>> a(String str) {
        return this.b.a(str).B0().B(this.a);
    }
}
