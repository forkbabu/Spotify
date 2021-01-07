package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.spotify.music.C0707R;

/* renamed from: v16  reason: default package */
public class v16 extends nc0 {
    private final ViewGroup c;
    private final TextView f;
    private final TextView n;
    private final Button o;

    public v16(Context context, ViewGroup viewGroup) {
        super(LayoutInflater.from(context).inflate(C0707R.layout.playlist_all_songs_header_content, viewGroup, false));
        View findViewById = getView().findViewById(C0707R.id.wrapper);
        findViewById.getClass();
        this.c = (ViewGroup) findViewById;
        View findViewById2 = getView().findViewById(C0707R.id.title);
        findViewById2.getClass();
        this.f = (TextView) findViewById2;
        View findViewById3 = getView().findViewById(C0707R.id.subtitle);
        findViewById3.getClass();
        this.n = (TextView) findViewById3;
        View findViewById4 = getView().findViewById(C0707R.id.button);
        findViewById4.getClass();
        this.o = (Button) findViewById4;
    }

    public Button E2() {
        return this.o;
    }

    public void F2(boolean z) {
        this.o.setVisibility(z ? 0 : 8);
    }

    public void G2(boolean z) {
        this.n.setVisibility(z ? 0 : 8);
    }

    @Override // defpackage.nc0, defpackage.tc0
    public void e0(int i, float f2) {
        this.c.setTranslationY((float) (-i));
    }

    public void setTitle(String str) {
        this.f.setText(str);
    }
}
