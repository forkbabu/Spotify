package com.spotify.mobile.android.core.internal;

import android.content.Context;
import android.content.Intent;
import com.spotify.mobile.android.core.internal.AudioDriver;

public class AudioEffectsListener implements AudioDriver.AudioDriverListener {
    private final Context mContext;
    private Integer mCurrentAudioEffectsSessionId;

    public AudioEffectsListener(Context context) {
        this.mContext = context.getApplicationContext();
    }

    private void disableEqualizer(int i) {
        Intent intent = new Intent("android.media.action.CLOSE_AUDIO_EFFECT_CONTROL_SESSION");
        intent.putExtra("android.media.extra.PACKAGE_NAME", this.mContext.getPackageName());
        intent.putExtra("android.media.extra.AUDIO_SESSION", i);
        this.mContext.sendBroadcast(intent);
    }

    private void enableEqualizer(int i) {
        Intent intent = new Intent("android.media.action.OPEN_AUDIO_EFFECT_CONTROL_SESSION");
        intent.putExtra("android.media.extra.PACKAGE_NAME", this.mContext.getPackageName());
        intent.putExtra("android.media.extra.CONTENT_TYPE", 0);
        intent.putExtra("android.media.extra.AUDIO_SESSION", i);
        this.mContext.sendBroadcast(intent);
    }

    private void toggleEqualizer(boolean z, Integer num) {
        if (z) {
            Integer num2 = this.mCurrentAudioEffectsSessionId;
            if (num2 != null) {
                disableEqualizer(num2.intValue());
                this.mCurrentAudioEffectsSessionId = null;
            }
        } else if (num != null) {
            Integer num3 = this.mCurrentAudioEffectsSessionId;
            if (num3 != null) {
                if (!num3.equals(num)) {
                    disableEqualizer(this.mCurrentAudioEffectsSessionId.intValue());
                } else {
                    return;
                }
            }
            this.mCurrentAudioEffectsSessionId = num;
            enableEqualizer(num.intValue());
        }
    }

    @Override // com.spotify.mobile.android.core.internal.AudioDriver.AudioDriverListener
    public void onAudioTrackCreated(int i) {
    }

    @Override // com.spotify.mobile.android.core.internal.AudioDriver.AudioDriverListener
    public void onAudioTrackDestroyed(int i) {
    }

    @Override // com.spotify.mobile.android.core.internal.AudioDriver.AudioDriverListener
    public void onPaused(boolean z, Integer num) {
        toggleEqualizer(z, num);
    }
}
