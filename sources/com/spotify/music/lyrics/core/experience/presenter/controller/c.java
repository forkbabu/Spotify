package com.spotify.music.lyrics.core.experience.presenter.controller;

import com.spotify.music.lyrics.core.experience.model.Lyrics;
import com.spotify.music.lyrics.core.experience.model.LyricsLineData;
import com.spotify.music.lyrics.core.experience.model.SyncMode;
import com.spotify.rxjava2.q;
import io.reactivex.s;
import io.reactivex.y;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.h;

public final class c {
    private final y a = io.reactivex.android.schedulers.a.b();
    private final q b = new q();
    private final com.spotify.music.lyrics.core.experience.rx.a c;

    static final class a<T1, T2, R> implements io.reactivex.functions.c<Lyrics, Integer, Integer> {
        public static final a a = new a();

        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // io.reactivex.functions.c
        public Integer a(Lyrics lyrics, Integer num) {
            Lyrics lyrics2 = lyrics;
            int intValue = num.intValue();
            h.e(lyrics2, "<name for destructuring parameter 0>");
            return Integer.valueOf(lyrics2.component2() == SyncMode.a ? 0 : nab.b(lyrics2.component1(), intValue));
        }
    }

    static final class b<T1, T2, R> implements io.reactivex.functions.c<Pair<? extends Integer, ? extends Integer>, Lyrics, qdb> {
        final /* synthetic */ com.spotify.music.lyrics.core.experience.contract.b a;

        b(com.spotify.music.lyrics.core.experience.contract.b bVar) {
            this.a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // io.reactivex.functions.c
        public qdb a(Pair<? extends Integer, ? extends Integer> pair, Lyrics lyrics) {
            int i;
            Pair<? extends Integer, ? extends Integer> pair2 = pair;
            Lyrics lyrics2 = lyrics;
            h.e(pair2, "size");
            h.e(lyrics2, "lyrics");
            int intValue = ((Number) pair2.c()).intValue();
            e eVar = new e(new LyricsPlaybackController$onStart$lineTransformerObservable$1$1(this.a));
            h.e(lyrics2, "lyrics");
            h.e(eVar, "lineCalculator");
            List<LyricsLineData> lines = lyrics2.getLines();
            HashMap hashMap = new HashMap();
            int size = lines.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                String string = lines.get(i3).getWords().get(0).getString();
                h.e(string, "text");
                h.e(eVar, "lineCalculator");
                if (intValue == 0) {
                    i = 1;
                } else {
                    Integer num = (Integer) eVar.apply(string);
                    if (num != null && num.intValue() == 0) {
                        num = 1;
                    }
                    h.d(num, "if (lineCount == 0) 1 else lineCount");
                    i = num.intValue();
                }
                i2 += i - 1;
                hashMap.put(Integer.valueOf(i3), Integer.valueOf(i3 + i2));
            }
            return new qdb(hashMap, null);
        }
    }

    /* renamed from: com.spotify.music.lyrics.core.experience.presenter.controller.c$c  reason: collision with other inner class name */
    static final class C0305c<T1, T2, R> implements io.reactivex.functions.c<Lyrics, Pair<? extends Integer, ? extends Integer>, Pair<? extends Lyrics, ? extends Pair<? extends Integer, ? extends Integer>>> {
        public static final C0305c a = new C0305c();

        C0305c() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // io.reactivex.functions.c
        public Pair<? extends Lyrics, ? extends Pair<? extends Integer, ? extends Integer>> a(Lyrics lyrics, Pair<? extends Integer, ? extends Integer> pair) {
            Lyrics lyrics2 = lyrics;
            Pair<? extends Integer, ? extends Integer> pair2 = pair;
            h.e(lyrics2, "lyrics");
            h.e(pair2, "colors");
            return new Pair<>(lyrics2, pair2);
        }
    }

    static final class d<T1, T2, T3, R> implements io.reactivex.functions.h<Pair<? extends Integer, ? extends Integer>, Pair<? extends Lyrics, ? extends Pair<? extends Integer, ? extends Integer>>, Boolean, rdb> {
        final /* synthetic */ com.spotify.music.lyrics.core.experience.contract.b a;

        d(com.spotify.music.lyrics.core.experience.contract.b bVar) {
            this.a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // io.reactivex.functions.h
        public rdb a(Pair<? extends Integer, ? extends Integer> pair, Pair<? extends Lyrics, ? extends Pair<? extends Integer, ? extends Integer>> pair2, Boolean bool) {
            int i;
            Pair<? extends Integer, ? extends Integer> pair3 = pair;
            Pair<? extends Lyrics, ? extends Pair<? extends Integer, ? extends Integer>> pair4 = pair2;
            boolean booleanValue = bool.booleanValue();
            h.e(pair3, "size");
            h.e(pair4, "lyricsColors");
            Lyrics lyrics = (Lyrics) pair4.c();
            Pair pair5 = (Pair) pair4.d();
            h.e(lyrics, "lyrics");
            HashMap hashMap = new HashMap();
            List<LyricsLineData> lines = lyrics.getLines();
            StringBuilder sb = new StringBuilder();
            int size = lines.size();
            for (int i2 = 0; i2 < size; i2++) {
                String string = lines.get(i2).getWords().get(0).getString();
                hashMap.put(Integer.valueOf(i2), Integer.valueOf(sb.length()));
                sb.append(string);
                sb.append('\n');
            }
            String sb2 = sb.toString();
            h.d(sb2, "lyricsBuilder.toString()");
            rdb rdb = new rdb(hashMap, lyrics, sb2, null);
            int intValue = ((Number) pair3.d()).intValue();
            int j = intValue / this.a.j(sdb.d(lyrics.getLines()));
            int i3 = j - (j % 2);
            if (i3 == 0) {
                i = 0;
            } else {
                i = intValue / i3;
            }
            this.a.e(nab.a(i, rdb.a(), pair3, lyrics, pair5, booleanValue));
            return rdb;
        }
    }

    public c(com.spotify.music.lyrics.core.experience.rx.a aVar) {
        h.e(aVar, "rxLyrics");
        this.c = aVar;
    }

    public final void a(com.spotify.music.lyrics.core.experience.contract.b bVar) {
        h.e(bVar, "viewBinder");
        s n = s.n(this.c.g(), this.c.b(), new b(bVar));
        h.d(n, "Observable.combineLatest…          }\n            )");
        s m = s.m(this.c.g(), s.n(this.c.b(), this.c.a(), C0305c.a).E(), this.c.f(), new d(bVar));
        h.d(m, "Observable.combineLatest…          }\n            )");
        s E = s.n(this.c.b(), this.c.d(), a.a).E();
        h.d(E, "Observable.combineLatest…  .distinctUntilChanged()");
        this.b.a(s.n(n, E, a.a).E().o0(this.a).subscribe(new d(new LyricsPlaybackController$observeUpdates$2(bVar))));
        this.b.a(s.n(m, this.c.d(), b.a).E().o0(this.a).subscribe(new d(new LyricsPlaybackController$observeUpdates$4(bVar))));
    }

    public final void b() {
        this.b.c();
    }
}
