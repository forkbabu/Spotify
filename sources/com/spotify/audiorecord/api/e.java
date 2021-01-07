package com.spotify.audiorecord.api;

import android.media.AudioDeviceInfo;
import io.reactivex.functions.l;
import io.reactivex.g;
import java.nio.ByteBuffer;

public interface e extends b, g {
    boolean b();

    AudioDeviceInfo c();

    l<ByteBuffer, Float> f();

    String g();

    g<ByteBuffer> i();
}
