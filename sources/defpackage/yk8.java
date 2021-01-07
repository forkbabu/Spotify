package defpackage;

import android.content.Context;
import android.os.Build;
import android.speech.tts.TextToSpeech;
import android.speech.tts.UtteranceProgressListener;
import io.reactivex.d;
import java.util.HashMap;
import java.util.Locale;

/* renamed from: yk8  reason: default package */
public class yk8 {
    private final Context a;
    private final String b;

    /* access modifiers changed from: private */
    /* renamed from: yk8$b */
    public static class b implements d, TextToSpeech.OnInitListener {
        private final Context a;
        private final Locale b;
        private final String c;
        private final String d;
        private io.reactivex.b e;
        private TextToSpeech f;

        /* renamed from: yk8$b$a */
        class a extends UtteranceProgressListener {
            a() {
            }

            @Override // android.speech.tts.UtteranceProgressListener
            public void onDone(String str) {
                if (b.this.d.equals(str)) {
                    b.this.e.onComplete();
                }
            }

            @Override // android.speech.tts.UtteranceProgressListener
            public void onError(String str) {
                if (b.this.d.equals(str)) {
                    b.this.e.onError(new Throwable("TTS failed."));
                }
            }

            @Override // android.speech.tts.UtteranceProgressListener
            public void onStart(String str) {
            }
        }

        b(Context context, String str, Locale locale, String str2, a aVar) {
            this.a = context;
            this.b = locale;
            this.c = str;
            this.d = str2;
        }

        public /* synthetic */ void c() {
            TextToSpeech textToSpeech = this.f;
            if (textToSpeech != null) {
                textToSpeech.stop();
                this.f.shutdown();
            }
        }

        @Override // android.speech.tts.TextToSpeech.OnInitListener
        public void onInit(int i) {
            if (!this.e.d() && i == 0) {
                this.f.setOnUtteranceProgressListener(new a());
                Locale locale = this.b;
                if (locale != null) {
                    this.f.setLanguage(locale);
                }
                TextToSpeech textToSpeech = this.f;
                String str = this.c;
                if (Build.VERSION.SDK_INT >= 21) {
                    textToSpeech.speak(str, 0, null, this.d);
                    return;
                }
                HashMap<String, String> hashMap = new HashMap<>(1);
                hashMap.put("utteranceId", this.d);
                textToSpeech.speak(str, 0, hashMap);
            }
        }

        @Override // io.reactivex.d
        public void subscribe(io.reactivex.b bVar) {
            this.e = bVar;
            bVar.e(new xk8(this));
            this.f = new TextToSpeech(this.a, this);
        }
    }

    public yk8(Context context, String str) {
        this.a = context;
        this.b = str;
    }

    public io.reactivex.a a(String str, Locale locale) {
        return io.reactivex.a.m(new b(this.a, str, locale, this.b, null));
    }
}
