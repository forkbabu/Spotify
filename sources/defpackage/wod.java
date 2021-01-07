package defpackage;

import android.app.Activity;
import android.net.Uri;
import android.nfc.NdefMessage;
import android.nfc.NdefRecord;
import android.nfc.NfcAdapter;
import android.nfc.NfcEvent;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.n;

/* renamed from: wod  reason: default package */
public class wod {
    private final NfcAdapter a;

    /* renamed from: wod$a */
    class a implements NfcAdapter.CreateNdefMessageCallback {
        final /* synthetic */ b a;
        final /* synthetic */ Activity b;

        a(wod wod, b bVar, Activity activity) {
            this.a = bVar;
            this.b = activity;
        }

        @Override // android.nfc.NfcAdapter.CreateNdefMessageCallback
        public NdefMessage createNdefMessage(NfcEvent nfcEvent) {
            Uri a2 = ((n) this.a).a();
            if (a2 == null) {
                return null;
            }
            return new NdefMessage(new NdefRecord[]{NdefRecord.createUri(a2), NdefRecord.createApplicationRecord(this.b.getApplication().getApplicationInfo().packageName)});
        }
    }

    /* renamed from: wod$b */
    public interface b {
    }

    wod(NfcAdapter nfcAdapter) {
        this.a = nfcAdapter;
    }

    public void a(b bVar, Activity activity) {
        NfcAdapter nfcAdapter = this.a;
        if (nfcAdapter != null) {
            try {
                nfcAdapter.setNdefPushMessageCallback(new a(this, bVar, activity), activity, new Activity[0]);
            } catch (RuntimeException e) {
                Assertion.i("NFC issue", e);
            }
        }
    }
}
