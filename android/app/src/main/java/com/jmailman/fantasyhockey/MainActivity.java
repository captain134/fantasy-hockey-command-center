package com.jmailman.fantasyhockey;
import android.app.*;import android.os.*;import android.webkit.*;import android.content.*;import android.net.Uri;import android.view.*;
public class MainActivity extends Activity{
 WebView w; final String HOME="https://fantasy.jmailman.com";
 public void onCreate(Bundle b){super.onCreate(b);w=new WebView(this);setContentView(w);WebSettings s=w.getSettings();s.setJavaScriptEnabled(true);s.setDomStorageEnabled(true);s.setAllowFileAccess(false);s.setMixedContentMode(WebSettings.MIXED_CONTENT_NEVER_ALLOW);CookieManager.getInstance().setAcceptCookie(true);w.setWebViewClient(new WebViewClient(){public boolean shouldOverrideUrlLoading(WebView v,WebResourceRequest r){Uri u=r.getUrl();if("fantasy.jmailman.com".equals(u.getHost()))return false;startActivity(new Intent(Intent.ACTION_VIEW,u));return true;}});w.loadUrl(HOME);}
 @Override public void onBackPressed(){if(w.canGoBack())w.goBack();else super.onBackPressed();}
}