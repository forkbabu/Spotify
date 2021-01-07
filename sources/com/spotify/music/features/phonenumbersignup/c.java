package com.spotify.music.features.phonenumbersignup;

import android.os.Parcelable;
import com.spotify.libs.callingcode.json.CallingCode;

public abstract class c implements Parcelable {
    public static c b(CallingCode callingCode, String str) {
        return new b(callingCode, str);
    }

    public abstract CallingCode a();

    public abstract String c();
}
