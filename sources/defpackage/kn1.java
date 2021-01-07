package defpackage;

import android.app.Application;
import android.content.Context;
import com.spotify.android.flags.c;
import com.spotify.audiorecord.api.AudioRecordingType;
import com.spotify.audiorecord.api.e;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.music.features.ads.api.h;
import io.reactivex.g;
import io.reactivex.s;
import io.reactivex.y;
import java.util.Map;

/* renamed from: kn1  reason: default package */
public final class kn1 implements fjf<jn1> {
    public static jn1 a(Context context, g<c> gVar, h hVar, y yVar) {
        return new jn1(context, gVar, hVar, yVar);
    }

    public static tn1 b(wlf<cif> wlf, s<Boolean> sVar, eif eif, Application application, dif dif, SpSharedPreferences<Object> spSharedPreferences, s<Boolean> sVar2, k5a k5a, Map<AudioRecordingType, e> map) {
        return new tn1(wlf, sVar, eif, application, dif, spSharedPreferences, sVar2, k5a, map);
    }
}
