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
public class LocalAlbumJacksonModel implements JacksonModel, b {
    @JsonProperty("artist")
    private final LocalArtistJacksonModel mArtist;
    @JsonProperty("covers")
    private final CoversJacksonModel mCovers;
    @JsonProperty("name")
    private final String mName;
    @JsonProperty("tracks")
    private final List<LocalTrackJacksonModel> mTracks;
    @JsonIgnore
    private final List<String> mTracksIds;
    @JsonProperty("link")
    private final String mUri;

    public LocalAlbumJacksonModel(@JsonProperty("link") String str, @JsonProperty("name") String str2, @JsonProperty("artist") LocalArtistJacksonModel localArtistJacksonModel, @JsonProperty("covers") CoversJacksonModel coversJacksonModel, @JsonProperty("tracks") List<LocalTrackJacksonModel> list) {
        List<LocalTrackJacksonModel> list2;
        this.mUri = str;
        this.mName = str2;
        this.mArtist = localArtistJacksonModel;
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

    @JsonIgnore
    public c getArtist() {
        return this.mArtist;
    }

    @Override // com.spotify.music.features.localfilesimport.model.LocalItem
    public Drawable getImagePlaceholder(Context context) {
        return yc0.k(context, SpotifyIcon.ALBUM_32, false, true);
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
        StringBuilder sb = new StringBuilder();
        LocalArtistJacksonModel localArtistJacksonModel = this.mArtist;
        if (localArtistJacksonModel != null) {
            sb.append(localArtistJacksonModel.getTitle());
        }
        if (sb.length() != 0) {
            sb.append(" • ");
        }
        int size = this.mTracksIds.size();
        sb.append(context.getResources().getQuantityString(C0707R.plurals.local_files_subtitle_number_of_songs, size, Integer.valueOf(size)));
        return sb.toString();
    }

    public String getTargetUri() {
        return this.mUri;
    }

    @Override // com.spotify.music.features.localfilesimport.model.LocalItem
    public String getTitle() {
        return this.mName;
    }

    @Override // com.spotify.music.features.localfilesimport.model.LocalItem
    public String getUri() {
        return this.mUri;
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
