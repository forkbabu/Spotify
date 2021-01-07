package com.spotify.http;

import com.adjust.sdk.Constants;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.music.json.e;
import com.spotify.music.json.g;
import okhttp3.u;
import okhttp3.y;
import retrofit2.w;

public final class v {
    public static w a(y yVar, g gVar) {
        e b = gVar.b();
        b.a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        ObjectMapper build = b.build();
        u.a aVar = new u.a();
        aVar.i(Constants.SCHEME);
        aVar.f("spclient.wg.spotify.com");
        u c = aVar.c();
        w.b bVar = new w.b();
        bVar.d(c);
        bVar.g(yVar);
        bVar.a(retrofit2.adapter.rxjava2.g.e());
        bVar.b(tqf.c());
        bVar.b(gqf.c());
        bVar.b(dqf.d(build));
        return bVar.e();
    }
}
