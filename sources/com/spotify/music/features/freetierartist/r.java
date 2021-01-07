package com.spotify.music.features.freetierartist;

import com.spotify.music.inappmessaging.MessageRequest;
import com.spotify.music.inappmessaging.b;

public class r implements a71 {
    private final b a;

    public r(b bVar) {
        this.a = bVar;
    }

    @Override // defpackage.a71
    public void b(o81 o81, n61 n61) {
        this.a.b(MessageRequest.a("artist", "music-video", "v1"));
    }
}
