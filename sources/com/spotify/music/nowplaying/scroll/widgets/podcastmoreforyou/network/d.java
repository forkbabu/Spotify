package com.spotify.music.nowplaying.scroll.widgets.podcastmoreforyou.network;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.mobile.android.hubframework.model.json.HubsJsonViewModel;
import com.spotify.music.json.e;
import com.spotify.music.nowplaying.scroll.widgets.podcastmoreforyou.network.h;
import java.io.IOException;
import java.nio.charset.Charset;
import kotlin.jvm.internal.h;
import okhttp3.e0;
import retrofit2.v;

public final class d {
    private final ObjectMapper a;

    public d(e eVar) {
        h.e(eVar, "objectMapperBuilder");
        this.a = eVar.a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).build();
    }

    public final h a(v<e0> vVar) {
        String str = "";
        h.e(vVar, "response");
        try {
            e0 a2 = vVar.a();
            if (!vVar.f() || a2 == null) {
                e0 d = vVar.d();
                if (vVar.f() || d == null) {
                    return new h.a("Invalid body");
                }
                e0 d2 = vVar.d();
                String m = d2 != null ? d2.m() : null;
                if (m == null) {
                    m = str;
                }
                return new h.a(m);
            }
            ObjectMapper objectMapper = this.a;
            byte[] b = a2.b();
            kotlin.jvm.internal.h.d(b, "responseBody.bytes()");
            Charset defaultCharset = Charset.defaultCharset();
            kotlin.jvm.internal.h.d(defaultCharset, "Charset.defaultCharset()");
            HubsJsonViewModel hubsJsonViewModel = (HubsJsonViewModel) objectMapper.readValue(new String(b, defaultCharset), HubsJsonViewModel.class);
            kotlin.jvm.internal.h.d(hubsJsonViewModel, "hubsViewModel");
            return new h.b(hubsJsonViewModel);
        } catch (IOException e) {
            String message = e.getMessage();
            if (message != null) {
                str = message;
            }
            return new h.a(str);
        }
    }
}
