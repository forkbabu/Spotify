package com.spotify.music.spotlets.radio.collection;

import com.spotify.mobile.android.cosmos.JacksonModel;

class RemoteCosmosCollectionApiImpl$Items implements JacksonModel {
    public final String contextSource;
    public final String[] items;
    public final String source;

    public RemoteCosmosCollectionApiImpl$Items(String[] strArr, String str, String str2) {
        this.items = strArr;
        this.contextSource = str;
        this.source = str2;
    }
}
