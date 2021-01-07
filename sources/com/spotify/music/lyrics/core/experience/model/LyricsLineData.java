package com.spotify.music.lyrics.core.experience.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.h;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class LyricsLineData implements JacksonModel, Parcelable {
    public static final Parcelable.Creator CREATOR = new a();
    private final List<Syllable> syllables;
    private final Integer time;
    private final List<Word> words;

    public static class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            h.e(parcel, "in");
            ArrayList arrayList = null;
            Integer valueOf = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                while (readInt != 0) {
                    arrayList2.add(parcel.readInt() != 0 ? (Syllable) Syllable.CREATOR.createFromParcel(parcel) : null);
                    readInt--;
                }
                arrayList = arrayList2;
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(readInt2);
            while (readInt2 != 0) {
                arrayList3.add((Word) Word.CREATOR.createFromParcel(parcel));
                readInt2--;
            }
            return new LyricsLineData(valueOf, arrayList, arrayList3);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LyricsLineData[i];
        }
    }

    public LyricsLineData(@JsonProperty("time") Integer num, @JsonProperty("syllables") List<Syllable> list, @JsonProperty("words") List<Word> list2) {
        h.e(list2, "words");
        this.time = num;
        this.syllables = list;
        this.words = list2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.spotify.music.lyrics.core.experience.model.LyricsLineData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LyricsLineData copy$default(LyricsLineData lyricsLineData, Integer num, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = lyricsLineData.time;
        }
        if ((i & 2) != 0) {
            list = lyricsLineData.syllables;
        }
        if ((i & 4) != 0) {
            list2 = lyricsLineData.words;
        }
        return lyricsLineData.copy(num, list, list2);
    }

    public final Integer component1() {
        return this.time;
    }

    public final List<Syllable> component2() {
        return this.syllables;
    }

    public final List<Word> component3() {
        return this.words;
    }

    public final LyricsLineData copy(@JsonProperty("time") Integer num, @JsonProperty("syllables") List<Syllable> list, @JsonProperty("words") List<Word> list2) {
        h.e(list2, "words");
        return new LyricsLineData(num, list, list2);
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
        if (!(obj instanceof LyricsLineData)) {
            return false;
        }
        LyricsLineData lyricsLineData = (LyricsLineData) obj;
        return h.a(this.time, lyricsLineData.time) && h.a(this.syllables, lyricsLineData.syllables) && h.a(this.words, lyricsLineData.words);
    }

    public final int getRequireTime() {
        Integer num = this.time;
        h.c(num);
        return num.intValue();
    }

    public final List<Syllable> getSyllables() {
        return this.syllables;
    }

    public final Integer getTime() {
        return this.time;
    }

    public final List<Word> getWords() {
        return this.words;
    }

    @Override // java.lang.Object
    public int hashCode() {
        Integer num = this.time;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        List<Syllable> list = this.syllables;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        List<Word> list2 = this.words;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode2 + i;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("LyricsLineData(time=");
        V0.append(this.time);
        V0.append(", syllables=");
        V0.append(this.syllables);
        V0.append(", words=");
        return je.L0(V0, this.words, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        h.e(parcel, "parcel");
        Integer num = this.time;
        if (num != null) {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        } else {
            parcel.writeInt(0);
        }
        List<Syllable> list = this.syllables;
        if (list != null) {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (Syllable syllable : list) {
                if (syllable != null) {
                    parcel.writeInt(1);
                    syllable.writeToParcel(parcel, 0);
                } else {
                    parcel.writeInt(0);
                }
            }
        } else {
            parcel.writeInt(0);
        }
        List<Word> list2 = this.words;
        parcel.writeInt(list2.size());
        for (Word word : list2) {
            word.writeToParcel(parcel, 0);
        }
    }
}
