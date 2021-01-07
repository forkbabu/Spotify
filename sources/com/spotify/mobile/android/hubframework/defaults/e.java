package com.spotify.mobile.android.hubframework.defaults;

import com.google.common.collect.ImmutableSet;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueCard;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueRow;

@Deprecated
public class e implements a61 {
    private static final ImmutableSet<String> a = ImmutableSet.of(HubsGlueCard.ENTITY.id(), HubsGlueRow.ENTITY.id(), HubsGlueRow.VIDEO.id());

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0070, code lost:
        if (com.spotify.mobile.android.util.l0.c(r0, com.spotify.mobile.android.util.LinkType.ALBUM, com.spotify.mobile.android.util.LinkType.ARTIST, com.spotify.mobile.android.util.LinkType.PLAYLIST_V2, com.spotify.mobile.android.util.LinkType.PROFILE_PLAYLIST, com.spotify.mobile.android.util.LinkType.SHOW_EPISODE, com.spotify.mobile.android.util.LinkType.SHOW_SHOW, com.spotify.mobile.android.util.LinkType.TRACK) != false) goto L_0x001b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.a61
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.s81 a(defpackage.s81 r7) {
        /*
            r6 = this;
            int r0 = com.spotify.mobile.android.hubframework.defaults.components.custom.a.c
            p81 r0 = r7.custom()
            java.lang.String r1 = "hubs:contextmenu"
            r2 = 0
            boolean r0 = r0.boolValue(r1, r2)
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L_0x001d
            a91 r0 = r7.target()
            if (r0 == 0) goto L_0x0073
            java.lang.String r0 = r0.uri()
        L_0x001b:
            r3 = r0
            goto L_0x0073
        L_0x001d:
            p81 r0 = r7.custom()
            java.lang.Boolean r0 = r0.boolValue(r1)
            if (r0 == 0) goto L_0x0029
            r0 = 1
            goto L_0x002a
        L_0x0029:
            r0 = 0
        L_0x002a:
            if (r0 != 0) goto L_0x0073
            com.google.common.collect.ImmutableSet<java.lang.String> r0 = com.spotify.mobile.android.hubframework.defaults.e.a
            q81 r1 = r7.componentId()
            java.lang.String r1 = r1.id()
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0073
            a91 r0 = r7.target()
            if (r0 == 0) goto L_0x0073
            java.lang.String r0 = r0.uri()
            if (r0 == 0) goto L_0x0073
            r1 = 7
            com.spotify.mobile.android.util.LinkType[] r1 = new com.spotify.mobile.android.util.LinkType[r1]
            com.spotify.mobile.android.util.LinkType r5 = com.spotify.mobile.android.util.LinkType.ALBUM
            r1[r2] = r5
            com.spotify.mobile.android.util.LinkType r5 = com.spotify.mobile.android.util.LinkType.ARTIST
            r1[r4] = r5
            r4 = 2
            com.spotify.mobile.android.util.LinkType r5 = com.spotify.mobile.android.util.LinkType.PLAYLIST_V2
            r1[r4] = r5
            r4 = 3
            com.spotify.mobile.android.util.LinkType r5 = com.spotify.mobile.android.util.LinkType.PROFILE_PLAYLIST
            r1[r4] = r5
            r4 = 4
            com.spotify.mobile.android.util.LinkType r5 = com.spotify.mobile.android.util.LinkType.SHOW_EPISODE
            r1[r4] = r5
            r4 = 5
            com.spotify.mobile.android.util.LinkType r5 = com.spotify.mobile.android.util.LinkType.SHOW_SHOW
            r1[r4] = r5
            r4 = 6
            com.spotify.mobile.android.util.LinkType r5 = com.spotify.mobile.android.util.LinkType.TRACK
            r1[r4] = r5
            boolean r1 = com.spotify.mobile.android.util.l0.c(r0, r1)
            if (r1 == 0) goto L_0x0073
            goto L_0x001b
        L_0x0073:
            if (r3 == 0) goto L_0x00c6
            o81$a r0 = defpackage.z81.b()
            java.lang.String r1 = "contextMenu"
            o81$a r0 = r0.e(r1)
            java.lang.String r1 = "uri"
            o81$a r0 = r0.b(r1, r3)
            w81 r1 = r7.text()
            java.lang.String r1 = r1.title()
            java.lang.String r3 = "title"
            o81$a r0 = r0.b(r3, r1)
            o81 r0 = r0.c()
            s81$a r1 = r7.toBuilder()
            java.lang.String r3 = "longClick"
            s81$a r1 = r1.f(r3, r0)
            com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueRow r3 = com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueRow.ENTITY
            java.lang.String r3 = r3.id()
            boolean r3 = defpackage.je.B(r7, r3)
            if (r3 != 0) goto L_0x00b9
            com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueRow r3 = com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueRow.VIDEO
            java.lang.String r3 = r3.id()
            boolean r7 = defpackage.je.B(r7, r3)
            if (r7 == 0) goto L_0x00ba
        L_0x00b9:
            r2 = 1
        L_0x00ba:
            if (r2 == 0) goto L_0x00c2
            java.lang.String r7 = "rightAccessoryClick"
            s81$a r1 = r1.f(r7, r0)
        L_0x00c2:
            s81 r7 = r1.l()
        L_0x00c6:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.hubframework.defaults.e.a(s81):s81");
    }
}
