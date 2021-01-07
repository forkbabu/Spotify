package com.spotify.music.features.spoton;

import com.spotify.mobile.android.service.media.u1;
import com.spotify.music.features.spoton.exceptions.SpotOnPlaybackException;
import io.reactivex.b;
import java.util.List;

/* access modifiers changed from: package-private */
public final class p implements u1 {
    final /* synthetic */ b a;
    final /* synthetic */ String b;

    p(b bVar, String str) {
        this.a = bVar;
        this.b = str;
    }

    @Override // com.spotify.mobile.android.service.media.u1
    public void onActionForbidden(List<String> list) {
        this.a.onError(new SpotOnPlaybackException(String.format(this.b, list)));
    }

    @Override // com.spotify.mobile.android.service.media.u1
    public void onActionSuccess() {
        this.a.onComplete();
    }
}
