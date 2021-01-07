package com.spotify.music.lyrics.core.experience.contract;

import com.spotify.music.lyrics.core.experience.model.Lyrics;
import com.spotify.music.lyrics.core.experience.model.c;
import io.reactivex.subjects.a;
import java.util.HashMap;
import kotlin.Pair;

public interface b {
    void a(int i, int i2);

    void b(int i);

    void c(int i);

    int d(int i);

    void e(c cVar);

    void g(Lyrics lyrics, boolean z);

    int getCurrScrollY();

    void h(HashMap<Integer, Pair<Integer, Integer>> hashMap, a<Integer> aVar);

    void i(LyricsContract$SelectionStyle lyricsContract$SelectionStyle, int i, int i2);

    int j(boolean z);

    void k(int i);

    int l(int i);

    void m(int i);

    void n(a aVar);

    int o(int i);

    int p(String str);

    void q();

    void setStartY(int i);
}
