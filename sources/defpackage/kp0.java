package defpackage;

import io.reactivex.z;
import java.util.List;
import okhttp3.e0;
import retrofit2.v;

/* access modifiers changed from: package-private */
/* renamed from: kp0  reason: default package */
public interface kp0 {
    @zqf("{base}/v2/messages")
    z<v<e0>> a(@mrf("base") String str, @crf("Accept") String str2, @crf("X-Spotify-Quicksilver-Uri") String str3, @nrf("locale") String str4, @nrf("trig_type") String str5, @nrf("purchase_allowed") boolean z, @nrf("ctv_type") List<String> list, @nrf("action") List<String> list2, @nrf("trigger") List<String> list3);
}
