package com.spotify.music.behindthelyrics.view;

import com.spotify.music.behindthelyrics.view.BehindTheLyricsViewStateManager;

public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ BehindTheLyricsViewStateManager a;
    public final /* synthetic */ BehindTheLyricsViewStateManager.State b;

    public /* synthetic */ a(BehindTheLyricsViewStateManager behindTheLyricsViewStateManager, BehindTheLyricsViewStateManager.State state) {
        this.a = behindTheLyricsViewStateManager;
        this.b = state;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.k(this.b);
    }
}
