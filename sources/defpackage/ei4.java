package defpackage;

import com.spotify.encore.mobile.snackbar.SnackbarConfiguration;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobius.rx2.m;
import com.spotify.music.C0707R;
import com.spotify.playlist.endpoints.i;
import com.spotify.playlist.models.l;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.h;

/* renamed from: ei4  reason: default package */
public final class ei4 {

    /* renamed from: ei4$a */
    static final class a<T> implements io.reactivex.functions.g<rh4> {
        final /* synthetic */ SpSharedPreferences a;

        a(SpSharedPreferences spSharedPreferences) {
            this.a = spSharedPreferences;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(rh4 rh4) {
            SpSharedPreferences.a b = this.a.b();
            b.f(zg4.b(), rh4.a());
            b.j();
        }
    }

    /* renamed from: ei4$b */
    static final class b<T> implements io.reactivex.functions.g<gh4> {
        final /* synthetic */ ui4 a;
        final /* synthetic */ qy4 b;
        final /* synthetic */ String c;

        b(ui4 ui4, qy4 qy4, String str) {
            this.a = ui4;
            this.b = qy4;
            this.c = str;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(gh4 gh4) {
            gh4 gh42 = gh4;
            this.a.c(gh42.a().getItems().size());
            List<l> items = gh42.a().getItems();
            ArrayList arrayList = new ArrayList(kotlin.collections.d.e(items, 10));
            Iterator<T> it = items.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getUri());
            }
            this.b.a(this.c, arrayList);
        }
    }

    /* renamed from: ei4$c */
    static final class c<T> implements io.reactivex.functions.g<sh4> {
        final /* synthetic */ com.spotify.mobile.android.share.menu.preview.api.e a;

        c(com.spotify.mobile.android.share.menu.preview.api.e eVar) {
            this.a = eVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(sh4 sh4) {
            this.a.b();
        }
    }

    /* renamed from: ei4$d */
    static final class d<Upstream, Downstream> implements w<eh4, bh4> {
        final /* synthetic */ i a;

        /* renamed from: ei4$d$a */
        static final class a<T, R> implements io.reactivex.functions.l<eh4, v<? extends bh4>> {
            final /* synthetic */ d a;

            a(d dVar) {
                this.a = dVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // io.reactivex.functions.l
            public v<? extends bh4> apply(eh4 eh4) {
                eh4 eh42 = eh4;
                h.e(eh42, "effect");
                return this.a.a.a(eh42.a(), kotlin.collections.d.t(eh42.b())).B().N();
            }
        }

        d(i iVar) {
            this.a = iVar;
        }

        @Override // io.reactivex.w
        public final v<bh4> apply(s<eh4> sVar) {
            h.e(sVar, "it");
            return sVar.W(new a(this), false, Integer.MAX_VALUE);
        }
    }

    /* renamed from: ei4$e */
    static final class e<T> implements io.reactivex.functions.g<jh4> {
        final /* synthetic */ com.spotify.music.preview.v a;

        e(com.spotify.music.preview.v vVar) {
            this.a = vVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(jh4 jh4) {
            this.a.f(jh4.a());
        }
    }

    /* renamed from: ei4$f */
    static final class f<T> implements io.reactivex.functions.g<hh4> {
        final /* synthetic */ com.spotify.music.preview.v a;

        f(com.spotify.music.preview.v vVar) {
            this.a = vVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(hh4 hh4) {
            this.a.j(hh4.a());
        }
    }

    /* renamed from: ei4$g */
    static final class g<T> implements io.reactivex.functions.g<uh4> {
        final /* synthetic */ SnackbarManager a;
        final /* synthetic */ nmf b;

        g(SnackbarManager snackbarManager, nmf nmf) {
            this.a = snackbarManager;
            this.b = nmf;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(uh4 uh4) {
            SnackbarManager snackbarManager = this.a;
            SnackbarConfiguration build = SnackbarConfiguration.builder((int) C0707R.string.undo_message).actionTextRes(C0707R.string.undo_label).onClickListener(new fi4(this, uh4)).build();
            h.d(build, "SnackbarConfiguration.bu…                 .build()");
            snackbarManager.show(build);
        }
    }

    public static final w<ah4, bh4> a(SpSharedPreferences<Object> spSharedPreferences, com.spotify.mobile.android.share.menu.preview.api.e eVar, i iVar, com.spotify.music.preview.v vVar, qy4 qy4, String str, nmf<String, io.reactivex.a> nmf, SnackbarManager snackbarManager, nmf<String, kotlin.f> nmf2, ui4 ui4) {
        h.e(spSharedPreferences, "sharedPreferences");
        h.e(eVar, "sharePreviewMenu");
        h.e(iVar, "playlistOperation");
        h.e(vVar, "previewPlayer");
        h.e(qy4, "entitySelector");
        h.e(str, "listName");
        h.e(nmf, "addPlaylistToLibraryAction");
        h.e(snackbarManager, "snackbarManager");
        h.e(nmf2, "undoConsumer");
        h.e(ui4, "audioPlusLogger");
        m f2 = com.spotify.mobius.rx2.i.f();
        f2.d(rh4.class, new a(spSharedPreferences));
        f2.e(gh4.class, new b(ui4, qy4, str), io.reactivex.android.schedulers.a.b());
        f2.d(sh4.class, new c(eVar));
        f2.h(eh4.class, new d(iVar));
        f2.d(jh4.class, new e(vVar));
        f2.d(hh4.class, new f(vVar));
        h.e(iVar, "playlistOperation");
        h.e(ui4, "audioPlusLogger");
        f2.h(wg4.class, new ai4(ui4, iVar));
        h.e(nmf, "addPlaylistToLibraryAction");
        f2.h(ug4.class, new di4(nmf));
        f2.e(uh4.class, new g(snackbarManager, nmf2), io.reactivex.android.schedulers.a.b());
        h.e(iVar, "playlistOperation");
        f2.h(xh4.class, new gi4(iVar));
        return f2.i();
    }
}
