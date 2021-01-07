package defpackage;

import android.os.Parcelable;
import com.spotify.inappmessaging.FormatType;
import com.spotify.inappmessaging.TriggerType;
import java.util.regex.Pattern;

/* renamed from: gp0  reason: default package */
public abstract class gp0 implements Parcelable {
    private Pattern a;

    public static gp0 a(TriggerType triggerType, String str, FormatType formatType) {
        return new dp0(triggerType, str, formatType);
    }

    public abstract FormatType b();

    public abstract String c();

    public abstract TriggerType e();

    public boolean f(String str) {
        Pattern pattern = this.a;
        if (pattern == null || pattern.toString().isEmpty()) {
            this.a = Pattern.compile(c().replace("?", "([a-zA-Z0-9~`!@#\\$%\\^&\\*\\(\\)_\\-\\+={\\[\\}\\]\\|\\;\"'<,>\\.\\?\\/  ]*)"));
        }
        return this.a.matcher(str).matches();
    }
}
