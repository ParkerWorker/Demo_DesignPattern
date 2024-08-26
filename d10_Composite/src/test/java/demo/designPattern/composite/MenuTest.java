package demo.designPattern.composite;

import org.junit.Test;

/**
 * 测试应用组件模式菜单系统
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/26 12:31
 **/
public class MenuTest {

    @Test
    public void testTransparentMenu() {
        MenuBar bar = new MenuBar("透明组合模式下的菜单栏...", 0);
        for (int i = 0; i < 5; i++) {
            bar.add(new MenuItem("菜单 " + i, 1));
        }
        bar.print();
    }

    @Test
    public void testSafeMenu() {
        MenuBar bar = new MenuBar("安全组合模式下的菜单栏...", 0);
        for (int i = 0; i < 5; i++) {
            bar.add((SafeMenuComponent) new MenuItem("菜单 " + i, 1));
        }
        bar.print();
    }
}
