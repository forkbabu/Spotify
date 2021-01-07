package com.spotify.music.features.listeninghistory.datasource;

import com.spotify.music.features.listeninghistory.datasource.ListeningHistoryDataSource;

public interface d {
    void a(ListeningHistoryDataSource.HistoryType historyType);

    ListeningHistoryDataSource.HistoryType getFilter();
}
