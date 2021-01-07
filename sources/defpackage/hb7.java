package defpackage;

import android.view.View;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.C0707R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import com.spotify.paste.widgets.SquareImageView;
import com.spotify.playlist.models.e;
import com.spotify.remoteconfig.m6;
import defpackage.gb7;
import kotlin.jvm.internal.h;

/* renamed from: hb7  reason: default package */
public final class hb7 implements gb7 {
    private View a;
    private final ajf<gb7.a> b;
    private final m6 c;

    /* renamed from: hb7$a */
    static final class a implements View.OnClickListener {
        final /* synthetic */ e.b a;
        final /* synthetic */ hb7 b;

        a(e.b bVar, hb7 hb7, e eVar) {
            this.a = bVar;
            this.b = hb7;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ((gb7.a) this.b.b.get()).a(this.a);
        }
    }

    public hb7(ajf<gb7.a> ajf, m6 m6Var) {
        h.e(ajf, "binderListener");
        h.e(m6Var, "episodeTranscriptProperties");
        this.b = ajf;
        this.c = m6Var;
    }

    @Override // defpackage.gb7
    public void a(e eVar) {
        View view = this.a;
        if (view != null) {
            boolean z = true;
            if (!this.c.a() || eVar == null || !(!eVar.a().isEmpty())) {
                z = false;
            }
            if (z) {
                view.setVisibility(0);
                view.setOnClickListener(new a(eVar.a().get(0), this, eVar));
                return;
            }
            view.setVisibility(8);
            return;
        }
        h.k("transcriptLinkContainer");
        throw null;
    }

    @Override // defpackage.gb7
    public void b(View view) {
        h.e(view, "rootView");
        View findViewById = view.findViewById(C0707R.id.transcript_link_image);
        h.d(findViewById, "rootView.findViewById(R.id.transcript_link_image)");
        ((SquareImageView) findViewById).setImageDrawable(new SpotifyIconDrawable(view.getContext(), SpotifyIconV2.CHEVRON_RIGHT, (float) view.getResources().getDimensionPixelSize(C0707R.dimen.std_24dp)));
        this.a = view;
    }
}
