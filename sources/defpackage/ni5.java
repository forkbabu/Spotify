package defpackage;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.spotify.mobile.android.recentlyplayed.model.RecentlyPlayedItems;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.features.home.common.cache.a;
import com.spotify.music.json.e;
import com.spotify.music.json.g;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;
import io.reactivex.y;
import java.io.IOException;

/* renamed from: ni5  reason: default package */
public class ni5 implements w<RecentlyPlayedItems, RecentlyPlayedItems> {
    private final a<byte[]> a;
    private final ObjectMapper b;
    private final y c;
    private final boolean d;

    ni5(a<byte[]> aVar, g gVar, boolean z, y yVar) {
        this.a = aVar;
        e b2 = gVar.b();
        b2.e(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        b2.a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        b2.d(JsonInclude.Include.ALWAYS);
        this.b = b2.build();
        this.d = z;
        this.c = yVar;
    }

    public static void b(ni5 ni5, RecentlyPlayedItems recentlyPlayedItems) {
        ni5.getClass();
        try {
            byte[] writeValueAsBytes = ni5.b.writeValueAsBytes(recentlyPlayedItems);
            if (writeValueAsBytes.length > 0) {
                ni5.a.n(writeValueAsBytes);
            }
        } catch (IOException e) {
            Assertion.i("Failed to serialize RecentlyPlayedItems", e);
        }
    }

    public /* synthetic */ RecentlyPlayedItems a(byte[] bArr) {
        return (RecentlyPlayedItems) this.b.readValue(bArr, RecentlyPlayedItems.class);
    }

    /* Return type fixed from 'io.reactivex.v' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [io.reactivex.s] */
    @Override // io.reactivex.w
    public v<RecentlyPlayedItems> apply(s<RecentlyPlayedItems> sVar) {
        if (this.d) {
            return sVar;
        }
        return this.a.read().q(this.c).v().j0(new hi5(this)).x(sVar.I0(this.c).N(new ii5(this))).p0(sVar);
    }
}
