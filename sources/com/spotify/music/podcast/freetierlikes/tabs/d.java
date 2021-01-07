package com.spotify.music.podcast.freetierlikes.tabs;

import android.content.Context;
import android.text.SpannableStringBuilder;
import androidx.core.content.a;
import com.google.common.collect.ImmutableList;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.foundation.R;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.C0707R;
import com.spotify.music.podcast.freetierlikes.tabs.b;
import com.spotify.music.yourlibrary.interfaces.YourLibraryPageId;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

public class d {
    private final Context a;

    public d(Context context) {
        this.a = context;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v1, resolved type: android.text.SpannableStringBuilder */
    /* JADX WARN: Multi-variable type inference failed */
    public c a() {
        b.C0325b bVar = (b.C0325b) c.b();
        bVar.f(YourLibraryPageId.PODCAST_DOWNLOADS);
        b.C0325b bVar2 = bVar;
        bVar2.g(this.a.getString(C0707R.string.your_library_podcast_tab_downloads_title));
        b.C0325b bVar3 = bVar2;
        bVar3.e(this.a.getString(C0707R.string.your_library_podcast_tab_downloads_empty_title));
        Context context = this.a;
        SpotifyIconV2 spotifyIconV2 = SpotifyIconV2.DOWNLOAD;
        String string = context.getString(C0707R.string.your_library_podcast_tab_downloads_empty_subtitle);
        int i = R.color.gray_50;
        if (!(string.indexOf(123) == -1 || string.indexOf(125) == -1)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) string);
            SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, spotifyIconV2, (float) nud.g(15.0f, context.getResources()));
            spotifyIconDrawable.r(a.b(context, i));
            spotifyIconDrawable.setBounds(0, 0, spotifyIconDrawable.getIntrinsicWidth(), spotifyIconDrawable.getIntrinsicHeight());
            spannableStringBuilder.setSpan(new vvd(spotifyIconDrawable), string.indexOf(123), string.indexOf(125) + 1, 33);
            string = spannableStringBuilder;
        }
        b.C0325b bVar4 = bVar3;
        bVar4.d(string);
        b.C0325b bVar5 = bVar4;
        bVar5.c(this.a.getString(C0707R.string.your_library_podcast_tab_empty_button_text));
        b.C0325b bVar6 = bVar5;
        bVar6.a(ImmutableList.of(LinkType.COLLECTION_PODCASTS_DOWNLOADS));
        return bVar6.b();
    }

    public c b() {
        b.C0325b bVar = (b.C0325b) c.b();
        bVar.f(YourLibraryPageId.PODCAST_EPISODES);
        b.C0325b bVar2 = bVar;
        bVar2.g(this.a.getString(C0707R.string.your_library_podcast_tab_episodes_title));
        b.C0325b bVar3 = bVar2;
        bVar3.e(this.a.getString(C0707R.string.your_library_podcast_tab_episodes_empty_title));
        b.C0325b bVar4 = bVar3;
        bVar4.c(this.a.getString(C0707R.string.your_library_podcast_tab_empty_button_text));
        b.C0325b bVar5 = bVar4;
        bVar5.a(ImmutableList.of(LinkType.COLLECTION_PODCASTS_EPISODES));
        return bVar5.b();
    }

    public c c() {
        b.C0325b bVar = (b.C0325b) c.b();
        bVar.f(YourLibraryPageId.PODCAST_FOLLOWED);
        b.C0325b bVar2 = bVar;
        bVar2.g(this.a.getString(C0707R.string.your_library_podcast_tab_followed_title));
        b.C0325b bVar3 = bVar2;
        bVar3.c(this.a.getString(C0707R.string.your_library_podcast_tab_empty_button_text));
        b.C0325b bVar4 = bVar3;
        bVar4.e(this.a.getString(C0707R.string.your_library_podcast_tab_followed_empty_title_follow));
        bVar4.d(this.a.getString(C0707R.string.your_library_podcast_tab_followed_empty_subtitle_follow));
        bVar4.a(ImmutableList.of(LinkType.COLLECTION_PODCASTS_FOLLOWING));
        return bVar4.b();
    }
}
