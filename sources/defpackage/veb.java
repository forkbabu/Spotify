package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.spotify.encore.foundation.R;
import com.spotify.music.lyrics.core.experience.model.Lyrics;
import com.spotify.rxjava2.q;
import io.reactivex.functions.g;
import io.reactivex.y;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

/* renamed from: veb  reason: default package */
public final class veb {
    public com.spotify.music.lyrics.share.selection.ui.a a;
    public com.spotify.music.lyrics.core.experience.model.a b;
    public Lyrics c;
    public reb d;
    public Set<Integer> e;
    private final y f = io.reactivex.android.schedulers.a.b();
    private final q g = new q();
    private final deb h;
    private final meb i;
    private final com.spotify.music.lyrics.core.experience.rx.a j;

    /* renamed from: veb$a */
    static final class a<T> implements g<jdb> {
        final /* synthetic */ veb a;

        a(veb veb) {
            this.a = veb;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(jdb jdb) {
            jdb jdb2 = jdb;
            h.e(jdb2, "event");
            veb veb = this.a;
            Set<Integer> b = jdb2.b();
            int a2 = jdb2.a();
            veb.getClass();
            h.e(b, "selectedLines");
            veb.e = b;
            com.spotify.music.lyrics.share.selection.ui.a aVar = veb.a;
            if (aVar != null) {
                aVar.o2(b.size(), a2);
                com.spotify.music.lyrics.share.selection.ui.a aVar2 = veb.a;
                if (aVar2 != null) {
                    aVar2.W1(!b.isEmpty());
                } else {
                    h.k("viewBinder");
                    throw null;
                }
            } else {
                h.k("viewBinder");
                throw null;
            }
        }
    }

    public veb(deb deb, meb meb, com.spotify.music.lyrics.core.experience.rx.a aVar) {
        h.e(deb, "lyricsShareAssetPickerNavigator");
        h.e(meb, "lyricsSharingLogger");
        h.e(aVar, "rxLyrics");
        this.h = deb;
        this.i = meb;
        this.j = aVar;
    }

    public final void a() {
        this.g.a(this.j.c().o0(this.f).subscribe(new a(this)));
        com.spotify.music.lyrics.share.selection.ui.a aVar = this.a;
        if (aVar != null) {
            aVar.o2(0, 5);
            com.spotify.music.lyrics.share.selection.ui.a aVar2 = this.a;
            if (aVar2 != null) {
                aVar2.W1(false);
            } else {
                h.k("viewBinder");
                throw null;
            }
        } else {
            h.k("viewBinder");
            throw null;
        }
    }

    public final void b() {
        this.i.d();
        this.g.c();
    }

    public final void c(Context context) {
        h.e(context, "context");
        this.i.c();
        Bundle bundle = new Bundle();
        StringBuilder sb = new StringBuilder();
        Set<Integer> set = this.e;
        if (set != null) {
            Iterator<Integer> it = set.iterator();
            while (it.hasNext()) {
                Lyrics lyrics = this.c;
                if (lyrics != null) {
                    sb.append(lyrics.getLines().get(it.next().intValue()).getWords().get(0).getString());
                    if (it.hasNext()) {
                        sb.append("\n");
                    }
                } else {
                    h.k("lyrics");
                    throw null;
                }
            }
            String sb2 = sb.toString();
            h.d(sb2, "builder.toString()");
            reb reb = this.d;
            if (reb != null) {
                com.spotify.music.lyrics.core.experience.model.a aVar = this.b;
                if (aVar != null) {
                    h.e(context, "context");
                    h.e(aVar, "colors");
                    int b2 = androidx.core.content.a.b(context, R.color.black);
                    int b3 = androidx.core.content.a.b(context, R.color.gray_7);
                    int b4 = androidx.core.content.a.b(context, R.color.gray_15);
                    int b5 = androidx.core.content.a.b(context, R.color.gray_90);
                    bundle.putParcelable("shareable_data", new qeb(sb2, reb, d.u(new peb(aVar.b(), aVar.b(), aVar.a(), b5), new peb(aVar.c(), aVar.c(), aVar.b(), b5), new peb(b4, b3, aVar.a(), b5), new peb(b5, b5, b2, b2)), 0));
                    this.h.a(bundle);
                    return;
                }
                h.k("colors");
                throw null;
            }
            h.k("trackInfo");
            throw null;
        }
        h.k("selectedLines");
        throw null;
    }
}
