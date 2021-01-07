package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.core.content.a;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.foundation.R;
import com.spotify.music.C0707R;
import com.spotify.music.libs.viewuri.c;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import com.spotify.paste.widgets.internal.StateListAnimatorImageButton;

/* renamed from: abb  reason: default package */
public class abb implements zab {
    private final vab a;
    private final tab b;
    private final xab c;

    public abb(vab vab, tab tab, xab xab) {
        this.a = vab;
        this.b = tab;
        this.c = xab;
    }

    @Override // defpackage.zab
    public void a() {
        this.b.a();
    }

    @Override // defpackage.zab
    public ImageButton b(Activity activity, ViewGroup viewGroup, Runnable runnable) {
        vab vab = this.a;
        vab.getClass();
        ImageButton imageButton = (ImageButton) activity.getLayoutInflater().inflate(C0707R.layout.voice_floating_mic_button, viewGroup).findViewById(C0707R.id.voice_floating_mic_button);
        imageButton.setOnClickListener(new qab(vab, runnable, activity));
        return imageButton;
    }

    @Override // defpackage.zab
    public View c(Context context) {
        this.b.getClass();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(nud.g(48.0f, context.getResources()), -1);
        StateListAnimatorImageButton stateListAnimatorImageButton = new StateListAnimatorImageButton(context);
        stateListAnimatorImageButton.setImageDrawable(new SpotifyIconDrawable(context, SpotifyIconV2.MIC, (float) nud.g(24.0f, context.getResources())));
        stateListAnimatorImageButton.setBackgroundColor(a.b(context, R.color.gray_7));
        stateListAnimatorImageButton.setContentDescription(context.getString(C0707R.string.voice_mic_button_content_desc));
        stateListAnimatorImageButton.setId(C0707R.id.search_voice_button);
        stateListAnimatorImageButton.setLayoutParams(layoutParams);
        return stateListAnimatorImageButton;
    }

    @Override // defpackage.zab
    public void d(View view, ViewGroup viewGroup, c.a aVar, boolean z) {
        this.c.a(view, viewGroup, aVar, z);
    }

    @Override // defpackage.zab
    public View e(Activity activity, ViewGroup viewGroup) {
        this.c.getClass();
        View.inflate(activity, C0707R.layout.voice_mic_callout_tooltip, viewGroup);
        return viewGroup.findViewById(C0707R.id.tooltip_container);
    }

    @Override // defpackage.zab
    public void f() {
        this.b.b();
    }
}
