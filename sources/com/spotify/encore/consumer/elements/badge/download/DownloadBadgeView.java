package com.spotify.encore.consumer.elements.badge.download;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.spotify.encore.consumer.elements.R;
import com.spotify.encore.consumer.elements.badge.download.DownloadBadgeDrawable;
import com.spotify.paste.widgets.internal.StateListAnimatorImageView;
import kotlin.f;

public class DownloadBadgeView extends StateListAnimatorImageView implements DownloadBadge {

    /* renamed from: com.spotify.encore.consumer.elements.badge.download.DownloadBadgeView$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$spotify$encore$consumer$elements$badge$download$DownloadState;

        static {
            DownloadState.values();
            int[] iArr = new int[5];
            $SwitchMap$com$spotify$encore$consumer$elements$badge$download$DownloadState = iArr;
            try {
                DownloadState downloadState = DownloadState.Empty;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = $SwitchMap$com$spotify$encore$consumer$elements$badge$download$DownloadState;
                DownloadState downloadState2 = DownloadState.Waiting;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int[] iArr3 = $SwitchMap$com$spotify$encore$consumer$elements$badge$download$DownloadState;
                DownloadState downloadState3 = DownloadState.Downloading;
                iArr3[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                int[] iArr4 = $SwitchMap$com$spotify$encore$consumer$elements$badge$download$DownloadState;
                DownloadState downloadState4 = DownloadState.Downloaded;
                iArr4[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                int[] iArr5 = $SwitchMap$com$spotify$encore$consumer$elements$badge$download$DownloadState;
                DownloadState downloadState5 = DownloadState.Error;
                iArr5[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public DownloadBadgeView(Context context) {
        this(context, null);
    }

    private DownloadBadgeDrawable getOrCreateBadgeDrawable() {
        Drawable drawable = getDrawable();
        if (!(drawable instanceof DownloadBadgeDrawable)) {
            return new DownloadBadgeDrawable(getContext());
        }
        drawable.setCallback(null);
        return (DownloadBadgeDrawable) drawable;
    }

    private void hideDownloadBadge() {
        setImageDrawable(null);
        setVisibility(8);
    }

    private void showDownloadBadge(DownloadBadgeDrawable.State state, int i) {
        DownloadBadgeDrawable orCreateBadgeDrawable = getOrCreateBadgeDrawable();
        orCreateBadgeDrawable.setCallback(this);
        orCreateBadgeDrawable.setDownloadState(state);
        updateDownloadBadge(orCreateBadgeDrawable);
        setContentDescription(getContext().getString(i));
        setVisibility(0);
    }

    private void updateDownloadBadge(Drawable drawable) {
        setImageDrawable(drawable);
    }

    @Override // com.spotify.encore.Item
    public void onEvent(nmf<? super Void, f> nmf) {
    }

    public DownloadBadgeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void render(DownloadState downloadState) {
        int ordinal = downloadState.ordinal();
        if (ordinal == 0) {
            hideDownloadBadge();
        } else if (ordinal == 1) {
            showDownloadBadge(DownloadBadgeDrawable.State.WAITING, R.string.download_badge_waiting_content_description);
        } else if (ordinal == 2) {
            showDownloadBadge(DownloadBadgeDrawable.State.DOWNLOADING, R.string.download_badge_downloading_content_description);
        } else if (ordinal == 3) {
            showDownloadBadge(DownloadBadgeDrawable.State.DOWNLOADED, R.string.download_badge_downloaded_content_description);
        } else if (ordinal == 4) {
            showDownloadBadge(DownloadBadgeDrawable.State.ERROR, R.string.download_badge_error_content_description);
        }
    }

    public DownloadBadgeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
