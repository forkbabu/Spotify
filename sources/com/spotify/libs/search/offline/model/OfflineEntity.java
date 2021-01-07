package com.spotify.libs.search.offline.model;

import com.google.common.base.Optional;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.io.Serializable;

public interface OfflineEntity extends JacksonModel, Serializable {
    Optional<String> imageUri();

    String name();

    String uri();
}
