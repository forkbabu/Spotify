package defpackage;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.guava.GuavaModule;
import com.spotify.music.json.e;
import com.spotify.music.json.g;
import com.spotify.player.model.PlayerState;
import defpackage.xre;

/* renamed from: rse  reason: default package */
public final class rse implements fjf<ObjectMapper> {
    private final wlf<g> a;

    public rse(wlf<g> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        e b = this.a.get().b();
        b.b(JsonParser.Feature.AUTO_CLOSE_SOURCE, false);
        b.e(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        b.d(JsonInclude.Include.NON_EMPTY);
        ObjectMapper build = b.build();
        build.registerModule(new GuavaModule());
        build.addMixIn(PlayerState.class, xre.a.class);
        return build;
    }
}
