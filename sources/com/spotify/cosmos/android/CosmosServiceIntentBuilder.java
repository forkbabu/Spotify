package com.spotify.cosmos.android;

import android.content.Context;
import android.content.Intent;

public interface CosmosServiceIntentBuilder {
    Intent createCosmosServiceIntent(Context context);
}
