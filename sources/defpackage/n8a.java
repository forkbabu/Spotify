package defpackage;

import android.content.Context;
import com.spotify.music.libs.collection.service.OffliningService;

/* renamed from: n8a  reason: default package */
public class n8a implements m8a {
    private final Context a;

    public n8a(Context context) {
        context.getClass();
        this.a = context;
    }

    @Override // defpackage.m8a
    public void a(String str) {
        OffliningService.a(this.a, str, true);
    }

    @Override // defpackage.m8a
    public void b(String str) {
        OffliningService.a(this.a, str, false);
    }
}
