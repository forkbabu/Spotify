package com.spotify.music.features.eventshub.model;

import android.os.Parcelable;
import android.text.TextUtils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Function;
import com.google.common.base.MoreObjects;
import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class Concert implements JacksonModel, Parcelable {
    public static final Concert EMPTY = create(null, null, null, null, null, null, false, null, null, null);
    private String mListingTitle;

    class a implements Predicate<Artist> {
        a(Concert concert) {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.google.common.base.Predicate
        public boolean apply(Artist artist) {
            Artist artist2 = artist;
            return artist2 != null && artist2.hasAffinity();
        }
    }

    class b implements Predicate<Artist> {
        b(Concert concert) {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.google.common.base.Predicate
        public boolean apply(Artist artist) {
            Artist artist2 = artist;
            return artist2 != null && !artist2.hasAffinity();
        }
    }

    /* access modifiers changed from: package-private */
    public class c implements Function<Artist, String> {
        c(Concert concert) {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.google.common.base.Function
        public String apply(Artist artist) {
            Artist artist2 = artist;
            if (artist2 != null && !MoreObjects.isNullOrEmpty(artist2.getName())) {
                return artist2.getName();
            }
            return "";
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d extends zod<Artist> {
        protected d() {
            super(Concert.getArtistCreator());
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e extends zod<ConcertPartner> {
        protected e() {
            super(Concert.getConcertPartnerCreator());
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f extends zod<ConcertTicketing> {
        protected f() {
            super(Concert.getConcertTicketingCreator());
        }
    }

    @JsonCreator
    public static Concert create(@JsonProperty("id") String str, @JsonProperty("date") String str2, @JsonProperty("title") String str3, @JsonProperty("location") String str4, @JsonProperty("venue") String str5, @JsonProperty("artists") List<Artist> list, @JsonProperty("festival") boolean z, @JsonProperty("partnerConcerts") List<ConcertPartner> list2, @JsonProperty("ticketing") List<ConcertTicketing> list3, @JsonProperty("category") String str6) {
        return new AutoValue_Concert(str, str2, str3, str4, str5, list == null ? new ArrayList() : list, z, list2, list3, str6);
    }

    @JsonIgnore
    static ConcertCategory createCategoryFromString(String str) {
        ConcertCategory concertCategory = ConcertCategory.CONCERT;
        if (MoreObjects.isNullOrEmpty(str)) {
            return concertCategory;
        }
        ConcertCategory[] concertCategoryArr = ConcertCategory.c;
        for (ConcertCategory concertCategory2 : concertCategoryArr) {
            if (rw.equal(concertCategory2.d(), str)) {
                return concertCategory2;
            }
        }
        return concertCategory;
    }

    /* access modifiers changed from: private */
    public static Parcelable.Creator<? extends Artist> getArtistCreator() {
        return AutoValue_Artist.CREATOR;
    }

    /* access modifiers changed from: private */
    public static Parcelable.Creator<? extends ConcertPartner> getConcertPartnerCreator() {
        return AutoValue_ConcertPartner.CREATOR;
    }

    /* access modifiers changed from: private */
    public static Parcelable.Creator<? extends ConcertTicketing> getConcertTicketingCreator() {
        return AutoValue_ConcertTicketing.CREATOR;
    }

    /* access modifiers changed from: package-private */
    @JsonIgnore
    public String createListingTitle() {
        ArrayList arrayList = new ArrayList(Collections2.transform((List) getArtists(), (Function) new c(this)));
        arrayList.removeAll(Arrays.asList("", null));
        String join = TextUtils.join(", ", arrayList);
        if (MoreObjects.isNullOrEmpty(join) || isFestival()) {
            return getTitle();
        }
        return join;
    }

    @JsonIgnore
    public String getArtistName() {
        String str = "";
        for (Artist artist : getArtists()) {
            str = artist.getName();
            if (!MoreObjects.isNullOrEmpty(str)) {
                break;
            }
        }
        return str;
    }

    @JsonProperty("artists")
    public abstract List<Artist> getArtists();

    @JsonIgnore
    public List<Artist> getArtistsWithAffinity() {
        return Collections2.newArrayList(Collections2.filter((Iterable) getArtists(), (Predicate) new a(this)));
    }

    @JsonIgnore
    public List<Artist> getArtistsWithOutAffinity() {
        return Collections2.newArrayList(Collections2.filter((Iterable) getArtists(), (Predicate) new b(this)));
    }

    @JsonProperty("category")
    public abstract String getCategory();

    @JsonIgnore
    public ConcertCategory getConcertCategory() {
        if (getCategory() != null) {
            return createCategoryFromString(getCategory());
        }
        return ConcertCategory.CONCERT;
    }

    @JsonProperty("date")
    public abstract String getDateString();

    @JsonProperty("id")
    public abstract String getId();

    @JsonIgnore
    public String getImageUri() {
        String str = null;
        for (Artist artist : getArtists()) {
            str = artist.getImageUri();
            if (!MoreObjects.isNullOrEmpty(str)) {
                break;
            }
        }
        return str;
    }

    public String getListingTitle() {
        if (this.mListingTitle == null) {
            this.mListingTitle = createListingTitle();
        }
        return this.mListingTitle;
    }

    @JsonProperty("location")
    public abstract String getLocation();

    @JsonProperty("partnerConcerts")
    public abstract List<ConcertPartner> getPartnerConcerts();

    @JsonProperty("ticketing")
    public abstract List<ConcertTicketing> getTicketing();

    @JsonProperty("title")
    public abstract String getTitle();

    @JsonProperty("venue")
    public abstract String getVenue();

    @JsonProperty("festival")
    public abstract boolean isFestival();

    @JsonIgnore
    public boolean isVirtual() {
        return getConcertCategory() == ConcertCategory.VIRTUAL;
    }
}
