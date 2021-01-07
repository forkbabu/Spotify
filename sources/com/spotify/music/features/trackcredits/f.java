package com.spotify.music.features.trackcredits;

import com.spotify.mobile.android.util.ui.k;
import com.spotify.mobile.android.util.ui.m;
import com.spotify.music.features.trackcredits.adapter.TrackCreditsAdapter;
import com.spotify.music.features.trackcredits.adapter.d;
import com.spotify.music.features.trackcredits.g;
import com.spotify.music.features.trackcredits.model.Artist;
import com.spotify.music.features.trackcredits.model.RoleCredits;
import com.spotify.music.features.trackcredits.model.TrackCredits;
import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.y;
import java.util.ArrayList;
import java.util.List;

public class f implements g.a {
    private final String a;
    private final wt8 b;
    private final y c;
    private g d;
    private b e = EmptyDisposable.INSTANCE;

    class a extends m {
        a() {
        }

        @Override // com.spotify.mobile.android.util.ui.m, com.spotify.mobile.android.util.ui.l
        public void onStop() {
            f.a(f.this);
        }
    }

    public f(String str, wt8 wt8, y yVar, k kVar) {
        this.a = str;
        this.b = wt8;
        this.c = yVar;
        ((jd0) kVar).y0(new a());
    }

    static void a(f fVar) {
        fVar.e.dispose();
    }

    private void b() {
        ((h) this.d).f();
        this.e = this.b.a(this.a.replaceFirst("spotify:track:", "")).B(this.c).subscribe(new a(this), new b(this));
    }

    public static void c(f fVar, TrackCredits trackCredits) {
        ((h) fVar.d).d();
        ((h) fVar.d).h(trackCredits.trackTitle());
        TrackCreditsAdapter.ViewType viewType = TrackCreditsAdapter.ViewType.HEADER;
        TrackCreditsAdapter.ViewType viewType2 = TrackCreditsAdapter.ViewType.ROW;
        ArrayList arrayList = new ArrayList();
        for (RoleCredits roleCredits : trackCredits.roleCredits()) {
            arrayList.add(d.a(roleCredits.roleTitle(), viewType));
            if (roleCredits.artists().isEmpty()) {
                arrayList.add(d.a("–", viewType2));
            } else {
                for (Artist artist : roleCredits.artists()) {
                    arrayList.add(d.b(artist.name(), artist.externalUrl(), viewType2));
                }
            }
        }
        List<String> sourceNames = trackCredits.sourceNames();
        if (!sourceNames.isEmpty()) {
            boolean z = true;
            if (sourceNames.size() != 1) {
                z = false;
            }
            arrayList.add(d.a(z ? "Source" : "Sources", viewType));
            for (String str : sourceNames) {
                arrayList.add(d.a(str, viewType2));
            }
        }
        arrayList.add(d.a("Report Error", TrackCreditsAdapter.ViewType.REPORT_ERROR));
        ((h) fVar.d).g(arrayList);
    }

    public void d(Throwable th) {
        ((h) this.d).d();
        ((h) this.d).e();
    }

    public void e() {
        ((h) this.d).a();
    }

    public void f() {
        ((h) this.d).c();
        this.e.dispose();
        b();
    }

    public void g(g gVar) {
        this.d = gVar;
        b();
    }
}
