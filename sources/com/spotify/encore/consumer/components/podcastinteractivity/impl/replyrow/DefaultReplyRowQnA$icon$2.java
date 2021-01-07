package com.spotify.encore.consumer.components.podcastinteractivity.impl.replyrow;

import androidx.core.content.a;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.consumer.components.podcastinteractivity.impl.R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
public final class DefaultReplyRowQnA$icon$2 extends Lambda implements cmf<SpotifyIconDrawable> {
    final /* synthetic */ DefaultReplyRowQnA this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DefaultReplyRowQnA$icon$2(DefaultReplyRowQnA defaultReplyRowQnA) {
        super(0);
        this.this$0 = defaultReplyRowQnA;
    }

    @Override // defpackage.cmf
    public final SpotifyIconDrawable invoke() {
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(this.this$0.context, SpotifyIconV2.MESSAGES, (float) this.this$0.context.getResources().getDimensionPixelSize(R.dimen.reply_row_qna_icon_size));
        spotifyIconDrawable.r(a.b(this.this$0.context, com.spotify.encore.foundation.R.color.gray_50));
        return spotifyIconDrawable;
    }
}
