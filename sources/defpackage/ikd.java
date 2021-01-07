package defpackage;

import android.os.Build;
import com.spotify.mobile.android.util.d0;
import com.spotify.mobile.android.util.t;
import io.reactivex.a;
import kotlin.jvm.internal.h;
import okhttp3.c0;
import okhttp3.w;
import okhttp3.x;

/* renamed from: ikd  reason: default package */
public final class ikd implements hkd {
    private final String a = d0.c("c89357781478587452351465436651790f3356395167037353650e6916644b770f7957784c3153650c3159791565006f157805375c755c3756380e3655690d3555671e6414730632476c0b395e6703770167406c096c08340f700b7106681b740473556b546d14370934107a4b315c324036583507695f7448375a6940695c311170", "376d6278757861746135766573663479693364393467617365656c69756473776d7963787a3130656f3161797065626f747837376e756d376f38363662696f353767786477733432746c39396c6732776267726c6a6c39346c706a713168787466736d6b6d6d77373934727a783164327636693565696e7470376869746939317770");
    private final String b = "upload_file_minidump";
    private final w c = w.d("application/octet-stream");
    private final jkd d;
    private final t e;

    public ikd(jkd jkd, t tVar) {
        h.e(jkd, "superbirdCrashReportingEndpoint");
        h.e(tVar, "clientInfo");
        this.d = jkd;
        this.e = tVar;
    }

    @Override // defpackage.hkd
    public a a(String str, String str2, String str3, byte[] bArr) {
        h.e(str, "serial");
        h.e(str2, "versionSoftware");
        h.e(str3, "versionOs");
        h.e(bArr, "minidump");
        c0 e2 = c0.e(this.c, bArr);
        String str4 = this.b;
        x.b b2 = x.b.b(str4, str4, e2);
        h.d(b2, "MultipartBody.Part.creat…    requestFile\n        )");
        jkd jkd = this.d;
        String str5 = this.a;
        h.d(str5, "apiKey");
        String c2 = this.e.c();
        h.d(c2, "clientInfo.versionName");
        String str6 = Build.VERSION.RELEASE;
        h.d(str6, "Build.VERSION.RELEASE");
        String str7 = Build.MODEL;
        h.d(str7, "Build.MODEL");
        return jkd.a("minidump", str5, str, str2, str3, c2, str6, "Android", str7, b2);
    }
}
