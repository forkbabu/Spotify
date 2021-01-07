package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.spotify.android.glue.components.toolbar.ToolbarSide;
import com.spotify.android.glue.components.toolbar.c;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.foundation.R;
import com.spotify.mobius.h;
import com.spotify.music.C0707R;
import com.spotify.music.sociallistening.models.Participant;
import com.spotify.music.sociallistening.participantlist.impl.SocialListeningActivity;
import com.spotify.music.sociallistening.participantlist.impl.g;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import com.spotify.paste.widgets.internal.StateListAnimatorImageButton;
import com.squareup.picasso.Picasso;

/* renamed from: wdd  reason: default package */
public class wdd implements Object {
    private final View a;
    private final g b;
    private final RecyclerView c;
    private final LinearLayout f;
    private final TextView n;
    private final TextView o;
    private final LinearLayout p;
    private final ImageView q;
    private final Button r;
    private final View s;
    private final x9d t;
    private final Picasso u;
    private final SocialListeningActivity v;

    /* renamed from: wdd$a */
    class a implements h<jed> {
        a() {
        }

        @Override // com.spotify.mobius.h, defpackage.da2
        public void accept(Object obj) {
            jed jed = (jed) obj;
            wdd.a(wdd.this, jed);
            if (wdd.this.c.getAdapter() == null) {
                wdd.this.t.l();
                wdd.this.c.setAdapter(wdd.this.b);
            }
            wdd.this.b.c0(jed.f().or((Optional<ImmutableList<Participant>>) ImmutableList.of()));
            wdd.this.b.Z(jed.n().or((Optional<String>) ""));
        }

        @Override // com.spotify.mobius.h, defpackage.w92
        public void dispose() {
            wdd.this.b.b0(pdd.a);
        }
    }

    public wdd(LayoutInflater layoutInflater, ViewGroup viewGroup, g gVar, x9d x9d, Picasso picasso, Activity activity) {
        this.b = gVar;
        this.t = x9d;
        this.u = picasso;
        View inflate = layoutInflater.inflate(C0707R.layout.fragment_social_listening_participant_list, viewGroup, false);
        this.a = inflate;
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C0707R.id.recycler_view);
        this.c = recyclerView;
        this.f = (LinearLayout) inflate.findViewById(C0707R.id.invite_container);
        this.n = (TextView) inflate.findViewById(C0707R.id.invite_notice_title);
        this.o = (TextView) inflate.findViewById(C0707R.id.invite_notice_subtitle);
        this.p = (LinearLayout) inflate.findViewById(C0707R.id.code_layout);
        this.q = (ImageView) inflate.findViewById(C0707R.id.scannable);
        this.r = (Button) inflate.findViewById(C0707R.id.invite_button);
        recyclerView.setLayoutManager(new LinearLayoutManager(layoutInflater.getContext()));
        SocialListeningActivity socialListeningActivity = (SocialListeningActivity) activity;
        this.v = socialListeningActivity;
        c U0 = socialListeningActivity.U0();
        U0.setTitle(socialListeningActivity.getString(C0707R.string.social_listening_participant_list_title_multi_output_design));
        StateListAnimatorImageButton stateListAnimatorImageButton = new StateListAnimatorImageButton(socialListeningActivity);
        int i = q4.g;
        int i2 = Build.VERSION.SDK_INT;
        stateListAnimatorImageButton.setBackground(null);
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(socialListeningActivity, SpotifyIconV2.PLUS, (float) socialListeningActivity.getResources().getDimensionPixelSize(C0707R.dimen.toolbar_icon_size));
        spotifyIconDrawable.r(androidx.core.content.a.b(socialListeningActivity, R.color.white));
        stateListAnimatorImageButton.setImageDrawable(spotifyIconDrawable);
        stateListAnimatorImageButton.setContentDescription(socialListeningActivity.getString(C0707R.string.social_listening_participant_list_toolbar_invite_button_content_description));
        U0.H1(ToolbarSide.END, stateListAnimatorImageButton, C0707R.id.toolbar_invite_button);
        this.s = stateListAnimatorImageButton;
    }

    static void a(wdd wdd, jed jed) {
        String str;
        wdd.s.setVisibility(jed.l() ? 0 : 4);
        if (jed.j()) {
            Resources resources = wdd.a.getResources();
            if (jed.i()) {
                str = resources.getString(C0707R.string.social_listening_participant_list_invite_notice_title_link_shared);
            } else {
                int e = jed.e() - 1;
                if (e > 1) {
                    str = resources.getQuantityString(C0707R.plurals.social_listening_participant_list_invite_notice_title, e, Integer.valueOf(e));
                } else {
                    str = resources.getString(C0707R.string.social_listening_participant_list_invite_notice_title_one_friend);
                }
            }
            String string = resources.getString(C0707R.string.social_listening_participant_list_invite_notice_subtitle);
            wdd.n.setText(str);
            wdd.o.setText(string);
            if (!jed.k() || !jed.h().isPresent() || !jed.g().isPresent()) {
                wdd.p.setVisibility(8);
            } else {
                wdd.u.m(jed.h().get()).n(wdd.q, null);
                wdd.p.getBackground().setColorFilter(jed.g().get().intValue(), PorterDuff.Mode.SRC_IN);
                wdd.p.setVisibility(0);
            }
            wdd.f.setVisibility(0);
            return;
        }
        wdd.f.setVisibility(8);
    }

    public View e() {
        return this.a;
    }

    public /* synthetic */ void f(da2 da2, Participant participant, int i) {
        da2.accept(ied.d(participant, i));
        this.t.q(i, participant.getUsername());
    }

    public /* synthetic */ void g(da2 da2, View view) {
        da2.accept(ied.b());
        this.t.e();
    }

    public /* synthetic */ void h(da2 da2, View view) {
        da2.accept(ied.g());
        this.t.n();
    }

    public h<jed> t(da2<ied> da2) {
        this.b.b0(new sdd(this, da2));
        this.r.setOnClickListener(new qdd(this, da2));
        this.s.setOnClickListener(new rdd(this, da2));
        return new a();
    }
}
