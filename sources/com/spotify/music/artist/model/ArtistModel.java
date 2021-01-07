package com.spotify.music.artist.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonDeserialize(using = ArtistModel_Deserializer.class)
public class ArtistModel implements Parcelable, JacksonModel {
    public static final Parcelable.Creator<ArtistModel> CREATOR = new a();
    public static final int TOP_TRACKS_LIMIT = 5;
    public final Optional<ArtistsPick> artistsPick;
    public final Optional<String> biography;
    public Optional<CreatorAbout> creatorAbout;
    public final Optional<CustomMessage> customMessage;
    public final Optional<ArtistGallery> gallery;
    public final HeaderImage headerImage;
    public final ArtistInfo info;
    public final Optional<Release> latestRelease;
    public final List<MerchandiseItem> merchandise;
    public final Optional<MonthlyListeners> monthlyListeners;
    public final List<Playlist> playlists;
    public final List<ArtistInfo> relatedArtists;
    public final Releases releases;
    public final List<Track> topTracks;
    public final List<Concert> upcomingConcerts;
    public final String uri;

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ArtistGallery implements Parcelable, JacksonModel {
        public static final Parcelable.Creator<ArtistGallery> CREATOR = new a();
        public static final ArtistGallery EMPTY_GALLERY = new ArtistGallery(ImmutableList.of());
        public final List<Image> images;

        static class a implements Parcelable.Creator<ArtistGallery> {
            a() {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public ArtistGallery createFromParcel(Parcel parcel) {
                return new ArtistGallery(parcel, null);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public ArtistGallery[] newArray(int i) {
                return new ArtistGallery[i];
            }
        }

        /* synthetic */ ArtistGallery(Parcel parcel, a aVar) {
            this(parcel);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeTypedList(this.images);
        }

        @JsonCreator
        public ArtistGallery(@JsonProperty("images") List<Image> list) {
            this.images = gf0.a(list);
        }

        private ArtistGallery(Parcel parcel) {
            List<Image> readImmutableList = ArtistModel.readImmutableList(parcel, Image.CREATOR);
            readImmutableList.getClass();
            this.images = readImmutableList;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ArtistInfo implements Parcelable, JacksonModel {
        public static final Parcelable.Creator<ArtistInfo> CREATOR = new a();
        public final String name;
        public final List<Image> portraits;
        public final String uri;
        public final boolean verified;

        static class a implements Parcelable.Creator<ArtistInfo> {
            a() {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public ArtistInfo createFromParcel(Parcel parcel) {
                return new ArtistInfo(parcel, null);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public ArtistInfo[] newArray(int i) {
                return new ArtistInfo[i];
            }
        }

        /* synthetic */ ArtistInfo(Parcel parcel, a aVar) {
            this(parcel);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @JsonIgnore
        public Uri getDefaultPortraitUri() {
            if (this.portraits.isEmpty()) {
                return null;
            }
            String str = this.portraits.get(0).uri;
            return !TextUtils.isEmpty(str) ? Uri.parse(str) : Uri.EMPTY;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.uri);
            parcel.writeString(this.name);
            parcel.writeInt(this.verified ? 1 : 0);
            parcel.writeTypedList(this.portraits);
        }

        @JsonCreator
        public ArtistInfo(@JsonProperty("uri") String str, @JsonProperty("name") String str2, @JsonProperty("portraits") List<Image> list, @JsonProperty("verified") boolean z) {
            str.getClass();
            this.uri = str;
            str2.getClass();
            this.name = str2;
            this.verified = z;
            this.portraits = gf0.a(list);
        }

        private ArtistInfo(Parcel parcel) {
            this.uri = parcel.readString();
            this.name = parcel.readString();
            this.verified = parcel.readInt() != 0;
            List<Image> readImmutableList = ArtistModel.readImmutableList(parcel, Image.CREATOR);
            readImmutableList.getClass();
            this.portraits = readImmutableList;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Concert implements Parcelable, JacksonModel {
        public static final Parcelable.Creator<Concert> CREATOR = new a();
        public final String city;
        public final String id;
        public final String localtime;
        public final String title;
        public final String venue;

        static class a implements Parcelable.Creator<Concert> {
            a() {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public Concert createFromParcel(Parcel parcel) {
                return new Concert(parcel, null);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public Concert[] newArray(int i) {
                return new Concert[i];
            }
        }

        /* synthetic */ Concert(Parcel parcel, a aVar) {
            this(parcel);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.title);
            parcel.writeString(this.id);
            parcel.writeString(this.localtime);
            parcel.writeString(this.venue);
            parcel.writeString(this.city);
        }

        @JsonCreator
        public Concert(@JsonProperty("title") String str, @JsonProperty("id") String str2, @JsonProperty("localtime") String str3, @JsonProperty("venue") String str4, @JsonProperty("city") String str5) {
            this.title = str;
            this.id = str2;
            this.localtime = str3;
            this.venue = str4;
            this.city = str5;
        }

        private Concert(Parcel parcel) {
            this.title = parcel.readString();
            this.id = parcel.readString();
            this.localtime = parcel.readString();
            this.venue = parcel.readString();
            this.city = parcel.readString();
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class CreatorAbout implements Parcelable, JacksonModel {
        public static final Parcelable.Creator<CreatorAbout> CREATOR = new a();
        public static final CreatorAbout EMPTY = new CreatorAbout(0, 0);
        public final int globalChartPosition;
        public final int monthlyListeners;

        static class a implements Parcelable.Creator<CreatorAbout> {
            a() {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public CreatorAbout createFromParcel(Parcel parcel) {
                return new CreatorAbout(parcel, (a) null);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public CreatorAbout[] newArray(int i) {
                return new CreatorAbout[i];
            }
        }

        /* synthetic */ CreatorAbout(Parcel parcel, a aVar) {
            this(parcel);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // java.lang.Object
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CreatorAbout)) {
                return false;
            }
            CreatorAbout creatorAbout = (CreatorAbout) obj;
            if (this.monthlyListeners == creatorAbout.monthlyListeners && this.globalChartPosition == creatorAbout.globalChartPosition) {
                return true;
            }
            return false;
        }

        @Override // java.lang.Object
        public int hashCode() {
            return (this.monthlyListeners * 31) + this.globalChartPosition;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.monthlyListeners);
            parcel.writeInt(this.globalChartPosition);
        }

        @JsonCreator
        public CreatorAbout(@JsonProperty("monthlyListeners") int i, @JsonProperty("globalChartPosition") int i2) {
            this.monthlyListeners = i;
            this.globalChartPosition = i2;
        }

        private CreatorAbout(Parcel parcel) {
            this.monthlyListeners = parcel.readInt();
            this.globalChartPosition = parcel.readInt();
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class CustomMessage implements Parcelable, JacksonModel {
        public static final Parcelable.Creator<CustomMessage> CREATOR = new a();
        public final String bodyText;

        static class a implements Parcelable.Creator<CustomMessage> {
            a() {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public CustomMessage createFromParcel(Parcel parcel) {
                return new CustomMessage(parcel, null);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public CustomMessage[] newArray(int i) {
                return new CustomMessage[i];
            }
        }

        /* synthetic */ CustomMessage(Parcel parcel, a aVar) {
            this(parcel);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.bodyText);
        }

        @JsonCreator
        public CustomMessage(@JsonProperty("body_text") String str) {
            str.getClass();
            this.bodyText = str;
        }

        private CustomMessage(Parcel parcel) {
            this.bodyText = parcel.readString();
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class HeaderImage implements Parcelable, JacksonModel {
        public static final Parcelable.Creator<HeaderImage> CREATOR = new a();
        public final String image;
        public final int offset;

        static class a implements Parcelable.Creator<HeaderImage> {
            a() {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public HeaderImage createFromParcel(Parcel parcel) {
                return new HeaderImage(parcel, (a) null);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public HeaderImage[] newArray(int i) {
                return new HeaderImage[i];
            }
        }

        /* synthetic */ HeaderImage(Parcel parcel, a aVar) {
            this(parcel);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.image);
            parcel.writeInt(this.offset);
        }

        @JsonCreator
        public HeaderImage(@JsonProperty("image") String str, @JsonProperty("offset") int i) {
            this.image = str;
            this.offset = i;
        }

        private HeaderImage(Parcel parcel) {
            this.image = parcel.readString();
            this.offset = parcel.readInt();
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class MerchandiseItem implements Parcelable, JacksonModel {
        public static final Parcelable.Creator<MerchandiseItem> CREATOR = new a();
        public final String description;
        public final String imageUri;
        public final String link;
        public final String name;
        public final String uuid;

        static class a implements Parcelable.Creator<MerchandiseItem> {
            a() {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public MerchandiseItem createFromParcel(Parcel parcel) {
                return new MerchandiseItem(parcel, null);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public MerchandiseItem[] newArray(int i) {
                return new MerchandiseItem[i];
            }
        }

        /* synthetic */ MerchandiseItem(Parcel parcel, a aVar) {
            this(parcel);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.uuid);
            parcel.writeString(this.name);
            parcel.writeString(this.description);
            parcel.writeString(this.imageUri);
            parcel.writeString(this.link);
        }

        @JsonCreator
        public MerchandiseItem(@JsonProperty("uuid") String str, @JsonProperty("name") String str2, @JsonProperty("description") String str3, @JsonProperty("image_uri") String str4, @JsonProperty("link") String str5) {
            this.uuid = str;
            this.name = str2;
            this.description = str3;
            this.imageUri = str4;
            this.link = str5;
        }

        private MerchandiseItem(Parcel parcel) {
            this.uuid = parcel.readString();
            this.name = parcel.readString();
            this.description = parcel.readString();
            this.imageUri = parcel.readString();
            this.link = parcel.readString();
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class MonthlyListeners implements Parcelable, JacksonModel {
        public static final Parcelable.Creator<MonthlyListeners> CREATOR = new a();
        public final String listenerCount;

        static class a implements Parcelable.Creator<MonthlyListeners> {
            a() {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public MonthlyListeners createFromParcel(Parcel parcel) {
                return new MonthlyListeners(parcel, null);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public MonthlyListeners[] newArray(int i) {
                return new MonthlyListeners[i];
            }
        }

        /* synthetic */ MonthlyListeners(Parcel parcel, a aVar) {
            this(parcel);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // java.lang.Object
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MonthlyListeners)) {
                return false;
            }
            MonthlyListeners monthlyListeners = (MonthlyListeners) obj;
            String str = this.listenerCount;
            if (str != null) {
                if (str.equals(monthlyListeners.listenerCount)) {
                    return true;
                }
            } else if (monthlyListeners.listenerCount == null) {
                return true;
            }
            return false;
        }

        @Override // java.lang.Object
        public int hashCode() {
            String str = this.listenerCount;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.listenerCount);
        }

        @JsonCreator
        public MonthlyListeners(@JsonProperty("listener_count") String str) {
            this.listenerCount = str;
        }

        private MonthlyListeners(Parcel parcel) {
            this.listenerCount = parcel.readString();
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Playlist implements Parcelable, JacksonModel {
        public static final Parcelable.Creator<Playlist> CREATOR = new a();
        public final Image cover;
        public final int followerCount;
        public final String name;
        public final String uri;

        static class a implements Parcelable.Creator<Playlist> {
            a() {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public Playlist createFromParcel(Parcel parcel) {
                return new Playlist(parcel, null);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public Playlist[] newArray(int i) {
                return new Playlist[i];
            }
        }

        /* synthetic */ Playlist(Parcel parcel, a aVar) {
            this(parcel);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // java.lang.Object
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Playlist)) {
                return false;
            }
            Playlist playlist = (Playlist) obj;
            if (this.followerCount != playlist.followerCount) {
                return false;
            }
            String str = this.uri;
            if (str == null ? playlist.uri != null : !str.equals(playlist.uri)) {
                return false;
            }
            String str2 = this.name;
            if (str2 == null ? playlist.name != null : !str2.equals(playlist.name)) {
                return false;
            }
            Image image = this.cover;
            Image image2 = playlist.cover;
            if (image != null) {
                if (image.equals(image2)) {
                    return true;
                }
            } else if (image2 == null) {
                return true;
            }
            return false;
        }

        @Override // java.lang.Object
        public int hashCode() {
            String str = this.uri;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.name;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            Image image = this.cover;
            if (image != null) {
                i = image.hashCode();
            }
            return ((hashCode2 + i) * 31) + this.followerCount;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.uri);
            parcel.writeString(this.name);
            gf0.v(parcel, this.cover, 0);
            parcel.writeInt(this.followerCount);
        }

        @JsonCreator
        public Playlist(@JsonProperty("uri") String str, @JsonProperty("name") String str2, @JsonProperty("cover") Image image, @JsonProperty("follower_count") int i) {
            this.uri = str;
            this.name = str2;
            this.cover = image;
            this.followerCount = i;
        }

        private Playlist(Parcel parcel) {
            this.uri = parcel.readString();
            this.name = parcel.readString();
            this.cover = (Image) gf0.n(parcel, Image.CREATOR);
            this.followerCount = parcel.readInt();
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Track implements Parcelable, JacksonModel {
        public static final Parcelable.Creator<Track> CREATOR = new a();
        public final boolean explicit;
        public final String name;
        public final int playcount;
        public final Release release;
        public final String uri;

        static class a implements Parcelable.Creator<Track> {
            a() {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public Track createFromParcel(Parcel parcel) {
                return new Track(parcel, null);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public Track[] newArray(int i) {
                return new Track[i];
            }
        }

        /* synthetic */ Track(Parcel parcel, a aVar) {
            this(parcel);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.uri);
            parcel.writeInt(this.playcount);
            parcel.writeInt(this.explicit ? 1 : 0);
            parcel.writeString(this.name);
            gf0.v(parcel, this.release, i);
        }

        @JsonCreator
        public Track(@JsonProperty("uri") String str, @JsonProperty("playcount") int i, @JsonProperty("explicit") boolean z, @JsonProperty("name") String str2, @JsonProperty("release") Release release2) {
            this.uri = str;
            this.playcount = i;
            this.explicit = z;
            this.name = str2;
            this.release = release2;
        }

        private Track(Parcel parcel) {
            this.uri = parcel.readString();
            this.playcount = parcel.readInt();
            this.explicit = parcel.readInt() != 0;
            this.name = parcel.readString();
            this.release = (Release) gf0.n(parcel, Release.CREATOR);
        }
    }

    static class a implements Parcelable.Creator<ArtistModel> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public ArtistModel createFromParcel(Parcel parcel) {
            return new ArtistModel(parcel, null);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public ArtistModel[] newArray(int i) {
            return new ArtistModel[i];
        }
    }

    /* synthetic */ ArtistModel(Parcel parcel, a aVar) {
        this(parcel);
    }

    static <T> List<T> extractListFromMap(String str, Map<String, List<T>> map) {
        if (map == null || !map.containsKey(str)) {
            return ImmutableList.of();
        }
        return ImmutableList.copyOf((Collection) map.get(str));
    }

    /* access modifiers changed from: private */
    public static <T> List<T> readImmutableList(Parcel parcel, Parcelable.Creator<T> creator) {
        ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        if (createTypedArrayList == null) {
            return null;
        }
        return ImmutableList.copyOf((Collection) createTypedArrayList);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.uri);
        this.info.writeToParcel(parcel, 0);
        gf0.v(parcel, this.headerImage, 0);
        gf0.v(parcel, this.gallery.orNull(), 0);
        parcel.writeTypedList(this.topTracks);
        parcel.writeTypedList(this.upcomingConcerts);
        parcel.writeTypedList(this.merchandise);
        parcel.writeTypedList(this.relatedArtists);
        parcel.writeString(this.biography.orNull());
        this.releases.writeToParcel(parcel, 0);
        gf0.v(parcel, this.latestRelease.orNull(), 0);
        parcel.writeTypedList(this.playlists);
        gf0.v(parcel, this.customMessage.orNull(), 0);
        gf0.v(parcel, this.monthlyListeners.orNull(), 0);
        gf0.v(parcel, this.creatorAbout.orNull(), 0);
        gf0.v(parcel, this.artistsPick.orNull(), 0);
    }

    @JsonCreator
    public ArtistModel(@JsonProperty("uri") String str, @JsonProperty("info") ArtistInfo artistInfo, @JsonProperty("header_image") HeaderImage headerImage2, @JsonProperty("gallery") ArtistGallery artistGallery, @JsonProperty("top_tracks") Map<String, List<Track>> map, @JsonProperty("upcoming_concerts") Map<String, List<Concert>> map2, @JsonProperty("merch") Map<String, List<MerchandiseItem>> map3, @JsonProperty("related_artists") Map<String, List<ArtistInfo>> map4, @JsonProperty("biography") Map<String, String> map5, @JsonProperty("releases") Releases releases2, @JsonProperty("latest_release") Release release, @JsonProperty("published_playlists") Map<String, List<Playlist>> map6, @JsonProperty("custom_message") CustomMessage customMessage2, @JsonProperty("monthly_listeners") MonthlyListeners monthlyListeners2, @JsonProperty("creator_about") CreatorAbout creatorAbout2, @JsonProperty("pinned_item") ArtistsPick artistsPick2) {
        String str2;
        str.getClass();
        this.uri = str;
        artistInfo.getClass();
        this.info = artistInfo;
        this.headerImage = headerImage2;
        this.gallery = Optional.fromNullable(artistGallery);
        List<Track> extractListFromMap = extractListFromMap("tracks", map);
        this.topTracks = extractListFromMap.size() >= 5 ? extractListFromMap.subList(0, 5) : extractListFromMap;
        this.upcomingConcerts = extractListFromMap("concerts", map2);
        this.merchandise = extractListFromMap("items", map3);
        this.relatedArtists = extractListFromMap("artists", map4);
        if (map5 == null) {
            str2 = null;
        } else {
            str2 = map5.get("text");
        }
        this.biography = Optional.fromNullable(str2);
        this.releases = releases2;
        this.latestRelease = Optional.fromNullable(release);
        this.playlists = extractListFromMap("playlists", map6);
        this.customMessage = Optional.fromNullable(customMessage2);
        this.monthlyListeners = Optional.fromNullable(monthlyListeners2);
        this.creatorAbout = Optional.fromNullable(creatorAbout2);
        this.artistsPick = Optional.fromNullable(artistsPick2);
    }

    private ArtistModel(Parcel parcel) {
        this.uri = parcel.readString();
        Parcelable.Creator<ArtistInfo> creator = ArtistInfo.CREATOR;
        this.info = creator.createFromParcel(parcel);
        this.headerImage = (HeaderImage) gf0.n(parcel, HeaderImage.CREATOR);
        this.gallery = Optional.fromNullable(gf0.n(parcel, ArtistGallery.CREATOR));
        List<Track> readImmutableList = readImmutableList(parcel, Track.CREATOR);
        readImmutableList.getClass();
        this.topTracks = readImmutableList;
        List<Concert> readImmutableList2 = readImmutableList(parcel, Concert.CREATOR);
        readImmutableList2.getClass();
        this.upcomingConcerts = readImmutableList2;
        List<MerchandiseItem> readImmutableList3 = readImmutableList(parcel, MerchandiseItem.CREATOR);
        readImmutableList3.getClass();
        this.merchandise = readImmutableList3;
        List<ArtistInfo> readImmutableList4 = readImmutableList(parcel, creator);
        readImmutableList4.getClass();
        this.relatedArtists = readImmutableList4;
        this.biography = Optional.fromNullable(parcel.readString());
        this.releases = Releases.CREATOR.createFromParcel(parcel);
        this.latestRelease = Optional.fromNullable(gf0.n(parcel, Release.CREATOR));
        List<Playlist> readImmutableList5 = readImmutableList(parcel, Playlist.CREATOR);
        readImmutableList5.getClass();
        this.playlists = readImmutableList5;
        this.customMessage = Optional.fromNullable(gf0.n(parcel, CustomMessage.CREATOR));
        this.monthlyListeners = Optional.fromNullable(gf0.n(parcel, MonthlyListeners.CREATOR));
        this.creatorAbout = Optional.fromNullable(gf0.n(parcel, CreatorAbout.CREATOR));
        this.artistsPick = Optional.fromNullable(gf0.n(parcel, ArtistsPick.CREATOR));
    }
}
