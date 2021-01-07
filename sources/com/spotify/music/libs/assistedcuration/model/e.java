package com.spotify.music.libs.assistedcuration.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Function;
import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.util.x;
import com.spotify.playlist.models.Covers;
import com.spotify.playlist.models.PlayabilityRestriction;
import com.spotify.playlist.models.b;
import com.spotify.playlist.models.o;
import com.spotify.playlist.models.q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class e implements Parcelable {
    public static final Parcelable.Creator<e> a = new a();

    static class a implements Parcelable.Creator<e> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public e createFromParcel(Parcel parcel) {
            return f.CREATOR.createFromParcel(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public e[] newArray(int i) {
            return f.CREATOR.newArray(i);
        }
    }

    public static e a(o oVar) {
        String str;
        List list;
        String str2;
        com.spotify.playlist.models.a album = oVar.getAlbum();
        ImmutableList<b> artists = oVar.getArtists();
        String g = album.g();
        boolean z = artists != null && !artists.isEmpty();
        if (z) {
            str = artists.get(0).f();
        } else {
            str = "";
        }
        b bVar = b.a;
        if (z) {
            list = Collections2.transform((List) artists, (Function) bVar);
        } else {
            list = Collections.emptyList();
        }
        String previewId = oVar.getPreviewId();
        if (previewId != null) {
            str2 = previewId;
        } else {
            str2 = "";
        }
        return new f(oVar.getUri(), oVar.getName(), str2, oVar.isExplicit(), oVar.getIs19plus(), oVar.isCurrentlyPlayable(), oVar.getPlayabilityRestriction(), g, str, list, q.e(oVar, Covers.Size.NORMAL));
    }

    public static List<e> b(List<RecsTrack> list) {
        ArrayList newArrayListWithCapacity = Collections2.newArrayListWithCapacity(list.size());
        for (RecsTrack recsTrack : list) {
            newArrayListWithCapacity.add(new f(recsTrack.uri(), recsTrack.name(), recsTrack.previewId(), recsTrack.isExplicit(), recsTrack.is19PlusOnly(), true, PlayabilityRestriction.UNKNOWN, recsTrack.albumName(), recsTrack.artistName(), recsTrack.artistNames(), (String) x.n(recsTrack.imageUri(), "")));
        }
        return newArrayListWithCapacity;
    }

    public static List<e> c(List<ResponseTrack> list) {
        List list2;
        ArrayList arrayList = new ArrayList();
        for (ResponseTrack responseTrack : list) {
            ResponseItem album = responseTrack.getAlbum();
            List<ResponseItem> artists = responseTrack.getArtists();
            boolean z = !artists.isEmpty();
            String name = z ? artists.get(0).getName() : "";
            if (z) {
                list2 = Collections2.transform((List) artists, (Function) d.a);
            } else {
                list2 = Collections.emptyList();
            }
            arrayList.add(new f(responseTrack.getUri(), responseTrack.getName(), responseTrack.getPreviewId(), responseTrack.isExplicit(), responseTrack.isNineteenPlusOnly(), responseTrack.isPlayable(), PlayabilityRestriction.UNKNOWN, album.getName(), name, list2, responseTrack.getImage()));
        }
        return arrayList;
    }

    public static List<e> e(List<o> list) {
        ArrayList arrayList = new ArrayList();
        for (o oVar : list) {
            arrayList.add(a(oVar));
        }
        return arrayList;
    }

    public abstract String f();

    public abstract String g();

    public abstract String getImageUri();

    public abstract String getName();

    public abstract String getPreviewId();

    public abstract String getUri();

    public abstract boolean h();

    public abstract boolean i();

    public abstract boolean isExplicit();

    public abstract PlayabilityRestriction j();

    public abstract List<String> x1();
}
