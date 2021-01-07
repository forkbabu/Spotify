package com.spotify.music.features.album.encore;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.m;
import androidx.lifecycle.n;
import androidx.lifecycle.w;
import com.spotify.base.java.logging.Logger;
import com.spotify.encore.Component;
import com.spotify.encore.consumer.components.album.api.header.AlbumHeader;
import com.spotify.encore.consumer.elements.downloadbutton.DownloadButton;
import com.spotify.encore.consumer.elements.downloadbutton.DownloadState;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import com.spotify.music.C0707R;
import com.spotify.music.features.album.offline.model.Album;
import com.spotify.music.features.album.offline.model.OfflineState;
import com.spotify.playlist.models.offline.a;
import com.spotify.rxjava2.p;
import defpackage.s51;
import io.reactivex.functions.g;
import io.reactivex.functions.l;
import io.reactivex.y;
import java.util.EnumSet;
import kotlin.d;
import kotlin.jvm.internal.h;

public final class AlbumHeaderComponentBinder implements Object<View>, m, m {
    private final p a = new p();
    private final d b = kotlin.a.b(new AlbumHeaderComponentBinder$albumHeader$2(this));
    private final String c;
    private final boolean f;
    private final n n;
    private final wlf<Component<AlbumHeader.Model, AlbumHeader.Events>> o;
    private final i p;
    private final y q;
    private final ly3 r;

    static final class a<T, R> implements l<OfflineState, com.spotify.playlist.models.offline.a> {
        public static final a a = new a();

        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public com.spotify.playlist.models.offline.a apply(OfflineState offlineState) {
            OfflineState offlineState2 = offlineState;
            h.e(offlineState2, "albumOfflineState");
            Album album = offlineState2.getAlbum();
            h.d(album, "albumOfflineState.album");
            return album.getOfflineState();
        }
    }

    static final class b<T> implements g<com.spotify.playlist.models.offline.a> {
        final /* synthetic */ AlbumHeaderComponentBinder a;
        final /* synthetic */ AlbumHeader.Model b;
        final /* synthetic */ s81 c;

        b(AlbumHeaderComponentBinder albumHeaderComponentBinder, AlbumHeader.Model model, s81 s81) {
            this.a = albumHeaderComponentBinder;
            this.b = model;
            this.c = s81;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(com.spotify.playlist.models.offline.a aVar) {
            DownloadButton.Model model;
            DownloadButton.Model model2;
            com.spotify.playlist.models.offline.a aVar2 = aVar;
            h.e(aVar2, "offlineState");
            this.a.getClass();
            if (aVar2 instanceof a.C0377a) {
                model2 = new DownloadButton.Model(DownloadState.Downloaded.INSTANCE, null, 2, null);
            } else if (aVar2 instanceof a.g) {
                model2 = new DownloadButton.Model(DownloadState.Pending.INSTANCE, null, 2, null);
            } else if (aVar2 instanceof a.h) {
                model2 = new DownloadButton.Model(DownloadState.Pending.INSTANCE, null, 2, null);
            } else if (aVar2 instanceof a.c) {
                model2 = new DownloadButton.Model(DownloadState.Error.INSTANCE, null, 2, null);
            } else if (aVar2 instanceof a.b) {
                model = new DownloadButton.Model(new DownloadState.Downloading(Float.valueOf((float) ((a.b) aVar2).c())), null, 2, null);
                this.a.i(AlbumHeader.Model.copy$default(this.b, null, null, null, null, null, 0, model, null, false, false, 959, null), this.c);
            } else {
                model2 = new DownloadButton.Model(DownloadState.Downloadable.INSTANCE, null, 2, null);
            }
            model = model2;
            this.a.i(AlbumHeader.Model.copy$default(this.b, null, null, null, null, null, 0, model, null, false, false, 959, null), this.c);
        }
    }

    static final class c<T> implements g<Throwable> {
        public static final c a = new c();

        c() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(Throwable th) {
            Throwable th2 = th;
            h.e(th2, "throwable");
            Logger.e(th2, "Failed to fetch download state", new Object[0]);
        }
    }

    public AlbumHeaderComponentBinder(String str, boolean z, n nVar, wlf<Component<AlbumHeader.Model, AlbumHeader.Events>> wlf, i iVar, y yVar, ly3 ly3) {
        h.e(str, "albumUri");
        h.e(nVar, "lifecycleOwner");
        h.e(wlf, "componentProvider");
        h.e(iVar, "interactionsListener");
        h.e(yVar, "mainScheduler");
        h.e(ly3, "albumOfflineStateProvider");
        this.c = str;
        this.f = z;
        this.n = nVar;
        this.o = wlf;
        this.p = iVar;
        this.q = yVar;
        this.r = ly3;
    }

    private final Component<AlbumHeader.Model, AlbumHeader.Events> g() {
        return (Component) this.b.getValue();
    }

    public void b(View view, s81 s81, s51.a<View> aVar, int... iArr) {
        h.e(view, "view");
        h.e(s81, "model");
        h.e(aVar, "action");
        h.e(iArr, "indexPath");
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:47:0x008a */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.util.ArrayList] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(android.view.View r29, defpackage.s81 r30, defpackage.w51 r31, defpackage.s51.b r32) {
        /*
        // Method dump skipped, instructions count: 359
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.features.album.encore.AlbumHeaderComponentBinder.c(android.view.View, s81, w51, s51$b):void");
    }

    public int d() {
        return C0707R.id.encore_header_album;
    }

    public EnumSet<GlueLayoutTraits.Trait> e() {
        EnumSet<GlueLayoutTraits.Trait> of = EnumSet.of(GlueLayoutTraits.Trait.HEADER);
        h.d(of, "EnumSet.of(GlueLayoutTraits.Trait.HEADER)");
        return of;
    }

    public View h(ViewGroup viewGroup, w51 w51) {
        h.e(viewGroup, "parent");
        h.e(w51, "config");
        this.n.A().a(this);
        return g().getView();
    }

    public final void i(AlbumHeader.Model model, s81 s81) {
        h.e(model, "model");
        h.e(s81, "data");
        g().render(model);
        g().onEvent(new AlbumHeaderComponentBinder$render$1(this, s81, model));
    }

    @w(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        this.a.a();
    }
}
