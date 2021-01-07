package com.spotify.mobile.android.hubframework.defaults.playback;

import android.content.Context;
import android.content.Intent;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.m;
import androidx.lifecycle.n;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.rx.w;
import com.spotify.music.libs.viewuri.c;
import com.spotify.player.model.command.PlayCommand;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.player.model.command.options.SkipToTrack;
import com.spotify.player.play.f;
import io.reactivex.d0;
import io.reactivex.disposables.d;
import io.reactivex.y;
import io.reactivex.z;
import java.util.Collection;
import java.util.List;

public class HubsTracksPlayerHelper {
    private final f a;
    private final lxd b;
    private final y c;
    private final Context d;
    private final w e;
    final d f = new d();
    private final c.a g;

    public HubsTracksPlayerHelper(Context context, w wVar, f fVar, c.a aVar, final n nVar, y yVar, lxd lxd) {
        context.getClass();
        this.d = context;
        wVar.getClass();
        this.e = wVar;
        fVar.getClass();
        this.a = fVar;
        lxd.getClass();
        this.b = lxd;
        aVar.getClass();
        this.g = aVar;
        this.c = yVar;
        nVar.A().a(new m() {
            /* class com.spotify.mobile.android.hubframework.defaults.playback.HubsTracksPlayerHelper.AnonymousClass1 */

            @androidx.lifecycle.w(Lifecycle.Event.ON_DESTROY)
            public void onDestroy() {
                nVar.A().c(this);
            }

            @androidx.lifecycle.w(Lifecycle.Event.ON_STOP)
            public void onStop() {
                HubsTracksPlayerHelper.this.f.dispose();
            }
        });
    }

    private void c(List<String> list, int i, String str) {
        this.f.b(this.e.b().j0(a.a).o0(this.c).T().s(new f(this, list, i, str)).subscribe());
    }

    public d0 a(List list, int i, String str, Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        c viewUri = this.g.getViewUri();
        viewUri.getClass();
        String cVar = viewUri.toString();
        if (booleanValue) {
            PlayCommand.Builder a2 = this.b.a(com.spotify.player.model.Context.fromTrackUris(cVar, ImmutableList.copyOf((Collection) list)));
            if (i >= 0) {
                a2.options(PreparePlayOptions.builder().skipTo(SkipToTrack.builder().pageIndex(0L).trackIndex(Long.valueOf((long) i)).build()).build());
            }
            if (str != null) {
                a2.loggingParams(LoggingParams.builder().interactionId(str).build());
            }
            return this.a.a(a2.build());
        }
        e6.b(this.d).d(new Intent("on-demand-restricted"));
        return z.z(zwd.b());
    }

    public void b(Iterable<String> iterable, String str) {
        ImmutableList list = FluentIterable.from(iterable).filter(k.a).toList();
        int indexOf = list.indexOf(null);
        if (indexOf < 0) {
            c(list, 0, null);
        } else {
            c(list, indexOf, null);
        }
    }
}
