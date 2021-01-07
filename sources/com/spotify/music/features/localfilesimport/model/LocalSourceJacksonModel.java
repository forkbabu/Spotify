package com.spotify.music.features.localfilesimport.model;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.music.C0707R;
import com.spotify.music.features.localfilesimport.model.LocalItem;
import com.spotify.music.libs.collection.json.CoversJacksonModel;
import com.spotify.playlist.models.Covers;
import com.spotify.playlist.models.q;
import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LocalSourceJacksonModel implements JacksonModel, LocalItem {
    @JsonProperty("images")
    private final CoversJacksonModel mCovers;
    @JsonProperty("name")
    private final String mName;
    @JsonProperty("tracks")
    private final List<LocalTrackJacksonModel> mTracks;
    @JsonIgnore
    private final List<String> mTracksIds;

    public LocalSourceJacksonModel(@JsonProperty("name") String str, @JsonProperty("tracks") List<LocalTrackJacksonModel> list, @JsonProperty("images") CoversJacksonModel coversJacksonModel) {
        List<LocalTrackJacksonModel> list2;
        this.mName = str;
        this.mCovers = coversJacksonModel;
        if (list != null) {
            list2 = list;
        } else {
            list2 = new ArrayList<>(0);
        }
        this.mTracks = list2;
        this.mTracksIds = new ArrayList(list2.size());
        if (list != null) {
            for (LocalTrackJacksonModel localTrackJacksonModel : list2) {
                this.mTracksIds.add(localTrackJacksonModel.getUri());
            }
        }
    }

    @Override // com.spotify.music.features.localfilesimport.model.LocalItem
    public Drawable getImagePlaceholder(Context context) {
        return yc0.k(context, SpotifyIcon.PLAYLIST_FOLDER_32, true, true);
    }

    @Override // com.spotify.music.features.localfilesimport.model.LocalItem
    public LocalItem.ImageType getImageType() {
        return LocalItem.ImageType.SQUARE;
    }

    @Override // com.spotify.music.features.localfilesimport.model.LocalItem
    public String getImageUri() {
        CoversJacksonModel coversJacksonModel = this.mCovers;
        return q.c(coversJacksonModel != null ? coversJacksonModel.getCovers() : null, Covers.Size.NORMAL);
    }

    @Override // com.spotify.music.features.localfilesimport.model.LocalItem
    public String getSubtitle(Context context) {
        int size = this.mTracksIds.size();
        return context.getResources().getQuantityString(C0707R.plurals.local_files_subtitle_number_of_songs, size, Integer.valueOf(size));
    }

    public String getTargetUri() {
        return "";
    }

    @Override // com.spotify.music.features.localfilesimport.model.LocalItem
    public String getTitle() {
        return this.mName;
    }

    @Override // com.spotify.music.features.localfilesimport.model.LocalItem
    public String getUri() {
        return "";
    }

    @Override // com.spotify.music.features.localfilesimport.model.LocalItem
    public boolean isExplicit() {
        return false;
    }

    @Override // com.spotify.music.features.localfilesimport.model.LocalItem
    @JsonIgnore
    public List<String> trackIds() {
        return this.mTracksIds;
    }
}
