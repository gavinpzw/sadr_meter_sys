package moonma.com.smartammeter;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

//Android webview https://blog.csdn.net/lowprofile_coding/article/details/77928614
public class MainActivity extends AppCompatActivity {
    static final String MAIN_URL_AMMETER= "http://47.106.220.166:3004/sadr/mobile/login.html";
    //static final String MAIN_URL_AMMETER=  "http://www.baidu.com";
    private WebView webView;
    private TextView textTitle;
    private ImageView imageViewLogo;
    private ProgressBar progressBar;
    private AlertDialog alertDialog;
    Handler handlerLoad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);//隐藏状态栏
        //getSupportActionBar().hide();//隐藏标题栏
        setContentView(R.layout.activity_main);
        imageViewLogo = (ImageView) findViewById(R.id.imageView);

// init
        initDialog();
        //progressBar= (ProgressBar)findViewById(R.id.progressbar);//进度条
        textTitle= (TextView) findViewById(R.id.TextTitle);
        textTitle.setText(R.string.web_load_fail);
        textTitle.setTextColor(Color.RED);
        textTitle.setVisibility(View.GONE);

        webView = (WebView) findViewById(R.id.webview);
        webView.setVisibility(View.GONE);
        //设置web背景透明
        //webView.setBackgroundColor(0);

        WebSettings webSettings = webView.getSettings();
       webSettings.setJavaScriptEnabled(true);
        webSettings.setUseWideViewPort(true);
        webSettings.setLoadWithOverviewMode(true);//设置网页缩放至手机大小
      //  webSettings.setCacheMode(WebSettings.LOAD_NO_CACHE);//不使用缓存，只从网络获取数据.
      //  webView.setLayerType(View.LAYER_TYPE_HARDWARE,null);//开启硬件加速

        // 在WebView中而不在默认浏览器中显示页面
        webView.setWebViewClient(new MyWebViewClient());
       webView.setWebChromeClient(new WebChromeClient());//支持特殊javascript

//        webView.loadUrl("file:///android_asset/test.html");//加载asset文件夹下html
       // webView.loadUrl("https://blog.csdn.net/lowprofile_coding/article/details/77928614");//加载url




        //使用webview显示html代码
//        webView.loadDataWithBaseURL(null,"<html><head><title> 欢迎您 </title></head>" +
//                "<body><h2>使用webview显示 html代码</h2></body></html>", "text/html" , "utf-8", null);

// webView.addJavascriptInterface(this,"android");//添加js监听 这样html就能调用客户端
//        webView.setWebChromeClient(webChromeClient);
//        webView.setWebViewClient(webViewClient);
//
//        WebSettings webSettings=webView.getSettings();
//        webSettings.setJavaScriptEnabled(true);//允许使用js
//
//        /**
//         * LOAD_CACHE_ONLY: 不使用网络，只读取本地缓存数据
//         * LOAD_DEFAULT: （默认）根据cache-control决定是否从网络上取数据。
//         * LOAD_NO_CACHE: 不使用缓存，只从网络获取数据.
//         * LOAD_CACHE_ELSE_NETWORK，只要本地有，无论是否过期，或者no-cache，都使用缓存中的数据。
//         */
//        webSettings.setCacheMode(WebSettings.LOAD_NO_CACHE);//不使用缓存，只从网络获取数据.
//
//        //支持屏幕缩放
//        webSettings.setSupportZoom(true);
//        webSettings.setBuiltInZoomControls(true);

        //不显示webview缩放按钮
//        webSettings.setDisplayZoomControls(false);
        LoadWeb();
    }


    /*
  初始化AlertDialog
   */
    public void initDialog()
    {
        //创建AlertDialog的构造器的对象
        AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
        //设置构造器标题
        builder.setTitle(R.string.exit_title);
        //构造器对应的图标
        //builder.setIcon(R.mipmap.ic_launcher);
        //构造器内容,为对话框设置文本项(之后还有列表项的例子)
        builder.setMessage(R.string.exit_msg);
        //为构造器设置确定按钮,第一个参数为按钮显示的文本信息，第二个参数为点击后的监听事件，用匿名内部类实现
        builder.setPositiveButton(R.string.exit_yes, new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                //第一个参数dialog是点击的确定按钮所属的Dialog对象,第二个参数which是按钮的标示值
                finish();//结束当前Activity
            }
        });
        //为构造器设置取消按钮,若点击按钮后不需要做任何操作则直接为第二个参数赋值null
        builder.setNegativeButton(R.string.exit_no,null);
        //为构造器设置一个比较中性的按钮，比如忽略、稍后提醒等no
       // builder.setNeutralButton("稍后提醒",null);
        //利用构造器创建AlertDialog的对象,实现实例化
        alertDialog=builder.create();
    }

    /*
    实现Button监听器的除了内部类外的方法
    点击Button时弹出AlertDialog
     */
    public void showDialog()
    {
        //当AlertDialog存在实例对象并且没有在展示时
        if(alertDialog!=null&&!alertDialog.isShowing())
            alertDialog.show();
    }
    // 网络状态
    public boolean isNetworkConnected(Context context) {
        if (context != null) {
            ConnectivityManager mConnectivityManager = (ConnectivityManager) context
                    .getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo mNetworkInfo = mConnectivityManager
                    .getActiveNetworkInfo();
            if (mNetworkInfo != null) {
                return mNetworkInfo.isAvailable();
            }
        }
        return false;
    }

    void LoadWeb()
    {
        webView.loadUrl(MAIN_URL_AMMETER);
//
//long timeDelayMS = 2000;
//        handlerLoad = new Handler();
//        Runnable r = new Runnable() {
//
//            @Override
//            public void run() {
//                //do something
//              //  webView.loadUrl(MAIN_URL_AMMETER);
//            }
//        };
//        handlerLoad.postDelayed(r, timeDelayMS);//延时毫秒
    }

    void ShowWeb()
    {
        long timeDelayMS = 3000;//ms
        handlerLoad = new Handler();
        Runnable r = new Runnable() {

            @Override
            public void run() {
                //do something
                webView.setVisibility(View.VISIBLE);

                //logo显示占用系统资源 需要隐藏
                imageViewLogo.setVisibility(View.GONE);
            }
        };
        handlerLoad.postDelayed(r, timeDelayMS);//延时毫秒
    }
    void ShowText()
    {
        textTitle.setVisibility(View.VISIBLE);

    }

    private class MyWebViewClient extends WebViewClient {
        @Override
        // 在WebView中而不在默认浏览器中显示页面
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }


        @Override
        public void onPageFinished(WebView view, String url) {
            // TODO Auto-generated method stub
            super.onPageFinished(view, url);
            //webView.setBackgroundColor(Color.WHITE);
            ShowWeb();

        }

        @Override
        public void onReceivedError(WebView view, int errorCode,
                                    String description, String failingUrl) {
            // TODO Auto-generated method stub
            super.onReceivedError(view, errorCode, description, failingUrl);
          //  Toast.makeText(onSave.this, "同步失败，请稍候再试", Toast.LENGTH_SHORT)
            //        .show();
            ShowText();
        }


        }


    /**
     * 监听Back键按下事件,方法2:
     * 注意:
     * 返回值表示:是否能完全处理该事件
     * 在此处返回false,所以会继续传播该事件.
     * 在具体项目中此处的返回值视情况而定.
     */
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK)) {
            System.out.println("按下了back键   onKeyDown()");
            showDialog();
            return false;
        } else {
            return super.onKeyDown(keyCode, event);
        }
    }
}
