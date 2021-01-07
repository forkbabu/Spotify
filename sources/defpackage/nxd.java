package defpackage;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.guava.GuavaModule;
import com.google.common.base.Charsets;
import com.google.common.base.MoreObjects;
import com.spotify.music.json.e;
import com.spotify.music.json.g;
import defpackage.pxd;
import java.io.IOException;

/* renamed from: nxd  reason: default package */
public class nxd implements pxd {
    private final ObjectMapper a;

    public nxd(g gVar) {
        e b = gVar.b();
        b.a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        b.e(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        b.d(JsonInclude.Include.NON_NULL);
        ObjectMapper build = b.build();
        build.registerModule(new GuavaModule());
        this.a = build;
    }

    @Override // defpackage.pxd
    public <T> pxd.a<T> a(byte[] bArr, Class<T> cls) {
        try {
            return new pxd.a.b(this.a.readValue(bArr, cls));
        } catch (IOException e) {
            return new pxd.a.C0670a(MoreObjects.nullToEmpty(e.getMessage()));
        }
    }

    @Override // defpackage.pxd
    public <T> pxd.a<byte[]> b(T t) {
        try {
            return new pxd.a.b(this.a.writeValueAsString(t).getBytes(Charsets.UTF_8));
        } catch (JsonProcessingException e) {
            return new pxd.a.C0670a(MoreObjects.nullToEmpty(e.getMessage()));
        }
    }
}
