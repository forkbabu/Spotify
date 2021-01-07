package defpackage;

import android.media.AudioDeviceInfo;
import android.media.AudioRecord;
import android.media.AudioRouting;

/* access modifiers changed from: package-private */
/* renamed from: sd0  reason: default package */
public class sd0 implements AudioRecord.OnRoutingChangedListener {
    private AudioDeviceInfo a;

    sd0() {
    }

    /* access modifiers changed from: package-private */
    public AudioDeviceInfo a() {
        return this.a;
    }

    @Override // android.media.AudioRecord.OnRoutingChangedListener
    public void onRoutingChanged(AudioRecord audioRecord) {
        AudioDeviceInfo routedDevice;
        if (audioRecord != null && (routedDevice = audioRecord.getRoutedDevice()) != null && !routedDevice.equals(this.a)) {
            this.a = routedDevice;
        }
    }

    @Override // android.media.AudioRecord.OnRoutingChangedListener, android.media.AudioRouting.OnRoutingChangedListener
    public void onRoutingChanged(AudioRouting audioRouting) {
        AudioDeviceInfo routedDevice;
        if (audioRouting != null && (routedDevice = audioRouting.getRoutedDevice()) != null && !routedDevice.equals(this.a)) {
            this.a = routedDevice;
        }
    }
}
