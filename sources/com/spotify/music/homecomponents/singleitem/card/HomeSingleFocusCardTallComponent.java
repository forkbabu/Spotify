package com.spotify.music.homecomponents.singleitem.card;

import android.app.Activity;
import androidx.lifecycle.n;
import com.spotify.music.C0707R;
import com.spotify.music.homecomponents.singleitem.card.HomeSingleFocusCardViewBinder;
import com.spotify.music.libs.home.common.contentapi.b;
import com.spotify.player.model.PlayerState;
import com.squareup.picasso.Picasso;
import io.reactivex.g;
import kotlin.jvm.internal.h;

public final class HomeSingleFocusCardTallComponent extends HomeBaseSingleFocusCardComponent {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HomeSingleFocusCardTallComponent(Activity activity, Picasso picasso, m71 m71, n nVar, b bVar, b bVar2, g<PlayerState> gVar) {
        super(activity, picasso, m71, bVar, bVar2, gVar);
        h.e(activity, "activity");
        h.e(picasso, "picasso");
        h.e(m71, "iconCache");
        h.e(nVar, "lifecycleOwner");
        h.e(bVar, "savedAlbums");
        h.e(bVar2, "savedPlaylists");
        h.e(gVar, "playerStates");
        nVar.A().a(this);
    }

    @Override // com.spotify.music.homecomponents.singleitem.card.HomeBaseSingleFocusCardComponent
    public HomeSingleFocusCardViewBinder.Size a() {
        return HomeSingleFocusCardViewBinder.Size.TALL;
    }

    public int d() {
        return C0707R.id.home_single_focus_card_tall_component;
    }
}
