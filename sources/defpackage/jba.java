package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.foundation.R;
import com.spotify.libs.connect.model.DeviceType;
import com.spotify.libs.connect.picker.view.h;
import com.spotify.music.C0707R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import java.util.HashMap;

/* renamed from: jba  reason: default package */
public final class jba {
    private final Context a;
    private final int b;
    private final HashMap<String, SpotifyIconDrawable> c = new HashMap<>();
    private final int d = R.color.green;
    private final int e = R.color.white;
    private SpotifyIconDrawable f;
    private SpotifyIconDrawable g;
    private kba h;

    /* access modifiers changed from: package-private */
    /* renamed from: jba$a */
    public class a extends AnimatorListenerAdapter {
        private boolean a;
        final /* synthetic */ View b;

        a(jba jba, View view) {
            this.b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.a) {
                animator.start();
                return;
            }
            this.b.setAlpha(1.0f);
            animator.removeAllListeners();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.a = false;
        }
    }

    public jba(Context context) {
        this.a = context;
        this.b = context.getResources().getDimensionPixelSize(C0707R.dimen.connect_destination_button_icon_size);
    }

    private SpotifyIconDrawable b(SpotifyIconV2 spotifyIconV2, int i) {
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(this.a, spotifyIconV2, (float) this.b);
        spotifyIconDrawable.r(androidx.core.content.a.b(this.a, i));
        spotifyIconDrawable.w((float) this.b);
        return spotifyIconDrawable;
    }

    private SpotifyIconDrawable h(DeviceType deviceType, boolean z, boolean z2) {
        StringBuilder sb = new StringBuilder();
        sb.append(deviceType.name());
        sb.append(z2 ? "Connected" : "Connecting");
        String sb2 = sb.toString();
        SpotifyIconDrawable spotifyIconDrawable = this.c.get(sb2);
        if (spotifyIconDrawable != null) {
            return spotifyIconDrawable;
        }
        SpotifyIconDrawable b2 = b(h.a(deviceType, z), z2 ? this.d : this.e);
        this.c.put(sb2, b2);
        return b2;
    }

    public AnimatorSet a(View view) {
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator duration = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f).setDuration(400L);
        duration.setStartDelay(250);
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f).setDuration(400L);
        duration2.setStartDelay(250);
        animatorSet.addListener(new a(this, view));
        animatorSet.play(duration).before(duration2);
        return animatorSet;
    }

    public SpotifyIconDrawable c() {
        if (this.g == null) {
            this.g = b(SpotifyIconV2.CHROMECAST_CONNECTED, this.d);
        }
        return this.g;
    }

    public kba d() {
        if (this.h == null) {
            SpotifyIconDrawable b2 = b(SpotifyIconV2.CHROMECAST_DISCONNECTED, this.e);
            b2.setAlpha(77);
            AnimationDrawable animationDrawable = new AnimationDrawable();
            SpotifyIconDrawable b3 = b(SpotifyIconV2.CHROMECAST_CONNECTING_ONE, this.e);
            SpotifyIconDrawable b4 = b(SpotifyIconV2.CHROMECAST_CONNECTING_TWO, this.e);
            SpotifyIconDrawable b5 = b(SpotifyIconV2.CHROMECAST_CONNECTING_THREE, this.e);
            animationDrawable.addFrame(b3, 333);
            animationDrawable.addFrame(b4, 333);
            animationDrawable.addFrame(b5, 333);
            animationDrawable.addFrame(b4, 333);
            animationDrawable.setOneShot(false);
            int i = this.b;
            animationDrawable.setBounds(i, i, i, i);
            this.h = new kba(new LayerDrawable(new Drawable[]{animationDrawable, b2}), animationDrawable);
        }
        return this.h;
    }

    public SpotifyIconDrawable e(DeviceType deviceType, boolean z) {
        return h(deviceType, z, true);
    }

    public SpotifyIconDrawable f(DeviceType deviceType, boolean z) {
        return h(deviceType, z, false);
    }

    public SpotifyIconDrawable g() {
        if (this.f == null) {
            this.f = b(SpotifyIconV2.DEVICE_OTHER, R.color.gray_70);
        }
        return this.f;
    }
}
