package com.spotify.libs.search.offline.model;

import com.spotify.libs.search.offline.model.OfflineEntity;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.io.Serializable;
import java.util.List;

public interface OfflineEntityList<T extends OfflineEntity> extends JacksonModel, Serializable {
    List<T> hits();
}
