package com.spotify.wakeword.sensory;

import android.content.Context;
import com.sensory.speech.snsr.Snsr;
import com.sensory.speech.snsr.SnsrSession;
import com.sensory.speech.snsr.SnsrStream;
import com.spotify.base.java.logging.Logger;
import java.io.File;

public class w implements v {
    public SnsrSession a(Context context, SnsrStream snsrStream) {
        SnsrSession snsrSession = new SnsrSession();
        String path = new File("assets/models", "thf-spot-11lb.snsr").getPath();
        Snsr.init(context);
        snsrSession.load(path).require("task-type", "phrasespot").setStream("->audio-pcm", snsrStream);
        Logger.n(snsrSession.getString("library-info"), new Object[0]);
        return snsrSession;
    }

    public void b(SnsrSession snsrSession) {
        snsrSession.setInt("audio-stream-size", 64000);
        snsrSession.setInt("auto-flush", 0);
        snsrSession.run();
    }
}
