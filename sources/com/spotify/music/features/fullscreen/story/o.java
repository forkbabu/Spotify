package com.spotify.music.features.fullscreen.story;

import android.app.Activity;
import android.view.KeyEvent;
import com.spotify.libs.connect.volume.controllers.p;

public class o implements ts2 {
    private final p a;
    private final Activity b;

    public o(p pVar, Activity activity) {
        pVar.getClass();
        this.a = pVar;
        activity.getClass();
        this.b = activity;
    }

    @Override // defpackage.ts2
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!(this.b instanceof FullscreenStoryActivity) || keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 24) {
            if (keyCode != 25 || -1.0f == this.a.c()) {
                return false;
            }
        } else if (-1.0f == this.a.e()) {
            return false;
        }
        return true;
    }
}
