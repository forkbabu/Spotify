package com.mp4parser.streaming;

import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;

class MultiTrackFragmentedMp4Writer$1 extends WriteOnlyBox {
    final /* synthetic */ a this$0;
    private final /* synthetic */ c val$streamingTrack;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    MultiTrackFragmentedMp4Writer$1(a aVar, String str, c cVar) {
        super(str);
        this.val$streamingTrack = cVar;
    }

    @Override // com.mp4parser.streaming.WriteOnlyBox, com.coremedia.iso.boxes.a, com.coremedia.iso.boxes.FullBox
    public void getBox(WritableByteChannel writableByteChannel) {
        new ArrayList();
        throw null;
    }

    @Override // com.mp4parser.streaming.WriteOnlyBox, com.coremedia.iso.boxes.a, com.coremedia.iso.boxes.FullBox
    public long getSize() {
        throw null;
    }
}
