package defpackage;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.guava.GuavaModule;
import com.google.common.collect.ImmutableList;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.android.cosmonaut.Cosmonaut;
import com.spotify.cosmos.android.cosmonaut.atoms.converter.ByteArrayConverters;
import com.spotify.cosmos.android.cosmonaut.atoms.converter.ProtoJavaliteConverters;
import com.spotify.cosmos.android.cosmonaut.atoms.converter.StringConverters;
import com.spotify.music.json.e;
import com.spotify.music.json.g;

/* renamed from: mv0  reason: default package */
public final class mv0 implements fjf<Cosmonaut> {
    private final wlf<RxResolver> a;
    private final wlf<g> b;

    public mv0(wlf<RxResolver> wlf, wlf<g> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        RxResolver rxResolver = this.a.get();
        e b2 = this.b.get().b();
        b2.a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        b2.d(JsonInclude.Include.NON_NULL);
        ObjectMapper build = b2.build();
        build.registerModule(new GuavaModule());
        int i = ImmutableList.a;
        ImmutableList.Builder builder = new ImmutableList.Builder();
        builder.mo53add((ImmutableList.Builder) new ByteArrayConverters());
        builder.mo53add((ImmutableList.Builder) new StringConverters());
        builder.mo53add((ImmutableList.Builder) new ProtoJavaliteConverters());
        builder.mo53add((ImmutableList.Builder) new kv0(build));
        ImmutableList build2 = builder.build();
        rxResolver.getClass();
        return new Cosmonaut(new lv0(rxResolver), build2);
    }
}
