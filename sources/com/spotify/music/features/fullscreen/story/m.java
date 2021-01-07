package com.spotify.music.features.fullscreen.story;

import android.app.Activity;
import android.content.Intent;

public class m implements vfa {
    private final Activity a;

    public m(Activity activity) {
        activity.getClass();
        this.a = activity;
    }

    @Override // defpackage.vfa
    public void a(String str, p62 p62) {
        Activity activity = this.a;
        int i = FullscreenStoryActivity.G;
        activity.getClass();
        Intent intent = new Intent(activity, FullscreenStoryActivity.class);
        intent.setFlags(603979776);
        intent.putExtra("fullscreen_story_playlist_uri", str);
        intent.putExtra("fullscreen_story_video_configuration", p62);
        this.a.startActivity(intent);
    }
}
