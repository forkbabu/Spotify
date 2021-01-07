package defpackage;

import com.spotify.music.lyrics.core.experience.model.Lyrics;
import com.spotify.music.lyrics.core.experience.model.LyricsLineData;
import com.spotify.music.lyrics.core.experience.model.c;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.h;

/* renamed from: nab  reason: default package */
public final class nab {
    public static final c a(int i, String str, Pair<Integer, Integer> pair, Lyrics lyrics, Pair<Integer, Integer> pair2, boolean z) {
        h.e(str, "lyricsAsPlainText");
        h.e(pair, "size");
        h.e(lyrics, "lyrics");
        h.e(pair2, "colors");
        return new c(str, lyrics, new ndb(i), pair2.c().intValue(), pair2.d().intValue(), z, pair);
    }

    public static final int b(List<LyricsLineData> list, int i) {
        h.e(list, "timeSortedLyrics");
        boolean z = true;
        int size = list.size() - 1;
        int i2 = 0;
        if (size < 0) {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException("The list cannot be empty".toString());
        } else if (i < list.get(0).getRequireTime() - 100) {
            return -1;
        } else {
            while (i2 < size) {
                int i3 = (i2 + size) / 2;
                int requireTime = list.get(i3).getRequireTime() - 100;
                int i4 = i3 + 1;
                int requireTime2 = list.get(i4).getRequireTime() - 100;
                if (requireTime <= i && requireTime2 > i) {
                    return i3;
                }
                if (i < requireTime) {
                    size = i3 - 1;
                } else {
                    i2 = i4;
                }
            }
            return size;
        }
    }
}
