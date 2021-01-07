package com.spotify.offline;

import com.spotify.offline.data.OfflineAvailability;
import com.spotify.offline.data.a;
import com.spotify.offline.data.b;
import java.util.ArrayList;
import java.util.List;

public final class d {
    public static final b a(hrd hrd) {
        OfflineAvailability offlineAvailability;
        List<grd> a = hrd.a();
        ArrayList arrayList = new ArrayList(kotlin.collections.d.e(a, 10));
        for (T t : a) {
            String b = t.b();
            String a2 = t.a();
            int hashCode = a2.hashCode();
            if (hashCode != -1211129254) {
                if (hashCode != 3521) {
                    if (hashCode != 119527) {
                        if (hashCode == 1116313165 && a2.equals("waiting")) {
                            offlineAvailability = OfflineAvailability.Waiting;
                        }
                        throw new IllegalStateException("Invalid availability string");
                    } else if (a2.equals("yes")) {
                        offlineAvailability = OfflineAvailability.Yes;
                    } else {
                        throw new IllegalStateException("Invalid availability string");
                    }
                } else if (a2.equals("no")) {
                    offlineAvailability = OfflineAvailability.No;
                } else {
                    throw new IllegalStateException("Invalid availability string");
                }
            } else if (a2.equals("downloading")) {
                offlineAvailability = OfflineAvailability.Downloading;
            } else {
                throw new IllegalStateException("Invalid availability string");
            }
            arrayList.add(new a(b, offlineAvailability));
        }
        return new b(arrayList);
    }
}
