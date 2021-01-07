package com.spotify.music.podcastentityrow.playback;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.m;
import androidx.lifecycle.n;
import androidx.lifecycle.w;
import com.spotify.music.libs.viewuri.c;
import com.spotify.music.podcastentityrow.playback.b;
import com.spotify.music.podcastentityrow.s;
import com.spotify.rxjava2.q;
import defpackage.enc;
import io.reactivex.functions.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

public final class DefaultEpisodePlayButtonClickListener implements b, m {
    private final q a = new q();
    private final fnc b;
    private final c c;
    private final s f;

    static final class a<T> implements g<Boolean> {
        final /* synthetic */ DefaultEpisodePlayButtonClickListener a;
        final /* synthetic */ com.spotify.music.podcastentityrow.g b;
        final /* synthetic */ b.a c;
        final /* synthetic */ String f;
        final /* synthetic */ int n;

        a(DefaultEpisodePlayButtonClickListener defaultEpisodePlayButtonClickListener, com.spotify.music.podcastentityrow.g gVar, b.a aVar, String str, int i) {
            this.a = defaultEpisodePlayButtonClickListener;
            this.b = gVar;
            this.c = aVar;
            this.f = str;
            this.n = i;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(Boolean bool) {
            Boolean bool2 = bool;
            h.d(bool2, "isPlaying");
            if (bool2.booleanValue()) {
                DefaultEpisodePlayButtonClickListener.d(this.a, this.b, this.c.e(), this.f, this.n);
            } else if (!this.a.f.a() || !this.c.f()) {
                DefaultEpisodePlayButtonClickListener.e(this.a, this.b, this.c.e(), this.c.d(), this.f, this.n);
            } else {
                this.a.f.b(this.c.e(), this.a.c.toString());
            }
        }
    }

    public DefaultEpisodePlayButtonClickListener(fnc fnc, c cVar, s sVar, n nVar) {
        h.e(fnc, "podcastPlayer");
        h.e(cVar, "viewUri");
        h.e(sVar, "podcastEpisodeItemConfig");
        h.e(nVar, "lifeCycleOwner");
        this.b = fnc;
        this.c = cVar;
        this.f = sVar;
        nVar.A().a(this);
    }

    public static final void d(DefaultEpisodePlayButtonClickListener defaultEpisodePlayButtonClickListener, com.spotify.music.podcastentityrow.g gVar, String str, String str2, int i) {
        defaultEpisodePlayButtonClickListener.getClass();
        defaultEpisodePlayButtonClickListener.a.a(defaultEpisodePlayButtonClickListener.b.b(gVar.h(str, str2, i)).subscribe());
    }

    public static final void e(DefaultEpisodePlayButtonClickListener defaultEpisodePlayButtonClickListener, com.spotify.music.podcastentityrow.g gVar, String str, List list, String str2, int i) {
        defaultEpisodePlayButtonClickListener.getClass();
        String e = gVar.e(str, str2, i);
        String cVar = defaultEpisodePlayButtonClickListener.c.toString();
        h.d(cVar, "viewUri.toString()");
        ArrayList arrayList = new ArrayList(d.e(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b.C0333b bVar = (b.C0333b) it.next();
            arrayList.add(new enc.a(bVar.b(), bVar.a()));
        }
        defaultEpisodePlayButtonClickListener.a.a(defaultEpisodePlayButtonClickListener.b.c(new enc.b(cVar, str, arrayList, e)).subscribe());
    }

    @Override // com.spotify.music.podcastentityrow.playback.b
    public void a(b.a aVar) {
        h.e(aVar, "model");
        this.a.a(this.b.a(aVar.e()).D(Boolean.FALSE).subscribe(new a(this, aVar.b(), aVar, aVar.c(), aVar.a())));
    }

    @w(Lifecycle.Event.ON_STOP)
    public final void onStop() {
        this.a.c();
    }
}
