package com.spotify.mobile.android.service.media.browser;

import com.spotify.mobile.android.util.SortOption;
import com.spotify.music.C0707R;
import com.spotify.music.libs.podcast.loader.r;
import com.spotify.music.libs.podcast.loader.v;
import com.spotify.playlist.models.Show;
import io.reactivex.y;
import io.reactivex.z;

public class t {
    private static final SortOption d;
    private static final SortOption e;
    private final qna a;
    private final y b;
    private final y c;

    static {
        SortOption sortOption = new SortOption("number", C0707R.string.sort_order_date, true);
        SortOption sortOption2 = new SortOption("publishDate", true);
        sortOption2.i(new SortOption("name"));
        sortOption.i(sortOption2);
        d = sortOption;
        SortOption sortOption3 = new SortOption("number", C0707R.string.sort_order_date, true);
        sortOption3.h(true, false);
        SortOption sortOption4 = new SortOption("publishDate", true);
        sortOption4.h(true, false);
        sortOption4.i(new SortOption("name"));
        sortOption3.i(sortOption4);
        e = sortOption3;
    }

    public t(qna qna, y yVar, y yVar2) {
        this.a = qna;
        this.b = yVar;
        this.c = yVar2;
    }

    static /* synthetic */ SortOption b(r rVar) {
        if (rVar.b().b() == Show.ConsumptionOrder.SEQUENTIAL) {
            return e;
        }
        return d;
    }

    public z<SortOption> a(String str) {
        return new v(str, this.a, this.b, this.c).a().A(k.a);
    }
}
