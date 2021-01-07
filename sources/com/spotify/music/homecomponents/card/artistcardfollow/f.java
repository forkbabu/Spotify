package com.spotify.music.homecomponents.card.artistcardfollow;

import com.spotify.encore.Component;
import com.spotify.encore.consumer.components.artist.api.artistcardfollow.ArtistCardFollow;
import io.reactivex.y;
import kotlin.jvm.internal.h;

public final class f implements b {
    private final ArtistCardFollowButtonLogger a;
    private final a71 b;
    private final aq9 c;
    private final hha d;
    private final y e;
    private final y f;

    public f(ArtistCardFollowButtonLogger artistCardFollowButtonLogger, a71 a71, aq9 aq9, hha hha, y yVar, y yVar2) {
        h.e(artistCardFollowButtonLogger, "artistCardFollowLogger");
        h.e(a71, "navigationCommandHandler");
        h.e(aq9, "homeFollowManager");
        h.e(hha, "homePreferenceManager");
        h.e(yVar, "mainScheduler");
        h.e(yVar2, "ioScheduler");
        this.a = artistCardFollowButtonLogger;
        this.b = a71;
        this.c = aq9;
        this.d = hha;
        this.e = yVar;
        this.f = yVar2;
    }

    @Override // com.spotify.music.homecomponents.card.artistcardfollow.b
    public void a(s81 s81) {
        h.e(s81, "model");
        o81 o81 = (o81) s81.events().get("click");
        n61 b2 = n61.b("click", s81);
        if (h.a(o81 != null ? o81.name() : null, "navigate")) {
            this.b.b(o81, b2);
        }
    }

    @Override // com.spotify.music.homecomponents.card.artistcardfollow.b
    public void b(s81 s81, Component<ArtistCardFollow.Model, ArtistCardFollow.Events> component, ArtistCardFollow.Model model, String str) {
        h.e(s81, "hubsModel");
        h.e(component, "card");
        h.e(model, "cardModel");
        h.e(str, "artistUri");
        n61 b2 = n61.b("followClick", s81);
        ArtistCardFollow.FollowingStatus f2 = this.c.f(str);
        ArtistCardFollow.FollowingStatus followingStatus = ArtistCardFollow.FollowingStatus.Following;
        if (f2 == followingStatus) {
            followingStatus = ArtistCardFollow.FollowingStatus.NotFollowing;
        }
        component.render(ArtistCardFollow.Model.copy$default(model, null, null, followingStatus, 3, null));
        ArtistCardFollowButtonLogger artistCardFollowButtonLogger = this.a;
        h.d(b2, "followClickEvent");
        artistCardFollowButtonLogger.a(str, b2, followingStatus);
        aq9 aq9 = this.c;
        aq9.b(aq9.g(str).I0(this.f).T().B(this.e).E(new c(component, model, str)).B(this.f).r(d.a).subscribe(new e(this, str, followingStatus)));
    }
}
