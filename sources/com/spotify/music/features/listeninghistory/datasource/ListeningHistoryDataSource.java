package com.spotify.music.features.listeninghistory.datasource;

import io.reactivex.z;
import kotlin.jvm.internal.f;

public interface ListeningHistoryDataSource {

    public enum HistoryType {
        GROUP,
        ITEM;
        
        public static final a f = new a(null);

        public static final class a {
            public a(f fVar) {
            }
        }
    }

    z<b91> a(Long l, HistoryType historyType);
}
