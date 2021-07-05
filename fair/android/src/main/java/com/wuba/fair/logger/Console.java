package com.wuba.fair.logger;

import android.webkit.JavascriptInterface;

public class Console {

    @JavascriptInterface
    public void log(Object... args) {
        FairLogger.i("Console [f_info] ", (args == null ? "" : args[0].toString()));
    }

    @JavascriptInterface
    public void error(Object... args) {
        FairLogger.e("Console [f_error] ", (args == null ? "" : args[0].toString()));
    }

    @JavascriptInterface
    public void warn(Object... args) {
        FairLogger.w("Console [f_warn] ", (args == null ? "" : args[0].toString()));
    }
}