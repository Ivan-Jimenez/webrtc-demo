package xyz.ivanjimenez.webrtcdemo

import android.webkit.JavascriptInterface

class JavaScriptInterface(val callActivity: CallActivity) {
    @JavascriptInterface
    fun onPeerConnected() {
        callActivity.onPeerConnected()
    }
}