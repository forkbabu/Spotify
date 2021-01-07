package defpackage;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.google.common.base.MoreObjects;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.features.yourlibrary.musicpages.songsmetadata.SongsMetadataFromTracks;
import com.spotify.music.features.yourlibrary.musicpages.songsmetadata.c;
import com.spotify.music.json.d;
import com.spotify.music.json.e;
import com.spotify.music.json.g;
import io.reactivex.internal.functions.Functions;
import io.reactivex.s;
import java.io.IOException;

/* renamed from: jf9  reason: default package */
public class jf9 {
    private final lf9 a;
    private final String b;
    private final c c;
    private final d d;
    private SongsMetadataFromTracks e;
    private s<SongsMetadataFromTracks> f;

    /* renamed from: jf9$a */
    class a extends d {
        a(jf9 jf9, g gVar) {
            super(gVar);
        }

        @Override // com.spotify.music.json.d
        public e b(e eVar) {
            eVar.a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            return eVar;
        }
    }

    public jf9(lf9 lf9, c cVar, String str, g gVar) {
        this.a = lf9;
        this.c = cVar;
        this.b = str;
        this.d = new a(this, gVar);
    }

    public /* synthetic */ void a(SongsMetadataFromTracks songsMetadataFromTracks) {
        this.e = songsMetadataFromTracks;
    }

    public void b() {
        SongsMetadataFromTracks songsMetadataFromTracks = this.e;
        if (songsMetadataFromTracks != null) {
            String str = null;
            try {
                str = this.d.a().writeValueAsString(songsMetadataFromTracks);
            } catch (JsonProcessingException e2) {
                Assertion.i("Failed to write songs metadata.", e2);
            }
            if (str != null) {
                this.c.a(this.b, str);
            }
        }
    }

    public s<SongsMetadataFromTracks> c() {
        SongsMetadataFromTracks songsMetadataFromTracks;
        if (this.f == null) {
            s<SongsMetadataFromTracks> N = this.a.a(false).E().N(new ff9(this));
            String value = this.c.getValue(this.b);
            if (MoreObjects.isNullOrEmpty(value)) {
                songsMetadataFromTracks = SongsMetadataFromTracks.DEFAULT;
            } else {
                try {
                    songsMetadataFromTracks = (SongsMetadataFromTracks) this.d.a().readValue(value, SongsMetadataFromTracks.class);
                } catch (IOException e2) {
                    Assertion.i("Failed loading songs metadata!", e2);
                    songsMetadataFromTracks = SongsMetadataFromTracks.DEFAULT;
                }
            }
            this.f = N.G0(songsMetadataFromTracks).M(Functions.f(), new ef9(this)).r0(cf9.a).v0(1).h1();
        }
        return this.f;
    }
}
