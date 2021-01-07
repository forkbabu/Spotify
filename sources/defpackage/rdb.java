package defpackage;

import com.spotify.music.lyrics.core.experience.model.Lyrics;
import com.spotify.music.lyrics.core.experience.model.LyricsLineData;
import com.spotify.music.lyrics.core.experience.model.Syllable;
import com.spotify.music.lyrics.core.experience.model.SyncMode;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

/* renamed from: rdb  reason: default package */
public final class rdb {
    private final Map<Integer, Integer> a;
    private final Lyrics b;
    private final String c;

    public rdb(Map map, Lyrics lyrics, String str, f fVar) {
        this.a = map;
        this.b = lyrics;
        this.c = str;
    }

    public final String a() {
        return this.c;
    }

    public final boolean b() {
        return this.b.getSyncMode() != SyncMode.a;
    }

    public final int c(int i) {
        List<LyricsLineData> lines = this.b.getLines();
        int b2 = nab.b(lines, i);
        if (b2 == -1) {
            return 0;
        }
        LyricsLineData lyricsLineData = lines.get(b2);
        List<Syllable> syllables = lyricsLineData.getSyllables();
        int i2 = this.a.get(Integer.valueOf(b2));
        if (i2 == null) {
            i2 = 0;
        }
        int intValue = i2.intValue();
        if (syllables == null || !(!syllables.isEmpty())) {
            return intValue + lyricsLineData.getWords().get(0).getString().length();
        }
        for (Syllable syllable : syllables) {
            h.c(syllable);
            if (syllable.getTime() <= i) {
                intValue = syllable.getLength() + intValue;
            }
        }
        return intValue;
    }
}
