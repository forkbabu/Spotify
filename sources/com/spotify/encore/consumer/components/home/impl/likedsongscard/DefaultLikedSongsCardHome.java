package com.spotify.encore.consumer.components.home.impl.likedsongscard;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encore.consumer.components.home.api.homecard.HomeCard;
import com.spotify.encore.consumer.components.home.api.likedsongscard.LikedSongsCardHome;
import com.spotify.encore.consumer.components.home.impl.databinding.LikedSongsCardHomeBinding;
import com.spotify.encore.consumer.components.home.impl.homecard.util.HomeCardUtil;
import com.spotify.encore.consumer.elements.artwork.ArtworkView;
import com.spotify.encore.consumer.elements.badge.download.DownloadBadgeView;
import com.spotify.encore.consumer.elements.badge.download.DownloadState;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class DefaultLikedSongsCardHome implements LikedSongsCardHome {
    private final LikedSongsCardHomeBinding binding;

    public DefaultLikedSongsCardHome(Context context) {
        h.e(context, "context");
        LikedSongsCardHomeBinding inflate = LikedSongsCardHomeBinding.inflate(LayoutInflater.from(context));
        h.d(inflate, "LikedSongsCardHomeBindin…utInflater.from(context))");
        this.binding = inflate;
        bvd b = dvd.b(getView());
        b.g(inflate.title);
        b.g(inflate.subtitle);
        b.f(inflate.image);
        b.a();
    }

    @Override // com.spotify.encore.ViewProvider
    public View getView() {
        ConstraintLayout root = this.binding.getRoot();
        h.d(root, "binding.root");
        return root;
    }

    @Override // com.spotify.encore.Item
    public void onEvent(nmf<? super LikedSongsCardHome.Events, f> nmf) {
        h.e(nmf, "event");
        getView().setOnClickListener(new DefaultLikedSongsCardHome$onEvent$1(nmf));
    }

    public void render(LikedSongsCardHome.Model model) {
        h.e(model, "model");
        HomeCardUtil homeCardUtil = HomeCardUtil.INSTANCE;
        View view = getView();
        HomeCard.Size size = HomeCard.Size.SMALL;
        homeCardUtil.setLayoutWidth(view, size);
        ArtworkView artworkView = this.binding.image;
        h.d(artworkView, "binding.image");
        homeCardUtil.setImageBottomMargin(artworkView, size);
        Context context = getView().getContext();
        h.d(context, "view.context");
        int i = 2;
        TextView textView = this.binding.title;
        h.d(textView, "binding.title");
        TextView textView2 = this.binding.subtitle;
        h.d(textView2, "binding.subtitle");
        boolean z = true;
        homeCardUtil.resetTextAlignment(context, textView, textView2);
        TextView textView3 = this.binding.title;
        h.d(textView3, "binding.title");
        textView3.setVisibility(model.getTitle().length() > 0 ? 0 : 8);
        TextView textView4 = this.binding.title;
        h.d(textView4, "binding.title");
        textView4.setText(model.getTitle());
        TextView textView5 = this.binding.subtitle;
        h.d(textView5, "binding.subtitle");
        textView5.setVisibility(model.getSubTitle().length() > 0 ? 0 : 8);
        TextView textView6 = this.binding.subtitle;
        h.d(textView6, "binding.subtitle");
        textView6.setText(model.getSubTitle());
        if (model.getTitle().length() > 0) {
            if (model.getSubTitle().length() > 0) {
                i = 1;
            }
        }
        this.binding.title.setLines(i);
        if (model.getDownloaded()) {
            TextView textView7 = this.binding.title;
            h.d(textView7, "binding.title");
            CharSequence text = textView7.getText();
            h.d(text, "binding.title.text");
            if (text.length() > 0) {
                this.binding.downloadBadgeTitle.render(DownloadState.Downloaded);
                DownloadBadgeView downloadBadgeView = this.binding.downloadBadgeTitle;
                h.d(downloadBadgeView, "binding.downloadBadgeTitle");
                downloadBadgeView.setVisibility(0);
                DownloadBadgeView downloadBadgeView2 = this.binding.downloadBadgeSubtitle;
                h.d(downloadBadgeView2, "binding.downloadBadgeSubtitle");
                downloadBadgeView2.setVisibility(8);
            } else {
                TextView textView8 = this.binding.subtitle;
                h.d(textView8, "binding.subtitle");
                CharSequence text2 = textView8.getText();
                h.d(text2, "binding.subtitle.text");
                if (text2.length() <= 0) {
                    z = false;
                }
                if (z) {
                    this.binding.downloadBadgeSubtitle.render(DownloadState.Downloaded);
                    DownloadBadgeView downloadBadgeView3 = this.binding.downloadBadgeSubtitle;
                    h.d(downloadBadgeView3, "binding.downloadBadgeSubtitle");
                    downloadBadgeView3.setVisibility(0);
                    DownloadBadgeView downloadBadgeView4 = this.binding.downloadBadgeTitle;
                    h.d(downloadBadgeView4, "binding.downloadBadgeTitle");
                    downloadBadgeView4.setVisibility(8);
                }
            }
        }
        ArtworkView artworkView2 = this.binding.image;
        Context context2 = getView().getContext();
        h.d(context2, "view.context");
        artworkView2.setImageDrawable(oi0.c(context2));
    }
}
