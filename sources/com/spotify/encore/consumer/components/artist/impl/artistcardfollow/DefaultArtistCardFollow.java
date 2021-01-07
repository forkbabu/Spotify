package com.spotify.encore.consumer.components.artist.impl.artistcardfollow;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encore.consumer.components.artist.api.artistcardfollow.ArtistCardFollow;
import com.spotify.encore.consumer.components.artist.impl.databinding.ArtistCardFollowLayoutBinding;
import com.spotify.encore.consumer.elements.artwork.Artwork;
import com.spotify.encore.consumer.elements.follow.FollowButtonGroup;
import com.squareup.picasso.Picasso;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class DefaultArtistCardFollow implements ArtistCardFollow {
    private final ArtistCardFollowLayoutBinding binding;
    private ArtistCardFollow.FollowingStatus currentStatus;

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            ArtistCardFollow.FollowingStatus.values();
            int[] iArr = new int[3];
            $EnumSwitchMapping$0 = iArr;
            ArtistCardFollow.FollowingStatus followingStatus = ArtistCardFollow.FollowingStatus.Error;
            iArr[2] = 1;
            ArtistCardFollow.FollowingStatus followingStatus2 = ArtistCardFollow.FollowingStatus.Following;
            iArr[1] = 2;
            ArtistCardFollow.FollowingStatus followingStatus3 = ArtistCardFollow.FollowingStatus.NotFollowing;
            iArr[0] = 3;
        }
    }

    public DefaultArtistCardFollow(Context context, Picasso picasso) {
        h.e(context, "context");
        h.e(picasso, "picasso");
        ArtistCardFollowLayoutBinding inflate = ArtistCardFollowLayoutBinding.inflate(LayoutInflater.from(context));
        h.d(inflate, "ArtistCardFollowLayoutBi…utInflater.from(context))");
        ArtistCardFollowBindingsExtensions.init(inflate, picasso);
        this.binding = inflate;
    }

    private final void setButtonErrorStatus() {
        this.binding.followButton.render(new FollowButtonGroup.Model(this.currentStatus == ArtistCardFollow.FollowingStatus.Following, null, true, 2, null));
        this.currentStatus = ArtistCardFollow.FollowingStatus.Error;
    }

    private final void setButtonFollowingStatus(boolean z) {
        ArtistCardFollow.FollowingStatus followingStatus;
        if (z) {
            followingStatus = ArtistCardFollow.FollowingStatus.Following;
        } else {
            followingStatus = ArtistCardFollow.FollowingStatus.NotFollowing;
        }
        this.currentStatus = followingStatus;
        this.binding.followButton.render(new FollowButtonGroup.Model(z, null, false, 6, null));
    }

    @Override // com.spotify.encore.ViewProvider
    public View getView() {
        ConstraintLayout root = this.binding.getRoot();
        h.d(root, "binding.root");
        return root;
    }

    @Override // com.spotify.encore.Item
    public void onEvent(nmf<? super ArtistCardFollow.Events, f> nmf) {
        h.e(nmf, "event");
        getView().setOnClickListener(new DefaultArtistCardFollow$onEvent$1(nmf));
        this.binding.followButton.setOnClickListener(new DefaultArtistCardFollow$onEvent$2(this, nmf));
    }

    public void render(ArtistCardFollow.Model model) {
        h.e(model, "model");
        TextView textView = this.binding.title;
        h.d(textView, "binding.title");
        textView.setText(model.getArtistName());
        this.binding.artwork.render((Artwork.Model) new Artwork.Model.Artist(model.getImageData(), false, 2, null));
        int ordinal = model.getFollowingStatus().ordinal();
        if (ordinal == 0) {
            setButtonFollowingStatus(false);
        } else if (ordinal == 1) {
            setButtonFollowingStatus(true);
        } else if (ordinal == 2) {
            setButtonErrorStatus();
        }
    }
}
