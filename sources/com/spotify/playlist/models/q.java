package com.spotify.playlist.models;

import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;
import com.spotify.cosmos.util.proto.PlayabilityRestriction;
import com.spotify.mobile.android.spotlets.show.proto.EpisodeMetadata$ProtoEpisodeMetadata;
import com.spotify.mobile.android.util.x;
import com.spotify.playlist.models.Covers;
import com.spotify.playlist.models.Episode;
import com.spotify.playlist.models.Show;

public final class q {
    private static final ImmutableMap<String, Show.ConsumptionOrder> a = ImmutableMap.of("episodic", Show.ConsumptionOrder.EPISODIC, "sequential", Show.ConsumptionOrder.SEQUENTIAL, "recent", Show.ConsumptionOrder.RECENT);
    private static final ImmutableMap<Integer, Show.MediaType> b = ImmutableMap.of(0, Show.MediaType.MIXED, 1, Show.MediaType.AUDIO, 2, Show.MediaType.VIDEO);
    private static final ImmutableMap<EpisodeMetadata$ProtoEpisodeMetadata.MediaType, Episode.MediaType> c = ImmutableMap.of(EpisodeMetadata$ProtoEpisodeMetadata.MediaType.VODCAST, Episode.MediaType.VODCAST, EpisodeMetadata$ProtoEpisodeMetadata.MediaType.AUDIO, Episode.MediaType.AUDIO, EpisodeMetadata$ProtoEpisodeMetadata.MediaType.VIDEO, Episode.MediaType.VIDEO);
    public static final /* synthetic */ int d = 0;

    private static void a(ImmutableMap.Builder<String, String> builder, String str, Covers.Size size, Covers covers, Covers covers2, Show show) {
        String f = f(covers, covers2, show, size);
        if (!MoreObjects.isNullOrEmpty(f)) {
            builder.mo51put(str, f);
        }
    }

    public static Show.ConsumptionOrder b(String str) {
        return (Show.ConsumptionOrder) x.n(a.get(str), Show.ConsumptionOrder.UNKNOWN);
    }

    public static String c(Covers covers, Covers.Size size) {
        if (covers == null) {
            return "";
        }
        String e = covers.e();
        Covers.Size size2 = Covers.Size.XLARGE;
        if (size == size2 && !MoreObjects.isNullOrEmpty(e)) {
            return e;
        }
        String b2 = covers.b();
        if ((size == Covers.Size.LARGE || size == size2) && !MoreObjects.isNullOrEmpty(b2)) {
            return b2;
        }
        String c2 = covers.c();
        if (size != Covers.Size.SMALL || MoreObjects.isNullOrEmpty(c2)) {
            return covers.d();
        }
        return c2;
    }

    public static String d(l lVar, Covers.Size size) {
        if (lVar == null) {
            return "";
        }
        Episode c2 = lVar.c();
        if (c2 != null) {
            return c(c2.c(), size);
        }
        return e(lVar.g(), size);
    }

    public static String e(o oVar, Covers.Size size) {
        if (oVar == null) {
            return "";
        }
        return c(oVar.getAlbum().e(), size);
    }

    public static String f(Covers covers, Covers covers2, Show show, Covers.Size size) {
        String str = "";
        String c2 = covers != null ? c(covers, size) : str;
        if (c2.isEmpty()) {
            if (covers2 != null) {
                str = c(covers2, size);
            }
            c2 = str;
        }
        return (!c2.isEmpty() || show == null) ? c2 : c(show.c(), size);
    }

    public static Show.MediaType g(int i) {
        return (Show.MediaType) x.n(b.get(Integer.valueOf(i)), Show.MediaType.UNKNOWN);
    }

    public static Episode.MediaType h(EpisodeMetadata$ProtoEpisodeMetadata.MediaType mediaType) {
        Episode.MediaType mediaType2 = c.get(mediaType);
        return mediaType2 != null ? mediaType2 : Episode.MediaType.UNKNOWN;
    }

    public static ImmutableMap.Builder<String, String> i(Covers covers, Covers covers2, String str, String str2, Show show, Episode.MediaType mediaType) {
        ImmutableMap.Builder<String, String> builder = ImmutableMap.builder();
        a(builder, "image_url", Covers.Size.NORMAL, covers, covers2, show);
        a(builder, "image_small_url", Covers.Size.SMALL, covers, covers2, show);
        a(builder, "image_large_url", Covers.Size.LARGE, covers, covers2, show);
        a(builder, "image_xlarge_url", Covers.Size.XLARGE, covers, covers2, show);
        if (!MoreObjects.isNullOrEmpty(str)) {
            builder.mo51put("title", str);
        }
        if (mediaType == Episode.MediaType.AUDIO) {
            builder.mo51put("media.type", "audio");
        } else if (mediaType == Episode.MediaType.VIDEO) {
            builder.mo51put("media.type", "video");
            builder.mo51put("media.manifest_id", str2);
        } else if (mediaType == Episode.MediaType.VODCAST) {
            builder.mo51put("media.type", "mixed");
            builder.mo51put("media.manifest_id", str2);
        }
        if (!MoreObjects.isNullOrEmpty(show.h())) {
            builder.mo51put("artist_name", show.h());
        }
        return builder;
    }

    public static PlayabilityRestriction j(l lVar) {
        o g = lVar.g();
        if (g != null) {
            return g.getPlayabilityRestriction();
        }
        Episode c2 = lVar.c();
        if (c2 != null) {
            return c2.p();
        }
        return PlayabilityRestriction.UNKNOWN;
    }

    public static PlayabilityRestriction k(PlayabilityRestriction playabilityRestriction) {
        int ordinal = playabilityRestriction.ordinal();
        if (ordinal == 1) {
            return PlayabilityRestriction.NO_RESTRICTION;
        }
        if (ordinal == 2) {
            return PlayabilityRestriction.EXPLICIT_CONTENT;
        }
        if (ordinal == 3) {
            return PlayabilityRestriction.AGE_RESTRICTED;
        }
        if (ordinal == 4) {
            return PlayabilityRestriction.NOT_IN_CATALOGUE;
        }
        if (ordinal != 5) {
            return PlayabilityRestriction.UNKNOWN;
        }
        return PlayabilityRestriction.NOT_AVAILABLE_OFFLINE;
    }

    public static PlayabilityRestriction l(String str) {
        if (MoreObjects.isNullOrEmpty(str)) {
            return k(PlayabilityRestriction.UNKNOWN);
        }
        return k(PlayabilityRestriction.valueOf(str));
    }

    public static Episode.Type m(EpisodeMetadata$ProtoEpisodeMetadata.EpisodeType episodeType) {
        int ordinal = episodeType.ordinal();
        if (ordinal == 1) {
            return Episode.Type.FULL;
        }
        if (ordinal == 2) {
            return Episode.Type.TRAILER;
        }
        if (ordinal != 3) {
            return Episode.Type.UNKNOWN;
        }
        return Episode.Type.BONUS;
    }
}
