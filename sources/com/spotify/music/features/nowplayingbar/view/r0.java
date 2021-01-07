package com.spotify.music.features.nowplayingbar.view;

import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import com.spotify.libs.connect.model.GaiaDevice;
import com.spotify.libs.connect.picker.view.d;
import com.spotify.music.C0707R;
import com.spotify.music.features.nowplayingbar.domain.ContentType;
import com.spotify.music.features.nowplayingbar.domain.Track;
import com.spotify.music.features.nowplayingbar.domain.f;
import com.spotify.music.features.nowplayingbar.domain.g;
import com.spotify.music.features.nowplayingbar.domain.h;
import com.spotify.music.features.nowplayingbar.domain.i;
import com.spotify.music.sociallistening.models.b;
import java.util.ArrayList;

public final class r0 {
    private r0() {
    }

    private static iu5 a(d dVar, b bVar, i iVar) {
        if (iVar.e()) {
            return iu5.d();
        }
        GaiaDevice a = dVar.a();
        if (j4d.a(a, bVar)) {
            return iu5.e(a, new g(a, bVar));
        }
        int ordinal = dVar.b().ordinal();
        if (ordinal == 0 || ordinal == 1) {
            return iu5.d();
        }
        if (ordinal == 2 || ordinal == 3) {
            if (a == null || a.isSelf()) {
                return iu5.b();
            }
            return iu5.e(a, new d(a));
        } else if (ordinal == 4) {
            return iu5.a(dVar.c());
        } else {
            StringBuilder V0 = je.V0("Unknown Connect state: ");
            V0.append(dVar.b());
            throw new IllegalArgumentException(V0.toString());
        }
    }

    private static ou5 b(Track track, boolean z) {
        int ordinal = track.e().ordinal();
        if (ordinal == 0) {
            return ou5.c(track.f(), C0707R.string.advertisement_title, track.d());
        }
        if (ordinal == 1) {
            return ou5.b(track.f(), C0707R.string.sas_interruption_title, C0707R.string.widget_label);
        }
        if (ordinal != 2) {
            StringBuilder V0 = je.V0("Cannot map ");
            V0.append(track.e());
            V0.append(" to an instance of TrackViewData");
            throw new IllegalStateException(V0.toString());
        } else if (z) {
            return ou5.a(track.f(), C0707R.string.mini_player_no_forecasting);
        } else {
            return ou5.d(track.f(), track.d(), track.c());
        }
    }

    static lu5 c(f fVar, h.b bVar) {
        ku5 ku5;
        ju5 ju5;
        mu5 mu5;
        h.b bVar2 = (h.b) fVar.d();
        Track a = bVar2.d().a();
        if (a.a()) {
            ku5 = ku5.c(b.a, a.h(), a.h() ? C0707R.string.player_content_description_unlike : C0707R.string.player_content_description_like);
        } else {
            ku5 = ku5.a();
        }
        iu5 a2 = a(fVar.b().a(), fVar.e(), bVar2.c());
        int i = bVar2.d().c() != null ? 1 : 0;
        ArrayList arrayList = new ArrayList(3);
        if (bVar2.d().c() != null) {
            arrayList.add(b(bVar2.d().c(), bVar2.c().b()));
        }
        arrayList.add(b(bVar2.d().a(), false));
        if (bVar2.d().b() != null) {
            arrayList.add(b(bVar2.d().b(), bVar2.c().a()));
        }
        pu5 a3 = pu5.a(arrayList, i, bVar2.c().d(), bVar2.c().c());
        ContentType c = fVar.c();
        Track a4 = bVar2.d().a();
        int ordinal = c.ordinal();
        if (ordinal == 0) {
            ju5 = ju5.a(Optional.fromNullable(a4.b()));
        } else if (ordinal == 1) {
            ju5 = ju5.c();
        } else {
            throw new IllegalArgumentException("Unknown content type: " + c);
        }
        if (bVar2.b().d()) {
            mu5 = mu5.b(a.a, C0707R.string.player_content_description_pause);
        } else {
            mu5 = mu5.b(c.a, C0707R.string.player_content_description_play);
        }
        g b = bVar2.b();
        nu5 a5 = nu5.a(b.c(), b.a(), b.b());
        MoreObjects.checkArgument(fVar.d() instanceof h.b, "NowPlayingBarLoggingModel can only be created from a NowPlayingBarModel that has tracks");
        h.b bVar3 = (h.b) fVar.d();
        Track a6 = bVar3.d().a();
        return lu5.c(a3, ju5, mu5, ku5, a2, a5, vt5.c(a6.g(), a6.h(), bVar3.b().d(), fVar.c(), fVar.b()));
    }
}
