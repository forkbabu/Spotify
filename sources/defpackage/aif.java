package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.guava.GuavaModule;
import com.spotify.music.json.g;
import com.spotify.voiceassistant.player.models.SearchRequest;
import com.spotify.voiceassistant.player.models.SearchResponse;
import okhttp3.c0;
import okhttp3.e0;
import retrofit2.w;

/* renamed from: aif  reason: default package */
class aif extends mhf<SearchRequest, SearchResponse> {
    private final ObjectMapper b;

    aif(w wVar, g gVar) {
        super(wVar);
        ObjectMapper a = gVar.a();
        a.registerModule(new GuavaModule());
        this.b = a;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* access modifiers changed from: protected */
    @Override // defpackage.mhf
    public SearchResponse a(e0 e0Var) {
        return (SearchResponse) this.b.readValue(e0Var.a(), SearchResponse.class);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* access modifiers changed from: protected */
    @Override // defpackage.mhf
    public c0 c(SearchRequest searchRequest) {
        return c0.e(okhttp3.w.d("application/json"), this.b.writeValueAsBytes(searchRequest));
    }
}
