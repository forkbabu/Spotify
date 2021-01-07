package com.spotify.music.features.wrapped2020.stories.templates.summary.sharecard;

import android.animation.Animator;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.Button;
import androidx.core.widget.c;
import androidx.viewpager2.widget.ViewPager2;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.share.menu.preview.view.ViewPagerDotsIndicator;
import com.spotify.music.C0707R;
import com.spotify.music.features.wrapped2020.stories.templates.d;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import defpackage.ex1;
import defpackage.jx1;
import defpackage.ox1;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.h;

public final class SummaryShareStory extends d {
    private i j;
    private final ex1.a k = ex1.a.a;
    private final g l;
    private final com.spotify.music.features.wrapped2020.stories.share.a m;
    private final ez8 n;

    /* compiled from: java-style lambda group */
    static final class a implements View.OnClickListener {
        public final /* synthetic */ int a;
        public final /* synthetic */ Object b;
        public final /* synthetic */ Object c;

        public a(int i, Object obj, Object obj2) {
            this.a = i;
            this.b = obj;
            this.c = obj2;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int i = this.a;
            if (i == 0) {
                SummaryShareStory.l((SummaryShareStory) this.b);
            } else if (i == 1) {
                SummaryShareStory.k((SummaryShareStory) this.b);
            } else {
                throw null;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SummaryShareStory(Activity activity, g gVar, com.spotify.music.features.wrapped2020.stories.share.a aVar, ez8 ez8) {
        super(activity, jx1.b.a, C0707R.layout.story_summary_share, gVar.d(), gVar.f(), EmptyList.a);
        h.e(activity, "activity");
        h.e(gVar, "viewData");
        h.e(aVar, "sharePayloadProviderFactory");
        h.e(ez8, "storiesLogger");
        this.l = gVar;
        this.m = aVar;
        this.n = ez8;
    }

    public static final void k(SummaryShareStory summaryShareStory) {
        ix1 g = summaryShareStory.g();
        if (g != null) {
            g.a(ox1.f.a);
        }
        summaryShareStory.n.a(summaryShareStory.l.f());
    }

    public static final void l(SummaryShareStory summaryShareStory) {
        ix1 g = summaryShareStory.g();
        if (g != null) {
            g.a(ox1.h.a);
        }
    }

    public static final void m(SummaryShareStory summaryShareStory) {
        ix1 g = summaryShareStory.g();
        if (g != null) {
            g.a(ox1.e.a);
        }
    }

    @Override // com.spotify.music.features.wrapped2020.stories.templates.d, defpackage.hx1
    public List<cmf<com.spotify.mobile.android.share.menu.preview.api.d>> b() {
        i iVar = this.j;
        if (iVar != null) {
            return this.m.c(this.l.e(), kotlin.collections.d.t(this.l.b().get(iVar.e().getCurrentItem()).f()));
        }
        return EmptyList.a;
    }

    @Override // com.spotify.music.features.wrapped2020.stories.templates.d, defpackage.hx1
    public ex1 d() {
        return this.k;
    }

    @Override // com.spotify.music.features.wrapped2020.stories.templates.d, defpackage.hx1
    public void dispose() {
        super.dispose();
        i iVar = this.j;
        if (iVar != null) {
            iVar.a().e(iVar.e());
        }
        this.j = null;
    }

    @Override // com.spotify.music.features.wrapped2020.stories.templates.d
    public Animator h() {
        i iVar = this.j;
        if (iVar == null) {
            return null;
        }
        Animator a2 = wz8.a(iVar.e(), C0707R.animator.animator_summary_share_pager);
        h.d(a2, "viewPager.createAnimator…ator_summary_share_pager)");
        Animator a3 = wz8.a(iVar.a(), C0707R.animator.animator_summary_share_dots);
        h.d(a3, "dots.createAnimator(R.an…mator_summary_share_dots)");
        Animator a4 = wz8.a(iVar.d(), C0707R.animator.animator_summary_share_share_cta);
        h.d(a4, "shareButton.createAnimat…_summary_share_share_cta)");
        Animator a5 = wz8.a(iVar.c(), C0707R.animator.animator_summary_share_restart_cta);
        h.d(a5, "replayButton.createAnima…ummary_share_restart_cta)");
        return wz8.k(a2, a3, a4, a5);
    }

    @Override // com.spotify.music.features.wrapped2020.stories.templates.d
    public void i(View view) {
        h.e(view, "view");
        View G = q4.G(view, C0707R.id.summary_card_carousel);
        h.d(G, "requireViewById(view, R.id.summary_card_carousel)");
        ViewPager2 viewPager2 = (ViewPager2) G;
        View G2 = q4.G(view, C0707R.id.dots);
        h.d(G2, "requireViewById(view, R.id.dots)");
        ViewPagerDotsIndicator viewPagerDotsIndicator = (ViewPagerDotsIndicator) G2;
        View G3 = q4.G(view, C0707R.id.share);
        h.d(G3, "requireViewById(view, R.id.share)");
        Button button = (Button) G3;
        View G4 = q4.G(view, C0707R.id.replay);
        h.d(G4, "requireViewById(view, R.id.replay)");
        Button button2 = (Button) G4;
        View G5 = q4.G(view, C0707R.id.story_background);
        h.d(G5, "requireViewById(view, R.id.story_background)");
        i iVar = new i(viewPager2, viewPagerDotsIndicator, button, button2, (InterceptTouchLayout) G5);
        InterceptTouchLayout b = iVar.b();
        b.setBackgroundColor(this.l.a());
        b.setUserLeftClickListener$apps_music_features_wrapped_2020(new SummaryShareStory$onViewCreated$$inlined$apply$lambda$1(this, view));
        ViewPager2 e = iVar.e();
        e.setAdapter(new d(this.l.c(), this.l.b()));
        e.setOffscreenPageLimit(3);
        e.setPageTransformer(new f(this, e));
        iVar.a().d(iVar.e());
        Button d = iVar.d();
        d.setText(this.l.h());
        d.setOnClickListener(new a(0, this, view));
        Button c = iVar.c();
        c.setText(this.l.g());
        Context context = view.getContext();
        h.d(context, "view.context");
        SpotifyIconV2 spotifyIconV2 = SpotifyIconV2.REFRESH;
        h.e(context, "context");
        h.e(spotifyIconV2, "icon");
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, spotifyIconV2, (float) context.getResources().getDimensionPixelSize(C0707R.dimen.replay_icon));
        spotifyIconDrawable.r(-1);
        c.h(c, spotifyIconDrawable, null, null, null);
        c.setOnClickListener(new a(1, this, view));
        this.j = iVar;
        this.n.b(this.l.f());
    }
}
