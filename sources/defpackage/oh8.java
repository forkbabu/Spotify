package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.C0707R;
import com.spotify.pageloader.s0;

/* renamed from: oh8  reason: default package */
public class oh8 implements s0 {
    private View a;

    @Override // com.spotify.pageloader.s0
    public View getView() {
        return this.a;
    }

    @Override // com.spotify.pageloader.s0
    public void i(Context context, ViewGroup viewGroup, LayoutInflater layoutInflater) {
        gb0 a2 = e90.c().a(context, viewGroup);
        a2.setTitle(context.getString(C0707R.string.saved_ads_empty_view_text));
        a2.setSubtitle("");
        this.a = a2.getView();
    }

    @Override // com.spotify.pageloader.s0
    public void start() {
    }

    @Override // com.spotify.pageloader.s0
    public void stop() {
    }
}
