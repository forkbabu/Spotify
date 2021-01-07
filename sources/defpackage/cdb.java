package defpackage;

import com.spotify.music.lyrics.core.experience.contract.b;
import com.spotify.music.lyrics.core.experience.rx.LyricsEventPublisher;
import com.spotify.rxjava2.q;
import io.reactivex.functions.g;
import io.reactivex.y;
import java.util.HashSet;
import kotlin.jvm.internal.h;

/* renamed from: cdb  reason: default package */
public final class cdb {
    private final y a = io.reactivex.android.schedulers.a.b();
    private final q b = new q();
    private b c;
    private HashSet<Integer> d = new HashSet<>();
    private int e;
    private final com.spotify.music.lyrics.core.experience.rx.a f;

    /* renamed from: cdb$a */
    static final class a<T> implements g<Integer> {
        final /* synthetic */ cdb a;
        final /* synthetic */ b b;

        a(cdb cdb, b bVar) {
            this.a = cdb;
            this.b = bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(Integer num) {
            int intValue = num.intValue();
            cdb.a(this.a, this.b.d(intValue), this.b.o(intValue));
        }
    }

    public cdb(com.spotify.music.lyrics.core.experience.rx.a aVar) {
        h.e(aVar, "rxLyrics");
        this.f = aVar;
    }

    public static final void a(cdb cdb, int i, int i2) {
        if (i <= i2) {
            while (true) {
                if (!cdb.d.contains(Integer.valueOf(i))) {
                    cdb.d.add(Integer.valueOf(i));
                    int i3 = cdb.e;
                    b bVar = cdb.c;
                    if (bVar != null) {
                        cdb.e = bVar.l(i) + i3;
                    } else {
                        h.k("viewBinder");
                        throw null;
                    }
                }
                if (i == i2) {
                    break;
                }
                i++;
            }
        }
        if (cdb.e >= 140) {
            cdb.b.c();
            LyricsEventPublisher lyricsEventPublisher = LyricsEventPublisher.c;
            LyricsEventPublisher.b(LyricsEventPublisher.Subject.MINIMUM_CHARACTER_COUNT, LyricsEventPublisher.a.C0306a.a);
        }
    }

    public final void b() {
        this.d.clear();
        this.e = 0;
    }

    public final void c(b bVar) {
        h.e(bVar, "viewBinder");
        this.c = bVar;
        this.b.a(this.f.e().E().o0(this.a).subscribe(new a(this, bVar)));
    }

    public final void d() {
        this.b.c();
    }
}
