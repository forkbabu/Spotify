package defpackage;

import android.content.Context;
import com.spotify.mobile.android.spotlets.bixbyhomecards.models.ContentItem;
import com.spotify.mobile.android.spotlets.bixbyhomecards.models.Image;
import com.spotify.mobile.android.spotlets.bixbyhomecards.models.PlaylistItem;
import com.spotify.mobile.android.spotlets.bixbyhomecards.models.RecommendedPlaylistsResponse;
import com.spotify.music.C0707R;
import io.reactivex.s;
import io.reactivex.y;
import java.text.SimpleDateFormat;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Queue;

/* renamed from: bt1  reason: default package */
public class bt1 {
    private final String a;
    private final y b;
    private final at1 c;

    public bt1(Context context, at1 at1, y yVar) {
        this.a = context.getString(C0707R.string.bixby_home_card_recommended_for_you);
        this.b = yVar;
        this.c = at1;
    }

    public static Queue b(bt1 bt1, RecommendedPlaylistsResponse recommendedPlaylistsResponse) {
        bt1.getClass();
        List<PlaylistItem> items = recommendedPlaylistsResponse.getPlaylists().items();
        if (items == null) {
            items = Collections.emptyList();
        }
        ArrayDeque arrayDeque = new ArrayDeque(items.size());
        for (PlaylistItem playlistItem : items) {
            Image image = playlistItem.image();
            if (image != null) {
                arrayDeque.add(ContentItem.create(playlistItem.uri(), playlistItem.name(), bt1.a, null, image.url(), playlistItem.uri() + "/play"));
            }
        }
        return arrayDeque;
    }

    public s<Queue<ContentItem>> a() {
        String format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US).format(new Date());
        return this.c.a(format).A(new vs1(this)).P().q(new j1e(20, 3, 1000, this.b));
    }
}
