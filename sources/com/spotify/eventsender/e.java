package com.spotify.eventsender;

import android.util.Pair;
import com.google.common.base.Function;
import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;
import com.spotify.contexts.DeviceAndroid;

public final /* synthetic */ class e implements Function {
    public static final /* synthetic */ e a = new e();

    private /* synthetic */ e() {
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        try {
            return DeviceAndroid.q((ByteString) ((Pair) obj).second).o();
        } catch (InvalidProtocolBufferException unused) {
            return "";
        }
    }
}
