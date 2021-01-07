package defpackage;

import android.content.Context;
import com.spotify.music.C0707R;
import java.util.List;

/* renamed from: w7e  reason: default package */
public class w7e {
    private final List<String> a;
    private final Context b;

    public w7e(List<String> list, Context context) {
        this.a = list;
        this.b = context;
    }

    public boolean a(String str) {
        if (this.a.contains(str) || str.startsWith(this.b.getString(C0707R.string.integration_id_marketing_format, ""))) {
            return true;
        }
        return false;
    }
}
