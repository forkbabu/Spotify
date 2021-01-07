package com.spotify.music.newplaying.scroll.widgets.lyrics.view;

import android.os.Bundle;
import com.spotify.music.lyrics.core.experience.model.LyricsWrapper;

public interface b {

    public interface a {
    }

    /* renamed from: com.spotify.music.newplaying.scroll.widgets.lyrics.view.b$b  reason: collision with other inner class name */
    public interface AbstractC0311b {
    }

    void a(int i, int i2);

    void b(LyricsWrapper lyricsWrapper);

    void c(int i, boolean z);

    void d();

    void e();

    com.spotify.music.lyrics.core.experience.contract.b getLyricsViewBinder();

    com.spotify.music.lyrics.share.common.sharebutton.a getShareButtonViewBinder();

    Bundle getViewStateBundle();

    @Override // com.spotify.music.newplaying.scroll.widgets.lyrics.view.b
    void setBackgroundColor(int i);

    void setFocusChangeListener(a aVar);

    void setFullscreenClickedListener(AbstractC0311b bVar);

    void setVocalRemovalPossible(boolean z);
}
