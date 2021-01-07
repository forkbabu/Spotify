package defpackage;

import android.media.AudioManager;
import com.spotify.music.features.ads.api.b;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

/* renamed from: dv3  reason: default package */
public class dv3 {
    private final AudioManager a;
    private final b b;
    private io.reactivex.disposables.b c;

    public dv3(b bVar, AudioManager audioManager) {
        this.b = bVar;
        this.a = audioManager;
    }

    public void a(String str, String str2) {
        c(str, str2, null, 0, null);
    }

    public void b(String str, String str2, String str3) {
        c(str, str2, str3, 0, null);
    }

    public void c(String str, String str2, String str3, long j, Map<String, String> map) {
        HashMap hashMap;
        if (map == null || map.isEmpty()) {
            hashMap = new HashMap(2);
        } else {
            hashMap = new HashMap(map);
        }
        hashMap.put("volume", new DecimalFormat("0.00").format((double) (((float) this.a.getStreamVolume(3)) / ((float) this.a.getStreamMaxVolume(3)))));
        hashMap.put("duration", str3);
        this.c = this.b.a(str, str2, j, hashMap).subscribe(new uu3(str), new vu3(str));
    }
}
