package defpackage;

import android.content.res.Resources;
import com.google.common.collect.FluentIterable;
import com.spotify.music.C0707R;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.remoteconfig.jb;
import defpackage.b91;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;
import java.util.ArrayList;
import java.util.List;

/* renamed from: mod  reason: default package */
public class mod implements w<b91, b91> {
    private final Resources a;
    private final jb b;

    mod(Resources resources, jb jbVar) {
        this.a = resources;
        this.b = jbVar;
    }

    public b91 a(b91 b91) {
        if (!this.b.a()) {
            return b91;
        }
        o81 a2 = d71.a(ViewUris.b1.toString());
        if (b91 == null) {
            return b91;
        }
        b91.a builder = b91.toBuilder();
        List<? extends s81> body = b91.body();
        if (!body.isEmpty()) {
            body = FluentIterable.from(body).transform(new lod(this, a2)).toList();
        }
        return builder.e(body).g();
    }

    /* Return type fixed from 'io.reactivex.v' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [io.reactivex.s] */
    @Override // io.reactivex.w
    public v<b91> apply(s<b91> sVar) {
        return sVar.j0(new kod(this));
    }

    public s81 b(o81 o81, s81 s81) {
        if (!"track-entity-view-header".equals(s81.id())) {
            return s81;
        }
        ArrayList arrayList = new ArrayList(s81.children());
        arrayList.add(z81.c().o("glue:textRow", "row").z(z81.h().a(this.a.getString(C0707R.string.upsell_play_on_premium_how_can_i_play_this_song_cta)).build()).s("track-entity-view-body_howToPlayButton").f("click", o81).i("ui:group", "track-entity-view-body-subtext").i("ui:index_in_block", 0).i("ui:source", "play-on-premium").l());
        return s81.toBuilder().m(arrayList).l();
    }
}
