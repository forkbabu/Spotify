package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.C0707R;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.timeline.a;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import com.spotify.rxjava2.q;
import com.spotify.share.sharedata.r;
import io.reactivex.functions.g;
import kotlin.Pair;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

/* renamed from: w1c  reason: default package */
public final class w1c implements v1c {
    private Pair<a.C0316a, a.b> a;
    private final q b = new q();
    private final Context c;
    private final jzc d;
    private final com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.timeline.a e;
    private final e1c f;

    /* renamed from: w1c$a */
    static final class a implements View.OnClickListener {
        final /* synthetic */ w1c a;

        a(w1c w1c) {
            this.a = w1c;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            w1c.d(this.a);
        }
    }

    /* renamed from: w1c$b */
    static final class b<T> implements g<Pair<? extends a.C0316a, ? extends a.b>> {
        final /* synthetic */ w1c a;

        b(w1c w1c) {
            this.a = w1c;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(Pair<? extends a.C0316a, ? extends a.b> pair) {
            this.a.a = pair;
        }
    }

    public w1c(Context context, jzc jzc, com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.timeline.a aVar, e1c e1c) {
        h.e(context, "context");
        h.e(jzc, "shareFlow");
        h.e(aVar, "timeLineFlowables");
        h.e(e1c, "shareLogger");
        this.c = context;
        this.d = jzc;
        this.e = aVar;
        this.f = e1c;
    }

    public static final void d(w1c w1c) {
        rzc rzc = rzc.a;
        w1c.f.q();
        Pair<a.C0316a, a.b> pair = w1c.a;
        if (pair != null) {
            com.spotify.music.nowplaying.podcast.mixedmedia.model.b b2 = pair.d().b().c().b();
            String str = "";
            if (b2.i().ordinal() != 1) {
                jzc jzc = w1c.d;
                String b3 = iyb.b(b2);
                String d2 = b2.d();
                if (d2 != null) {
                    str = d2;
                }
                jzc.c(pzc.e(b3, str, d.p(b2.a(), null, null, null, 0, null, null, 63, null), b2.e().toString()).build(), rzc, C0707R.string.integration_id_now_playing);
                return;
            }
            r.a h = r.h(b2.n());
            h.c(ViewUris.h0.toString());
            r build = h.build();
            String string = w1c.c.getString(C0707R.string.share_by_artist, d.p(b2.a(), null, null, null, 0, null, null, 63, null));
            h.d(string, "context.getString(\n     ….joinToString()\n        )");
            String b4 = iyb.b(b2);
            String m = b2.m();
            if (m != null) {
                str = m;
            }
            w1c.d.c(pzc.c(b4, str, string, build).build(), rzc, C0707R.string.integration_id_now_playing);
        }
    }

    @Override // defpackage.v1c
    public void a() {
        this.b.c();
    }

    @Override // defpackage.v1c
    public void b(ImageView imageView) {
        h.e(imageView, "shareButton");
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(imageView.getContext(), SpotifyIconV2.SHARE_ANDROID, (float) imageView.getResources().getDimensionPixelSize(C0707R.dimen.std_24dp));
        spotifyIconDrawable.s(androidx.core.content.a.c(imageView.getContext(), C0707R.color.glue_button_text));
        imageView.setImageDrawable(spotifyIconDrawable);
        imageView.setOnClickListener(new a(this));
        this.b.a(this.e.f(false).subscribe(new b(this)));
    }
}
