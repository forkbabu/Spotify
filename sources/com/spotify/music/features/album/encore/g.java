package com.spotify.music.features.album.encore;

import com.spotify.encore.consumer.elements.badge.contentrestriction.ContentRestriction;
import com.spotify.music.features.album.f;
import com.spotify.music.libs.ageverification.AgeRestrictedContentFacade;
import kotlin.jvm.internal.h;

public final class g implements vd3 {
    private final a71 a;
    private final a71 b;
    private final AgeRestrictedContentFacade c;

    public g(a71 a71, a71 a712, AgeRestrictedContentFacade ageRestrictedContentFacade) {
        h.e(a71, "playFromContextCommandHandler");
        h.e(a712, "contextMenuCommandHandlerLazy");
        h.e(ageRestrictedContentFacade, "mAgeRestrictedContentFacade");
        this.a = a71;
        this.b = a712;
        this.c = ageRestrictedContentFacade;
    }

    @Override // defpackage.vd3
    public void a(s81 s81) {
        h.e(s81, "model");
        o81 o81 = (o81) s81.events().get("rightAccessoryClick");
        if (o81 != null) {
            this.b.b(o81, n61.b("rightAccessoryClick", s81));
        }
    }

    @Override // defpackage.vd3
    public void b() {
    }

    @Override // defpackage.vd3
    public void c(s81 s81) {
        h.e(s81, "model");
        if (f.a(s81) == ContentRestriction.Over19Only) {
            Object obj = s81.metadata().get("uri");
            if (obj != null) {
                this.c.d((String) obj, null);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        o81 o81 = (o81) s81.events().get("click");
        if (o81 != null) {
            this.a.b(o81, n61.b("click", s81));
        }
    }
}
