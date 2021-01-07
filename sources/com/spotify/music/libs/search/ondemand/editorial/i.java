package com.spotify.music.libs.search.ondemand.editorial;

import com.spotify.music.libs.search.ondemand.editorial.cache.EditorialOnDemandCachedInfo;
import com.spotify.music.libs.search.ondemand.editorial.cache.a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class i implements h {
    private final a a;
    private final cqe b;

    i(cqe cqe, a aVar) {
        this.b = cqe;
        this.a = aVar;
    }

    private static boolean c(List<EditorialOnDemandCachedInfo> list, String str) {
        for (EditorialOnDemandCachedInfo editorialOnDemandCachedInfo : list) {
            if (editorialOnDemandCachedInfo.playlistUri().equals(str)) {
                return true;
            }
        }
        return false;
    }

    private List<EditorialOnDemandCachedInfo> d(long j) {
        List<EditorialOnDemandCachedInfo> read = this.a.read();
        long j2 = j - 86400000;
        ArrayList arrayList = new ArrayList(10);
        for (EditorialOnDemandCachedInfo editorialOnDemandCachedInfo : read) {
            if (j2 < editorialOnDemandCachedInfo.playedTimeInMillis()) {
                arrayList.add(editorialOnDemandCachedInfo);
            }
        }
        return arrayList;
    }

    @Override // com.spotify.music.libs.search.ondemand.editorial.h
    public boolean a(String str) {
        boolean z;
        long d = this.b.d();
        try {
            List<EditorialOnDemandCachedInfo> d2 = d(d);
            this.a.a(d2);
            if (!c(d2, str)) {
                ArrayList arrayList = (ArrayList) d2;
                if (arrayList.size() < 10) {
                    arrayList.add(EditorialOnDemandCachedInfo.create(str, d));
                    this.a.a(d2);
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    return false;
                }
            }
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // com.spotify.music.libs.search.ondemand.editorial.h
    public boolean b(String str) {
        try {
            List<EditorialOnDemandCachedInfo> d = d(this.b.d());
            if (c(d, str)) {
                return true;
            }
            if (((ArrayList) d).size() < 10) {
                return true;
            }
            return false;
        } catch (IOException unused) {
        }
    }
}
