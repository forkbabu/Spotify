package com.spotify.voiceassistant.voice.results;

import com.spotify.base.java.logging.Logger;
import com.spotify.ubi.specification.factories.f4;
import com.spotify.voice.results.model.f;
import com.spotify.voice.results.model.g;

public final class m implements g {
    private final ere a;
    private final o b;
    private final f4 c = new f4("third_party_voice");

    m(ere ere, o oVar) {
        this.a = ere;
        this.b = oVar;
    }

    private String b() {
        try {
            return this.b.a().b();
        } catch (IllegalStateException e) {
            Logger.e(e, "There was no stored playback id", new Object[0]);
            return "";
        }
    }

    @Override // com.spotify.voice.results.model.g
    public void a(f fVar) {
        fVar.b(new a(this), new b(this));
    }

    public /* synthetic */ void c(f.b bVar) {
        this.a.a(this.c.b(b()).a());
    }

    public /* synthetic */ void d(f.a aVar) {
        this.a.a(this.c.d(Integer.valueOf(aVar.d()), b()).a(aVar.e()));
    }
}
