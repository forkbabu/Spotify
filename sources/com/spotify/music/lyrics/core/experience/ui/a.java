package com.spotify.music.lyrics.core.experience.ui;

import android.content.Context;
import android.view.View;
import com.spotify.music.lyrics.core.experience.model.ProviderAndroidIntent;
import com.spotify.music.lyrics.core.experience.model.c;
import com.spotify.music.lyrics.core.experience.rx.LyricsEventPublisher;
import kotlin.jvm.internal.h;

public final class a extends mdb {
    final /* synthetic */ LyricsFooterView a;
    final /* synthetic */ c b;

    a(LyricsFooterView lyricsFooterView, c cVar) {
        this.a = lyricsFooterView;
        this.b = cVar;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        h.e(view, "view");
        ProviderAndroidIntent providerIntent = this.b.d().getProviderIntent();
        if (providerIntent != null) {
            LyricsEventPublisher lyricsEventPublisher = LyricsEventPublisher.c;
            LyricsEventPublisher.b(LyricsEventPublisher.Subject.SYNC_THIS_LYRICS, LyricsEventPublisher.a.b.a);
            Context context = this.a.getContext();
            h.d(context, "context");
            sdb.g(context, providerIntent);
        }
    }
}
