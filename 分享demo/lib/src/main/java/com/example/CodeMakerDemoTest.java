package com.example;


import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.By;

import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;

import java.net.URL;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class CodeMakerDemoTest {

    public static void main(String[] args) throws MalformedURLException{

    System.out.println("自动化测试开始1111----------->");
    DesiredCapabilities capabilities = new DesiredCapabilities();
    capabilities.setCapability("appium-version", "1.0");
    capabilities.setCapability("platformName", "Android");
    capabilities.setCapability("platformVersion", "4.4.4");
    capabilities.setCapability("deviceName", "HM NOTE 1LTE");
//        capabilities.setCapability("app", "/Users/admin/appium_test/app-release.apk");
    capabilities.setCapability("app", "/Users/admin/apk/anteater-20161018.apk");

    //        AppiumDriver wd;
    AndroidDriver wd;
    wd = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

    wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

//		boolean isOk = 1>2;
//		assert isOk;
//		System.out.println("程序正常");
//		assert 1==2:"Out assertion failed!";
    System.out.println("自动化测试开始2222----------->");

    for (int i = 0; i < 5; i++) {
        int width = wd.manage().window().getSize().width;
        int height = wd.manage().window().getSize().height;
        wd.swipe(width * 6 / 7, height / 2, width / 7, height / 2, 1000);
    }

    // 立即体验
    wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[1]")).click();


    /**
     * 以下这种软键盘获取数据的方法需要适配各种不同分辨率的手机 现在适配略麻烦 暂时先不这么处理
     */
//        wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.EditText[1]")).click();
//
//        inputPhoneNum(wd, 58, 906);
//        inputPhoneNum(wd, 60, 1117);
//        inputPhoneNum(wd, 240, 1229);
//        inputPhoneNum(wd, 243, 1002);
//        inputPhoneNum(wd, 70, 907);
//        inputPhoneNum(wd, 245, 1222);
//        inputPhoneNum(wd, 240, 898);
//        inputPhoneNum(wd, 242, 1116);
//        inputPhoneNum(wd, 65, 1114);
//        inputPhoneNum(wd, 242, 1222);
//        inputPhoneNum(wd, 59, 1010);

    wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.EditText[1]")).sendKeys("17051028704");

    wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.EditText[1]")).sendKeys("yshr1991");

    // 登录
    wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.Button[1]")).click();

    // 切换底部菜单栏
    int[] n = new int[]{2, 3, 4, 5, 1};
    for (int i = 0; i < n.length; i++) {
        wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.TabHost[1]/android.widget.TabWidget[1]/android.widget.RelativeLayout[" + n[i] + "]")).click();

    }

    /**
     * 账单部分
     */
    // 消息
    wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[1]")).click();

    // 消息返回
    TitleBack(wd);

    // 加号
    wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView[1]")).click();

    //添加账单
    addBill(wd);


    // 首页面 账单汇总
    wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]")).click();

    // 首页面-->账单汇总 返回
    TitleBack(wd);

    //首页面添加账单
    wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.LinearLayout[1]/android.widget.GridView[1]/android.widget.LinearLayout[1]")).click();
    // 添加账单界面返回
    addBill(wd);

    // 首页面-->在线办卡
    wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.LinearLayout[1]/android.widget.GridView[1]/android.widget.LinearLayout[2]")).click();
    wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]")).click();
    TitleBack(wd);


    // 首页面账单底部菜单点击
    wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.TabHost[1]/android.widget.TabWidget[1]/android.widget.RelativeLayout[1]")).click();

    // 首页面-->公积金查询
    wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.LinearLayout[1]/android.widget.GridView[1]/android.widget.LinearLayout[3]")).click();
    TitleBack(wd);

    // 首页面-->社保查询
    wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.LinearLayout[1]/android.widget.GridView[1]/android.widget.LinearLayout[4]")).click();
    TitleBack(wd);

    // 首页面-->当期账单
    wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[3]/android.widget.TextView[1]")).click();
    TitleBack(wd);

    //首页面-->添加新账单

    swipeToUp(wd, 1000);

    wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.LinearLayout[5]/android.widget.TextView[1]")).click();

    //        wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[3]/android.widget.TextView[1]")).click();
    TitleBack(wd);
//        addBill(wd);

    // 首页面--->信用卡列表
    //列表被遮住 需要往上移动之后才可出发脚本事件
//        swipeToUp(wd, 1000);

//        wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]")).click();
//        TitleBack(wd);


    /**
     * 办卡部分
     */
    // 底部点击
    wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.TabHost[1]/android.widget.TabWidget[1]/android.widget.RelativeLayout[2]")).click();
    //第一个条目点击
    wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]")).click();
    TitleBack(wd);


    /**
     * 服务部分
     */
    // 底部点击
    wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.TabHost[1]/android.widget.TabWidget[1]/android.widget.RelativeLayout[3]")).click();
    // 消息
    wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[1]")).click();
    TitleBack(wd);


    /**
     * 钱社部分
     */
    // 底部点击
    wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.TabHost[1]/android.widget.TabWidget[1]/android.widget.RelativeLayout[4]")).click();
    // 左上角搜索
    wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[1]")).click();
    // 右上角取消
    wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]")).click();


    /**
     * 我的部分
     */
    // 底部点击
    wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.TabHost[1]/android.widget.TabWidget[1]/android.widget.RelativeLayout[5]")).click();
    // 消息
    wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[3]")).click();
    TitleBack(wd);
    //添加账单
    wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[5]")).click();
    addBill(wd);
    wd.close();
    System.out.println("自动化测试完成------------>");
    }

    // 手机号码输入 此处根据坐标 之后需修改
    private static void inputPhoneNum(AndroidDriver wd, final int x, final int y) {
        Boolean a = (Boolean) wd.executeScript("mobile: tap", new HashMap<String, Integer>() {{
            put("tapCount", 1);
            put("touchCount", 1);
            put("duration", 1);
            put("x", x);
            put("y", y);
        }});
    }

    // 添加账单点击后界面的操作流程
    private static void addBill(AndroidDriver wd) {
        // 信用卡账单点击
        wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.TextView[1]")).click();

        // 邮箱登录界面 列表邮箱条目 qq
        wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.ListView[1]/android.widget.LinearLayout[1]")).click();
        // 输入邮箱账号
//        wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.EditText[1]")).click();
        wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.EditText[1]")).sendKeys("843655195");
        // 输入邮箱账号
        wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout[2]/android.widget.EditText[1]")).sendKeys("yshr1991");
        //邮箱登陆
        System.out.println("邮箱登陆即将点击1111------------>");
        wd.hideKeyboard();
        wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.Button[1]")).click();
        System.out.println("邮箱已经登陆222------------>");
        //回到首界面
        wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.Button[1]")).click();


        // 返回键到添加账单界面
//        TitleBack(wd);
//        TitleBack(wd);

        //进入添加账单界面
        wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.LinearLayout[1]/android.widget.GridView[1]/android.widget.LinearLayout[1]")).click();
        //房贷账单
        wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.TextView[2]")).click();
        // 房贷账单界面返回
        TitleBack(wd);

        // 车贷账单
        wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.TextView[3]")).click();
        // 车贷账单返回
        TitleBack(wd);

        //添加账单界面返回
        TitleBack(wd);

    }

    //标题栏返回键
    private static void TitleBack(AndroidDriver wd) {
        wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[1]")).click();
    }

//    public void sendKeyEvent(int key) {
//        execute(KEY_EVENT, getCommandImmutableMap(KEY_CODE, key));
//    }

    /**
     * This Method for swipe Left
     *
     * @param driver
     * @param during
     * @author Young
     */
    private static void swipeToLeft(AndroidDriver driver, int during) {
        int width = driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().height;
        driver.swipe(width * 3 / 4, height / 2, width / 4, height / 2, during);
        // wait for page loading
    }

    /**
     * This Method for swipe Right
     *
     * @param driver
     * @param during
     * @author Young
     */
    private static void swipeToRight(AndroidDriver driver, int during) {
        int width = driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().height;
        driver.swipe(width / 4, height / 2, width * 3 / 4, height / 2, during);
        // wait for page loading
    }

    private static void swipeToUp(AndroidDriver driver, int during) {
        int width = driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().height;
//        driver.swipe(width / 2, height * 3 / 4, width / 2, height / 4, during);


        boolean Swiped;
        String beforeswipe = driver.getPageSource();
        driver.swipe(width / 2, height / 4, width / 2, height * 3 / 4, 1000);
        String afterswipe = driver.getPageSource();
        Swiped = beforeswipe.equals(afterswipe) ? true : false;
//        iTestAssert.assertFalse(Swiped,String.format(resourceBundle.getString("swipe_to_fail")));
//        androidUtils.takesScreenshot(String.format(resourceBundle.getString("after_swipe"), direction));
        //判断是否滑动到底部：

        String str1;
        String str2;
//  do while 循环
        do {
//滑动前获取pagesource
            str1 = driver.getPageSource();
            driver.swipe(width / 2, height * 3 / 4, width / 2, height / 4, 1000);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
//滑动后获取pagesource
            str2 = driver.getPageSource();
        } while (!str1.equals(str2));

    }

    private static void swipeToDown(AndroidDriver driver, int during) {
        int width = driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().height;
        System.out.println(width);
        System.out.println(height);
        driver.swipe(width / 2, height / 4, width / 2, height * 3 / 4, during);
    }
}
