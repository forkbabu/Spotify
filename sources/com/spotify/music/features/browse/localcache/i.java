package com.spotify.music.features.browse.localcache;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.mobile.android.hubframework.model.json.HubsJsonViewModel;
import com.spotify.music.json.e;
import io.reactivex.g;
import io.reactivex.internal.functions.Functions;
import io.reactivex.k;
import java.io.IOException;
import okhttp3.e0;
import retrofit2.v;

/* access modifiers changed from: package-private */
public class i implements k<v<e0>, b91> {
    private final ObjectMapper a;

    public i(e eVar) {
        this.a = eVar.a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).build();
    }

    /* Return type fixed from 'tpf' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [io.reactivex.g] */
    @Override // io.reactivex.k
    public tpf<b91> a(g<v<e0>> gVar) {
        return gVar.O(new c(this)).O(Functions.c(b91.class));
    }

    public /* synthetic */ HubsJsonViewModel b(v vVar) {
        try {
            e0 e0Var = (e0) vVar.a();
            if (vVar.f() && e0Var != null) {
                return (HubsJsonViewModel) this.a.readValue(e0Var.b(), HubsJsonViewModel.class);
            }
            e0 d = vVar.d();
            if (!vVar.f() && d != null) {
                byte[] b = d.b();
                if (b.length > 0) {
                    return (HubsJsonViewModel) this.a.readValue(b, HubsJsonViewModel.class);
                }
            }
            throw new RuntimeException("Failed to parse response body");
        } catch (IOException e) {
            throw new RuntimeException("Failed to parse response body", e);
        }
    }
}
