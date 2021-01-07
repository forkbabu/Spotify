package com.spotify.music.features.eventshub.model;

import android.content.Context;
import android.os.Parcelable;
import android.text.format.DateUtils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.MoreObjects;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.music.C0707R;
import com.spotify.music.features.eventshub.concertentity.j;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class EventResult implements JacksonModel, Parcelable {
    public static final EventResult EMPTY = create(null, null, null, null, null, null, null);
    private static final String MULTIPLE_LOCATIONS = "Multiple locations";

    /* access modifiers changed from: package-private */
    public static final class a extends zod<ConcertResult> {
        protected a() {
            super(EventResult.getConcertResultCreator());
        }
    }

    @JsonCreator
    public static EventResult create(@JsonProperty("concerts") List<ConcertResult> list, @JsonProperty("artists") List<String> list2, @JsonProperty("source") String str, @JsonProperty("openingDate") String str2, @JsonProperty("closingDate") String str3, @JsonProperty("venue") String str4, @JsonProperty("location") String str5) {
        if (list2 == null) {
            list2 = new ArrayList<>();
        }
        return new AutoValue_EventResult(gf0.a(list), list2, str, str2, str3, str4, str5);
    }

    @JsonIgnore
    static SourceType createSourceFromString(String str) {
        SourceType sourceType = SourceType.ALL;
        if (MoreObjects.isNullOrEmpty(str)) {
            return sourceType;
        }
        SourceType[] sourceTypeArr = SourceType.n;
        for (SourceType sourceType2 : sourceTypeArr) {
            if (rw.equal(sourceType2.d(), str)) {
                return sourceType2;
            }
        }
        return sourceType;
    }

    /* access modifiers changed from: private */
    public static Parcelable.Creator<? extends ConcertResult> getConcertResultCreator() {
        return AutoValue_ConcertResult.CREATOR;
    }

    static String getFormattedDateRange(Context context, String str, String str2, cqe cqe) {
        if (str == null || str2 == null) {
            return null;
        }
        try {
            return DateUtils.formatDateRange(context, iso8601toCalendar(str, cqe).getTimeInMillis(), iso8601toCalendar(str2, cqe).getTimeInMillis(), 65536);
        } catch (ParseException unused) {
            Logger.d("Parse Exception in formatting date range with dates: %s and %s", str, str2);
            return null;
        }
    }

    static String getFormattedTime(Context context, String str, cqe cqe) {
        if (str == null) {
            return null;
        }
        try {
            Calendar iso8601toCalendar = iso8601toCalendar(str, cqe);
            return j.c(j.a(str, "yyyy-MM-dd'T'HH:mm:ss", Locale.getDefault(), iso8601toCalendar), iso8601toCalendar, Locale.getDefault());
        } catch (ParseException unused) {
            Logger.d("Parse Exception in formatting time with date: %s", str);
            return null;
        }
    }

    private static Calendar iso8601toCalendar(String str, cqe cqe) {
        Date parse = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.getDefault()).parse(str.replace("Z", "+00:00"));
        Calendar e = cqe.e();
        e.setTime(parse);
        return e;
    }

    @JsonProperty("artists")
    public abstract List<String> getArtists();

    @JsonProperty("closingDate")
    public abstract String getClosingDate();

    @JsonProperty("concerts")
    public abstract List<ConcertResult> getConcertResults();

    @JsonProperty("location")
    public abstract String getLocation();

    public String getMetadata(Context context, cqe cqe) {
        String str;
        boolean z = false;
        boolean z2 = SourceType.VIRTUAL == getSourceType();
        if (getConcertResults().size() > 1) {
            z = true;
        }
        StringBuilder sb = new StringBuilder(getFormattedDateRange(context, getOpeningDate(), getClosingDate(), cqe));
        String venue = getVenue();
        if (z2) {
            str = getVenue();
        } else if (MULTIPLE_LOCATIONS.equals(getVenue())) {
            str = context.getString(C0707R.string.events_hub_multiple_venues);
        } else {
            str = venue + ", " + getLocation();
        }
        if (!MoreObjects.isNullOrEmpty(str)) {
            if (sb.length() > 0) {
                sb.append(" • ");
            }
            if (z2 && !z) {
                sb.append(getFormattedTime(context, getOpeningDate(), cqe));
                sb.append(", ");
            }
            sb.append(str);
        }
        return sb.toString();
    }

    @JsonProperty("openingDate")
    public abstract String getOpeningDate();

    @JsonIgnore
    public ConcertResult getPosterConcertResult() {
        return getConcertResults().get(0);
    }

    @JsonProperty("source")
    public abstract String getSource();

    @JsonIgnore
    public SourceType getSourceType() {
        if (getSource() != null) {
            return createSourceFromString(getSource());
        }
        if (getConcertResults().size() > 0) {
            return getConcertResults().get(0).getSourceType();
        }
        return SourceType.ALL;
    }

    @JsonProperty("venue")
    public abstract String getVenue();

    @JsonIgnore
    public boolean isSingleConcert() {
        return getConcertResults().size() == 1;
    }
}
