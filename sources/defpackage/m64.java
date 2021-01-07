package defpackage;

import android.content.Context;
import com.spotify.music.C0707R;

/* renamed from: m64  reason: default package */
public class m64 implements l64 {
    private final Context a;

    public m64(Context context) {
        this.a = context;
    }

    @Override // defpackage.l64
    public String a(boolean z, boolean z2, boolean z3) {
        return this.a.getString((z || !z2) ? z3 ? C0707R.string.find_search_field_hint_with_podcasts : C0707R.string.find_search_field_hint : C0707R.string.find_search_field_offline_hint);
    }

    @Override // defpackage.l64
    public String b(boolean z, boolean z2, boolean z3) {
        return this.a.getString((z || !z2) ? z3 ? C0707R.string.find_search_field_hint_voice_with_podcasts : C0707R.string.find_search_field_hint_voice : C0707R.string.find_search_field_offline_hint);
    }
}
