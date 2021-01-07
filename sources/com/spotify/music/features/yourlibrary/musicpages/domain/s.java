package com.spotify.music.features.yourlibrary.musicpages.domain;

import com.spotify.mobius.e0;
import com.spotify.music.C0707R;
import com.spotify.music.features.yourlibrary.musicpages.domain.r0;
import com.spotify.music.features.yourlibrary.musicpages.domain.s0;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import com.spotify.music.features.yourlibrary.musicpages.pages.MusicPageId;
import com.spotify.music.features.yourlibrary.musicpages.pages.u;

public final /* synthetic */ class s implements ti0 {
    public final /* synthetic */ MusicPagesModel a;

    public /* synthetic */ s(MusicPagesModel musicPagesModel) {
        this.a = musicPagesModel;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        MusicPagesModel musicPagesModel = this.a;
        s0.k kVar = (s0.k) obj;
        MusicItem Q = kVar.Q();
        int ordinal = Q.type().ordinal();
        if (ordinal != 16) {
            if (ordinal == 22) {
                return e0.a(z42.l(new r0.c0(Q.v(), Q.w())));
            }
            switch (ordinal) {
                case 0:
                    if (Q.l()) {
                        return e0.a(z42.l(new r0.d0(), new r0.g()));
                    }
                    return e0.h();
                case 1:
                case 2:
                case 3:
                    break;
                case 4:
                    if (Q.l()) {
                        return e0.a(z42.l(new r0.g0(), new r0.u()));
                    }
                    return e0.h();
                case 5:
                    return e0.a(z42.l(new r0.h0(), new r0.v()));
                case 6:
                    u m = musicPagesModel.m();
                    if (m.k() == MusicPageId.FOLDER) {
                        String orNull = m.t().orNull();
                        orNull.getClass();
                        return e0.a(z42.l(new r0.f0(orNull), new r0.k()));
                    }
                    String orNull2 = m.t().orNull();
                    orNull2.getClass();
                    return e0.a(z42.l(new r0.e0(orNull2), new r0.k()));
                default:
                    switch (ordinal) {
                        case 11:
                            break;
                        case 12:
                        case 13:
                            return e0.a(z42.l(new r0.c0(Q.v(), Q.w()), new r0.w()));
                        default:
                            throw new IllegalArgumentException("Unsupported music item clicked");
                    }
            }
        }
        if (Q.l()) {
            return e0.a(z42.l(new r0.c0(Q.v(), Q.w()), new r0.t(Q.v(), kVar.R())));
        }
        return e0.a(z42.l(new r0.d1(C0707R.string.your_library_music_pages_artists_artist_clicked_offline_message)));
    }
}
