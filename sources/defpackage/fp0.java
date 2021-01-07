package defpackage;

import android.os.Parcelable;
import com.spotify.inappmessaging.FormatType;
import java.util.Map;

/* renamed from: fp0  reason: default package */
public abstract class fp0 implements Parcelable {
    public static fp0 a(String str, Map<String, ep0> map, String str2, String str3, String str4, FormatType formatType) {
        return new cp0(str, map, str2, str3, str4, formatType);
    }

    public abstract Map<String, ep0> b();

    public abstract FormatType c();

    public abstract String e();

    public abstract String f();

    public abstract String g();

    public abstract String h();
}
