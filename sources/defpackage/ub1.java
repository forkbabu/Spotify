package defpackage;

import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor;
import defpackage.oia;
import java.util.List;

/* renamed from: ub1  reason: default package */
public final /* synthetic */ class ub1 implements oia.a {
    public final /* synthetic */ SpotifyServiceIntentProcessor.a a;

    public /* synthetic */ ub1(SpotifyServiceIntentProcessor.a aVar) {
        this.a = aVar;
    }

    @Override // com.spotify.mobile.android.cosmos.player.v2.Player.ActionCallback
    public final void onActionForbidden(List list) {
        this.a.a(list);
    }

    @Override // com.spotify.mobile.android.cosmos.player.v2.Player.ActionCallback
    public /* synthetic */ void onActionSuccess() {
        nia.a(this);
    }
}
