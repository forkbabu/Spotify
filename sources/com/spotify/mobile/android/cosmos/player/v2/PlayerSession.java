package com.spotify.mobile.android.cosmos.player.v2;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.internal.PlayerInternalError;
import java.lang.ref.WeakReference;
import java.util.List;

public class PlayerSession {
    private boolean mPlayWasCalled;
    private final WeakReference<ResolverPlayer> mPlayerWeakReference;
    private String mSessionUri;

    PlayerSession(ResolverPlayer resolverPlayer) {
        this.mPlayerWeakReference = new WeakReference<>(resolverPlayer);
    }

    public void destroy() {
        ResolverPlayer resolverPlayer = this.mPlayerWeakReference.get();
        if (resolverPlayer != null) {
            resolverPlayer.destroyPlayerSession(this, new Player.ActionCallback() {
                /* class com.spotify.mobile.android.cosmos.player.v2.PlayerSession.AnonymousClass1 */

                @Override // com.spotify.mobile.android.cosmos.player.v2.Player.ActionCallback
                public void onActionForbidden(List<String> list) {
                }

                @Override // com.spotify.mobile.android.cosmos.player.v2.Player.ActionCallback
                public void onActionSuccess() {
                    PlayerSession.this.mSessionUri = null;
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        String str = this.mSessionUri;
        if (str == null) {
            super.finalize();
            return;
        }
        throw new PlayerInternalError(new Throwable(String.format(" Session '%s' has not been destroyed", str)));
    }

    /* access modifiers changed from: package-private */
    public String getSessionId() {
        String str = this.mSessionUri;
        if (str == null) {
            return "";
        }
        return str.substring(str.lastIndexOf(47) + 1);
    }

    /* access modifiers changed from: package-private */
    public String getSessionUri() {
        return this.mSessionUri;
    }

    public void play() {
        if (this.mSessionUri == null) {
            this.mPlayWasCalled = true;
            return;
        }
        ResolverPlayer resolverPlayer = this.mPlayerWeakReference.get();
        if (resolverPlayer != null) {
            resolverPlayer.play(this);
        }
    }

    /* access modifiers changed from: package-private */
    public void setSessionUri(String str) {
        this.mSessionUri = str;
        if (this.mPlayWasCalled) {
            play();
        }
    }
}
