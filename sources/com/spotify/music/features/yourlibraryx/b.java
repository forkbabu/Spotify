package com.spotify.music.features.yourlibraryx;

import com.spotify.encore.consumer.elements.artwork.Artwork;
import com.spotify.encore.consumer.elements.badge.download.DownloadState;
import com.spotify.mobile.android.spotlets.yourlibrary.proto.YourLibraryResponseProto$Offline$Availability;
import com.spotify.mobile.android.spotlets.yourlibrary.proto.YourLibraryResponseProto$YourLibraryEntityInfo;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.h;

public final class b {
    /* JADX WARNING: Removed duplicated region for block: B:41:0x009b A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T extends com.spotify.music.features.yourlibraryx.domain.b> boolean a(java.util.List<? extends com.spotify.music.features.yourlibraryx.domain.b> r5, kotlin.reflect.c<? extends T> r6) {
        /*
            java.lang.String r0 = "$this$isEnabled"
            kotlin.jvm.internal.h.e(r5, r0)
            java.lang.String r0 = "type"
            kotlin.jvm.internal.h.e(r6, r0)
            boolean r0 = r5.isEmpty()
            r1 = 0
            if (r0 == 0) goto L_0x0012
            return r1
        L_0x0012:
            java.util.Iterator r0 = r5.iterator()
        L_0x0016:
            boolean r2 = r0.hasNext()
            r3 = 0
            if (r2 == 0) goto L_0x0033
            java.lang.Object r2 = r0.next()
            r4 = r2
            com.spotify.music.features.yourlibraryx.domain.b r4 = (com.spotify.music.features.yourlibraryx.domain.b) r4
            java.lang.Class r4 = r4.getClass()
            kotlin.reflect.c r4 = kotlin.jvm.internal.j.b(r4)
            boolean r4 = kotlin.jvm.internal.h.a(r4, r6)
            if (r4 == 0) goto L_0x0016
            goto L_0x0034
        L_0x0033:
            r2 = r3
        L_0x0034:
            com.spotify.music.features.yourlibraryx.domain.b r2 = (com.spotify.music.features.yourlibraryx.domain.b) r2
            if (r2 == 0) goto L_0x003a
            goto L_0x00a5
        L_0x003a:
            java.util.Iterator r5 = r5.iterator()
        L_0x003e:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x00a3
            java.lang.Object r0 = r5.next()
            r2 = r0
            com.spotify.music.features.yourlibraryx.domain.b r2 = (com.spotify.music.features.yourlibraryx.domain.b) r2
            com.spotify.music.features.yourlibraryx.domain.b$d r4 = com.spotify.music.features.yourlibraryx.domain.b.d.a
            boolean r4 = kotlin.jvm.internal.h.a(r2, r4)
            if (r4 == 0) goto L_0x0054
            goto L_0x0098
        L_0x0054:
            boolean r4 = r2 instanceof com.spotify.music.features.yourlibraryx.domain.b.e
            if (r4 == 0) goto L_0x0063
            com.spotify.music.features.yourlibraryx.domain.b$e r2 = (com.spotify.music.features.yourlibraryx.domain.b.e) r2
            java.util.List r2 = r2.a()
            boolean r2 = a(r2, r6)
            goto L_0x0099
        L_0x0063:
            boolean r4 = r2 instanceof com.spotify.music.features.yourlibraryx.domain.b.C0269b
            if (r4 == 0) goto L_0x0072
            com.spotify.music.features.yourlibraryx.domain.b$b r2 = (com.spotify.music.features.yourlibraryx.domain.b.C0269b) r2
            java.util.List r2 = r2.a()
            boolean r2 = a(r2, r6)
            goto L_0x0099
        L_0x0072:
            boolean r4 = r2 instanceof com.spotify.music.features.yourlibraryx.domain.b.a
            if (r4 == 0) goto L_0x0081
            com.spotify.music.features.yourlibraryx.domain.b$a r2 = (com.spotify.music.features.yourlibraryx.domain.b.a) r2
            java.util.List r2 = r2.a()
            boolean r2 = a(r2, r6)
            goto L_0x0099
        L_0x0081:
            boolean r4 = r2 instanceof com.spotify.music.features.yourlibraryx.domain.b.f
            if (r4 == 0) goto L_0x0090
            com.spotify.music.features.yourlibraryx.domain.b$f r2 = (com.spotify.music.features.yourlibraryx.domain.b.f) r2
            java.util.List r2 = r2.a()
            boolean r2 = a(r2, r6)
            goto L_0x0099
        L_0x0090:
            com.spotify.music.features.yourlibraryx.domain.b$c r4 = com.spotify.music.features.yourlibraryx.domain.b.c.a
            boolean r2 = kotlin.jvm.internal.h.a(r2, r4)
            if (r2 == 0) goto L_0x009d
        L_0x0098:
            r2 = 0
        L_0x0099:
            if (r2 == 0) goto L_0x003e
            r3 = r0
            goto L_0x00a3
        L_0x009d:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L_0x00a3:
            if (r3 == 0) goto L_0x00a6
        L_0x00a5:
            r1 = 1
        L_0x00a6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.features.yourlibraryx.b.a(java.util.List, kotlin.reflect.c):boolean");
    }

    public static c b() {
        c cVar = ViewUris.l1;
        h.d(cVar, "ViewUris.COLLECTION");
        return cVar;
    }

    public static c c() {
        c cVar = ViewUris.x1;
        h.d(cVar, "ViewUris.COLLECTION_SEARCH");
        return cVar;
    }

    public static final DownloadState d(YourLibraryResponseProto$Offline$Availability yourLibraryResponseProto$Offline$Availability) {
        h.e(yourLibraryResponseProto$Offline$Availability, "$this$toDownloadState");
        int ordinal = yourLibraryResponseProto$Offline$Availability.ordinal();
        if (ordinal == 0) {
            return DownloadState.Empty;
        }
        if (ordinal == 1) {
            return DownloadState.Empty;
        }
        if (ordinal == 2) {
            return DownloadState.Downloaded;
        }
        if (ordinal == 3) {
            return DownloadState.Downloading;
        }
        if (ordinal == 4) {
            return DownloadState.Waiting;
        }
        if (ordinal == 5) {
            return DownloadState.Empty;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final Artwork.ImageData e(YourLibraryResponseProto$YourLibraryEntityInfo yourLibraryResponseProto$YourLibraryEntityInfo) {
        h.e(yourLibraryResponseProto$YourLibraryEntityInfo, "$this$toImageData");
        return new Artwork.ImageData(yourLibraryResponseProto$YourLibraryEntityInfo.l());
    }
}
