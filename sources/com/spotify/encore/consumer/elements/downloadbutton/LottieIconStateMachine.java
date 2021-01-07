package com.spotify.encore.consumer.elements.downloadbutton;

import com.spotify.encore.consumer.elements.downloadbutton.DownloadButton;

public interface LottieIconStateMachine {
    void moveToState(DownloadButton.Model model, DownloadButtonView downloadButtonView);
}
