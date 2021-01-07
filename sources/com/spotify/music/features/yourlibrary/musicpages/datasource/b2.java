package com.spotify.music.features.yourlibrary.musicpages.datasource;

import com.google.common.base.MoreObjects;
import com.spotify.mobile.android.util.x;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import com.spotify.playlist.models.offline.a;
import java.util.regex.Pattern;

public final /* synthetic */ class b2 implements n4 {
    public static final /* synthetic */ b2 a = new b2();

    private /* synthetic */ b2() {
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.n4
    public final boolean a(x3 x3Var, MusicItem musicItem) {
        String e = x3Var.c().e();
        if (!e.isEmpty() && !Pattern.compile(Pattern.quote(e), 66).matcher(musicItem.w()).find()) {
            return false;
        }
        if (((Boolean) MoreObjects.firstNonNull(x3Var.c().b().get("available_offline_only"), Boolean.FALSE)).booleanValue()) {
            a aVar = (a) x.n(musicItem.p(), a.f.a);
            aVar.getClass();
            if (aVar instanceof a.f) {
                return false;
            }
        }
        return true;
    }
}
