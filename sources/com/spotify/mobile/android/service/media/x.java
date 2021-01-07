package com.spotify.mobile.android.service.media;

import com.spotify.player.model.command.options.PreparePlayOptions;
import io.reactivex.functions.l;

public final /* synthetic */ class x implements l {
    public final /* synthetic */ String a;
    public final /* synthetic */ PreparePlayOptions b;

    public /* synthetic */ x(String str, PreparePlayOptions preparePlayOptions) {
        this.a = str;
        this.b = preparePlayOptions;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0032, code lost:
        if ((r5 != null && r5.c(r0)) != false) goto L_0x0034;
     */
    @Override // io.reactivex.functions.l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object apply(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.String r0 = r4.a
            com.spotify.player.model.command.options.PreparePlayOptions r1 = r4.b
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            r2 = 1
            r3 = 0
            if (r5 != 0) goto L_0x0059
            com.spotify.mobile.android.util.LinkType r5 = com.spotify.mobile.android.util.LinkType.TRACK
            s52 r5 = defpackage.t52.a(r5)
            if (r5 == 0) goto L_0x001e
            boolean r5 = r5.c(r0)
            if (r5 == 0) goto L_0x001e
            r5 = 1
            goto L_0x001f
        L_0x001e:
            r5 = 0
        L_0x001f:
            if (r5 != 0) goto L_0x0034
            com.spotify.mobile.android.util.LinkType r5 = com.spotify.mobile.android.util.LinkType.SHOW_EPISODE
            s52 r5 = defpackage.t52.a(r5)
            if (r5 == 0) goto L_0x0031
            boolean r5 = r5.c(r0)
            if (r5 == 0) goto L_0x0031
            r5 = 1
            goto L_0x0032
        L_0x0031:
            r5 = 0
        L_0x0032:
            if (r5 == 0) goto L_0x0059
        L_0x0034:
            com.spotify.player.model.Context$Builder r5 = com.spotify.player.model.Context.builder(r0)
            com.spotify.player.model.ContextPage$Builder r1 = com.spotify.player.model.ContextPage.builder()
            com.spotify.player.model.ContextTrack r0 = com.spotify.player.model.ContextTrack.create(r0)
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.of(r0)
            com.spotify.player.model.ContextPage$Builder r0 = r1.tracks(r0)
            com.spotify.player.model.ContextPage r0 = r0.build()
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.of(r0)
            com.spotify.player.model.Context$Builder r5 = r5.pages(r0)
            com.spotify.player.model.Context r5 = r5.build()
            goto L_0x00ae
        L_0x0059:
            com.spotify.mobile.android.util.LinkType r5 = com.spotify.mobile.android.util.LinkType.COLLECTION_PODCASTS_DOWNLOADS
            s52 r5 = defpackage.t52.a(r5)
            if (r5 == 0) goto L_0x0068
            boolean r5 = r5.c(r0)
            if (r5 == 0) goto L_0x0068
            goto L_0x0069
        L_0x0068:
            r2 = 0
        L_0x0069:
            r5 = 0
            if (r2 == 0) goto L_0x00ae
            if (r1 != 0) goto L_0x0070
            r1 = r5
            goto L_0x007a
        L_0x0070:
            com.google.common.base.Optional r1 = r1.skipTo()
            java.lang.Object r1 = r1.orNull()
            com.spotify.player.model.command.options.SkipToTrack r1 = (com.spotify.player.model.command.options.SkipToTrack) r1
        L_0x007a:
            if (r1 != 0) goto L_0x007e
            r1 = r5
            goto L_0x0088
        L_0x007e:
            com.google.common.base.Optional r1 = r1.trackUri()
            java.lang.Object r1 = r1.orNull()
            java.lang.String r1 = (java.lang.String) r1
        L_0x0088:
            if (r1 == 0) goto L_0x00ae
            com.spotify.player.model.Context$Builder r5 = com.spotify.player.model.Context.builder(r0)
            com.spotify.player.model.ContextPage$Builder r0 = com.spotify.player.model.ContextPage.builder()
            com.spotify.player.model.ContextTrack r1 = com.spotify.player.model.ContextTrack.create(r1)
            com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.of(r1)
            com.spotify.player.model.ContextPage$Builder r0 = r0.tracks(r1)
            com.spotify.player.model.ContextPage r0 = r0.build()
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.of(r0)
            com.spotify.player.model.Context$Builder r5 = r5.pages(r0)
            com.spotify.player.model.Context r5 = r5.build()
        L_0x00ae:
            com.google.common.base.Optional r5 = com.google.common.base.Optional.fromNullable(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.service.media.x.apply(java.lang.Object):java.lang.Object");
    }
}
