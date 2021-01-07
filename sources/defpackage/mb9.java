package defpackage;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.features.yourlibrary.musicpages.filtertags.loader.FilterTagsResponse;
import com.spotify.music.json.d;
import com.spotify.music.json.e;
import com.spotify.music.json.g;

/* renamed from: mb9  reason: default package */
public class mb9 implements lb9 {
    private final ob9 a;
    private final d b;

    /* renamed from: mb9$a */
    class a extends d {
        a(mb9 mb9, g gVar) {
            super(gVar);
        }

        @Override // com.spotify.music.json.d
        public e b(e eVar) {
            eVar.a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            return eVar;
        }
    }

    public mb9(ob9 ob9, g gVar) {
        this.a = ob9;
        this.b = new a(this, gVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.lb9
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.spotify.music.features.yourlibrary.musicpages.filtertags.loader.FilterTagsResponse a(java.lang.String r3) {
        /*
            r2 = this;
            ob9 r0 = r2.a
            java.lang.String r3 = r0.getValue(r3)
            boolean r0 = com.google.common.base.MoreObjects.isNullOrEmpty(r3)
            if (r0 != 0) goto L_0x0021
            com.spotify.music.json.d r0 = r2.b     // Catch:{ IOException -> 0x001b }
            com.fasterxml.jackson.databind.ObjectMapper r0 = r0.a()     // Catch:{ IOException -> 0x001b }
            java.lang.Class<com.spotify.music.features.yourlibrary.musicpages.filtertags.loader.FilterTagsResponse> r1 = com.spotify.music.features.yourlibrary.musicpages.filtertags.loader.FilterTagsResponse.class
            java.lang.Object r3 = r0.readValue(r3, r1)     // Catch:{ IOException -> 0x001b }
            com.spotify.music.features.yourlibrary.musicpages.filtertags.loader.FilterTagsResponse r3 = (com.spotify.music.features.yourlibrary.musicpages.filtertags.loader.FilterTagsResponse) r3     // Catch:{ IOException -> 0x001b }
            goto L_0x0022
        L_0x001b:
            r3 = move-exception
            java.lang.String r0 = "Failed reading filter tags response cache."
            com.spotify.mobile.android.util.Assertion.i(r0, r3)
        L_0x0021:
            r3 = 0
        L_0x0022:
            if (r3 != 0) goto L_0x002c
            com.google.common.collect.ImmutableList r3 = com.google.common.collect.ImmutableList.of()
            com.spotify.music.features.yourlibrary.musicpages.filtertags.loader.FilterTagsResponse r3 = com.spotify.music.features.yourlibrary.musicpages.filtertags.loader.FilterTagsResponse.create(r3)
        L_0x002c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mb9.a(java.lang.String):com.spotify.music.features.yourlibrary.musicpages.filtertags.loader.FilterTagsResponse");
    }

    @Override // defpackage.lb9
    public void b(String str, FilterTagsResponse filterTagsResponse) {
        try {
            this.a.a(str, this.b.a().writeValueAsString(filterTagsResponse));
        } catch (JsonProcessingException e) {
            Assertion.i("Failed writing filter tags response cache.", e);
        }
    }
}
