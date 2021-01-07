package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.spotify.cosmos.android.CosmosServiceIntentBuilder;
import com.spotify.mobile.android.service.SpotifyService;

/* renamed from: pc3  reason: default package */
public final /* synthetic */ class pc3 implements CosmosServiceIntentBuilder {
    public static final /* synthetic */ pc3 a = new pc3();

    private /* synthetic */ pc3() {
    }

    @Override // com.spotify.cosmos.android.CosmosServiceIntentBuilder
    public final Intent createCosmosServiceIntent(Context context) {
        return new Intent().setComponent(new ComponentName(context, SpotifyService.class));
    }
}
