package com.spotify.cosmos.router;

import androidx.lifecycle.Lifecycle;

public interface RxRouterProvider {
    RxRouter provideWithLifecycle(Lifecycle lifecycle);
}
