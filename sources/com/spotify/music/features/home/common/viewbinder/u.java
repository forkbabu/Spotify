package com.spotify.music.features.home.common.viewbinder;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import androidx.core.content.a;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.C0707R;
import com.spotify.music.features.followfeed.entrypoint.FollowFeedButtonManagerImpl;
import com.spotify.music.libs.followfeed.entrypoint.FollowFeedButton;
import com.spotify.music.libs.followfeed.entrypoint.b;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;
import com.spotify.music.navigation.t;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import com.spotify.paste.widgets.internal.StateListAnimatorImageButton;
import com.spotify.ubi.specification.factories.g1;

public class u implements t {
    private final Context a;
    private final Resources b;
    private final ere c;
    private final g1 d;
    private final bg5 e;
    private final bj5 f;

    public u(Context context, Resources resources, ere ere, g1 g1Var, bg5 bg5, bj5 bj5) {
        this.a = context;
        this.b = resources;
        this.c = ere;
        this.d = g1Var;
        this.e = bg5;
        this.f = bj5;
    }

    public b a(c cVar, v vVar, b.a aVar) {
        g1.e.a b2 = this.d.e().b(cVar.toString(), "");
        FollowFeedButton followFeedButton = new FollowFeedButton(this.a);
        followFeedButton.setId(C0707R.id.home_toolbar_follow_feed);
        followFeedButton.setContentDescription(this.a.getString(C0707R.string.follow_feed_feature_title));
        followFeedButton.setOnClickListener(new c(this, b2, aVar));
        vVar.I(followFeedButton);
        this.c.a(b2.b());
        return followFeedButton;
    }

    public void b(c cVar, v vVar, t tVar) {
        StateListAnimatorImageButton stateListAnimatorImageButton = new StateListAnimatorImageButton(this.a);
        stateListAnimatorImageButton.setId(C0707R.id.home_toolbar_image_recs);
        stateListAnimatorImageButton.setContentDescription(this.a.getString(C0707R.string.image_recs));
        stateListAnimatorImageButton.setImageDrawable(new SpotifyIconDrawable(this.a, SpotifyIconV2.CAMERA, (float) this.b.getDimensionPixelSize(C0707R.dimen.home_toolbar_icon_size)));
        stateListAnimatorImageButton.setOnClickListener(new d(tVar));
        vVar.I(stateListAnimatorImageButton);
    }

    public void c(c cVar, v vVar, t tVar) {
        StateListAnimatorImageButton stateListAnimatorImageButton = new StateListAnimatorImageButton(this.a);
        stateListAnimatorImageButton.setId(C0707R.id.home_toolbar_listening_history);
        stateListAnimatorImageButton.setImageDrawable(a.d(this.a, C0707R.drawable.ic_listening_history));
        stateListAnimatorImageButton.setOnClickListener(new e(this));
        vVar.I(stateListAnimatorImageButton);
        this.f.a();
    }

    public void d(c cVar, v vVar, t tVar) {
        g1.e.c d2 = this.d.e().d("");
        StateListAnimatorImageButton stateListAnimatorImageButton = new StateListAnimatorImageButton(this.a);
        stateListAnimatorImageButton.setId(C0707R.id.home_toolbar_settings);
        stateListAnimatorImageButton.setContentDescription(this.a.getString(C0707R.string.settings_title));
        stateListAnimatorImageButton.setImageDrawable(new SpotifyIconDrawable(this.a, SpotifyIconV2.GEARS, (float) this.b.getDimensionPixelSize(C0707R.dimen.home_toolbar_icon_size)));
        stateListAnimatorImageButton.setOnClickListener(new f(this, d2, tVar));
        vVar.I(stateListAnimatorImageButton);
        this.c.a(d2.b());
    }

    public /* synthetic */ void e(g1.e.a aVar, b.a aVar2, View view) {
        this.c.a(aVar.a(ViewUris.e.toString()));
        ((FollowFeedButtonManagerImpl) aVar2).c();
    }

    public /* synthetic */ void f(View view) {
        this.f.b();
        this.e.a();
    }

    public /* synthetic */ void g(g1.e.c cVar, t tVar, View view) {
        this.c.a(cVar.a("spotify:internal:preferences"));
        tVar.d("spotify:internal:preferences");
    }
}
