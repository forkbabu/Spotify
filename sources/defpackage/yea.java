package defpackage;

import android.media.AudioManager;
import android.view.KeyEvent;
import com.spotify.libs.connect.volume.controllers.p;
import com.spotify.mobile.android.cosmos.player.v2.LegacyPlayerState;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;

/* renamed from: yea  reason: default package */
public class yea implements ts2 {
    private final ajf<AudioManager> a;
    private final afa b;
    private final Player c;
    private final p d;

    public yea(p pVar, ajf<AudioManager> ajf, afa afa, Player player) {
        this.d = pVar;
        this.a = ajf;
        this.b = afa;
        this.c = player;
    }

    private void a(int i) {
        LegacyPlayerState lastPlayerState = this.c.getLastPlayerState();
        lastPlayerState.getClass();
        this.c.seekTo((long) ((int) Math.max(0L, Math.min(lastPlayerState.currentPlaybackPosition() + ((long) i), lastPlayerState.duration()))));
    }

    @Override // defpackage.ts2
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        PlayerTrack track;
        PlayerTrack track2;
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 62) {
            switch (keyCode) {
                case 19:
                    if (keyEvent.isCtrlPressed() && keyEvent.isShiftPressed()) {
                        if (!this.d.g(Float.valueOf(1.0f))) {
                            this.a.get().setStreamVolume(3, this.a.get().getStreamMaxVolume(3), 0);
                        }
                        return true;
                    } else if (keyEvent.isCtrlPressed()) {
                        if (-1.0f != this.d.e()) {
                            this.a.get().setStreamVolume(3, this.b.a(true), 0);
                        }
                        return true;
                    }
                    break;
                case 20:
                    if (keyEvent.isCtrlPressed() && keyEvent.isShiftPressed()) {
                        if (!this.d.g(Float.valueOf(0.0f))) {
                            this.a.get().setStreamVolume(3, 0, 0);
                        }
                        return true;
                    } else if (keyEvent.isCtrlPressed()) {
                        if (-1.0f != this.d.c()) {
                            this.a.get().setStreamVolume(3, this.b.a(false), 0);
                        }
                        return true;
                    }
                    break;
                case 21:
                    LegacyPlayerState lastPlayerState = this.c.getLastPlayerState();
                    boolean isPodcast = (lastPlayerState == null || (track = lastPlayerState.track()) == null) ? false : PlayerTrackUtil.isPodcast(track);
                    if (keyEvent.isCtrlPressed()) {
                        if (!isPodcast || keyEvent.isShiftPressed()) {
                            this.c.skipToPreviousTrack();
                        } else {
                            a(-15000);
                        }
                        return true;
                    }
                    break;
                case 22:
                    LegacyPlayerState lastPlayerState2 = this.c.getLastPlayerState();
                    boolean isPodcast2 = (lastPlayerState2 == null || (track2 = lastPlayerState2.track()) == null) ? false : PlayerTrackUtil.isPodcast(track2);
                    if (keyEvent.isCtrlPressed()) {
                        if (!isPodcast2 || keyEvent.isShiftPressed()) {
                            this.c.skipToNextTrack();
                        } else {
                            a(15000);
                        }
                        return true;
                    }
                    break;
            }
            return false;
        }
        LegacyPlayerState lastPlayerState3 = this.c.getLastPlayerState();
        if (lastPlayerState3 == null || !lastPlayerState3.isPaused()) {
            this.c.pause();
        } else {
            this.c.resume();
        }
        return true;
    }
}
