package com.spotify.music.playlist.extender;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.base.java.logging.Logger;
import com.spotify.encore.foundation.R;
import com.spotify.mobile.android.ui.view.w;
import com.spotify.mobile.android.util.o0;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.music.C0707R;
import com.spotify.music.contentviewstate.view.LoadingView;
import com.spotify.music.playlist.extender.f0;
import com.spotify.music.playlist.extender.model.RecTrack;
import com.spotify.music.playlist.extender.u;
import com.spotify.music.playlist.extender.v;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.command.PlayCommand;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PlayerOptionOverrides;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.player.model.command.options.SkipToTrack;
import com.spotify.player.play.f;
import com.spotify.playlist.endpoints.i;
import com.spotify.rxjava2.q;
import io.reactivex.g;
import io.reactivex.y;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class g0 implements f0 {
    static final SpSharedPreferences.b<Object, Boolean> L = SpSharedPreferences.b.e("playlist-extender-is-collapsed-key");
    private kb0 A;
    private String B;
    private boolean C;
    private boolean D;
    private boolean E;
    private boolean F;
    private final q G = new q();
    private final bre H;
    private final u.a I;
    private final v.a J;
    private final View.OnClickListener K;
    private final u a;
    private final ObjectMapper b;
    private final f0.a c;
    private final Context d;
    private final String e;
    private final String f;
    private final f g;
    private final PlayOrigin h;
    private final g<PlayerState> i;
    private final SpotifyIconDrawable j;
    private final ObjectAnimator k;
    private final int l;
    private final SpSharedPreferences<Object> m;
    private final x n;
    private final sa0 o;
    private final y p;
    private final i q;
    private final ExtenderLogger r;
    private final o0 s;
    private final com.spotify.music.libs.viewuri.c t;
    private final Handler u;
    private final boolean v;
    private w w;
    private twd x;
    private ka0 y;
    private Button z;

    class a implements u.a {
        a() {
        }

        @Override // com.spotify.music.playlist.extender.u.a
        public void a(List<RecTrack> list) {
            g0.this.D = true;
            g0.this.w.Z(list);
            g0.this.A.setSubtitle(null);
            if (g0.this.w.f0().isEmpty()) {
                if (g0.this.a.a()) {
                    g0.s(g0.this);
                } else {
                    g0.this.E = false;
                    g0.this.A.setSubtitle(g0.this.d.getString(C0707R.string.playlist_extended_tracks_no_results));
                }
            }
            g0 g0Var = g0.this;
            g0Var.B = g0Var.d.getString(g0.this.c.d() == 0 ? C0707R.string.playlist_extended_tracks_section_description_songs_empty : C0707R.string.playlist_extended_tracks_section_description_songs);
            g0.this.L();
        }

        @Override // com.spotify.music.playlist.extender.u.a
        public void onError(Throwable th) {
            g0.this.D = true;
            Logger.b("extender: onError(%s)", th.getMessage());
            if (g0.this.z()) {
                g0.this.E = false;
                g0.this.A.setSubtitle(g0.this.d.getString(C0707R.string.playlist_extended_tracks_offline));
            } else {
                g0.this.E = true;
                g0.this.A.setSubtitle(g0.this.d.getString(C0707R.string.playlist_extended_tracks_error));
            }
            g0.this.L();
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements v.a {
        b() {
        }

        public void a(String str, int i, v.a.AbstractC0321a aVar) {
            g0.this.G.a(g0.this.q.e(g0.this.f, Collections.singletonList(str), g0.this.t.toString(), g0.this.e).A(g0.this.p).subscribe(new n(this, str, i, aVar), new o(this, aVar)));
        }
    }

    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            g0 g0Var = g0.this;
            g0Var.F = !g0Var.F;
            if (g0.this.F) {
                g0.this.r.b(false);
                g0.this.L();
            } else {
                g0.this.c.b();
                g0.this.L();
                g0.this.M();
                g0.this.r.b(true);
            }
            SpSharedPreferences.a b = g0.this.m.b();
            b.a(g0.L, g0.this.F);
            b.i();
        }
    }

    class d extends TypeReference<List<RecTrack>> {
        d(g0 g0Var) {
        }
    }

    /* access modifiers changed from: package-private */
    public class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            g0.q(g0.this);
        }
    }

    public g0(Context context, String str, int i2, SpotifyIconDrawable spotifyIconDrawable, ObjectAnimator objectAnimator, ObjectMapper objectMapper, f fVar, PlayOrigin playOrigin, g<PlayerState> gVar, z zVar, boolean z2, SpSharedPreferences<Object> spSharedPreferences, x xVar, sa0 sa0, y yVar, i iVar, ExtenderLogger extenderLogger, o0 o0Var, com.spotify.music.libs.viewuri.c cVar, bre bre, boolean z3, f0.a aVar) {
        a aVar2 = new a();
        this.I = aVar2;
        this.J = new b();
        this.K = new c();
        this.c = aVar;
        this.d = context;
        this.f = str;
        this.l = i2;
        this.j = spotifyIconDrawable;
        this.k = objectAnimator;
        this.b = objectMapper;
        this.g = fVar;
        this.h = playOrigin;
        this.i = gVar;
        this.e = je.x0(str, ":recommended");
        this.a = zVar.b(aVar2);
        this.F = z2;
        this.m = spSharedPreferences;
        this.n = xVar;
        this.o = sa0;
        this.p = yVar;
        this.q = iVar;
        this.r = extenderLogger;
        this.s = o0Var;
        this.t = cVar;
        this.u = new Handler(context.getMainLooper());
        this.v = z3;
        this.H = bre;
    }

    public static void C(g0 g0Var, int i2) {
        String uri = g0Var.w.c0(i2).getUri();
        if (!g0Var.v) {
            g0Var.r.f(uri, i2);
            g0Var.c.c();
            return;
        }
        int i3 = ImmutableList.a;
        ImmutableList.Builder builder = new ImmutableList.Builder();
        for (int i4 = 0; i4 < g0Var.w.b0(); i4++) {
            builder.mo53add((ImmutableList.Builder) g0Var.w.c0(i4).getUri());
        }
        com.spotify.player.model.Context fromTrackUris = com.spotify.player.model.Context.fromTrackUris(g0Var.e, builder.build());
        PreparePlayOptions.Builder skipTo = PreparePlayOptions.builder().skipTo(SkipToTrack.fromIndices(Long.valueOf((long) i2), 0L));
        PlayerOptionOverrides.Builder builder2 = PlayerOptionOverrides.builder();
        Boolean bool = Boolean.FALSE;
        PreparePlayOptions build = skipTo.playerOptionsOverride(builder2.repeatingContext(bool).repeatingTrack(bool).shufflingContext(bool).build()).build();
        g0Var.G.a(g0Var.g.a(PlayCommand.builder(fromTrackUris, g0Var.h).options(build).loggingParams(LoggingParams.builder().interactionId(g0Var.r.e(uri, i2)).pageInstanceId(g0Var.H.get()).build()).build()).subscribe());
    }

    /* access modifiers changed from: private */
    public void D() {
        boolean z2 = false;
        if (z()) {
            this.E = false;
            this.A.setSubtitle(this.d.getString(C0707R.string.playlist_extended_tracks_offline));
            L();
            return;
        }
        if (this.w.f0().size() < this.l * 2) {
            z2 = true;
        }
        if (this.C && this.c.h() && z2 && !this.a.b()) {
            this.a.i(this.c.e());
            L();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void L() {
        boolean z2 = true;
        if (!(!this.c.a())) {
            this.x.i0(0, 1, 2, 3, 4);
        } else if (this.F) {
            this.x.l0(0);
            this.x.i0(1, 2, 3, 4);
            ((la0) this.y).getTitleView().setTextColor(androidx.core.content.a.b(this.d, R.color.gray_70));
            ((la0) this.y).getTitleView().setOnClickListener(this.K);
            ((la0) this.y).d().setVisibility(0);
            ((la0) this.y).Q0(SpotifyIcon.CHEVRON_DOWN_32);
            ((la0) this.y).c().setVisibility(8);
        } else if (this.C) {
            this.x.l0(0);
            ((la0) this.y).Q0(SpotifyIcon.CHEVRON_UP_32);
            ((la0) this.y).getTitleView().setTextColor(androidx.core.content.a.b(this.d, R.color.white));
            boolean z3 = !this.D;
            boolean b2 = this.a.b();
            boolean z4 = !TextUtils.isEmpty(this.A.getSubtitleView().getText());
            if (!z4 && !z3) {
                ((la0) this.y).d().setVisibility(0);
                ((la0) this.y).getTitleView().setOnClickListener(this.K);
            } else {
                ((la0) this.y).d().setVisibility(8);
                ((la0) this.y).getTitleView().setOnClickListener(null);
            }
            if (!z3 || !b2) {
                this.x.i0(2);
                if (z4) {
                    this.x.l0(3);
                    this.x.i0(1);
                    ((la0) this.y).c().setVisibility(8);
                    if (this.E) {
                        this.x.l0(4);
                    } else {
                        this.x.i0(4);
                    }
                } else {
                    this.x.i0(3);
                    this.x.l0(4, 1);
                    ((la0) this.y).B0(this.B);
                    ((la0) this.y).c().setVisibility(0);
                }
                if (this.z.getCompoundDrawables()[0] == null) {
                    z2 = false;
                }
                if (b2) {
                    if (!z2) {
                        this.z.setCompoundDrawablesWithIntrinsicBounds(this.j, (Drawable) null, (Drawable) null, (Drawable) null);
                    }
                    this.z.setText(C0707R.string.playlist_extended_tracks_refreshing_button);
                    this.k.start();
                    return;
                }
                if (this.k.isStarted()) {
                    this.k.end();
                }
                if (z2) {
                    this.z.setCompoundDrawables(null, null, null, null);
                }
                this.z.setText(C0707R.string.playlist_extended_tracks_refresh_button);
                return;
            }
            this.x.l0(2);
            this.x.i0(3, 1, 4);
            ((la0) this.y).c().setVisibility(8);
        }
    }

    static void q(g0 g0Var) {
        if (!g0Var.a.b()) {
            g0Var.w.l0();
            g0Var.D();
        }
        g0Var.r.d();
    }

    static void s(g0 g0Var) {
        g0Var.w.k0();
        g0Var.a.j();
        g0Var.a.i(g0Var.c.e());
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private boolean z() {
        return !this.c.h() && this.w.f0().isEmpty();
    }

    public /* synthetic */ void B(PlayerState playerState) {
        Optional<ContextTrack> track = playerState.track();
        if (!track.isPresent() || !rw.equal(this.e, playerState.contextUri())) {
            this.w.m0(null);
        } else {
            this.w.m0(track.get().uri());
        }
    }

    public void E(ViewGroup viewGroup) {
        w b2 = this.n.b(this.v, new q(this));
        this.w = b2;
        b2.p0(this.J);
        this.w.n0(!this.c.h());
        ka0 c2 = this.o.c(this.d, viewGroup);
        this.y = c2;
        ((la0) c2).setTitle(this.d.getString(C0707R.string.playlist_extended_tracks_section_title));
        ((la0) this.y).u2(this.K);
        View view = ((la0) this.y).getView();
        w wVar = new w(new int[]{androidx.core.content.a.b(this.d, C0707R.color.gray_layer), 0}, new float[]{0.0f, 1.0f});
        int i2 = q4.g;
        int i3 = Build.VERSION.SDK_INT;
        view.setBackground(wVar);
        LinearLayout linearLayout = new LinearLayout(this.d);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        int dimensionPixelSize = this.d.getResources().getDimensionPixelSize(C0707R.dimen.playlist_extender_refresh_bottom_padding);
        linearLayout.setPadding(0, dimensionPixelSize, 0, dimensionPixelSize);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        Button button = (Button) com.spotify.android.paste.app.c.b(this.d, Button.class, null, C0707R.attr.pasteButtonStyleInfo);
        this.z = button;
        button.setId(C0707R.id.extender_refresh_button);
        this.z.setCompoundDrawablePadding(nud.f(10.0f, this.d.getResources()));
        this.z.setOnClickListener(new e());
        linearLayout.addView(this.z);
        LinearLayout linearLayout2 = new LinearLayout(this.d);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(17);
        int dimensionPixelSize2 = this.d.getResources().getDimensionPixelSize(C0707R.dimen.playlist_extender_loading_view_padding);
        linearLayout2.setPadding(0, dimensionPixelSize2, 0, dimensionPixelSize2);
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        LoadingView l2 = LoadingView.l(LayoutInflater.from(this.d));
        l2.s(0);
        linearLayout2.addView(l2);
        gb0 a2 = e90.c().a(this.d, null);
        a2.getTitleView().setSingleLine(false);
        a2.getTitleView().setEllipsize(null);
        a2.getSubtitleView().setSingleLine(false);
        a2.getSubtitleView().setEllipsize(null);
        a2.getTitleView().setVisibility(8);
        a2.setSubtitle(null);
        this.A = a2;
        twd twd = new twd(false);
        this.x = twd;
        twd.Z(new v02(((la0) this.y).getView(), true), 0);
        this.x.Z(this.w, 1);
        this.x.Z(new v02(linearLayout2, false), 2);
        this.x.Z(new v02(this.A.getView(), true), 3);
        this.x.Z(new v02(linearLayout, true), 4);
        this.x.i0(0, 1, 2, 3, 4);
    }

    public void F(Bundle bundle) {
        this.a.g(bundle);
        if (bundle != null) {
            this.D = bundle.getBoolean("got_first_response", false);
            try {
                List<RecTrack> list = (List) this.b.readValue(bundle.getString("tracks", ""), new d(this));
                this.w.Z(list);
                this.C = !list.isEmpty();
            } catch (IOException e2) {
                Logger.e(e2, "Failed to read extended tracks.", new Object[0]);
            }
        }
    }

    public void G(Bundle bundle) {
        this.a.h(bundle);
        bundle.putBoolean("got_first_response", this.D);
        w wVar = this.w;
        if (wVar != null) {
            try {
                bundle.putString("tracks", this.b.writeValueAsString(wVar.f0()));
            } catch (JsonProcessingException e2) {
                Logger.e(e2, "Failed ro save extended tracks.", new Object[0]);
            }
        }
    }

    public void H() {
        L();
    }

    public void I(boolean z2) {
        w wVar = this.w;
        if (wVar != null) {
            boolean z3 = !wVar.g0();
            this.w.n0(!z2);
            if (z2 && !z3) {
                D();
            }
        }
    }

    public void J() {
        this.G.a(this.i.Q(this.p).subscribe(new p(this)));
    }

    public void K() {
        this.a.k();
        this.G.c();
    }

    public void M() {
        if ((!this.c.a()) && !this.F && !this.C && this.c.f()) {
            this.C = true;
            this.u.post(new m(this));
        }
    }

    public RecyclerView.e<? extends RecyclerView.b0> y() {
        return this.x;
    }
}
