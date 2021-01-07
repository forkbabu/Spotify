package defpackage;

import android.content.Context;
import com.google.common.base.Joiner;
import com.google.common.base.MoreObjects;
import com.google.common.collect.FluentIterable;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.C0707R;
import com.spotify.music.podcast.episode.util.DurationFormatter;
import com.spotify.searchview.proto.Album;
import com.spotify.searchview.proto.AudioEpisode;
import com.spotify.searchview.proto.Entity;
import java.util.Locale;

/* renamed from: cg8  reason: default package */
public class cg8 {
    private final DurationFormatter a;

    public cg8(DurationFormatter durationFormatter) {
        this.a = durationFormatter;
    }

    private String b(Context context, Entity entity) {
        int ordinal = entity.m().ordinal();
        if (ordinal == 1) {
            return Joiner.on(", ").join(FluentIterable.from(entity.q().p()).transform(vf8.a));
        }
        if (ordinal == 2) {
            Album h = entity.h();
            if (h.i() > 0) {
                return h.h(0);
            }
            return "";
        } else if (ordinal == 5) {
            return entity.l().l();
        } else {
            if (ordinal == 6) {
                AudioEpisode i = entity.i();
                String n = i.n();
                long i2 = i.i().i();
                if (i2 <= 2147483647L) {
                    return d(this.a.a(DurationFormatter.Format.LONG_HOUR_AND_MINUTE, (int) i2).toLowerCase(Locale.getDefault()), n);
                }
                Assertion.g("Duration too large to be formatted: " + i2);
                return n;
            } else if (ordinal != 8) {
                return "";
            } else {
                if (entity.p().i() != 0) {
                    return context.getResources().getQuantityString(C0707R.plurals.podcast_topic_episodes, entity.p().i(), Integer.valueOf(entity.p().i()));
                }
                return context.getString(C0707R.string.podcast_topic);
            }
        }
    }

    private static String d(String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        if (MoreObjects.isNullOrEmpty(str) || MoreObjects.isNullOrEmpty(str2)) {
            sb.append(str2);
        } else {
            sb.append(" • ");
            sb.append(str2);
        }
        return sb.toString();
    }

    public String a(Context context, Entity entity) {
        return b(context, entity);
    }

    public String c(Context context, Entity entity) {
        String b = b(context, entity);
        switch (entity.m().ordinal()) {
            case 0:
                return context.getString(C0707R.string.search_main_entity_subtitle_artist);
            case 1:
                return d(context.getString(C0707R.string.search_main_entity_subtitle_track), b);
            case 2:
                return d(context.getString(C0707R.string.search_main_entity_subtitle_album), b);
            case 3:
                return context.getString(C0707R.string.search_main_entity_subtitle_playlist);
            case 4:
                return context.getString(C0707R.string.search_main_entity_subtitle_genre);
            case 5:
                return d(context.getString(entity.l().i() ? C0707R.string.search_main_entity_subtitle_show : C0707R.string.search_main_entity_subtitle_audio_show), b);
            case 6:
                return d(context.getString(C0707R.string.search_main_entity_subtitle_audio_episode_short), b);
            case 7:
                return context.getString(C0707R.string.search_main_entity_subtitle_profile);
            case 8:
                if (entity.p().i() != 0) {
                    return d(context.getString(C0707R.string.podcast_topic), b);
                }
                return context.getString(C0707R.string.podcast_topic);
            default:
                return "";
        }
    }
}
