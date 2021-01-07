package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.MoreObjects;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.spotlets.bixbyhomecards.models.StreamingCardData;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.music.json.g;
import java.io.IOException;

/* renamed from: lt1  reason: default package */
public class lt1 {
    private static final SpSharedPreferences.b<Object, String> c = SpSharedPreferences.b.e("com.spotify.music.features.bixbyhomecards.STREAMING_CARD_DATA_CACHE");
    private final SpSharedPreferences<Object> a;
    private final ObjectMapper b;

    public lt1(SpSharedPreferences<Object> spSharedPreferences, g gVar) {
        this.a = spSharedPreferences;
        this.b = gVar.a();
    }

    public StreamingCardData a() {
        String m = this.a.m(c, null);
        if (MoreObjects.isNullOrEmpty(m)) {
            return null;
        }
        try {
            return (StreamingCardData) this.b.readValue(m, StreamingCardData.class);
        } catch (IOException e) {
            Logger.e(e, "Failed parsing recommended playlists cached response", new Object[0]);
            return null;
        }
    }

    public void b(StreamingCardData streamingCardData) {
        try {
            SpSharedPreferences.a<Object> b2 = this.a.b();
            b2.f(c, this.b.writeValueAsString(streamingCardData));
            b2.i();
        } catch (IOException e) {
            Logger.e(e, "Failed writing recommended playlists cached response to string", new Object[0]);
        }
    }
}
