package com.spotify.music.features.yourepisodes.view;

import android.content.Context;
import androidx.core.content.a;
import com.spotify.encore.consumer.components.yourepisodes.api.yourepisodesheader.YourEpisodesHeader;
import com.spotify.encore.consumer.elements.downloadbutton.DownloadButton;
import com.spotify.encore.consumer.elements.downloadbutton.DownloadState;
import com.spotify.encore.consumer.elements.playbutton.PlayState;
import com.spotify.music.C0707R;
import com.spotify.music.features.yourepisodes.domain.e;
import com.spotify.music.features.yourepisodes.domain.l;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class HeaderViewBinderImpl implements a {
    private DownloadState a = DownloadState.None.INSTANCE;
    private PlayButtonLogAction b = PlayButtonLogAction.PLAY;
    private final int c;
    private final Context d;
    private final YourEpisodesHeader e;

    public HeaderViewBinderImpl(Context context, YourEpisodesHeader yourEpisodesHeader) {
        h.e(context, "context");
        h.e(yourEpisodesHeader, "views");
        this.d = context;
        this.e = yourEpisodesHeader;
        this.c = a.b(context, C0707R.color.your_episodes_header_gradient_start);
    }

    @Override // com.spotify.music.features.yourepisodes.view.a
    public void a(l lVar) {
        PlayButtonLogAction playButtonLogAction;
        PlayState playState;
        DownloadState downloadState;
        h.e(lVar, "model");
        if (lVar.d().b()) {
            playButtonLogAction = PlayButtonLogAction.PAUSE;
        } else {
            playButtonLogAction = PlayButtonLogAction.PLAY;
        }
        this.b = playButtonLogAction;
        e e2 = lVar.e();
        if (e2 instanceof e.a) {
            if (lVar.d().b()) {
                playState = PlayState.PAUSE;
            } else {
                playState = PlayState.PLAY_WITHOUT_SHUFFLE;
            }
            e e3 = lVar.e();
            if (e3 != null) {
                e.a aVar = (e.a) e3;
                if (!lVar.c()) {
                    downloadState = DownloadState.None.INSTANCE;
                } else {
                    downloadState = aVar.c();
                }
                this.a = downloadState;
                String string = this.d.getString(C0707R.string.your_episodes_header_title);
                h.d(string, "context.getString(R.stri…ur_episodes_header_title)");
                DownloadButton.Model model = new DownloadButton.Model(this.a, null, 2, null);
                String quantityString = this.d.getResources().getQuantityString(C0707R.plurals.your_episodes_header_subtitle, aVar.e(), Integer.valueOf(aVar.e()));
                h.d(quantityString, "context.resources.getQua…mberOfItems\n            )");
                this.e.render(new YourEpisodesHeader.Model(string, this.c, playState, quantityString, model));
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.spotify.music.features.yourepisodes.domain.UiState.Content");
        } else if (e2 instanceof e.b) {
            String string2 = this.d.getString(C0707R.string.your_episodes_header_title);
            h.d(string2, "context.getString(R.stri…ur_episodes_header_title)");
            this.e.render(new YourEpisodesHeader.Model(string2, this.c, PlayState.GONE, null, null, 24, null));
        } else {
            boolean z = e2 instanceof e.c;
        }
    }

    @Override // com.spotify.music.features.yourepisodes.view.a
    public void b() {
        q4.F(this.e.getView());
    }

    @Override // com.spotify.music.features.yourepisodes.view.a
    public void c(nmf<? super PlayButtonLogAction, f> nmf, nmf<? super DownloadState, f> nmf2, cmf<f> cmf) {
        h.e(nmf, "onPlayClicked");
        h.e(nmf2, "onDownloadClicked");
        h.e(cmf, "onBackButtonClicked");
        String string = this.d.getString(C0707R.string.your_episodes_header_title);
        h.d(string, "context.getString(R.stri…ur_episodes_header_title)");
        this.e.render(new YourEpisodesHeader.Model(string, this.c, PlayState.PLAY_WITHOUT_SHUFFLE, null, null, 24, null));
        this.e.onEvent(new HeaderViewBinderImpl$setup$1(this, nmf, nmf2, cmf));
    }
}
