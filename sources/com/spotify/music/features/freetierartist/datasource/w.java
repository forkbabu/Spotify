package com.spotify.music.features.freetierartist.datasource;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.mobile.android.hubframework.model.json.HubsJsonViewModel;
import com.spotify.music.json.e;
import io.reactivex.s;
import okhttp3.e0;
import retrofit2.v;

public class w implements io.reactivex.w<v<e0>, b91> {
    private final ObjectMapper a;

    public w(e eVar) {
        this.a = eVar.a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).build();
    }

    public /* synthetic */ b91 a(v vVar) {
        e0 e0Var = (e0) vVar.a();
        if (vVar.f() && e0Var != null) {
            byte[] b = e0Var.b();
            if (b.length > 0) {
                return (b91) this.a.readValue(b, HubsJsonViewModel.class);
            }
        }
        e0 d = vVar.d();
        if (!vVar.f() && d != null) {
            byte[] b2 = d.b();
            if (b2.length > 0) {
                return (b91) this.a.readValue(b2, HubsJsonViewModel.class);
            }
        }
        throw new ArtistResponseParseException();
    }

    /* Return type fixed from 'io.reactivex.v' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [io.reactivex.s] */
    @Override // io.reactivex.w
    public io.reactivex.v<b91> apply(s<v<e0>> sVar) {
        return sVar.j0(new e(this));
    }
}
