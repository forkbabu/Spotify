package com.spotify.music.podcast.freetierlikes.tabs.episodes;

public class EpisodeTypeViewSelector {

    public enum EpisodeType {
        DATE_HEADER,
        UNFINISHED,
        EPISODE_ITEM,
        UNKNOWN
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        if ((r6.l() == com.spotify.playlist.models.Episode.MediaType.VODCAST) != false) goto L_0x002a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0049  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.spotify.music.podcast.freetierlikes.tabs.episodes.EpisodeTypeViewSelector.EpisodeType a(com.spotify.playlist.models.Episode r6) {
        /*
            r5 = this;
            java.lang.String r0 = r6.getHeader()
            boolean r0 = com.google.common.base.MoreObjects.isNullOrEmpty(r0)
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto L_0x000f
            com.spotify.music.podcast.freetierlikes.tabs.episodes.EpisodeTypeViewSelector$EpisodeType r6 = com.spotify.music.podcast.freetierlikes.tabs.episodes.EpisodeTypeViewSelector.EpisodeType.DATE_HEADER
            return r6
        L_0x000f:
            com.spotify.playlist.models.Episode$MediaType r0 = r6.l()
            com.spotify.playlist.models.Episode$MediaType r2 = com.spotify.playlist.models.Episode.MediaType.AUDIO
            r3 = 0
            if (r0 != r2) goto L_0x001a
            r0 = 1
            goto L_0x001b
        L_0x001a:
            r0 = 0
        L_0x001b:
            if (r0 != 0) goto L_0x002a
            com.spotify.playlist.models.Episode$MediaType r0 = r6.l()
            com.spotify.playlist.models.Episode$MediaType r4 = com.spotify.playlist.models.Episode.MediaType.VODCAST
            if (r0 != r4) goto L_0x0027
            r0 = 1
            goto L_0x0028
        L_0x0027:
            r0 = 0
        L_0x0028:
            if (r0 == 0) goto L_0x0043
        L_0x002a:
            java.lang.Integer r0 = r6.x()
            if (r0 == 0) goto L_0x0043
            int r0 = r6.j()
            java.lang.Integer r4 = r6.x()
            int r4 = r4.intValue()
            int r0 = r0 - r4
            r4 = 30
            if (r0 < r4) goto L_0x0043
            r0 = 1
            goto L_0x0044
        L_0x0043:
            r0 = 0
        L_0x0044:
            if (r0 == 0) goto L_0x0049
            com.spotify.music.podcast.freetierlikes.tabs.episodes.EpisodeTypeViewSelector$EpisodeType r6 = com.spotify.music.podcast.freetierlikes.tabs.episodes.EpisodeTypeViewSelector.EpisodeType.UNFINISHED
            return r6
        L_0x0049:
            com.spotify.playlist.models.Episode$MediaType r0 = r6.l()
            if (r0 != r2) goto L_0x0051
            r0 = 1
            goto L_0x0052
        L_0x0051:
            r0 = 0
        L_0x0052:
            if (r0 != 0) goto L_0x0064
            com.spotify.playlist.models.Episode$MediaType r6 = r6.l()
            com.spotify.playlist.models.Episode$MediaType r0 = com.spotify.playlist.models.Episode.MediaType.VODCAST
            if (r6 != r0) goto L_0x005d
            goto L_0x005e
        L_0x005d:
            r1 = 0
        L_0x005e:
            if (r1 == 0) goto L_0x0061
            goto L_0x0064
        L_0x0061:
            com.spotify.music.podcast.freetierlikes.tabs.episodes.EpisodeTypeViewSelector$EpisodeType r6 = com.spotify.music.podcast.freetierlikes.tabs.episodes.EpisodeTypeViewSelector.EpisodeType.UNKNOWN
            return r6
        L_0x0064:
            com.spotify.music.podcast.freetierlikes.tabs.episodes.EpisodeTypeViewSelector$EpisodeType r6 = com.spotify.music.podcast.freetierlikes.tabs.episodes.EpisodeTypeViewSelector.EpisodeType.EPISODE_ITEM
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.podcast.freetierlikes.tabs.episodes.EpisodeTypeViewSelector.a(com.spotify.playlist.models.Episode):com.spotify.music.podcast.freetierlikes.tabs.episodes.EpisodeTypeViewSelector$EpisodeType");
    }
}
