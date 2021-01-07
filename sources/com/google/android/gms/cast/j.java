package com.google.android.gms.cast;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.spotify.player.model.ContextTrack;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class j extends com.google.android.gms.common.internal.safeparcel.a {
    public static final Parcelable.Creator<j> CREATOR = new a1();
    private static final String[] f = {null, "String", "int", "double", "ISO-8601 date String", "Time in milliseconds as long"};
    private static final a n;
    private final List<hr> a;
    final Bundle b;
    private int c;

    /* access modifiers changed from: package-private */
    public static class a {
        private final Map<String, String> a = new HashMap();
        private final Map<String, String> b = new HashMap();
        private final Map<String, Integer> c = new HashMap();

        public final a a(String str, String str2, int i) {
            this.a.put(str, str2);
            this.b.put(str2, str);
            this.c.put(str, Integer.valueOf(i));
            return this;
        }

        public final String b(String str) {
            return this.b.get(str);
        }

        public final int c(String str) {
            Integer num = this.c.get(str);
            if (num != null) {
                return num.intValue();
            }
            return 0;
        }
    }

    static {
        a aVar = new a();
        aVar.a("com.google.android.gms.cast.metadata.CREATION_DATE", "creationDateTime", 4);
        aVar.a("com.google.android.gms.cast.metadata.RELEASE_DATE", "releaseDate", 4);
        aVar.a("com.google.android.gms.cast.metadata.BROADCAST_DATE", "originalAirdate", 4);
        aVar.a("com.google.android.gms.cast.metadata.TITLE", "title", 1);
        aVar.a("com.google.android.gms.cast.metadata.SUBTITLE", ContextTrack.Metadata.KEY_SUBTITLE, 1);
        aVar.a("com.google.android.gms.cast.metadata.ARTIST", "artist", 1);
        aVar.a("com.google.android.gms.cast.metadata.ALBUM_ARTIST", "albumArtist", 1);
        aVar.a("com.google.android.gms.cast.metadata.ALBUM_TITLE", "albumName", 1);
        aVar.a("com.google.android.gms.cast.metadata.COMPOSER", "composer", 1);
        aVar.a("com.google.android.gms.cast.metadata.DISC_NUMBER", "discNumber", 2);
        aVar.a("com.google.android.gms.cast.metadata.TRACK_NUMBER", "trackNumber", 2);
        aVar.a("com.google.android.gms.cast.metadata.SEASON_NUMBER", "season", 2);
        aVar.a("com.google.android.gms.cast.metadata.EPISODE_NUMBER", "episode", 2);
        aVar.a("com.google.android.gms.cast.metadata.SERIES_TITLE", "seriesTitle", 1);
        aVar.a("com.google.android.gms.cast.metadata.STUDIO", "studio", 1);
        aVar.a("com.google.android.gms.cast.metadata.WIDTH", "width", 2);
        aVar.a("com.google.android.gms.cast.metadata.HEIGHT", "height", 2);
        aVar.a("com.google.android.gms.cast.metadata.LOCATION_NAME", "location", 1);
        aVar.a("com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "latitude", 3);
        aVar.a("com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "longitude", 3);
        aVar.a("com.google.android.gms.cast.metadata.SECTION_DURATION", "sectionDuration", 5);
        aVar.a("com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA", "sectionStartTimeInMedia", 5);
        aVar.a("com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME", "sectionStartAbsoluteTime", 5);
        aVar.a("com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER", "sectionStartTimeInContainer", 5);
        aVar.a("com.google.android.gms.cast.metadata.QUEUE_ITEM_ID", "queueItemId", 2);
        aVar.a("com.google.android.gms.cast.metadata.BOOK_TITLE", "bookTitle", 1);
        aVar.a("com.google.android.gms.cast.metadata.CHAPTER_NUMBER", "chapterNumber", 2);
        aVar.a("com.google.android.gms.cast.metadata.CHAPTER_TITLE", "chapterTitle", 1);
        n = aVar;
    }

    j(List<hr> list, Bundle bundle, int i) {
        this.a = list;
        this.b = bundle;
        this.c = i;
    }

    public static void t2(String str, int i) {
        if (!TextUtils.isEmpty(str)) {
            int c2 = n.c(str);
            if (c2 != i && c2 != 0) {
                String str2 = f[i];
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + String.valueOf(str).length() + 21);
                sb.append("Value for ");
                sb.append(str);
                sb.append(" must be a ");
                sb.append(str2);
                throw new IllegalArgumentException(sb.toString());
            }
            return;
        }
        throw new IllegalArgumentException("null and empty keys are not allowed");
    }

    private final boolean u2(Bundle bundle, Bundle bundle2) {
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            Object obj2 = bundle2.get(str);
            if ((obj instanceof Bundle) && (obj2 instanceof Bundle) && !u2((Bundle) obj, (Bundle) obj2)) {
                return false;
            }
            if (obj == null) {
                if (obj2 != null || !bundle2.containsKey(str)) {
                    return false;
                }
            } else if (!obj.equals(obj2)) {
                return false;
            }
        }
        return true;
    }

    public boolean I1(String str) {
        return this.b.containsKey(str);
    }

    public final void Q1(JSONObject jSONObject) {
        this.b.clear();
        this.a.clear();
        this.c = 0;
        try {
            this.c = jSONObject.getInt("metadataType");
        } catch (JSONException unused) {
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("images");
        if (optJSONArray != null) {
            gr.a(this.a, optJSONArray);
        }
        ArrayList arrayList = new ArrayList();
        int i = this.c;
        if (i == 0) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i == 1) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.STUDIO", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i == 2) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.SERIES_TITLE", "com.google.android.gms.cast.metadata.SEASON_NUMBER", "com.google.android.gms.cast.metadata.EPISODE_NUMBER", "com.google.android.gms.cast.metadata.BROADCAST_DATE");
        } else if (i == 3) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ALBUM_TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.ALBUM_ARTIST", "com.google.android.gms.cast.metadata.COMPOSER", "com.google.android.gms.cast.metadata.TRACK_NUMBER", "com.google.android.gms.cast.metadata.DISC_NUMBER", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i == 4) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.LOCATION_NAME", "com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "com.google.android.gms.cast.metadata.WIDTH", "com.google.android.gms.cast.metadata.HEIGHT", "com.google.android.gms.cast.metadata.CREATION_DATE");
        } else if (i == 5) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.CHAPTER_TITLE", "com.google.android.gms.cast.metadata.CHAPTER_NUMBER", "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.BOOK_TITLE", "com.google.android.gms.cast.metadata.SUBTITLE");
        }
        Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.SECTION_DURATION", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA", "com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER", "com.google.android.gms.cast.metadata.QUEUE_ITEM_ID");
        HashSet hashSet = new HashSet(arrayList);
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!"metadataType".equals(next)) {
                    a aVar = n;
                    String b2 = aVar.b(next);
                    if (b2 == null) {
                        Object obj = jSONObject.get(next);
                        if (obj instanceof String) {
                            this.b.putString(next, (String) obj);
                        } else if (obj instanceof Integer) {
                            this.b.putInt(next, ((Integer) obj).intValue());
                        } else if (obj instanceof Double) {
                            this.b.putDouble(next, ((Double) obj).doubleValue());
                        }
                    } else if (hashSet.contains(b2)) {
                        try {
                            Object obj2 = jSONObject.get(next);
                            if (obj2 != null) {
                                int c2 = aVar.c(b2);
                                if (c2 != 1) {
                                    if (c2 != 2) {
                                        if (c2 == 3) {
                                            double optDouble = jSONObject.optDouble(next);
                                            if (!Double.isNaN(optDouble)) {
                                                this.b.putDouble(b2, optDouble);
                                            }
                                        } else if (c2 != 4) {
                                            if (c2 == 5) {
                                                this.b.putLong(b2, com.google.android.gms.cast.internal.a.b((double) jSONObject.optLong(next)));
                                            }
                                        } else if ((obj2 instanceof String) && gr.b((String) obj2) != null) {
                                            this.b.putString(b2, (String) obj2);
                                        }
                                    } else if (obj2 instanceof Integer) {
                                        this.b.putInt(b2, ((Integer) obj2).intValue());
                                    }
                                } else if (obj2 instanceof String) {
                                    this.b.putString(b2, (String) obj2);
                                }
                            }
                        } catch (JSONException unused2) {
                        }
                    }
                }
            }
        } catch (JSONException unused3) {
        }
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return u2(this.b, jVar.b) && this.a.equals(jVar.a);
    }

    @Override // java.lang.Object
    public int hashCode() {
        int i = 17;
        for (String str : this.b.keySet()) {
            i = (i * 31) + this.b.get(str).hashCode();
        }
        return this.a.hashCode() + (i * 31);
    }

    public List<hr> o2() {
        return this.a;
    }

    public int p2() {
        return this.c;
    }

    public String q2(String str) {
        t2(str, 1);
        return this.b.getString(str);
    }

    public long r2(String str) {
        t2(str, 5);
        return this.b.getLong(str);
    }

    public boolean s2() {
        List<hr> list = this.a;
        return list != null && !list.isEmpty();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelReader.a(parcel);
        SafeParcelReader.X(parcel, 2, this.a, false);
        SafeParcelReader.E(parcel, 3, this.b, false);
        SafeParcelReader.M(parcel, 4, this.c);
        SafeParcelReader.m(parcel, a2);
    }

    public j() {
        ArrayList arrayList = new ArrayList();
        Bundle bundle = new Bundle();
        this.a = arrayList;
        this.b = bundle;
        this.c = 0;
    }

    public j(int i) {
        ArrayList arrayList = new ArrayList();
        Bundle bundle = new Bundle();
        this.a = arrayList;
        this.b = bundle;
        this.c = i;
    }
}
