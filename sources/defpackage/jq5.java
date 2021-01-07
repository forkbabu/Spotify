package defpackage;

import android.net.Uri;
import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem;
import com.spotify.mobile.android.service.media.browser.loaders.browse.b;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.functions.l;
import java.util.Collections;

/* renamed from: jq5  reason: default package */
public final /* synthetic */ class jq5 implements l {
    public static final /* synthetic */ jq5 a = new jq5();

    private /* synthetic */ jq5() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        PlayerState playerState = (PlayerState) obj;
        ContextTrack contextTrack = playerState.track().get();
        String contextUri = playerState.contextUri();
        ImmutableMap<String, String> metadata = contextTrack.metadata();
        String c = kxd.c(contextTrack);
        Uri parse = c == null ? Uri.EMPTY : Uri.parse(c);
        b bVar = new b(contextTrack.uri());
        bVar.c(MediaBrowserItem.ActionType.PLAYABLE);
        bVar.r(metadata.get("title"));
        bVar.q(kxd.a(contextTrack));
        bVar.g(contextUri);
        bVar.h(kxd.g(contextTrack));
        bVar.j(parse);
        return Collections.singletonList(bVar.a());
    }
}
