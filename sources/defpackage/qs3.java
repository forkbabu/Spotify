package defpackage;

import android.text.TextUtils;
import com.coremedia.iso.boxes.FreeSpaceBox;
import com.spotify.music.features.ads.api.d;
import com.spotify.music.features.ads.model.Ad;
import com.spotify.music.features.ads.model.AdSlot;
import com.spotify.music.features.ads.rx.model.RewardAdsRequestBody;
import com.spotify.remoteconfig.AndroidLibsAdsCommonProperties;
import com.spotify.rxjava2.q;
import io.reactivex.functions.g;
import io.reactivex.functions.n;
import io.reactivex.y;
import java.util.HashMap;
import java.util.Map;

/* renamed from: qs3  reason: default package */
public class qs3 {
    private final q a = new q();
    private final ss3 b;
    private final AndroidLibsAdsCommonProperties c;
    private final d d;
    private final bv3 e;
    private final y f;
    private final g<Ad> g = new a();

    /* renamed from: qs3$a */
    class a implements g<Ad> {
        a() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(Ad ad) {
            Ad ad2 = ad;
            if (!qs3.this.c.f()) {
                qs3.b(qs3.this, "time", Integer.parseInt(ad2.metadata().get("rewardValue")), ad2.metadata().get(Ad.METADATA_AD_SPONSOR_ID));
                qs3.this.e.a(AdSlot.STREAM);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: qs3$b */
    public static class b implements n<Ad> {
        b() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.n
        public boolean test(Ad ad) {
            Map<String, String> metadata = ad.metadata();
            if (metadata != null && "Ad-Free Listening".equals(metadata.get("rewardType")) && metadata.containsKey("rewardValue")) {
                return true;
            }
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: qs3$c */
    public static class c implements n<Ad> {
        c() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.n
        public boolean test(Ad ad) {
            return TextUtils.isDigitsOnly(ad.metadata().get("rewardValue"));
        }
    }

    public qs3(ss3 ss3, AndroidLibsAdsCommonProperties androidLibsAdsCommonProperties, d dVar, bv3 bv3, y yVar) {
        this.b = ss3;
        this.c = androidLibsAdsCommonProperties;
        this.d = dVar;
        this.e = bv3;
        this.f = yVar;
    }

    static void b(qs3 qs3, String str, int i, String str2) {
        qs3.getClass();
        HashMap hashMap = new HashMap();
        if (str.equals(FreeSpaceBox.TYPE)) {
            hashMap.put("reward", FreeSpaceBox.TYPE);
        } else if (str.equals("time")) {
            hashMap.put("reward", "time");
            hashMap.put("reward_seconds", Integer.valueOf(i));
        } else {
            hashMap.put("reward", "time");
            hashMap.put("reward_seconds", 0);
        }
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("sponsor_id", str2);
        }
        qs3.a.a(qs3.d.a(hashMap).B0().B(qs3.f).subscribe(is3.a, hs3.a));
    }

    public void d() {
        if (this.a.d() <= 0) {
            this.a.a(this.b.a(RewardAdsRequestBody.create("audio")).j0(ls3.a).Q(js3.a).Q(new b()).Q(new c()).subscribe(this.g, ks3.a));
        }
    }

    public void e() {
        this.a.c();
    }
}
