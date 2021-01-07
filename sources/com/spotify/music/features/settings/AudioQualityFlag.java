package com.spotify.music.features.settings;

import com.spotify.android.flags.Overridable;
import com.spotify.android.flags.b;
import com.spotify.mobile.android.ui.fragments.logic.p;

@Deprecated
public class AudioQualityFlag extends b<Value> {
    public static final Value[] h = Value.values();

    public enum Value {
        STANDARD_BITRATE(0),
        VERY_HIGH_BITRATE(1);
        
        private final String mValue;

        private Value(int i) {
            this.mValue = Integer.toString(i);
        }
    }

    public AudioQualityFlag(Overridable overridable) {
        super(Value.class, "audio-quality", new p("audio-quality"), overridable, Value.STANDARD_BITRATE.mValue);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.io.Serializable] */
    @Override // com.spotify.android.flags.b
    public boolean g(Value value) {
        throw new UnsupportedOperationException();
    }

    /* Return type fixed from 'java.io.Serializable' to match base method */
    @Override // com.spotify.android.flags.b
    public Value h(String str) {
        Value[] valueArr = h;
        for (Value value : valueArr) {
            if (value.mValue.equals(str)) {
                return value;
            }
        }
        return null;
    }
}
