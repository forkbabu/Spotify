package defpackage;

import com.google.common.base.Charsets;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.spotlets.bixbyhomecards.models.ContentItem;
import com.spotify.mobile.android.spotlets.bixbyhomecards.models.StreamingCardData;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: fu1  reason: default package */
public class fu1 {
    private static final Pattern a = Pattern.compile("spotify:image:", 16);

    fu1() {
    }

    private static String b(Map<String, String> map, String str) {
        String str2 = map.get(str);
        if (str2 != null) {
            return str2;
        }
        Logger.n("Metadata doesn't contain key: %s", str);
        return "";
    }

    public Optional<StreamingCardData> a(Optional<PlayerState> optional, Queue<ContentItem> queue) {
        StreamingCardData.Builder builder = StreamingCardData.builder();
        ArrayDeque arrayDeque = new ArrayDeque(queue);
        ContextTrack contextTrack = null;
        PlayerState playerState = optional.isPresent() ? optional.get() : null;
        if (playerState != null) {
            contextTrack = playerState.track().orNull();
        }
        if (queue.size() < 3) {
            return Optional.absent();
        }
        if (playerState == null || contextTrack == null) {
            Object poll = arrayDeque.poll();
            poll.getClass();
            builder.mainContentItem((ContentItem) poll);
            Object poll2 = arrayDeque.poll();
            poll2.getClass();
            builder.listItem1((ContentItem) poll2);
            Object poll3 = arrayDeque.poll();
            poll3.getClass();
            builder.listItem2((ContentItem) poll3);
        } else {
            ImmutableMap<String, String> metadata = contextTrack.metadata();
            String b = b(metadata, "title");
            String b2 = b(metadata, "artist_name");
            String replaceAll = a.matcher(b(metadata, "image_large_url")).replaceAll(Matcher.quoteReplacement(""));
            StringBuilder V0 = je.V0("https://i.scdn.co/image/");
            V0.append(gf0.d(replaceAll, Charsets.UTF_8));
            builder.mainContentItem(ContentItem.builder().contentUri(playerState.contextUri()).title(b).metadata1(b2).metadata2(playerState.contextMetadata().get("context_description")).imageUrl(V0.toString()).intentDataUriString(playerState.contextUri()).build());
            String contextUri = optional.get().contextUri();
            Object peek = arrayDeque.peek();
            peek.getClass();
            if (((ContentItem) peek).contentUri().equals(contextUri)) {
                arrayDeque.remove();
            }
            Object poll4 = arrayDeque.poll();
            poll4.getClass();
            builder.listItem1((ContentItem) poll4);
            Object peek2 = arrayDeque.peek();
            peek2.getClass();
            if (((ContentItem) peek2).contentUri().equals(contextUri)) {
                arrayDeque.remove();
            }
            Object poll5 = arrayDeque.poll();
            poll5.getClass();
            builder.listItem2((ContentItem) poll5);
            builder.isPaused(playerState.isPaused());
            builder.isPlaying(playerState.isPlaying());
            builder.isPrevButtonDisabled(!playerState.restrictions().disallowSkippingPrevReasons().isEmpty());
            builder.isNextButtonDisabled(!playerState.restrictions().disallowSkippingNextReasons().isEmpty());
            builder.trackUri(contextTrack.uri());
        }
        return Optional.of(builder.build());
    }
}
