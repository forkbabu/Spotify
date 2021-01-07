package com.spotify.music.lyrics.share.selection.presenter.controller;

import com.spotify.music.lyrics.core.experience.contract.LyricsContract$SelectionStyle;
import com.spotify.music.lyrics.core.experience.model.Lyrics;
import com.spotify.music.lyrics.core.experience.model.LyricsLineData;
import com.spotify.rxjava2.q;
import io.reactivex.functions.g;
import io.reactivex.s;
import io.reactivex.y;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

public final class LyricsSelectionController {
    private com.spotify.music.lyrics.core.experience.contract.b a;
    private final HashMap<Integer, Pair<Integer, Integer>> b = new HashMap<>();
    private final HashMap<Integer, SelectionState> c = new HashMap<>();
    private final io.reactivex.subjects.a<Integer> d;
    private final y e;
    private final q f;
    private final com.spotify.music.lyrics.core.experience.rx.a g;

    public enum SelectionState {
        SELECTED,
        SELECTABLE
    }

    static final class a<T1, T2, R> implements io.reactivex.functions.c<Lyrics, Pair<? extends Integer, ? extends Integer>, Pair<? extends Lyrics, ? extends Pair<? extends Integer, ? extends Integer>>> {
        public static final a a = new a();

        a() {
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

    static final class b<T1, T2, R> implements io.reactivex.functions.c<Pair<? extends Integer, ? extends Integer>, Pair<? extends Lyrics, ? extends Pair<? extends Integer, ? extends Integer>>, Lyrics> {
        final /* synthetic */ LyricsSelectionController a;
        final /* synthetic */ com.spotify.music.lyrics.core.experience.contract.b b;

        b(LyricsSelectionController lyricsSelectionController, com.spotify.music.lyrics.core.experience.contract.b bVar) {
            this.a = lyricsSelectionController;
            this.b = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // io.reactivex.functions.c
        public Lyrics a(Pair<? extends Integer, ? extends Integer> pair, Pair<? extends Lyrics, ? extends Pair<? extends Integer, ? extends Integer>> pair2) {
            int i;
            Pair<? extends Integer, ? extends Integer> pair3 = pair;
            Pair<? extends Lyrics, ? extends Pair<? extends Integer, ? extends Integer>> pair4 = pair2;
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
            int j = intValue / this.b.j(sdb.d(lyrics.getLines()));
            int i3 = j - (j % 2);
            if (i3 == 0) {
                i = 0;
            } else {
                i = intValue / i3;
            }
            LyricsSelectionController.e(this.a, nab.a(i, rdb.a(), pair3, lyrics, pair5, false));
            return lyrics;
        }
    }

    static final class c<T> implements g<Lyrics> {
        final /* synthetic */ LyricsSelectionController a;
        final /* synthetic */ com.spotify.music.lyrics.core.experience.contract.b b;

        c(LyricsSelectionController lyricsSelectionController, com.spotify.music.lyrics.core.experience.contract.b bVar) {
            this.a = lyricsSelectionController;
            this.b = bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(Lyrics lyrics) {
            Lyrics lyrics2 = lyrics;
            LyricsSelectionController lyricsSelectionController = this.a;
            h.d(lyrics2, "lyrics");
            LyricsSelectionController.a(lyricsSelectionController, lyrics2);
            this.b.h(this.a.b, this.a.d);
        }
    }

    public LyricsSelectionController(com.spotify.music.lyrics.core.experience.rx.a aVar) {
        h.e(aVar, "rxLyrics");
        this.g = aVar;
        io.reactivex.subjects.a<Integer> h1 = io.reactivex.subjects.a.h1();
        h.d(h1, "BehaviorSubject.create()");
        this.d = h1;
        this.e = io.reactivex.android.schedulers.a.b();
        this.f = new q();
    }

    public static final void a(LyricsSelectionController lyricsSelectionController, Lyrics lyrics) {
        lyricsSelectionController.getClass();
        List<LyricsLineData> lines = lyrics.getLines();
        StringBuilder sb = new StringBuilder();
        int size = lines.size();
        for (int i = 0; i < size; i++) {
            String string = lines.get(i).getWords().get(0).getString();
            lyricsSelectionController.b.put(Integer.valueOf(i), new Pair<>(Integer.valueOf(sb.length()), Integer.valueOf(string.length() + sb.length())));
            sb.append(string);
            sb.append('\n');
        }
    }

    public static final void d(LyricsSelectionController lyricsSelectionController, int i) {
        SelectionState selectionState = lyricsSelectionController.c.get(Integer.valueOf(i));
        SelectionState selectionState2 = SelectionState.SELECTED;
        if (selectionState == selectionState2) {
            LyricsContract$SelectionStyle lyricsContract$SelectionStyle = LyricsContract$SelectionStyle.DESELECTED;
            int i2 = i - 1;
            if (lyricsSelectionController.c.get(Integer.valueOf(i2)) == selectionState2 && lyricsSelectionController.c.get(Integer.valueOf(i + 1)) == selectionState2) {
                lyricsSelectionController.f();
                lyricsSelectionController.i(i);
                return;
            }
            Pair<Integer, Integer> pair = lyricsSelectionController.b.get(Integer.valueOf(i));
            h.c(pair);
            Pair<Integer, Integer> pair2 = pair;
            SelectionState selectionState3 = lyricsSelectionController.c.get(Integer.valueOf(i2));
            SelectionState selectionState4 = SelectionState.SELECTABLE;
            if (selectionState3 == selectionState4 && lyricsSelectionController.c.get(Integer.valueOf(i + 1)) == selectionState4) {
                com.spotify.music.lyrics.core.experience.contract.b bVar = lyricsSelectionController.a;
                if (bVar != null) {
                    bVar.i(lyricsContract$SelectionStyle, pair2.c().intValue(), pair2.d().intValue());
                    lyricsSelectionController.c.remove(Integer.valueOf(i));
                    lyricsSelectionController.g.k(new jdb(lyricsSelectionController.h(), 5));
                } else {
                    h.k("viewBinder");
                    throw null;
                }
            } else {
                com.spotify.music.lyrics.core.experience.contract.b bVar2 = lyricsSelectionController.a;
                if (bVar2 != null) {
                    bVar2.i(LyricsContract$SelectionStyle.SELECTABLE, pair2.c().intValue(), pair2.d().intValue());
                    lyricsSelectionController.c.put(Integer.valueOf(i), selectionState4);
                    lyricsSelectionController.g.k(new jdb(lyricsSelectionController.h(), 5));
                } else {
                    h.k("viewBinder");
                    throw null;
                }
            }
            if (lyricsSelectionController.c.get(Integer.valueOf(i2)) == selectionState4) {
                Pair<Integer, Integer> pair3 = lyricsSelectionController.b.get(Integer.valueOf(i2));
                h.c(pair3);
                Pair<Integer, Integer> pair4 = pair3;
                com.spotify.music.lyrics.core.experience.contract.b bVar3 = lyricsSelectionController.a;
                if (bVar3 != null) {
                    bVar3.i(lyricsContract$SelectionStyle, pair4.c().intValue(), pair4.d().intValue());
                    lyricsSelectionController.c.remove(Integer.valueOf(i2));
                } else {
                    h.k("viewBinder");
                    throw null;
                }
            }
            int i3 = i + 1;
            if (lyricsSelectionController.c.get(Integer.valueOf(i3)) == selectionState4) {
                Pair<Integer, Integer> pair5 = lyricsSelectionController.b.get(Integer.valueOf(i3));
                h.c(pair5);
                Pair<Integer, Integer> pair6 = pair5;
                com.spotify.music.lyrics.core.experience.contract.b bVar4 = lyricsSelectionController.a;
                if (bVar4 != null) {
                    bVar4.i(lyricsContract$SelectionStyle, pair6.c().intValue(), pair6.d().intValue());
                    lyricsSelectionController.c.remove(Integer.valueOf(i3));
                    return;
                }
                h.k("viewBinder");
                throw null;
            }
            return;
        }
        lyricsSelectionController.i(i);
    }

    public static final void e(LyricsSelectionController lyricsSelectionController, com.spotify.music.lyrics.core.experience.model.c cVar) {
        com.spotify.music.lyrics.core.experience.contract.b bVar = lyricsSelectionController.a;
        if (bVar != null) {
            bVar.e(cVar);
        } else {
            h.k("viewBinder");
            throw null;
        }
    }

    private final void f() {
        this.c.clear();
        com.spotify.music.lyrics.core.experience.contract.b bVar = this.a;
        if (bVar != null) {
            bVar.i(LyricsContract$SelectionStyle.CLEAR_ALL, 0, 0);
        } else {
            h.k("viewBinder");
            throw null;
        }
    }

    private final int g() {
        int i = 0;
        for (Map.Entry<Integer, SelectionState> entry : this.c.entrySet()) {
            if (entry.getValue() == SelectionState.SELECTED) {
                i++;
            }
        }
        return i;
    }

    private final Set<Integer> h() {
        HashMap<Integer, SelectionState> hashMap = this.c;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<Integer, SelectionState> entry : hashMap.entrySet()) {
            if (entry.getValue() == SelectionState.SELECTED) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap.keySet();
    }

    private final void i(int i) {
        SelectionState selectionState = SelectionState.SELECTABLE;
        if (((!this.c.isEmpty()) && this.c.get(Integer.valueOf(i)) != selectionState) || g() >= 5) {
            f();
        }
        Pair<Integer, Integer> pair = this.b.get(Integer.valueOf(i));
        h.c(pair);
        Pair<Integer, Integer> pair2 = pair;
        com.spotify.music.lyrics.core.experience.contract.b bVar = this.a;
        if (bVar != null) {
            bVar.i(LyricsContract$SelectionStyle.SELECTED, pair2.c().intValue(), pair2.d().intValue());
            HashMap<Integer, SelectionState> hashMap = this.c;
            Integer valueOf = Integer.valueOf(i);
            SelectionState selectionState2 = SelectionState.SELECTED;
            hashMap.put(valueOf, selectionState2);
            this.g.k(new jdb(h(), 5));
            if (g() >= 5) {
                for (Map.Entry entry : d.U(this.c).entrySet()) {
                    int intValue = ((Number) entry.getKey()).intValue();
                    if (((SelectionState) entry.getValue()) == selectionState) {
                        this.c.remove(Integer.valueOf(intValue));
                        Pair<Integer, Integer> pair3 = this.b.get(Integer.valueOf(intValue));
                        h.c(pair3);
                        h.d(pair3, "charCountForLineMap[key]!!");
                        Pair<Integer, Integer> pair4 = pair3;
                        com.spotify.music.lyrics.core.experience.contract.b bVar2 = this.a;
                        if (bVar2 != null) {
                            bVar2.i(LyricsContract$SelectionStyle.DESELECTED, pair4.c().intValue(), pair4.d().intValue());
                        } else {
                            h.k("viewBinder");
                            throw null;
                        }
                    }
                }
                return;
            }
            LyricsContract$SelectionStyle lyricsContract$SelectionStyle = LyricsContract$SelectionStyle.SELECTABLE;
            int i2 = i - 1;
            if (this.c.get(Integer.valueOf(i2)) != selectionState2 && this.b.containsKey(Integer.valueOf(i2)) && !this.c.containsKey(Integer.valueOf(i2))) {
                Pair<Integer, Integer> pair5 = this.b.get(Integer.valueOf(i2));
                h.c(pair5);
                Pair<Integer, Integer> pair6 = pair5;
                com.spotify.music.lyrics.core.experience.contract.b bVar3 = this.a;
                if (bVar3 != null) {
                    bVar3.i(lyricsContract$SelectionStyle, pair6.c().intValue(), pair6.d().intValue());
                    this.c.put(Integer.valueOf(i2), selectionState);
                } else {
                    h.k("viewBinder");
                    throw null;
                }
            }
            int i3 = i + 1;
            if (!(this.c.get(Integer.valueOf(i3)) == selectionState2 || !this.b.containsKey(Integer.valueOf(i3)) || this.c.containsKey(Integer.valueOf(i3)))) {
                Pair<Integer, Integer> pair7 = this.b.get(Integer.valueOf(i3));
                h.c(pair7);
                Pair<Integer, Integer> pair8 = pair7;
                com.spotify.music.lyrics.core.experience.contract.b bVar4 = this.a;
                if (bVar4 != null) {
                    bVar4.i(lyricsContract$SelectionStyle, pair8.c().intValue(), pair8.d().intValue());
                    this.c.put(Integer.valueOf(i3), selectionState);
                    return;
                }
                h.k("viewBinder");
                throw null;
            }
            return;
        }
        h.k("viewBinder");
        throw null;
    }

    public final void j(com.spotify.music.lyrics.core.experience.contract.b bVar) {
        h.e(bVar, "viewBinder");
        this.a = bVar;
        this.f.a(s.n(this.g.g(), s.d1(this.g.b(), this.g.a(), a.a).E(), new b(this, bVar)).subscribe(new c(this, bVar)));
        this.f.a(this.d.o0(this.e).subscribe(new a(this)));
        s n = s.n(this.g.g(), this.g.h(), c.a);
        h.d(n, "Observable.combineLatest…Int -> startY }\n        )");
        this.f.a(n.E().o0(this.e).subscribe(new b(bVar)));
    }

    public final void k() {
        this.f.c();
    }
}
